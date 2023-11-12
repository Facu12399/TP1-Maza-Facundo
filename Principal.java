package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Profesor profesor1 = new Profesor(38383838,"Ariel",30,4,"Maestro Especial",true);
		
		System.out.println(profesor1.toString());
		profesor1.EvaluarCantidadMesesTrabajados();
		
		Profesor profesor2 = new Profesor();
		
		System.out.println(profesor2.toString());
		profesor2.ObtenerInformacionParticularDelTrabajo();
	}

}
