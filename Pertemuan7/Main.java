package Pertemuan7;

public class Main{
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Budi");
        mhs.setNIM("2008765");
        mhs.setNilai(100);

        System.out.println("Nama Mhs : "+mhs.getNama());
        System.out.println("NIM      : "+mhs.getNIM());
        System.out.println("Nilai    : "+mhs.getNilai());
    }
}
