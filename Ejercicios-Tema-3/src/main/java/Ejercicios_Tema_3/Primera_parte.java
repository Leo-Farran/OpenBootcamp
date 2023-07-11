package Ejercicios_Tema_3;

public class Primera_parte {

    public int suma(int a, int b, int c){
        int total = a+b+c;
        return total;
    }

    public static void main(String[] args) {
        int valorA = 5;
        int valorB = 7;
        int valorC = 2;

        Primera_parte resultado = new Primera_parte();
        int total = resultado.suma(valorA, valorB, valorC);
        System.out.println(total);
    }
}
