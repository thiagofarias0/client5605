package grupo1.client5605.iu.painel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import grupo1.client5605.iu.InterfaceComUsuario;

public class PainelAjuda extends Painel {
	JLabel help;
	JTextArea texto;
	
	public PainelAjuda(String Titulo, InterfaceComUsuario iu){
		super(Titulo, iu);
		definaComponentes();
		posicioneComponentes();	
	}

	private void definaComponentes() {
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 16);
		
		help = new JLabel("Precisando de ajuda com Client Twitter versão 1.1");//ver jeito melhor de inserir texto
		help.setFont(fonte);
		help.setForeground(Color.white);
		
		texto= new JTextArea("  Explica funcionalidades e xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx  "+"\n"+"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		setPreferredSize(new Dimension(350, 260));
		setBackground(Color.black);
	}
	private void posicioneComponentes() {
		add(help);
		add(texto);
	}

}
