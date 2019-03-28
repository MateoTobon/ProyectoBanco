package mateo.tobon.proyecto.banco;

public class CuentaBancaria {
	
	private String clave;
	private Persona persona;
	private double saldo;
	private String tipodecuenta;
	private String numero;
	
	public CuentaBancaria(String clave, Persona persona, double saldo, String tipodecuenta, 
			String numero) 
	{
		
		this.clave = clave;
		this.persona = persona;
		this.saldo = saldo;
		this.tipodecuenta = tipodecuenta;
		this.numero = numero;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipodecuenta() {
		return tipodecuenta;
	}

	public void setTipodecuenta(String tipodecuenta) {
		this.tipodecuenta = tipodecuenta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

}
