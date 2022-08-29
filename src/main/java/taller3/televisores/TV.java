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
    
	public Marca getmarca () {
		return marca;}
	public void setmarca (Marca marc) {
		this.marca = marc;}
	
	public Control getcontrol () {
		return control;}
	public void setcontrol (Control cant) {
		control = cant;}
	
	public int getprecio () {
		return precio;}
	public void setprecio (int prec) {
		precio = prec;}
	
	public int getvolumen () {
		return volumen;}
	public void setvolumen (int vol) {
		volumen = vol;}
	
	public int getcanal () {
		return canal;}
	public void setCanal(int canal) {
		if(estado==true) {
			if(canal>=1 && canal<=120) {
				this.canal=canal;
				}
		}
	}
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;}
    public static int getnumTV() {
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
	
	public Control getControl() {
		return control;}
	public void setControl(Control control) {
		this.control=control;}

}
