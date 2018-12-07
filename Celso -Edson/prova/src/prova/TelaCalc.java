package prova;

import java.awt.Container;
import java.awt.Label;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCalc extends JFrame{
	
	MaskFormatter formatTel = null;
	
	JTextField txtvisor = new JTextField ("0");
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	JButton btntracomenos = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisOuMenos = new JButton("+/-");
	JButton btnR = new JButton("R...");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btndivisao = new JButton("/");
	JButton btnporcetagem = new JButton("%");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnmult = new JButton("*");
	JButton btnmetade = new JButton("1/x");
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnmenos = new JButton("-");
	JButton btnigual = new JButton("=");
	JButton btn0 = new JButton("0");
	JButton btnvirgula = new JButton(",");
	JButton btnSoma = new JButton("+");
	
	

	
	public TelaCalc(){
		super("Calculadora - Prova");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		
		paine.add(txtvisor);
		txtvisor.setBounds(20, 20, 292, 50);	
	
		paine.add(btnMC);
		btnMC.setBounds(20, 80, 52, 20);
		
		paine.add(btnMR);
		btnMR.setBounds(80, 80, 52, 20);
		
		paine.add(btnMS);
		btnMS.setBounds(140, 80, 52, 20);
		
		paine.add(btnMmais);
		btnMmais.setBounds(200, 80, 52, 20);
		
		paine.add(btnMmenos);
		btnMmenos.setBounds(260, 80, 52, 20);
		
		paine.add(btntracomenos);
		btntracomenos.setBounds(20, 105, 52, 20);
		
		paine.add(btnCE);
		btnCE.setBounds(80, 105, 52, 20);
		
		paine.add(btnC);
		btnC.setBounds(140, 105, 52, 20);
		
		paine.add(btnMaisOuMenos);
		btnMaisOuMenos.setBounds(200, 105, 52, 20);
		
		paine.add(btnR);
		btnR.setBounds(260, 105, 52, 20);
		
		paine.add(btn7);
		btn7.setBounds(20, 130, 52, 20);
		
		paine.add(btn8);
		btn8.setBounds(80, 130, 52, 20);
		
		paine.add(btn9);
		btn9.setBounds(140, 130, 52, 20);
		
		paine.add(btndivisao);
		btndivisao.setBounds(200, 130, 52, 20);
		
		paine.add(btnporcetagem);
		btnporcetagem.setBounds(260, 130, 52, 20);
		
		paine.add(btn4);
		btn4.setBounds(20, 155, 52, 20);
		
		paine.add(btn5);
		btn5.setBounds(80, 155, 52, 20);
		
		paine.add(btn6);
		btn6.setBounds(140, 155, 52, 20);
		
		paine.add(btnmult);
		btnmult.setBounds(200, 155, 52, 20);
		
		paine.add(btnmetade);
		btnmetade.setBounds(260, 155, 52, 20);
		
		paine.add(btn1);
		btn1.setBounds(20, 180, 52, 20);
		
		paine.add(btn2);
		btn2.setBounds(80, 180, 52, 20);
		
		paine.add(btn3);
		btn3.setBounds(140, 180, 52, 20);
		
		paine.add(btnmenos);
		btnmenos.setBounds(200, 180, 52, 20);
		
		paine.add(btnigual);
		btnigual.setBounds(260, 180, 52, 45);
		
		paine.add(btn0);
		btn0.setBounds(20, 205, 113, 20);
		
		paine.add(btnvirgula);
		btnvirgula.setBounds(140, 205, 52, 20);
		
		paine.add(btnSoma);
		btnSoma.setBounds(200, 205, 52, 20);
		

		
		
		
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(340, 280);
	}
	public static void main(String args[]){
		TelaCalc tela = new TelaCalc();
	}
}