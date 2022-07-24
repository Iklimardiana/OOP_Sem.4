public class PersegiPanjang {
    double lebar =1;
    double panjang =1;

    PersegiPanjang(){

    }

    PersegiPanjang(double l, double p){
        lebar = l;
        panjang = p;
    }

    void SetLebar(double l){
        lebar = l;
    }

    void SetPanjang(double p){
        panjang = p;
    }

    double getLuas(){
        return this.panjang*this.lebar;
    }

    double getKeliling(){
        return 2*(this.panjang+this.lebar);
    }

    public static void main(String[] args) {
        PersegiPanjang SegiPanjang1 = new PersegiPanjang(3.5, 35.9);
        PersegiPanjang SegiPanjang2 = new PersegiPanjang(40, 6.9);
        System.out.println("Lebar : "+ SegiPanjang1.lebar);
        System.out.println("Panjang : "+ SegiPanjang1.panjang);
        System.out.println("Luas : "+ SegiPanjang1.getLuas());
        System.out.println("Keliling "+ SegiPanjang1.getKeliling());
        System.out.println("");
        System.out.println("Lebar : "+ SegiPanjang2.lebar);
        System.out.println("Panjang : "+ SegiPanjang2.panjang);
        System.out.println("Luas : "+ SegiPanjang2.getLuas());
        System.out.println("Keliling : "+ SegiPanjang2.getKeliling());

    }

}
