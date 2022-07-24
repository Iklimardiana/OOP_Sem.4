public class SegitigaSikuSiku {
    double alas = 1;
    double tinggi = 1;

    SegitigaSikuSiku(){}

    SegitigaSikuSiku(double A, double T){
        alas = A;
        tinggi= T;
    }

    void setAlas(double A){
        System.out.print("Alas : ");
        alas = A;
    }
    void setTinggi(double T){
        System.out.print("Tinggi : ");
        tinggi = T;
    }

    double getLuas(){
        return (alas * tinggi)/2;
    }

    double getKeliling() {
        return alas + tinggi + getMiring();
    }

    double getMiring() {
        return Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
    }


    public static void main(String[] args){
        SegitigaSikuSiku Segitigaku1 = new SegitigaSikuSiku(); 
        SegitigaSikuSiku Segitigaku2 = new SegitigaSikuSiku(3, 4);
        System.out.println("Alas : " + Segitigaku2.alas);
        System.out.println("Tinggi : "+ Segitigaku2.tinggi);
        System.out.println("Miring : "+ Segitigaku2.getMiring());
        System.out.println("Luas Segitiga 1: " + Segitigaku2.getLuas());
        System.out.println("Keliling Segitiga 1: " + Segitigaku2.getKeliling());
        System.out.println("");
        System.out.println("Alas : " + Segitigaku1.alas);
        System.out.println("Tinggi : "+ Segitigaku1.tinggi);
        System.out.println("Miring : "+ Segitigaku1.getMiring());
        System.out.println("Luas Segitiga 1: " + Segitigaku1.getLuas());
        System.out.println("Keliling Segitiga 1: " + Segitigaku1.getKeliling());

    }
}
