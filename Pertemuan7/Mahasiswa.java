package Pertemuan7;


public class Mahasiswa {
    private String nama;
    private String nim;
    private int nilai;

    public void setNama(String namaBaru){
        this.nama = namaBaru;
    }

    public String getNama(){
        return nama;
    }

    public void setNIM(String nimBaru){
        this.nim = nimBaru;
    }

    public String getNIM(){
        return nim;
    }

    public void setNilai(int nilaiBaru){
        this.nilai=nilaiBaru;
    }

    public int getNilai(){
        return nilai;
    }
    
}

