package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println(numeros.size());
        //Adicionando valores na lista
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros.size());

        //Capturar um elemento
        System.out.print("Qual posição deseja capturar:");
        int posicao = scan.nextInt();

        System.out.printf("O valor na posição %d é %d", posicao, numeros.get(posicao-1));

        //Removendo um elemento
        System.out.print("\nQual posição deseja remover: ");
        posicao = scan.nextInt();

        System.out.printf("O valor %d na posição %d foi removido!", numeros.get(posicao-1), posicao);
        numeros.remove(posicao-1);

        //Verificar valores contidos na lista
        System.out.print("\nValor para ser procurado: ");
        int valor = scan.nextInt();

        System.out.println(numeros.contains(valor) ? "Valor contido na lista!" : "Valor não encontrado!");

        for(Integer numero : numeros) {
            System.out.print(numero + "\t");
        }

    }
}
