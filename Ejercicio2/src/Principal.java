import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		int nA;
		int nM;
		int nO;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el n�mero de Administrativos que quieres crear: ");
		nA = teclado.nextInt();
		Persona[] admin = new Administrativos[nA];
		for (int i=0; i<admin.length; i++) {
			System.out.println("Introduce el nombre del trabajador: ");
			String nombre = teclado.next();
			System.out.println("Introduce el salario del trabajador: ");
			float salario = teclado.nextFloat();
			System.out.println("Introduce la edad del trabajador: ");
			int edad = teclado.nextInt();
			System.out.println("Introduce los estudios academicos: ");
			String estudiosAcademicos = teclado.next();
			System.out.println("Introduce el n�mero de ordenadores: ");
			int numOrdenadores = teclado.nextInt();
			admin[i] = new Administrativos(nombre, salario, edad, estudiosAcademicos, numOrdenadores);
		}
		
		System.out.println("Introduce el n�mero de Maquinistas quie quieres crear: ");
		nM = teclado.nextInt();
		Persona[] maqui = new Maquinistas[nM];
		for (int i = 0; i<maqui.length; i++) {
			System.out.println("Introduce el nombre del trabajador: ");
			String nombre = teclado.next();
			System.out.println("Introduce el salario del trabajador: ");
			float salario = teclado.nextFloat();
			System.out.println("Introduce la edad del trabajador: ");
			int edad = teclado.nextInt();
			System.out.println("Introduce el n�mero de la m�quina asignado: ");
			int numMaquinas = teclado.nextInt();
			System.out.println("Introduce los a�os que lleva con la m�quina: ");
			int anoMaquinas = teclado.nextInt();
			maqui[i] = new Maquinistas(nombre, salario, edad, numMaquinas, anoMaquinas);
		}
		
		System.out.println("Introduce el n�mero de empleados que no sean Administrativos o Maquinistas: ");
		nO = teclado.nextInt();
		Persona[] persona = new Persona[nO];
		for (int i = 0; i<persona.length; i++) {
			System.out.println("Introduce el nombre del trabajador: ");
			String nombre = teclado.next();
			System.out.println("Introduce el salario del trabajador: ");
			float salario = teclado.nextFloat();
			System.out.println("Introduce la edad del trabajador: ");
			int edad = teclado.nextInt();
			persona[i] = new Persona(nombre, salario, edad);
		}

		for (int i = 0; i<admin.length; i++) {
			admin[i].visualizarTodosDatos();
		}
		System.out.println(" ");
		
		for (int i = 0; i<maqui.length; i++) {
			maqui[i].visualizarTodosDatos();
		}
		System.out.println(" ");
		
		for (int i = 0; i<persona.length; i++){
			persona[i].visualizarTodosDatos();
		}
		
	}

}
