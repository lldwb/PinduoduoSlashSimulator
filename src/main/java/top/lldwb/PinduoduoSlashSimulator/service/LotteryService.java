package top.lldwb.PinduoduoSlashSimulator.service;

import top.lldwb.PinduoduoSlashSimulator.dao.PDS_Sim_DB;
import top.lldwb.PinduoduoSlashSimulator.entity.Prize;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 抽奖业务类
 */
public class LotteryService {

    /**
     * @return 返回一个随机奖品
     */
    public static String lottery() throws SQLException {
        return lotterys(0);
    }

    /**
     * @param grouping 奖品分组，当grouping为0是不分组
     * @return 返回一个随机奖品
     */
    public static String lottery(int grouping) throws SQLException {
        return lotterys(grouping);
    }

    /**
     * @param grouping 奖品分组，当grouping为0是不分组
     * @return 返回一个随机奖品
     */
    private static String lotterys(int grouping) throws SQLException {
        // 从prize表中获取奖品列表，存储在list集合中
        List<Prize> list = new PDS_Sim_DB().pdsList(new Prize(), "select * from prize");

        // 通过Stream随机读取一个奖品
        // optional对象表示获取的奖品，若返回为空则返回Optional.empty()
        // 首先list集合转成Stream流
        Optional<Prize> optional = list.stream()
                // 判断是否是指定分组，当grouping为0是不分组
                .filter(prize -> grouping == 0 ? true : prize.getGrouping() == grouping)
                // 使用skip跳过随机数量的元素
                .skip(new Random()
                        .nextInt((int) list.stream().filter(prize -> grouping == 0 ? true : prize.getGrouping() == grouping).count()))
                // 再使用findFirst方法获取第一个元素
                .findFirst();

        // 如果Optional.value为空，返回Name为"谢谢惠顾"的Prize对象
        return optional.orElseGet(() -> {
            Prize prize = new Prize();
            prize.setName("谢谢惠顾");
            return prize;
        }).getName();
    }
}
