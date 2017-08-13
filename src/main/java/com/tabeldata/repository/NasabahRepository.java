package com.tabeldata.repository;

import com.tabeldata.config.DBSource;
import com.tabeldata.dao.NasabahDao;
import com.tabeldata.entity.Nasabah;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * kelas ini digunakan untuk mengederhanakan proses CRUD dan mengimplementasikan konsep transactional
 */
public class NasabahRepository {

    private NasabahDao nasabahDao;

    /**
     * @param nomorRegister
     * @param namaNasabah
     * @return
     */
    public List<Nasabah> findAll(String nomorRegister, String namaNasabah) {
        try {
            Connection connection = DBSource.getDatasource().getConnection();
//          TODO set autocommit manual
            connection.setAutoCommit(false);

            nasabahDao = new NasabahDao(connection);
            List<Nasabah> datas = nasabahDao.findAll(nomorRegister, namaNasabah);

//            TODO tutup kembali connection JDBC
            connection.close();
            return datas;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Nasabah save(Nasabah nasabah) {
        Connection connection = null;
        try {
            connection = DBSource.getDatasource().getConnection();
//            TODO set autocommit manual
            connection.setAutoCommit(false);

            nasabahDao = new NasabahDao(connection);
            Nasabah nasabahBaru = nasabahDao.save(nasabah);

//            TODO commit transaction
            connection.commit();
//            TODO tutup connection
            connection.close();

            return nasabahBaru;
        } catch (SQLException e) {
            e.printStackTrace();
            try {
//             TODO jika ada error kembalikan ke semula dengan rollback
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            return null;
        }
    }

    public Nasabah update(Nasabah nasabah) {
        try {
            return nasabahDao.update(nasabah);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
