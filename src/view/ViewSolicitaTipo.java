package view;

import javax.swing.JOptionPane;

public class ViewSolicitaTipo {
	private int validador;

	public ViewSolicitaTipo() {

		validador = Integer
				.parseInt(JOptionPane.showInputDialog("Visualizar Pa�ses Associados: /n 1 - SIM /n 2 - N�O"));
	}

	public int getValidador() {
		return validador;
	}

}