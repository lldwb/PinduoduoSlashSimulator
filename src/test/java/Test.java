import top.lldwb.PinduoduoSlashSimulator.service.LotteryService;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args){
        for (;true;){
            try {
//                System.out.println(LotteryService.lottery());
                System.out.println(LotteryService.lottery(1));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
