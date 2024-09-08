package com.mycompany.bab11soal1;

public class Bab11Soal1 {

    public static void main(String[] args) {
       Karyawan karyawan1 = new Karyawan();
        karyawan1.setKaryawan(0001, "malika", "O", "Polwan", 8000000);
        karyawan1.getKaryawan();
        
        System.out.println("----------------------------");
        
        Karyawan karyawan2 = new Karyawan();
        karyawan2.setKaryawan(0002, "Dewi", "A", "Polwan", 8000000);
        karyawan2.getKaryawan();
        
    }
}
