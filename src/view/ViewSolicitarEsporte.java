package view;

import javax.swing.JOptionPane;
public class ViewSolicitarEsporte {
	//Atributo
	private String esporte;
	public ViewSolicitarEsporte() {
		esporte = JOptionPane.showInputDialog("Infome o nome do Esporte: ");
	}
	public String getEsporte() {
		return esporte;
	}
}