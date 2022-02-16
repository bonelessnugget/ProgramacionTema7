/**
 * Diseña una interface y llámala Persona, con el fin de establecer los datos y funciones
mínimas que tiene que tener cualquier clase de un proyecto que implemente la
misma.
Los métodos mínimos son:
 pedirTodosDatos();
 visualizarTodosDatos();
Los atributos mínimos son:
 Nombre de la empresa. (Dale un valor).
Diseña dos clases, Cliente y Empleado, que implemente dicha interface (establece qué
datos deben de tener). Pide los datos de un cliente y de un empleado y visualízalos.
Cambia al cliente el nombre de la empresa por “editorial”. ¿Qué ocurre?
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
