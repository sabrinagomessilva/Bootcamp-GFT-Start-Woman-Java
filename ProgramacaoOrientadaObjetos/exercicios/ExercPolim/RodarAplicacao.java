package dio.polim.sob;

public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //fazendo upcasts

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Exemplo de downcasts (que não se deve usar, dará erro, é apenas exemplificativo).

        //Vendedor vendedor1 = (Vendedor) new Funcionario();

    }


}
