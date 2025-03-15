package funcoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int valor = scan.nextInt();

        //Invocando a função
        System.out.println(numeroPar(valor) ? "O número é PAR!" : "O número não é PAR!");

        String[] nomes = {"Alexandre", "Carlos", "Julia"};
        //Invocando a função
        exibirVetor(nomes);

        String[][] produtos = {
                {"Bicicleta", "Pino"},
                {"Flauta", "Computador"}
        };
        //Invocando a função
        exibirMatriz(produtos);

        ArrayList<String> emails = new ArrayList<>();
        emails.add("teste@lab.com");
        emails.add("lab@lab.com");
        emails.add("admin@lab.com");
        //Invocando a função
        exibirArrayList(emails);
    }

    public static boolean numeroPar(int numero){
       return  numero % 2 == 0;
    }
    public static void exibirVetor(String[] vars){
        for(String var : vars){
            System.out.println(var);
        }
    }
    public static void exibirMatriz(String[][] vars){
        for(String[] var : vars){
            for(String value : var){
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
    public static void exibirArrayList(ArrayList<String> vars){
        for(String var : vars){
            System.out.print(var + "\t");
        }
    }
}
