/**
 * Dise�a una interface y ll�mala Persona, con el fin de establecer los datos y funciones
m�nimas que tiene que tener cualquier clase de un proyecto que implemente la
misma.
Los m�todos m�nimos son:
 pedirTodosDatos();
 visualizarTodosDatos();
Los atributos m�nimos son:
 Nombre de la empresa. (Dale un valor).
Dise�a dos clases, Cliente y Empleado, que implemente dicha interface (establece qu�
datos deben de tener). Pide los datos de un cliente y de un empleado y visual�zalos.
Cambia al cliente el nombre de la empresa por �editorial�. �Qu� ocurre?
 * @author yszee
 *
 */
import java.util.Scanner;
public class Cliente implements Obligatorio{
	private String nombre;
	private String dni;
	Scanner teclado = new Scanner(System.in);
	@Override
	public void pedirTodosDatos() {

		System.out.println("Introduce el nombre: ");
		this.nombre = teclado.next();
		System.out.println("Introduce el dni: ");
		this.dni = teclado.next();
	}
	
	@Override
	public void visualizarTodosDatos() {
		System.out.println(Obligatorio.nombreEmpresa);
		System.out.println(nombre+ "\t" + dni);
	}
	
	
}
