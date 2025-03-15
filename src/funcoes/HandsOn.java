package funcoes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class HandsOn {
    public static void main(String[] args) {

        System.out.println(
                calcularIdade(new Date(), 1970)
        );

        System.out.println(_calcularIdade(LocalDate.now(), 1970));

        System.out.println(
                LocalDate.now()
        );

        //Definição de formatos para datas com SimpleDateFormat
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/YYYY");
        String dataFormatada = simpleFormat.format(new Date());

        System.out.println(dataFormatada);

    }

    //Como conseguir capturar o ano de uma variável do tipo Date
    public static int calcularIdade(Date dataAtual, int anoNascimento){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataAtual);

        return calendar.get(Calendar.YEAR) - anoNascimento;
    }

    public static int _calcularIdade(LocalDate dataAtual, int anoNascimento){
        return dataAtual.getYear() - anoNascimento;
    }
}
