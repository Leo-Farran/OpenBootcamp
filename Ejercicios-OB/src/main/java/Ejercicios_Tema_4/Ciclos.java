package Ejercicios_Tema_4;

public class Ciclos {

    public static void main(String[] args) {

        System.out.println("Condicional If");
        int numeroIF = -4;
        if (numeroIF > 0){
            System.out.println("El número es positivo");
        }else {
            System.out.println("El número es negativo");
        }

        System.out.println();
        System.out.println("Bucle While");
        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println();
        System.out.println("Bucle Do While");
        do {
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);

        System.out.println();
        System.out.println("Bucle For");
        int numeroFor = 0;
        for(int i = 0; i < 3; i++){
            numeroFor++;
            System.out.println(numeroFor);
        }

        System.out.println();
        System.out.println("Sentencia Switch");
        String estacion = "4";
        switch (estacion){
            case "1":
                System.out.println("Estación verano");
                break;
            case "2":
                System.out.println("Estación otoño");
                break;
            case "3":
                System.out.println("Estación invierno");
                break;
            case "4":
                System.out.println("Estación primavera");
                break;
        }
    }
}
