
public class Encapsulacion {

	public static void main(String[] args) {

		Persona persona = new Persona();
		persona.setEdad(20);
		persona.setNombre("Pablo");
		persona.setTelefono(643546345);
		
		System.out.println("Nombre: " + persona.nombre + " Edad: " + persona.edad + " Telefono: " + persona.telefono);

	}

	public static class Persona {

		private String nombre;
		private int edad;
		private int telefono;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

	}
}
