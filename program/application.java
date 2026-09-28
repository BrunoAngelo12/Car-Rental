package program;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String strModeloCarro = sc.nextLine();
        System.out.println(strModeloCarro);

    }
}