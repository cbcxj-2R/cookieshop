package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class C3P0Utils {
    private static DataSource ds;
    static {
        ds=new ComboPooledDataSource();
    }
    public static DataSource getDataSource(){
        return ds;
    }
    /**
     * �����ӳ��л��һ������,��ϸ����ҵ���ʱ����
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException{
    	return ds.getConnection();
    }
}


