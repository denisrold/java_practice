package proyecto_bytebank;
//class --> entidad que quiero representar. 
class Cuenta {
	private double saldo;
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	public Object getTitular1() {
		return titular;
	};

	
	
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	//void no espera retornar nada 
	public void depositar(double valor){
	this.saldo = this.saldo + valor;
	}
	
	public boolean retirar(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} return false;
	}
	
	public boolean transferir(double valor,
			Cuenta cuenta ){
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		} return false;
	
	}

	public double getSaldo(){
		return this.saldo;
	};
	public void setAgencia(int nuevaAgencia){
		if(this.agencia >0) {
		this.agencia = nuevaAgencia;}
		else {
			System.out.println("No estan permitidos valores negativos.");
		}
	};
	
	public int getAgencia() {
		return agencia;
	}
}
