package desafio.dio.banco;

public class Main {

    public static void main(String[] args) {

        Cliente vanderson = new Cliente();
        vanderson.setNome("vanderson");
        Conta cc = new ContaCorrente(vanderson);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(vanderson);

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
