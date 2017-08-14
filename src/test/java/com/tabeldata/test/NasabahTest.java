package com.tabeldata.test;

import com.tabeldata.config.DBSource;
import com.tabeldata.dao.NasabahDao;
import com.tabeldata.entity.Nasabah;
import junit.framework.TestCase;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class NasabahTest extends TestCase {

    private NasabahDao nasabahDao;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        DataSource dataSource = DBSource.getDatasource();
        this.nasabahDao = new NasabahDao(dataSource.getConnection());
    }

    @Test
    public void testFindNasabah() throws SQLException {
//        List<Nasabah> list = this.nasabahDao.findAll(null, null);
//        List<Nasabah> list = this.nasabahDao.findAll("10511148", "");
//        List<Nasabah> list = this.nasabahDao.findAll("", "");
//        List<Nasabah> list = this.nasabahDao.findAll("10511146", null);
//        List<Nasabah> list = this.nasabahDao.findAll("", "Dimas");
//        List<Nasabah> list = this.nasabahDao.findAll(null, "Dimas");
        List<Nasabah> list = this.nasabahDao.findAll("10511148", "Dimas");
        assertEquals("Jumlah nasabah yang didapatkan!", 1, list.size());
    }
}
