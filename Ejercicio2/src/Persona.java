/**
 * Escribe un programa que controle los datos de todas las personas que trabajan en una
empresa. De todas ellas, nos interesa: nombre, sueldo base (el mismo para todos) y
edad. Entre los empleados que trabajan en la empresa, hay dos grupos de personas de
las que nos interesa algún dato más:
 Los administrativos: de los cuales, nos interesan estudios académicos y
número de ordenador asignado.
 Los maquinistas: de los cuales nos interesan número de máquina asignada y la
cantidad de años que lleva con dicha máquina.
Es obligatorio usar constructores en cada una de las clases que se encarguen de pedir
los datos de dichos empleados. El método “visualizarTodosDatos()” estará en todas las
clases y se encargará de visualizar todos los datos de la clase donde está.
El programa pedirá que el usuario indique el número de empleados que pertenecen al
grupo de los administrativos, al grupo de los maquinistas y número de empleados que
no están en ninguno de estos dos grupos. Posteriormente se pedirán los datos de cada
uno de ellos.
Visualiza los datos de cada uno de ellos (por grupos). Para ello se usará un único
método preparado para recibir los datos de un grupo de trabajadores con el fin de
visualizar sus datos.
 * @author yszee
 *
 */
public class Persona implements Importante{
private String nombre;
private float sueldo;
private int edad;

public Persona(String nombre, float sueldo, int edad) {
	this.nombre = nombre;
	this.sueldo = sueldo;
	this.edad = edad;
}

@Override
public void visualizarTodosDatos() {
System.out.print("Nombre: " + nombre + "\t" + "Edad: " + edad + "\t" + "Sueldo: " + sueldo +" € ");
}

}