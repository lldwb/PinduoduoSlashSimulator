import top.lldwb.PinduoduoSlashSimulator.dao.PDS_Sim_DB;
import top.lldwb.PinduoduoSlashSimulator.entity.Prize;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args){
        try {
            System.out.println(new PDS_Sim_DB().pdsList(new Prize(),"select * from prize").toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
