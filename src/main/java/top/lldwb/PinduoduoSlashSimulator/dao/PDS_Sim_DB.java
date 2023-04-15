package top.lldwb.PinduoduoSlashSimulator.dao;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 安然的尾巴
 * @version 1.0
 */
public class PDS_Sim_DB {
    private static final String URL = "jdbc:mysql://mysql.lldwb.top:33366/PDS_Sim_DB?serverTimezone=Asia/Shanghai";
    //账号
    private static final String USER_NAME = "root";
    //密码
    private static final String PASSWORD = "@dwb123456";
    //QueryRunner对象
    QueryRunner queryRunner = new QueryRunner();
    //数据库连接对象
    Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

    public PDS_Sim_DB() throws SQLException {
    }

    public <T> List<T> pdsList(T t, String sql, Object... obj) throws SQLException {
        List<T> list = queryRunner.query(conn,sql,new  BeanListHandler<T>((Class<? extends T>) t.getClass()),obj);
        DbUtils.close(conn);
        return list;
    }
}
