package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	
	private String nombre;
	private int edad;
	private final String posicion;
	
	public 	Futbolista() {
		
		this("Maradona", 30, "delantero");
		
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		
	}
	

	
	public boolean equals(Futbolista futbolista) {
		
		if (this == futbolista) {
			
			return true;
		
		}
			
		return false;
	}
	
	public abstract boolean jugarConLasManos();
	
	@Override 
	public String toString() {
		
		return ("El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion);
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
	}
	
	public int getEdad() {
		
		return edad;
	}
	
	public String getPosicion() {
		
		return posicion;
	}
	

}
