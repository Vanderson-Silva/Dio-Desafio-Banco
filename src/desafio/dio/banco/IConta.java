package desafio.dio.banco;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDesino);

    void imprimirExtrato();
}
