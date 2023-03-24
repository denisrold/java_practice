package proyecto_bytebank;

public class pruebaMetodos {
public static void main(String[] args) {
	Cuenta miCuenta = new Cuenta();
	miCuenta.setSaldo(300);
	miCuenta.depositar(300);

	System.out.println(miCuenta.getSaldo());
	miCuenta.retirar(100);
	System.out.println(miCuenta.getSaldo());
	
	Cuenta cuentaDeJimena = new Cuenta();
	cuentaDeJimena.depositar(1000);
	if(cuentaDeJimena.transferir(400,miCuenta)) {
		System.out.println("transferencia Exitosa");
	};
	System.out.println(cuentaDeJimena.getSaldo());
	System.out.println(miCuenta.getSaldo());
}
}
