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
public interface Obligatorio {
	static String nombreEmpresa = "Empresa";
	void pedirTodosDatos();
	void visualizarTodosDatos();
	
	
}
