
public class Main {

	static ArrayList<Conta> listaContas = new ArrayList<Conta>();

	public static void main(String[] args) {
		/*Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();*/




		Scanner scan = new Scanner(System.in);

		cargaContas();

		String opcaoEscolhida = "";

		while (!"0".equals(opcaoEscolhida)) {

			exibirMenu();
			opcaoEscolhida = scan.nextLine();

			//int idxRemedio = -1;
			Remedio pesquisado = null;

			switch (opcaoEscolhida) {

				case "1":
					listarContas();
					break;

				case "2":
					//ListarRemedios();
					break;

				case "3":
					//idxRemedio = pesquisarRemedios();
					//pesquisado = listaRemedios.get(idxRemedio);
					System.out.println(pesquisado);
					break;

				case "4":
					//ExcluirRemedios();
					break;

				case "5":
					//EditarRemedios();
					break;

				default:
					break;
			}

		}

		System.out.println("Fim");
	}


	public static void exibirMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("0 - Sair: ");
		System.out.println("1 - Listar Contas: ");
		System.out.println("2 - Listar remédios: ");
		System.out.println("3 - Pesquisar remédios: ");
		System.out.println("4 - Excluir remédios: ");
		System.out.println("5 - Editar remédios: ");
		System.out.println("Digite a opção: ");

	}

	public static void listarContas() {
		for (int i = 0; i < listaContas.size(); i++) {
			System.out.println(listaContas.get(i));
		}
	}

	public static void cargaContas(){

		Cliente venilton = new Cliente("Venilton");
		Cliente mauricio = new Cliente("Mauricio");
		Cliente josivaldo = new Cliente("Josivaldo");
		Cliente rick = new Cliente("Rick");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		listaContas.add(cc);
		listaContas.add(poupanca);

		Conta cc1 = new ContaCorrente(mauricio);
		Conta poupanca1 = new ContaPoupanca(mauricio);
		listaContas.add(cc1);
		listaContas.add(poupanca1);

		Conta cc2 = new ContaCorrente(josivaldo);
		Conta poupanca2 = new ContaPoupanca(josivaldo);
		listaContas.add(cc2);
		listaContas.add(poupanca2);

		Conta cc3 = new ContaCorrente(rick);
		Conta poupanca3 = new ContaPoupanca(rick);
		listaContas.add(cc3);
		listaContas.add(poupanca3);

	}
}
