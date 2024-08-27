package futbol;

public class Portero extends Futbolista{
	
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(short golesRecibidos, byte dorsal, String nombre, int edad, String posicion) {
		
		super(nombre, edad, "Portero");
		
	}
	
	@Override
	public String toString() {
		
		return "El futbolista " + getNombre()+ " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ".Le han marcado " 
				+ golesRecibidos;
		
	}
	
	@Override
	
	public int compareTo(Futbolista futbolista) {
	
		return Math.abs(this.getGolesRecibidos() - ((Portero) futbolista).getGolesRecibidos());
		
	}
	
	public void setGolesRecibidos(short golesRecibidos) {
		
		this.golesRecibidos = golesRecibidos;
		
	}
	
	public short getGolesRecibidos() {
		
		return golesRecibidos;
		
	}
	
	public void setDorsal(byte dorsal) {
		
		this.dorsal = dorsal;
		
	}
	
	public byte GetDorsal() {
		
		return dorsal;
		
	}
	
	@Override
	public boolean jugarConLasManos() {
		
		
		return true;
		
	}
	

}
