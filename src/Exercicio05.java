// Nome: Davi Fernandes Alves
// Matrícula: 1261946667


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner scanner = new Scanner(System.in);

     System.out.println("Digite um numero(0 para encerrar): ");

     int numero = -1 ;
     int soma = 0;
     

     while (numero != 0) {
        numero = scanner.nextInt();

        soma = soma + numero;

        System.out.println("Soma total:" + soma);

        scanner.close();
        
     }
    }
}
