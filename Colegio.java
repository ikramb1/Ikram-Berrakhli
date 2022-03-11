package ejecicios;

public class Colegio {
	String nombre; 
	 String direccion;
	 int  num_alumnos;
	 
	 public Colegio(){
	 }
	public Colegio(String nombre,String direccion,int num_alumnos) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.num_alumnos=num_alumnos;
	}
	
	public void setNombre (String nom) {
		this.nombre=nom;
	}
	public void setDireccion(String dir) {
		this.direccion=dir;
		}
		public void setNumAlumnos(int num_alumnos) {
			this.num_alumnos=num_alumnos;
		}
		
		public String getNombre () {
			return this.nombre;
		}
			public String getDireccion () {
				return this.direccion;
				
			}
			public int getNumAlumnos() {
				return this.num_alumnos;
			}
			
}
		


