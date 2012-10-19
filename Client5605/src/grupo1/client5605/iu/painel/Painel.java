package grupo1.client5605.iu.painel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import twitter4j.TwitterException;

import grupo1.client5605.iu.InterfaceComUsuario;
import grupo1.client5605.logica.Autentificador;

public class Painel extends JPanel implements ActionListener {
	JButton btAcao;
	InterfaceComUsuario iu;

	public Painel(String titulo,
			InterfaceComUsuario interfaceComUsuario) {
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 14);
		this.iu = interfaceComUsuario;
		setBorder(BorderFactory.createTitledBorder( titulo));
		btAcao = new JButton();
		btAcao.addActionListener(this);
	}
	protected void processeAcao(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Método processeAcao não definido",
				"Erro", JOptionPane.ERROR_MESSAGE);
	}

	public void validar(String url) throws IOException, URISyntaxException {
		java.awt.Desktop.getDesktop().browse(new URI(url));
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
