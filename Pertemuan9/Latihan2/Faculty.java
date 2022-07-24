package Pertemuan9.Latihan2;

public class Faculty extends Employee {
    private String JamKerja;
    private String Pangkat;

    public Faculty() {
    }

    public Faculty(String Nama, String Alamat, String NomorTelepon, String Email, int Kantor, double Gaji,
            String JamKerja, String Pangkat) {
        super(Nama, Alamat, NomorTelepon, Email, Kantor, Gaji);
        this.JamKerja = JamKerja;
        this.Pangkat = Pangkat;
    }

    public String getJamKerja() {
        return JamKerja;
    }

    public String getPangkat() {
        return Pangkat;
    }
    public void setJamKerja(String JamKerja) {
        this.JamKerja = JamKerja;
    }

    public void setPangkat(String Pangkat) {
        this.Pangkat = Pangkat;
    }

    public String toString() {
        return super.toString() + "\nJam Kerja: " + JamKerja + "\nPangkat: " + Pangkat;
    }
}
