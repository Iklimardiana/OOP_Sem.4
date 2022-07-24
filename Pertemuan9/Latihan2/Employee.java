package Pertemuan9.Latihan2;

public class Employee extends Person {
    private int Kantor;
    private double Gaji;
    private Mydate TanggalKerja;

    public Employee() {
    }

    public Employee(String Nama, String Alamat, String NomorTelepon, String Email, int Kantor, double Gaji) {
        super(Nama, Alamat, NomorTelepon, Email);
        this.Kantor = Kantor;
        this.Gaji = Gaji;
        this.TanggalKerja = new Mydate();
    }

    public int getKantor() {
        return Kantor;
    }

    public void setKantor(int Kantor) {
        this.Kantor = Kantor;
    }

    public double getGaji() {
        return Gaji;
    }

    public void setGaji(double Gaji) {
        this.Gaji = Gaji;
    }

    public String getTanggalKerja() {
        return TanggalKerja.getMonth() + "/" + TanggalKerja.getDay() + "/" + TanggalKerja.getYear();
    }

    public void setTanggalKerja(Mydate TanggalKerja) {
        this.TanggalKerja = TanggalKerja;
    }

    public String toString() {
        return super.toString() + "\nKantor: " + Kantor + "\nGaji: " + Gaji + "\nTanggal Kerja: " + getTanggalKerja();
    }
}
