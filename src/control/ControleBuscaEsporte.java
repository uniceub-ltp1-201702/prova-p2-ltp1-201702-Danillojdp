package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Esporte;
import view.ViewBuscarEsporte;
import view.ViewSolicitarEsporte;

public class ControleBuscaEsporte {

	private BDSimulado bds;

	public ControleBuscaEsporte(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void BuscaModalidade() {

		ArrayList<Esporte> esportes = bds.getEsportes();

		ViewSolicitarEsporte se = new ViewSolicitarEsporte();

		String nomeEsporte = se.getEsporte();

		String e = "";
		for (int i = 0; i < esportes.size(); i++) {

			if (esportes.get(i).equals(nomeEsporte)) {
				e += "Esporte: " + esportes.get(i).getEsporte() + " - " + "Modalidade: " + esportes.get(i).getModalidade();
			}
		}
		ViewBuscarEsporte be = new ViewBuscarEsporte(e);

	}
}