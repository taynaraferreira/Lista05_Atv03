import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Atv 3");
        System.out.print("Informe um número: ");
        int a1=teclado.nextInt();
        System.out.print("Informe outro número: ");
        int b2=teclado.nextInt();
        System.out.print("Informe o outro número: ");
        int c3=teclado.nextInt();
        teclado.close();
        int resultadoSoma=calculo(a1, b2, c3);
        System.out.println("O resultado da soma dos números informados é: "+resultadoSoma);
    }   

    static int calculo(int n1, int n2, int n3){
        int soma=n1+n2+n3;
        return soma;
    }
}
