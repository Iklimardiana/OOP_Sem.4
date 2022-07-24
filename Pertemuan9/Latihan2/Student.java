package Pertemuan9.Latihan2;

public class Student extends Person {
    private int Status;
    public static final int MahasiswaBaru = 1;
    public static final int MahasiswaTahunKedua = 2;
    public static final int Junior = 3;
    public static final int Senior = 4;

    public Student() {
    }

    public Student(String Nama, String Alamat, String NomorTelepon, String Email, int Status) {
        super(Nama, Alamat, NomorTelepon, Email);
        this.Status = Status;
    }

    public String getStatus() {
        if (Status ==1){
            return "Mahasiswa Baru";
        }else if(Status ==2){
            return "Mahasiswa Tahun Kedua";
        }else if(Status ==3){
            return "Mahasiswa Junior";
        }else if(Status ==4){
            return "Mahasiswa Senior";
        }else{
            return "Status tidak diketahui";
        }
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String toString() {
        return super.toString() + "\nStatus: " + Status;
    }
}
