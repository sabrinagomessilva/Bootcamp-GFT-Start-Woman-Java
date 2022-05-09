package banco.dio;

import java.util.ArrayList;
import java.util.Scanner;

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
		Conta contaSelecionada = null;

		while (!"0".equals(opcaoEscolhida)) {

			exibirMenu();
			opcaoEscolhida = scan.nextLine();
			System.out.println("\n\n============================================================\n");

			//int idxRemedio = -1;
			//Remedio pesquisado = null;

			switch (opcaoEscolhida) {

				case "1":
					listarContas();
					break;

				case "2":
					System.out.println("Digite o nome do titular da conta: ");
					String nomeTitular = scan.nextLine();
					contaSelecionada = localizarConta(nomeTitular);
					if(contaSelecionada != null) {
						System.out.println("Conta Localizada");
					} else {
						System.out.println("Conta não localizada");
					}
					break;

				case "3":
					if(contaSelecionada == null) {
						System.out.println("Nenhuma conta selecionada");
					} else {
						System.out.println(contaSelecionada);
					}
					break;

				case "4":
					if(contaSelecionada == null) {
						System.out.println("Conta não localizada");
						System.out.println("Localize uma conta para sacar");
						System.out.println("Digite <ENTER> para continuar");
						scan.next();
					} else {
						System.out.println("Digite o valor que deseja sacar ");
						double valorSaque = Double.parseDouble(scan.nextLine());
						contaSelecionada.sacar(valorSaque);
						System.out.println("Saque realizado com sucesso!");
					}
					break;

				case "5":
					if(contaSelecionada == null) {
						System.out.println("Conta não localizada");
						System.out.println("Localize uma conta para depositar");
						System.out.println("Digite <ENTER> para continuar");
						scan.nextLine();
					} else {
						System.out.println("Digite o valor que deseja depositar ");
						double valorDeposito = Double.parseDouble(scan.nextLine());
						contaSelecionada.depositar(valorDeposito);
						System.out.println("Depósito realizado com sucesso!");
					}
					break;
					
				case "6":
					if(contaSelecionada == null) {
						System.out.println("Conta não localizada");
						System.out.println("Localize uma conta de origem para transferir");
						System.out.println("Digite <ENTER> para continuar");
						scan.nextLine();
					} else {
						System.out.println("Digite o nome do titular da conta de destino: ");
						String nomeTitularDestino = scan.nextLine();
						Conta contaDestino = localizarConta(nomeTitularDestino);
						if(contaDestino != null) {
							System.out.println("Digite o valor que deseja transferir ");
							double valorTransferencia = Double.parseDouble(scan.nextLine());
							contaSelecionada.transferir(valorTransferencia, contaDestino);
							System.out.println("Transferência realizada com sucesso!");
						} else {
							System.out.println("Operação não realizada");
							System.out.println("Conta de destino não localizada");
							System.out.println("Digite <ENTER> para continuar");
							scan.nextLine();
						}
					}
					break;

				default:
					System.out.println("Opção inválida");
					break;
			}

		}

		System.out.println("Fim");
	}


	private static Conta localizarConta(String nomeTitular) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Conta> listaContasTitular = new ArrayList<Conta>();
		for (int i = 0; i < listaContas.size(); i++) {

            if (nomeTitular.equalsIgnoreCase(listaContas.get(i).cliente.getNome())) {

                listaContasTitular.add(listaContas.get(i));
            }

        }
		
		if(listaContasTitular.size() > 1) {
			System.out.println("Este titular possui mais de uma conta. Selecione o numero da conta");
			for (int i = 0; i < listaContasTitular.size(); i++) {
				System.out.println(listaContasTitular.get(i));;
	        }

			int numeroConta = Integer.parseInt(scan.nextLine());
			
			for (int i = 0; i < listaContas.size(); i++) {
	            if (numeroConta == listaContas.get(i).numero) {
	                return listaContas.get(i);
	            }
	        }
		} else if (listaContasTitular.size() == 1) {
			return listaContasTitular.get(0);
		}
		
		return null;
	}


	public static void exibirMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("\n====================== MENU MEU BANCO ======================\n");
		System.out.println("0 - Sair: ");
		System.out.println("1 - Listar Contas: ");
		System.out.println("2 - Localizar Conta: ");
		System.out.println("3 - Imprimir Conta Selecionada: ");
		System.out.println("4 - Sacar da Conta Selecionada: ");
		System.out.println("5 - Depositar na Conta Selecionada: ");
		System.out.println("6 - Transferir ");

		System.out.print("\nDigite a o código da opção desejada: ");

	}

	public static void listarContas() {
		
		System.out.println("==================== Contas Cadastradas ====================\n");
		
		for (int i = 0; i < listaContas.size(); i++) {
			System.out.println(listaContas.get(i));
		}
		
		System.out.println("\n============================================================\n");
	}

	public static void cargaContas(){

		Cliente venilton = new Cliente("Venilton");
		Cliente mauricio = new Cliente("Mauricio");
		Cliente josivaldo = new Cliente("Josivaldo");
		Cliente rick = new Cliente("Rick");

		Conta cc = new ContaCorrente(venilton);
		cc.depositar(200.0);
		Conta poupanca = new ContaPoupanca(venilton);
		poupanca.depositar(3000.0);
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
