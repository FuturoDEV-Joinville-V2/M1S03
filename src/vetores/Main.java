package vetores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Criando / Instanciando vetores
        int[] valores = new int[3];
        // valores[10, 20, 30]
        String[] nomes = new String[3];

        // double notas = new double[4]; -> Gera um erro de tipo incompatível

        //Inicializando vetores
        double[] notas = {4.5, 5.6, 9.5};
        boolean[] valores_logicos = {true, false, false};

        //Acessar valores no vetor
        System.out.println(notas[0]);

        //Modificar valores no vetor
        notas[0] = 7;

        System.out.println(notas[0]);

        System.out.print("Nome do usuário: ");
        nomes[0] = scan.nextLine();

        System.out.println(nomes[0]);

        System.out.print("1º Nota: ");
        notas[0] = scan.nextDouble();

        System.out.println("Tamanho do vetor notas: " + notas.length);
        System.out.println("Tamanho do vetor nomes: " + nomes.length);

        System.out.println("---------------------------------------------");
        System.out.println("CADASTRO DE NOTAS");
        for(int i = 0; i < notas.length; i++){
            System.out.printf("%dº Nota: ", (i+1));
            notas[i] = scan.nextDouble();
        }
        System.out.println("VISUALIZAR NOTAS");
        //For Convencional
        for(int i = 0; i < notas.length; i++){
            System.out.printf("%dº Nota: %.1f\n", (i+1), notas[i]);
        }

        //For each
        for(double nota : notas){
            System.out.println("-> " + nota);
        }

    }
}
