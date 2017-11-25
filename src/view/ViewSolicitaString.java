package view;

import javax.swing.JOptionPane;

public class ViewSolicitaString {
	//Atributos
	private String nome;

	public ViewSolicitaString() {
		nome = JOptionPane.showInputDialog("Infome a palavra para busca: ");
	}

	public String getNome() {
		return nome;
	}

}