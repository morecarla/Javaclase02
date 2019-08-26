package com.senatiddw05;

public class ImplementaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona Obr1=new Persona(1,"carla","more","F","20/09/2000");
		Persona Obr2=new Persona(2,"alfredo","cortez","M","03/12/2000");
		Persona Obr3=new Persona(3,"fabiola","fernandez","F","08/11/2000");
		Persona Obr4=new Persona(4,"pedro","more","M","25/09/2004");
		Persona Obr5=new Persona(5,"gabriela","more","F","08/11/2010");
		Persona Ger1=new Persona(1,"Jean","mattos","M","26/12/2000");
		System.out.println("Datos registrados");
		System.out.println(Obr1.toString());
		System.out.println(Obr2.toString());
		System.out.println(Obr3.toString());
		System.out.println(Obr4.toString());
		System.out.println(Obr5.toString());
		
		System.out.println(Ger1.toString());
	}

}
