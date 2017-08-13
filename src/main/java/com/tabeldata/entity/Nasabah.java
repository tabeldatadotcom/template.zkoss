package com.tabeldata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nasabah {

    private String nomorRegister;
    private String namaNasabah;
    private String alamat;
}
