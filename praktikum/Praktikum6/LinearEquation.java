import java.util.Scanner;

public class LinearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    LinearEquation(){

    }
    public LinearEquation(int a, int b, int c, int d, int e, int  f) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

    public int getA(int A){
        return a;
    }

    public int getB(int B){
        return b;
    }

    public int getC(int C){
        return c;
    }

    public int getD(int D){
        return d;
    }

    public int getE(int E){
        return e;
    }

    public int getF(int F){
        return f;
    }

    boolean isSolvable(){
        if (a*b - b*c != 0){
            return true;
        }else{
            return false;
        }
    }



    public double getX() {
       double det = (this.a * this.d)-(this.b * this.c);
       return (this.e * this.d)-(this.b*this.f)/det;
    }

    public double getY() {
        double det = (this.a * this.d) - (this.b * this.c);
        return (this.a * this.f) - (this.e * this.c)/ det;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=sc.nextInt();
        sc.close();
        LinearEquation linearEquation=new LinearEquation(a, b, c, d, e, f);
        if(linearEquation.isSolvable()){
            System.out.println("x="+linearEquation.getX());
            System.out.println("y="+linearEquation.getY());
        }else{
            System.out.println("Persamaan tidak memiliki solusi");
        }
    }
}


