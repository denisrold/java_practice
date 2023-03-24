package proyecto_bytebank;

public class TestReferencia {
public static void main(String[] args) {
	Cuenta primeraCuenta = new Cuenta();
	primeraCuenta.setSaldo(200); 
	
	Cuenta segundaCuenta = primeraCuenta;
	segundaCuenta.setSaldo(100);
	System.out.println(primeraCuenta);
}
}
