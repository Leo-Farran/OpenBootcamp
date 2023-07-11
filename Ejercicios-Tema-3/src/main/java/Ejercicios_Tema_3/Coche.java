package Ejercicios_Tema_3;

public class Coche {

    public int NroDePuertas = 0;

    public int agregarPuerta(int cantidad){
        return NroDePuertas + cantidad;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println("El coche tiene " + miCoche.agregarPuerta(1) + " puertas");
    }
}
