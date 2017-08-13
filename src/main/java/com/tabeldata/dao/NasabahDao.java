package com.tabeldata.dao;

import com.tabeldata.entity.Nasabah;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Kelas ini digunakan untuk membuat perintah query-query seperti
 * insert, update, delete dan select (CRUD Operation)
 */
public class NasabahDao {

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
        return null;
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
        return null;
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
        return null;
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
        return true;
    }


}
