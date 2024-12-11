import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p = -1;
        double a = -1;

        System.out.println("Vamos iniciar o cálculo do seu Índice de Massa Corporal(IMC).");
        System.out.println("Responda as seguintes perguntas:");

        while (p <= 0) {
            System.out.print("Qual seu peso em quilos (kg)? ");
            p = sc.nextDouble();

            if (p <= 0) {
                System.out.println("O peso deve ser maior que 0. Tente novamente.");
            }
        }

        while (a <= 0) {
            System.out.print("Qual sua altura em metros? ");
            a = sc.nextDouble();

            if (a <= 0) {
                System.out.println("A altura deve ser maior que 0. Tente novamente.");
            }
        }
        System.out.println();
        Double imc = p / (a * a);

        System.out.print("Seu IMC é: ");
        System.out.printf("%.2f%n", imc);

        System.out.println(
                "Classificação do seu IMC de acordo com a OMS (Organização Mundial da Saúde):");
        if (imc < 18.5) {
            System.out.println();
            System.out.println("Abaixo do peso normal");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println();
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println();
            System.out.println("Excesso de peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println();
            System.out.println("Obesidade classe 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println();
            System.out.println("Obesidade classe 2");
        } else if (imc >= 40) {
            System.out.println();
            System.out.println("Obesidade classe 3");
        }

        sc.close();
    }
}
