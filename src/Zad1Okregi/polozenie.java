/********************************************************
 * nazwa funkcji: <polożenie>
 * parametry wejściowe: <3 liczby z przedziału (-10000 , 10000)>
 * wartość zwracana: <literki>
 * autor: <Hubert Strączewski>
 * ********************************************************/
package Zad1Okregi;

    public class polozenie {
        public static void okrag(int r, int xo, int yo, int xi, int yi){
            int a= (xo-xi) + (yo-yi);
                System.out.println(a);
            if(a>r){
                System.out.println("lezy na zewnatrz okregu");
        }
            else if(a<r){
                System.out.println("lezy wewnatrz okregu");
        }
            else{
                System.out.println("lezy na okregu");
        }

    }
    public static void main(String[]args){
        int r, xo, yo, xi, yi;
        okrag(5,1,-4,1,1);
    }
}