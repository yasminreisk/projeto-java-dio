
public class main {

	public static void main(String[] args) {
		////explorando o polimorfismo///
		
		Cliente claudiomiro = new Cliente();
		claudiomiro.setNome("Claudiomiro");
		
		Conta cc = new ContaCorrente(claudiomiro);
		
		
		
		Conta poupanca = new ContaPoupanca(claudiomiro);
		
		cc.depositar(600);
		
		cc.transferir(150, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
