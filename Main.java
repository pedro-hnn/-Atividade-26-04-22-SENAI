import java.util.Scanner;

public class Main {

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tChecagem se o ano é Bissexto ou não\n" +
                        "2\t\t=>\t\tChecagem se o número é impar ou par\n" +
                        "3\t\t=>\t\tCheca qual é o maior entre dois números inteiros\n" +
                        "4\t\t=>\t\tCheca qual é o maior entre três números inteiros\n" +
                        "5\t\t=>\t\tRecebe três números inteiros e imprime todos em ordem decrescente\n" +
                        "6\t\t=>\t\tRecebe 4 notas e envia média do aluno\n" +
                        "7\t\t=>\t\tRecebe o sexo (Masculino ou Feminino) e imprime o mesmo (sem diferenciação se é maiuscula ou minúscula)\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 7) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }


            } catch (Exception e) {
                System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }


    public static void main(String[] args) {
        System.out.println("Atividade SENAI 26/4/2022 - Básico de Java 2 (tarefa sobre IF/ELSE/condicionais) - Curso: Desenvolvedor Java Vespertino\n\n");

        int num1,num2,num3,num4;
        Double num1_double,num2_double,num3_double,num4_double;

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    System.out.println("\n\nDigite um ano");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.println("\n\n" + Funcoes.ChecaAnoBissexto(num1) + "\n\n");
                    continue;

                case 2:
                    System.out.println("\n\nDigite um número");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.println("\n\n" + Funcoes.ImparPar(num1) + "\n\n");
                    continue;

                case 3:
                    System.out.println("\n\nDigite dois números:");
                    System.out.print("Num1 = ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("Num2 = ");
                    num2 = new Scanner(System.in).nextInt();
                    System.out.println("\n\n" + Funcoes.MaiorNumero(num1,num2) + "\n\n");
                    continue;

                case 4:
                    System.out.println("\n\nDigite três números:");
                    System.out.print("Num1 = ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("Num2 = ");
                    num2 = new Scanner(System.in).nextInt();
                    System.out.print("Num3 = ");
                    num3 = new Scanner(System.in).nextInt();
                    System.out.println("\n\n" + Funcoes.MaiorNumeroDe3(num1,num2,num3) + "\n\n");
                    continue;

                case 5:
                    System.out.println("\n\nDigite três números:");
                    System.out.print("Num1 = ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("Num2 = ");
                    num2 = new Scanner(System.in).nextInt();
                    System.out.print("Num3 = ");
                    num3 = new Scanner(System.in).nextInt();
                    System.out.println("\n\n");
                    Funcoes.ImprimirNumerosDecrescente(num1,num2,num3);
                    System.out.println("\n\n");
                    continue;

                case 6:
                    System.out.println("\n\nDigite quatro números:");
                    System.out.print("\n\nPrimeira Nota: ");
                    num1_double = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nSegunda Nota: ");
                    num2_double = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nTerceira Nota: ");
                    num3_double = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nQuarta Nota: ");
                    num4_double = new Scanner(System.in).nextDouble();
                    System.out.println("\n\n" + Funcoes.EnviaMedia(num1_double,num2_double,num3_double,num4_double) + "\n\n");
                    continue;

                case 7:
                    System.out.println("\n\nDigite o seu sexo:");
                    System.out.println("M/m/masculino/MASCULINO = Sexo Masculino\nF/f/feminino/FEMININO = Sexo Feminino");
                    String sexo = new Scanner(System.in).nextLine();
                    System.out.println("\n\n" + Funcoes.SexoDigitado(sexo) + "\n\n");
                    continue;

                case 0:
                    run = false;
                    break;
            }
        }
    }
}