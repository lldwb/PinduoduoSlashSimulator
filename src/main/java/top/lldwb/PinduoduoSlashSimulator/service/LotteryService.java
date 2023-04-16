package top.lldwb.PinduoduoSlashSimulator.service;

import top.lldwb.PinduoduoSlashSimulator.dao.PDS_Sim_DB;
import top.lldwb.PinduoduoSlashSimulator.entity.Prize;

import java.sql.SQLException;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class LotteryService {
    public static String lottery(){
        Optional<Prize> optional;
        try {
            Stream<Prize> stream = new PDS_Sim_DB().pdsList(new Prize(),"select * from prize");
            optional = stream.findAny();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return optional.orElseGet(()->{
            Prize prize = new Prize();
            prize.setName("谢谢惠顾");
            return prize;
        }).getName();
    }
}
