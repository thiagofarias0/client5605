package grupo1.client5605.iu;

import grupo1.client5605.iu.menu.*;
import grupo1.client5605.iu.painel.Painel;
import grupo1.client5605.iu.painel.PainelAjuda;
import grupo1.client5605.iu.painel.PainelLogado;
import grupo1.client5605.iu.painel.PainelLogin;
import grupo1.client5605.logica.Autentificador;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InterfaceComUsuario extends JFrame implements ActionListener {
	Autentificador aut;
	Painel painel;
	JLabel camada1;
	JLabel camada2;
	InterfaceComUsuario iu;

	public InterfaceComUsuario() {
		super("Client5605 v1.1");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		definaMenu();
		mostrePainelInicial();
	}

	public void mostrePainelInicial() {
		JPanel p = new JPanel();

		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 27);
		camada1 = new JLabel("Client Twitter versão 1.1");
		camada1.setFont(fonte);
		camada1.setForeground(Color.WHITE);

		ImageIcon img = new ImageIcon(this.getClass()
				.getResource("twitter.jpg")); // a imagem tem que ficar na pasta
												// BIN
		// do projeto , onde ficam os .CLASS
		camada2 = new JLabel(img, JLabel.CENTER);

		// p.setLayout(new FlowLayout(FlowLayout.LEADING));
		p.add(camada1);
		p.add(camada2);

		p.setPreferredSize(new Dimension(300, 250));
		p.setBackground(Color.black);
		setContentPane(p);
		pack();
		//setLocationRelativeTo(null); // centraliza janela na tela
	}

	private void definaMenu() {
		JMenuBar jmb = new JMenuBar();
		JMenu menu = new JMenu("Opções");
		JMenu men = new JMenu("Ajuda");
		JMenuItem item;

		item = new JMenuItem("Login");
		item.setActionCommand(Opcao.LOGIN.name());
		item.addActionListener(this);
		menu.add(item);

		item = new JMenuItem("Principal");
		item.setActionCommand(Opcao.PRINCIPAL.name());
		item.addActionListener(this);
		menu.add(item);
		item = new JMenuItem("Sair");
		item.setActionCommand(Opcao.SAIR.name());
		item.addActionListener(this);
		menu.add(item);
		
		item = new JMenuItem("Ajuda_TF1");
		item.setActionCommand(Opcao.TF1.name());
		item.addActionListener(this);
		men.add(item);

		men.setIcon(new javax.swing.ImageIcon(getClass().getResource("h.gif")));
		jmb.add(menu);
		jmb.add(men);
		setJMenuBar(jmb);
	}

	public void interaja() {
		setVisible(true);
		mostreAbertura();
	}

	private void mostreEncerramento() {
		String msg;

		msg = "Obrigado por usar o Client5605. Volte sempre!";

		JOptionPane.showMessageDialog(this, msg, "",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostreAbertura() {
		String msg;

		msg = "Bem vindo ao Client5605!";

		JOptionPane.showMessageDialog(this, msg, "",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void executeOpcao(Opcao opcao) {
		Autentificador aut = new Autentificador();
		int teste=0;
		switch (opcao) {
		case LOGIN:
			painel = new PainelLogin("",iu);
			teste=1;
			break;

		case PRINCIPAL:
			 painel = new PainelLogado("", iu);
			 teste=2;
			break;
		
		case TF1:
			 painel = new PainelAjuda("", iu);
			 teste=0;
			break;
		}
		setContentPane(painel);
		pack();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Opcao opcao = Opcao.valueOf(e.getActionCommand());

		if (opcao == Opcao.SAIR) {
			mostreEncerramento();
			System.exit(0);
		} else
			executeOpcao(opcao);

	}
	public void acaoConcluida() {
		mostrePainelInicial();
	}

}
