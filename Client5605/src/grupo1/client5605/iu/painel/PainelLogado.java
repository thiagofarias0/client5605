package grupo1.client5605.iu.painel;

import grupo1.client5605.iu.InterfaceComUsuario;
import grupo1.client5605.logica.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;

import twitter4j.TwitterException;
import twitter4j.User;

public class PainelLogado extends Painel implements ActionListener{
	
	JLabel jL_Foto;
	JTextArea jTA_Status;
	JLabel jL_Restantes;
	JScrollPane jScrollPane2;
	JPanel jP_Tweets;
	Image foto;
	private User eu;
	
	public PainelLogado(String titulo, InterfaceComUsuario iu){
	super(titulo, iu);
	definaComponentes();
	posicioneComponentes();
}
	private void definaComponentes() {
		jL_Foto = new JLabel(new javax.swing.ImageIcon(getClass().getResource("tes.jpg")));
		jTA_Status = new JTextArea();
		jL_Restantes = new JLabel();
		jScrollPane2 = new JScrollPane();
		jP_Tweets = new JPanel();
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 14);
		 jL_Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
	        jL_Foto.setName("jL_Foto"); // NOI18N4
	      //  jL_Restantes.setForeground(Color.WHITE);
	       // jL_Restantes.setText("140");
	      //  jL_Restantes.setName("jL_Restantes"); // NOI18N
	        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ultimos Tweets"));//ver como mudar cor fonte
	        jScrollPane2.setName("jScrollPane2"); // NOI18N
	       
	        
	        jP_Tweets.setName("jP_Tweets"); // NOI18N
	        jP_Tweets.setLayout(new javax.swing.BoxLayout(jP_Tweets, javax.swing.BoxLayout.Y_AXIS));
	        jScrollPane2.setViewportView(jP_Tweets);
	        jScrollPane2.setVerticalScrollBarPolicy(
	        		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//mostra barra rolagem
	      
	        
	        jTA_Status.setColumns(21);
	        jTA_Status.setLineWrap(true);
	        jTA_Status.setRows(3);
	        jTA_Status.setName("jTA_Status"); // NOI18N
	        setBackground(Color.black);
	        setPreferredSize(new Dimension(300, 550));
	        jScrollPane2.setPreferredSize(new Dimension(290,480));
	       // jScrollPane2.setBackground(Color.black);
	}
	
	private void posicioneComponentes() {
		add(jL_Foto);
		add(jTA_Status);
		add(jL_Restantes);
		add(jScrollPane2);
		add(jP_Tweets);
	}
	protected void processeAcao(ActionEvent e) {
		iu.acaoConcluida();
	}
		
@Override
public void actionPerformed(ActionEvent e) {
	try{
		System.out.println("ok");
	}catch (Exception te) {
		System.out.println("falha");
		
	}
	
}

}


