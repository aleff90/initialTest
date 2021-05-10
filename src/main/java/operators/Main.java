package operators;

public class Main {
    public static void main(String[] args) {
        float a=542178967, b=125478469;

        float totalSoma = a+b;
        float totalMultiplicacao = a*b;
        float totalDivisao = a%b;
        float totalSubtracao = a-b;

        System.out.println("\n Resultado da soma: "+totalSoma);
        System.out.println("\n Resultado da multiplicação: "+totalMultiplicacao);
        System.out.println("\n Resultado da divisão: "+totalDivisao);
        System.out.println("\n Resultado da subtração: "+totalSubtracao);
    }
}

//at the beginning of the learning I declared the variables like this

//var a = 3;
//var b = 8;

//final var total1 = a+b;
//final var total2 = a*b;
//final var total3 = a%b;
//final var total4 = a-b;