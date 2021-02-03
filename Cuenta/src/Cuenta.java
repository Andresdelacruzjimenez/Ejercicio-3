
public class Cuenta {

	public String titular;
	public float cuenta;

	Cuenta() {
		titular = null;
		cuenta = 0;
	}

	Cuenta(String titular, float cuenta) {
		this.titular=titular;
		this.cuenta=cuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getCuenta() {
		return cuenta;
	}

	public void setCuenta(float cuenta) {
		this.cuenta = cuenta;
	}

	public String toString() {
		return this.getTitular() + " " + this.getCuenta();

	}
	
	public float ingresar(double cantidad) {
		if (cantidad>0) {
			this.cuenta=(float) (this.cuenta+cantidad);
		} else {
			this.cuenta=this.cuenta;
		}
		
		return this.cuenta;
		
	}
	
	public float retirar(double cantidad) {
		this.cuenta=(float) (this.cuenta-cantidad);
		
		if (this.cuenta<=0) {
			this.cuenta=0;
		}
		return this.cuenta;
	}
	
	
	
}
