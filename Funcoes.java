import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Funcoes {

    public static String ChecaAnoBissexto(int ano){
        //se o ano for divisivel por 4 mas não por 100 ou se o ano for divisivel por 4,100,400
        Boolean is_bissexto;
        if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
            is_bissexto = true;
        }else if(ano % 4 == 0 && ano % 100 != 0){
            is_bissexto = true;
        }else{
            is_bissexto = false;
        }

        if(is_bissexto){
            return ano + " É UM ANO BISSEXTO!";
        }else{
            return ano + " NÃO É UM ANO BISSEXTO!";
        }
    }

    public static String ImparPar(int n){
        if(n % 2 == 0){
            return n + " É UM NÚMERO PAR!";
        }else{
            return n + " É UM NÚMERO IMPAR!";
        }
    }

    public static String MaiorNumero(int n1, int n2){
        if(n1 == n2){
            return n1 + " E " + n2 + " SÃO IGUAIS!";
        }else if(n1 < n2){
            return n1 + " É MENOR QUE " + n2 + "!";
        }else{
            return n1 + " É MAIOR QUE " + n2 + "!";
        }
    }

    public static String MaiorNumeroDe3(int n1, int n2, int n3){

        Integer[] lista_numeros = {n1,n2,n3};

        Arrays.sort(lista_numeros,Collections.reverseOrder());

        return "O maior número dos 3 números digitados é "+lista_numeros[0];

    }

    public static void ImprimirNumerosDecrescente(int n1, int n2, int n3){

        Integer[] lista_numeros = {n1,n2,n3};

        Arrays.sort(lista_numeros,Collections.reverseOrder());

        for(Integer i : lista_numeros){
            System.out.println(i);
        }
    }

    public static Double EnviaMedia(Double n1, Double n2, Double n3, Double n4){
        Double nota = n1 + n2 + n3 + n4;

        Double media = nota / 4;
        return media;
    }

    public static String SexoDigitado(String sexo){
        sexo = sexo.toUpperCase();

        System.out.println(sexo);

        if(sexo.equals("MASCULINO") || sexo.equals("M")){
            return "Você é do sexo masculino!";
        }else if(sexo.equals("FEMININO") || sexo.equals("F")){
            return "Você é do sexo feminino!";
        }else{
            return "Você é de outro sexo não identificado pelo programa.";
        }
    }

}
