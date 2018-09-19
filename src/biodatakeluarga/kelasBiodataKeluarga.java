/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodatakeluarga;

/**
 *
 * @author ALFINA
 */
public class kelasBiodataKeluarga {

    public static void main(String[] args) {

        BiodataKeluarga keluarga = new BiodataKeluarga();
        keluarga.setNamaAyah("Joko Prasetyawan");
        keluarga.setNamaIbu("Rini Setyowati");
        keluarga.setNamaSaudara("Amelia Trihapsari");
        keluarga.setNamaSaya("Alfina hidayati");
        keluarga.setAlamat("Turen");
        keluarga.setTempatLahir("Malang");
        keluarga.setTanggalLahir("8Maret2003");
        keluarga.setHobi("Menari");
        keluarga.setCitacita("Designer");
        keluarga.setNoTelp("081357417008");

        System.out.println("Nama Ayah :" + keluarga.getNamaAyah());
        System.out.println("Nama Ibu :" + keluarga.getNamaIbu());
        System.out.println("Nama Saudara :" + keluarga.getNamaSaudara());
        System.out.println("Nama Saya :" + keluarga.getNamaSaya());
        System.out.println("Alamat :" + keluarga.getAlamat());
        System.out.println("Tempat Lahir :" + keluarga.getTempatLahir());
        System.out.println("Tangga Lahir :" + keluarga.getTanggalLahir());
        System.out.println("Hobi :" + keluarga.getHobi());
        System.out.println("Citacita :" + keluarga.getCitacita());
        System.out.println("NoTelp :" + keluarga.getNoTelp());

    }
}
