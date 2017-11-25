package control;

import java.io.IOException;
import javax.swing.JOptionPane;
import model.BDSimulado;
import view.ViewPrincipal;

public class ControlePrincipal {
	//Atributos
	private BDSimulado bds;
	private ViewPrincipal vp;
	private ControleBuscaEsporte cbe;
	private ControleDiferencaEUA cde;
	private ControleCadastraEsporte cce;

	public ControlePrincipal() throws IOException {
		this.bds = new BDSimulado();
		this.vp = new ViewPrincipal();
		this.cbe = new ControleBuscaEsporte(bds);
		this.cde = new ControleDiferencaEUA(bds);
		this.cce = new ControleCadastraEsporte(bds);

		tratarOpcao(this.vp.getOpcao());
	}

	public void tratarOpcao(String opcao) throws IOException {

		while (true) {
			switch (opcao) {
			case "1":
				this.cbe.BuscaModalidade();
				break;
			case "2":
				this.cce.CadastraEsporte();
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "At� Breve");
				return;
			default:
				JOptionPane.showConfirmDialog(null, "Digite um n�mero v�lido");
			}
			opcao = this.vp.getOpcao();
		}

	}
}