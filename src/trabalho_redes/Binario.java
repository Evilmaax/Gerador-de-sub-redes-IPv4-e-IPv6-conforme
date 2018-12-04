/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_redes;

/**
 *
 * @author Elvi Kalinoski, Maximiliano Meyer
 */
public class Binario {

    String bin = "";
    int vezes;
    int decimal;
    String inicio;

    //ContaUm irá receber uma String e caso tenha o valor 1 irá remover
    public static int contaUm(String texto) {
        int x = texto.length() - texto.replaceAll("1", "").length();
        return x;
    }

    //qtdHost recebe uma String com a quantidade de host
    public static int qtdHost(String t) {
        int potencia = 32 - Integer.parseInt(t);    //Subtrai de 32 a mascara e o restante será a potência do cálculo
        int base = 2;
        int x = (int) Math.pow(base, potencia);     //Realizar o cálculo de potência sobre a base
        return x;                                   //Retona o valor da base elevada à pontência
    }
    
    //Determina quantos bits adicionais precisará preencher para gerar as sub-redes
    public static int qtdHost6(String t) {
       int num = Integer.parseInt(t);
       int y=1, m=1;
       while (y < num){
                y = (int) Math.pow(2, m);
                m++;
            }
       return m-1;                       
    }
    
    public static String contaInsereFinal(String contar, int hostSub){
        int m = 12, r = 32 - m;
        String x = contar;
        String meio = x.replace(":", "");
        meio = meio.substring(0,m);
        String resto = "f";
        String repeated = new String(new char[r]).replace("\0", resto);
        String saida = meio + repeated;
        String finali = saida.substring(0, 4) + ":" +saida.substring(4,8)+ ":" +saida.substring(8,12)+ ":" +saida.substring(12,16)+
                ":" +saida.substring(16,20)+ ":" +saida.substring(20,24)+ ":" +saida.substring(24,28)+ ":" +saida.substring(28,32);
    
        return finali;
    }

    //Metódo irá monstar os hosts do fim
    public static String mostraHost(String a, String b, String c) {
        String temp = a.replace('.', '#');      //Substitui os ponstos por # para consequir executar o split
        String[] inicioInt = temp.split("#");   //Separa uma string em um array de string
        int demo = Integer.parseInt(inicioInt[3]) + (Integer.parseInt(b) - Integer.parseInt(c)); //Reunir valores
        String retur = inicioInt[0] + "." + inicioInt[1] + "." + inicioInt[2] + "." + demo;      //Juntar as partes e monta o IP
        return retur;
    }

    //Metado contador realiza os cálculos de início dos hosts
    public static String contador(String a, String b) {
        String temp = a.replace('.', '#');      //Substitui os ponstos par # para consequir executar o split
        String[] inicioInt = temp.split("#");   //Separa uma string em um array de string
        int demo = Integer.parseInt(inicioInt[3]) + Integer.parseInt(b);    //Reunir valores
        String retur = inicioInt[0] + "." + inicioInt[1] + "." + inicioInt[2] + "." + demo;     //Juntar as partes e monta o IP
        return retur;
    }
}