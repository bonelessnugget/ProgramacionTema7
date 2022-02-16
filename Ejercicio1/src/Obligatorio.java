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
public interface Obligatorio {
	static String nombreEmpresa = "Empresa";
	void pedirTodosDatos();
	void visualizarTodosDatos();
	
	
}
