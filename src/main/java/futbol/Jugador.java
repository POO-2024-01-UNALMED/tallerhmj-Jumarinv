package futbol;

public class Jugador extends Futbolista {
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador () {
		
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
					
	}
	
	
	public Jugador (short golesMarcados, byte dorsal, String nombre, int edad, String posicion) {
		
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
			
	}
	

	
	@Override
	public int compareTo(Futbolista futbolista) {
		
		return Math.abs(this.getEdad()- futbolista.getEdad());
		
	}
	
	@Override
	public String toString() {
		
		return "El futbolista " + getNombre()+ " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " 
		+ golesMarcados;
		
	}
	
	@Override
	public boolean jugarConLasManos() {
		
		
		return false;
		
	}
	
	public void setGolesMarcados(short golesMarcados) {
		
		this.golesMarcados = golesMarcados;
		
	}
	
	public short getGolesMarcados() {
		
		return golesMarcados;
		
	}
	
	public void setDorsal(byte dorsal) {
		
		this.dorsal = dorsal;
		
	}
	
	public byte GetDorsal() {
		
		return dorsal;
		
	}

}
