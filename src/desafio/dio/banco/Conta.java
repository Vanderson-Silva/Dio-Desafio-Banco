package desafio.dio.banco;

import lombok.Data;

@Data
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;

    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDesino) {
        this.sacar(valor);
        contaDesino.depositar(valor);

    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
