package view;

import java.io.IOException;

import controller.ModificacaoCadastroController;

public class ListaClientesPrincipal {
	public static void main (String[] args) {
		
		ModificacaoCadastroController modCont = new ModificacaoCadastroController();
		
		try {
			modCont.novoCadastro(41, 60, 8000.00);
			modCont.novoCadastro(31, 40, 5000.00);
			modCont.novoCadastro(21, 30, 3000.00);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
