package com.senatiddw05;

public class Persona {
	//atributo de las clases
		int id;
		String nombre;
		String apellido ;
		String sexo;
		String fecha;
		//constructor se emplea al momento de crear el objeto
		//este constructor recibe automaticamente los parametros de inicio
		public Persona(int id, String nombre, String apellido, String sexo, String fecha) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.sexo = sexo;
			this.fecha = fecha;
		}
		//constructor que no recibe parametros
		public Persona() {
			super();
		}
		//Getters y Setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getFecha() {
			return fecha;
		}
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		@Override
		public String toString() {
			return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", fecha="
					+ fecha + "]";
		}
		
}
