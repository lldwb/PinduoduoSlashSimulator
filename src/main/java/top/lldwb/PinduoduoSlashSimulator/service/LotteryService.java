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
 * @author 安然的尾巴
 * @version 1.0
 */
public class LotteryService {
    public static String lottery() {
        Optional<Prize> optional;
        try {
            // 从prize表中获取奖品列表，存储在list集合中
            List<Prize> list = new PDS_Sim_DB().pdsList(new Prize(), "select * from prize");
            // 通过Stream随机读取一个奖品
            //  首先list集合转成Stream流，使用skip跳过随机数量的元素，再使用findFirst方法获取第一个元素
            //  optional对象表示获取的奖品，若返回为空则返回Optional.empty()
            optional = list.stream().skip(new Random().nextInt(list.size())).findFirst();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // 如果Optional.value为空，返回Name为"谢谢惠顾"的Prize对象
        return optional.orElseGet(() -> {
            Prize prize = new Prize();
            prize.setName("谢谢惠顾");
            return prize;
        }).getName();
    }
}
