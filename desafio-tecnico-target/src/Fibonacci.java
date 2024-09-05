public class Fibonacci {

    public static void main(String[] args) {
        calcFibonacci(0);
    }

    public  static void calcFibonacci(int n) {
        String mensagem="Esse numero nao esta na sequencia de fibonacci";
        int a = 0;
        int b = 1;
        int fib = 1;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;

            if(fib == n)
                mensagem= "Esse numero esta na sequencia de fibonacci";
        }

        if(n==0 || n==1)
            mensagem= "Esse numero esta na sequencia de fibonacci";

        System.out.println("Valor calculado: "+fib);
        System.out.println(mensagem);
    }
}
