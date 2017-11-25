package view;
import javax.swing.JOptionPane;

public class ViewBuscarEsporte {

	@SuppressWarnings("unused")
	public ViewBuscarEsporte(String esportes) {
			if (esportes != "") {
				JOptionPane.showMessageDialog(null, esportes);
			ViewPrincipal vp = new ViewPrincipal();
		
		} else {
			JOptionPane.showConfirmDialog(null, "Esporte não cadastrado");
		}
	}

}