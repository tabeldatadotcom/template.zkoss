package com.tabeldata.test;

import com.tabeldata.config.DBSource;
import junit.framework.TestCase;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DbConnectionTest extends TestCase {
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testConnectionValid() throws SQLException {
        DataSource dataSource = DBSource.getDatasource();
        Connection connection = dataSource.getConnection();
        connection.close();
    }
}
