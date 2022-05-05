package banco.dio;

public class Main {
    public static void main(String[] args) {
        Cliente sabrina = new Cliente();
        sabrina.setNome(("Sabrina"));

        Conta cc = new ContaCorrente(sabrina);
        Conta poupanca = new ContaPoupanca(sabrina);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
