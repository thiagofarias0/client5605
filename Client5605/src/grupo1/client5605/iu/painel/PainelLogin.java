package grupo1.client5605.iu.painel;

import grupo1.client5605.iu.InterfaceComUsuario;
import grupo1.client5605.logica.Autentificador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.TwitterException;

public class PainelLogin extends Painel implements ActionListener {
	JButton button1 ;
	JButton button2 ;
	JTextField texto;
	JLabel camada1;
	JLabel camada2;

	public PainelLogin( String Titulo, InterfaceComUsuario iu) {
		super(Titulo, iu);
		definaComponentes();
		posicioneComponentes();
	}

	public void definaComponentes() {

		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 22);
		button1=new JButton("Click aqui para gerar o Código");
		button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("ico_twitter.gif"))); 
		button1.setToolTipText("Direciona para site Twitter gerar código de acesso");
		
		button2=new JButton("Entrar");
		button2.setToolTipText("Valida código para acessar sua conta do Client5605");
		
		texto=new JTextField(12);
		ImageIcon img = new ImageIcon(this.getClass()
				.getResource("twitter.jpg")); // a imagem tem que ficar na pasta
												
		camada1 = new JLabel(img, JLabel.CENTER);
		camada2 = new JLabel("Código :");
		camada2.setForeground(Color.WHITE);
		camada2.setFont(fonte);
		
		setBackground(Color.black);	
		setPreferredSize(new Dimension(310, 260));
		
	}
	private void  posicioneComponentes(){
		add(button1);
		add(camada1);
		add(camada2);
		add(texto);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	public boolean eValido(int Codigo) {// fazer codigo para verificar se codigo
										// digitado é valido ou nao
		return true;
	}
	protected void processeAcao(ActionEvent e) {
		iu.acaoConcluida();
	}

	public void actionPerformed(ActionEvent e) {
		Autentificador aut = new Autentificador();
		if (e.getSource() == button1) {
				try {
					aut.autentica();
				} catch (TwitterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		} else if(e.getSource()==button2){
			try {
				aut.setCodigo(texto.getText());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}

	}

}
