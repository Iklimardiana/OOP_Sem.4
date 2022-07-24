/*Buatlah sebuah kelas Binatang yang memiliki parameter jenis, dan warna. - Buatlah constructor kosong - Buatlah constructor untuk mengisi parameter binatang tersebut. - Buat method getter dan setter dari kelas tersebut - Buatlah method aktifitas pada binatang tersebut
Fungsi utama akan menerima input data 1 objek binatang tertentu dan sebuah kode.
Kode 1 artinya program akan mencetak bahwa binatang sedang diam
Kode 2 artinya program akan mencetak bahwa binatang sedang beraktifitas, sehingga ketika program menerima input 2, user harus memasukan string aktifitas yang dilakukan. */ 

import java.util.Scanner;

public class Binatang {
    String jenis;
    String warna;


    public Binatang(){
    }
    public Binatang(String jenis, String warna){
        this.jenis = jenis;
        this.warna = warna;
    }

    void SetJenis(String jenis){
        this.jenis = jenis;
    }

    void SetWarna(String warna){
        this.warna = warna;
    }

    String GetJenis(){
        return this.jenis;
    }

    String GetWarna(){
        return this.jenis;
    }

    // void SetAktifitas(String aktifitas){
    //     this.aktifitas = aktifitas;
    // }

    // String GetAktifitas(){
    //     return this.aktifitas;
    // }

    public void aktifitas (){
        //cetak 
        //jenis binatang sedang diam
        System.out.println(this.jenis + " sedang diam");
    }
    public void aktifitas( String A){
            // cetak 
            //jenis binatang sedang A
            // this.aktifitas = A;
            System.out.println(this.jenis+"Sedang"+ A.toLowerCase());
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Binatang binatang1 = new Binatang();
        String jenis = input.nextLine();
        String warna = input.nextLine();
        int kode = input.nextInt();

        
        binatang1.SetJenis(jenis);
        binatang1.SetWarna(warna);

        
        if (kode ==1){
            binatang1.aktifitas();
        }
        else if (kode ==2){
            String aktifitas = input.next();
            binatang1.aktifitas(aktifitas);
        }
    }
}
