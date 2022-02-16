/**
 * Escribe un programa que controle los datos de todas las personas que trabajan en una
empresa. De todas ellas, nos interesa: nombre, sueldo base (el mismo para todos) y
edad. Entre los empleados que trabajan en la empresa, hay dos grupos de personas de
las que nos interesa alg�n dato m�s:
 Los administrativos: de los cuales, nos interesan estudios acad�micos y
n�mero de ordenador asignado.
 Los maquinistas: de los cuales nos interesan n�mero de m�quina asignada y la
cantidad de a�os que lleva con dicha m�quina.
Es obligatorio usar constructores en cada una de las clases que se encarguen de pedir
los datos de dichos empleados. El m�todo �visualizarTodosDatos()� estar� en todas las
clases y se encargar� de visualizar todos los datos de la clase donde est�.
El programa pedir� que el usuario indique el n�mero de empleados que pertenecen al
grupo de los administrativos, al grupo de los maquinistas y n�mero de empleados que
no est�n en ninguno de estos dos grupos. Posteriormente se pedir�n los datos de cada
uno de ellos.
Visualiza los datos de cada uno de ellos (por grupos). Para ello se usar� un �nico
m�todo preparado para recibir los datos de un grupo de trabajadores con el fin de
visualizar sus datos.
 * @author yszee
 *
 */
public class Administrativos extends Persona implements Importante{
private String estudiosAcademicos;
private int numOrdenadores;

public void visualizarTodosDatos() {
	super.visualizarTodosDatos();
	System.out.print("\t" + "Estudios Academicos: " + estudiosAcademicos + "\t" + "Numero Ordenadores: " + numOrdenadores + "\t" +"Administrativos");
}

public Administrativos(String nombre, float sueldo,int edad, String estudiosAcademicos, int numOrdenadores) {
	super(nombre, sueldo, edad);
	this.estudiosAcademicos = estudiosAcademicos;
	this.numOrdenadores = numOrdenadores;
}

}



