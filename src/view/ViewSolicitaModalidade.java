package view;

import javax.swing.JOptionPane;

public class ViewSolicitaModalidade {
	//Atributos
	private String modalidade;

	public ViewSolicitaModalidade() {
		modalidade = JOptionPane.showInputDialog("Infome a Modalidade: ");
	}
//Construtor
	public String getModalidade() {
		return modalidade;
	}
}