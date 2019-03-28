import java.util.ArrayList;
import java.util.List;

import mateo.tobon.proyecto.banco.Banco;
import mateo.tobon.proyecto.banco.CuentaBancaria;
import mateo.tobon.proyecto.banco.Persona;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona();
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria("12334",persona, 100, "Ahorro","1");
		CuentaBancaria cuentaBancaria2 = new CuentaBancaria("12334",persona, 90, "Corriente","2");
		
		List<CuentaBancaria> cuentasBancarias = new ArrayList<>();
		
		cuentasBancarias.add(cuentaBancaria1);
		cuentasBancarias.add(cuentaBancaria2);

		Banco banco = new Banco(100,cuentasBancarias);
		
		//System.out.println("numero de trabajadores: "+banco.getNumeroDeTrabajadores());
		//System.out.println(banco.getCuentasBancarias().get(1).getTipodecuenta());
		//System.out.println(banco.getCuentasBancarias().get(0).getTipodecuenta());
		
		
		//banco.retirarPlata(10.0, "1", "12334");
		//banco.retirarPlata(10.0, "2", "12334");
		//banco.retirarPlata(10.0, "1", "fwegvdtb");
	
		banco.consignarPlata(1000000, "1", "12334");
		banco.consignarPlata(80, "2", "12334");
	}

}
