package Aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public  Caneta(String m, String c, float p) {
		
		
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
		
	}
	
	

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar(){
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("----- SOBRE CANETA: -----");
		System.out.println("----- Modelo:" +this.getModelo());
		System.out.println("----- Ponta:" +this.getPonta());
		System.out.println("----- Cor:" +this.cor);
		System.out.println("----- Tampada: " +this.tampada);
		
		
	}


	
	
	
	
	
}
