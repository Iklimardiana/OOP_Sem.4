package Praktikum.Praktikum7.Latihan2;

public class Person {
    private String Nama;
    private String Alamat;
    private String NomorTelepon;
    private String Email;

    public Person() {
    }

    public Person(String Nama, String Alamat, String NomorTelepon, String Email) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.NomorTelepon = NomorTelepon;
        this.Email = Email;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNomorTelepon() {
        return NomorTelepon;
    }

    public void setNomorTelepon(String NomorTelepon) {
        this.NomorTelepon = NomorTelepon;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String toString() {
        return "Nama: " + Nama + "\n" +
                "Alamat: " + Alamat + "\n" +
                "Nomor Telepon: " + NomorTelepon + "\n" +
                "Email: " + Email;
    }
}
