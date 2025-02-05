public class Main {

    public static void main(String [] Args){

        double saldo = 25.0;
        double valorSolicitado = 12.9;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }

    }
}
