package proyecto_bytebank;

public class PruebaEncapsulamiento {
public static void main(String[] args) {
	Cuenta cuenta = new Cuenta();
	Cliente cliente = new Cliente();
	
	cliente.setNombre("Diego");
	cliente.setDocumento("356541551");
	cliente.setTelefono("3545645645");
	
	cuenta.setTitular(cliente);
	
	System.out.println(cliente.getNombre());
	System.out.println(cuenta.getTitular().getNombre());
}
}
