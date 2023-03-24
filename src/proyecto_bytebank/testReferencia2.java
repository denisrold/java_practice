package proyecto_bytebank;

public class testReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("54554554");
		diego.setTelefono("08001050505");
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.setAgencia(1);
		cuentaDeDiego.setTitular(diego);
		
		Cliente raul = new Cliente();
		raul.setNombre("Raul");
		raul.setDocumento("14355212");
		raul.setTelefono("0800121235");
		
		Cuenta cuentaDeRaul = new Cuenta();
		cuentaDeRaul.setAgencia(3);
		cuentaDeRaul.setTitular(raul);
		System.out.println(cuentaDeRaul.getTitular().getNombre());
	}
}
