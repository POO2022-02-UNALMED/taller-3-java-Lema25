package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado){
		this.estado =estado;
		this.marca=marca;
		numTV++;
	}
    
	public Marca getMarca () {
		return marca;}
	public void setMarca (Marca marc) {
		this.marca = marc;}
	
	public Control getControl () {
		return control;}
	public void setControl (Control cont) {
		this.control = cont;}
	
	public int getPrecio () {
		return precio;}
	public void setPrecio (int prec) {
		this.precio = prec;}
	
	public int getVolumen () {
		return volumen;}
	public void setVolumen (int vol) {
		this.volumen = vol;}
	
	public int getCanal () {
		return canal;}
	public void setCanal(int can) {
		if(estado==true) {
			if(can>=1 && can<=120) {
				this.canal=can;
				}
		}
	}
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;}
    public static int getNumTV() {
        return numTV;}
    
	public void turnOn(){
		estado=true;
	}
	
	public void turnOff(){
		estado=false;
	}
	
	public void canalUp(){
		if(estado== true) {
			if(canal<120) {
				canal++;
			}
		}
	}
	
	public void canalDown(){
		if(estado== true) {
			if(canal>1) {
				canal--;
			}
		}
	}
	
	public void volumenUp(){
		if(estado== true) {
			if(volumen<7) {
				volumen++;
			}
		}
	}
	
	public void volumenDown(){
		if(estado== true) {
			if(volumen>0) {
				volumen--;
			}
		}
	}
	
	public boolean getEstado () {
		return estado;
	}
	
}
