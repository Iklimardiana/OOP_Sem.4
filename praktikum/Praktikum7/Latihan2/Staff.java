package Praktikum.Praktikum7.Latihan2;

public class Staff extends Employee {
    private String Gelar;

    public Staff() {
    }

    public Staff(String Nama, String Alamat, String NomorTelepon, String Email, int Kantor, double Gaji, String Gelar) {
        super(Nama, Alamat, NomorTelepon, Email, Kantor, Gaji);
        this.Gelar = Gelar;
    }

    public String getGelar() {
        return Gelar;
    }

    public void setGelar(String Gelar) {
        this.Gelar = Gelar;
    }

    public String toString() {
        return super.toString() + "\nGelar: " + Gelar;
    }
}
