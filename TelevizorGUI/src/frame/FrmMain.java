package frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import classes.Televizor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMain {

	public JFrame frame;
	private JTextField txtFieldChannel;
	private JTextField txtFieldVol;
    private JButton btnOn;
    private JButton btnOff;
    private JButton btnChannelPlus;
    private JButton btnChannelMinus;
    private JButton btnVolPlus;
    private JButton btnVolMinus;
    
    protected Televizor televizor;
    private JButton btnOn_1;
    private JButton btnOff_1;
    private JButton btnChannelPlus_1;
    private JButton btnChannelMinus_1;
    private JButton btnVolPlus_1;
    private JButton btnVolMinus_1;

	/**
	 * Create the application.
	 */
	public FrmMain() {
		initialize();
		this.televizor=new Televizor();
		setOFFState();
	}

	protected void setONState(){
		televizor.setON();
		txtFieldChannel.setText(String.valueOf(televizor.getChannel()));
		txtFieldVol.setText(String.valueOf(televizor.getVol()));
		btnOn_1.setEnabled(false);
		btnOff_1.setEnabled(true);
		btnChannelPlus_1.setEnabled(true);
		btnChannelMinus_1.setEnabled(true);
		btnVolPlus_1.setEnabled(true);
		btnVolMinus_1.setEnabled(true);		
	}
	
	protected void setOFFState(){
		televizor.setOFF();
		txtFieldChannel.setText("");
		txtFieldVol.setText("");
		btnOn_1.setEnabled(true);
		btnOff_1.setEnabled(false);
		btnChannelPlus_1.setEnabled(false);
		btnChannelMinus_1.setEnabled(false);
		btnVolPlus_1.setEnabled(false);
		btnVolMinus_1.setEnabled(false);		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnOn_1 = new JButton("ON");
		btnOn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setONState();
			}
		});
		btnOn_1.setBounds(107, 56, 89, 23);
		frame.getContentPane().add(btnOn_1);
		
		btnOff_1 = new JButton("OFF");
		btnOff_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setOFFState();
			}
		});
		btnOff_1.setBounds(213, 56, 89, 23);
		frame.getContentPane().add(btnOff_1);
		
		btnChannelPlus_1 = new JButton("Channel +");
		btnChannelPlus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				televizor.PlusChannel();
				txtFieldChannel.setText(String.valueOf(televizor.getChannel()));
				
			}
		});
		btnChannelPlus_1.setBounds(107, 92, 89, 23);
		frame.getContentPane().add(btnChannelPlus_1);
		
		btnChannelMinus_1 = new JButton("Channel -");
		btnChannelMinus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				televizor.MinusChannel();
				txtFieldChannel.setText(String.valueOf(televizor.getChannel()));
			}
		});
		btnChannelMinus_1.setBounds(213, 92, 89, 23);
		frame.getContentPane().add(btnChannelMinus_1);
		
		btnVolPlus_1 = new JButton("Vol +");
		btnVolPlus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				televizor.PlusVol();
				txtFieldVol.setText(String.valueOf(televizor.getVol()));
			}
		});
		btnVolPlus_1.setBounds(107, 126, 89, 23);
		frame.getContentPane().add(btnVolPlus_1);
		
		btnVolMinus_1 = new JButton("Vol -");
		btnVolMinus_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				televizor.MinusVol();
				txtFieldVol.setText(String.valueOf(televizor.getVol()));
			}
		});
		btnVolMinus_1.setBounds(213, 126, 89, 23);
		frame.getContentPane().add(btnVolMinus_1);
		
		txtFieldChannel = new JTextField();
		txtFieldChannel.setBounds(107, 25, 190, 20);
		frame.getContentPane().add(txtFieldChannel);
		txtFieldChannel.setColumns(10);
		
		txtFieldVol = new JTextField();
		txtFieldVol.setBounds(11, 127, 86, 20);
		frame.getContentPane().add(txtFieldVol);
		txtFieldVol.setColumns(10);
	}
}
