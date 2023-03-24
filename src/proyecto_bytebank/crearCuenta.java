package proyecto_bytebank;

public class crearCuenta {
public static void main(String[] args) {
	Cuenta primeraCuenta = new Cuenta();
	//esta variable del tipo cuenta representa una nueva cuenta. 
	primeraCuenta.setSaldo(1000);
	
	System.out.println(primeraCuenta.getSaldo());
	
	Cuenta segundaCuenta = new Cuenta();
	segundaCuenta.setSaldo(500);
	System.out.println(segundaCuenta.getSaldo());
}
}
