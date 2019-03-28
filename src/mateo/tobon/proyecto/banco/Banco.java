package mateo.tobon.proyecto.banco;

import java.util.List;

public class Banco {
	private int numeroDeTrabajadores;
	private List<CuentaBancaria> cuentasBancarias;

	public Banco(int numeroDeTrabajadores, List<CuentaBancaria> cuentasBancarias) {
		this.numeroDeTrabajadores = numeroDeTrabajadores;
		this.cuentasBancarias = cuentasBancarias;
	}

	public int getNumeroDeTrabajadores() {
		return numeroDeTrabajadores;
	}

	public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
		this.numeroDeTrabajadores = numeroDeTrabajadores;
	}

	public List<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}

	public void retirarPlata(double dineroARetirar, String numeroDeCuenta, String clave) {
		try {
			this.cuentasBancarias.get(0);

		} catch (Exception e) {
			System.out.println("el banco no tiene ninguna cuenta y lanza esta excepcion: " + e.getMessage());
		}
//Retiramos dinero
		for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
			if (cuentaBancaria.getNumero().equals(numeroDeCuenta)) {
				if (cuentaBancaria.getClave().equals(clave)) {
					if (dineroARetirar <= cuentaBancaria.getSaldo()) {
						cuentaBancaria.setSaldo(cuentaBancaria.getSaldo() - dineroARetirar);
						System.out.println("retiro de dinero exitoso");
						System.out.println("el nuevo saldo de la cuenta es: " + cuentaBancaria.getSaldo());
					} else {
						System.out.println("saldo insuficiente");
						return;
					}
				} else {
					System.out.println("las claves son distintas");
					return;
				}
			}
		}
	}

	public void consignarPlata(double dineroAConsignar, String numeroDeCuenta, String clave) {
		try {
			this.cuentasBancarias.get(0);

		} catch (Exception e) {
			System.out.println("el banco no tiene ninguna cuenta y lanza esta excepcion: " + e.getMessage());
		}
		// Consignar dinero
		for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
			if (cuentaBancaria.getNumero().equals(numeroDeCuenta)) {
				if (cuentaBancaria.getClave().equals(clave)) {
					if (dineroAConsignar != cuentaBancaria.getSaldo()) {
						cuentaBancaria.setSaldo(cuentaBancaria.getSaldo() + dineroAConsignar);
						System.out.println("Consigna de dinero exitoso");
						System.out.println("el nuevo saldo de la cuenta es: " + cuentaBancaria.getSaldo());
					} else {
						System.out.println("saldo insuficiente");
						return;
					}
				} else {
					System.out.println("las claves son distintas");
					return;
				}
			}
		}
	}
}
