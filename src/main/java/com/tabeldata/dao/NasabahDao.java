package com.tabeldata.dao;

import com.tabeldata.converter.StringConverter;
import com.tabeldata.entity.Nasabah;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Kelas ini digunakan untuk membuat perintah query-query seperti
 * insert, update, delete dan select (CRUD Operation)
 */
public class NasabahDao {

    private final static Logger console = LoggerFactory.getLogger(NasabahDao.class);

    /**
     * 1. buat object connection
     */
    private final Connection connection;

    /**
     * 2. buat construktur dengan menggunakan argument
     *
     * @param connection inject value connection dari luar
     */
    public NasabahDao(Connection connection) {
        this.connection = connection;
    }

    /**
     * 3. ambil semua nasabah dari database dengan query
     * <pre>select * from m_nasabah where nomor_register = ? and nama_nasabah = ?</pre>
     *
     * @param nomorRegister parameter untuk pencarian berdasarkan nomor register
     * @param nama          parameter untuk pencarian berdasarkan nama
     * @return mengembalikan <pre>java.util.List&lt;com.tabeldata.entity.Nasabah&gt;</pre>
     */
    public List<Nasabah> findAll(String nomorRegister, String nama) throws SQLException {
        List<Nasabah> listNasabah = new ArrayList<>();
        StringBuilder query = new StringBuilder();
        query.append("select * from m_nasabah");

        if (StringConverter.isNotNull(nomorRegister) && StringConverter.isNotNull(nama))
            query.append(" where nomor_register = ? and lower(nama_nasabah) like ?");
        else if (StringConverter.isNotNull(nomorRegister))
            query.append(" where nomor_register = ?");
        else if (StringConverter.isNotNull(nama))
            query.append(" where nama_nasabah like ?");

        console.info("query for find nasabah {}", query.toString());

//        TODO argument pencarian nama dan nomor register
        PreparedStatement ps = connection.prepareStatement(query.toString());
        if (StringConverter.isNotNull(nomorRegister) && StringConverter.isNotNull(nama)) {
            ps.setString(1, nomorRegister);
            ps.setString(2, new StringBuilder("%").append(nama.toLowerCase()).append("%").toString());
        } else if (StringConverter.isNotNull(nomorRegister))
            ps.setString(1, nomorRegister);
        else if (StringConverter.isNotNull(nama))
            ps.setString(1, new StringBuilder("%").append(nama.toLowerCase()).append("%").toString());

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            listNasabah.add(new Nasabah(
                    rs.getString("nomor_register"),
                    rs.getString("nama_nasabah"),
                    rs.getString("alamat"))
            );
        }

//        TODO tutup connection preparedStatement dan resultSet
        ps.clearParameters();
        ps.close();
        rs.close();
        return listNasabah;
    }

    /**
     * Menyimpan object nasabah ke database dengan query
     * <pre>insert into m_nasabah (nomor_register, nama_nasabah, alamat) values (?,?,?)</pre>
     *
     * @param nasabah nilai dari nasabah baru
     * @return kembalikan object nasabah dengan object yang baru tersebut jika gagal insert kembalikan <pre>java.lang.Null</pre>
     * @throws SQLException
     */
    public Nasabah save(Nasabah nasabah) throws SQLException {
        //language=PostgreSQL
        String query = "INSERT INTO m_nasabah (nomor_register, nama_nasabah, alamat) \n" +
                "VALUES (?, ?, ?)";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, nasabah.getNomorRegister());
        ps.setString(2, nasabah.getNamaNasabah());
        ps.setString(3, nasabah.getAlamat());

        ps.executeUpdate();
        ps.close();
        return nasabah;
    }

    /**
     * Mengupdate object nasabah ke database dengan query
     * <pre>update m_nasabah set nama_nasabah = ?, alamat = ? where nomor_register = ?</pre>
     *
     * @param nasabah nilai dari nasabah yang akan diupdate
     * @return kembalikan object nasabah dengan objek yang baru tersebit jika gagal update kembalikan <pre>java.lang.Null</pre>
     * @throws SQLException
     */
    public Nasabah update(Nasabah nasabah) throws SQLException {
        //language=PostgreSQL
        String query = "UPDATE m_nasabah\n" +
                "SET nama_nasabah = ?, alamat = ?\n" +
                "WHERE nomor_register = ?";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, nasabah.getNamaNasabah());
        ps.setString(2, nasabah.getAlamat());
        ps.setString(3, nasabah.getNomorRegister());

        ps.executeUpdate();
        ps.close();
        return nasabah;
    }

    /**
     * Menghapus object nasabah bedasarkan nomor register dengan query
     * <pre>delete from m_nasabah where nomor_register = ?</pre>
     *
     * @param nomorRegister nomor register namasabah yang dipilih dari tabel atau lainya
     * @return jika berhasil terhapus kembalikan true jika tidak false
     * @throws SQLException
     */
    public boolean delete(String nomorRegister) throws SQLException {
        //language=PostgreSQL
        String query = "DELETE FROM m_nasabah\n" +
                "WHERE nomor_register = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, nomorRegister);
        int i = ps.executeUpdate();
        ps.close();
//        jika
        return i > 0;
    }


}
