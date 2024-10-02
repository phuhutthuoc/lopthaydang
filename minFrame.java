import java.awt.*;
import java.awt.event.*;
public class minFrame extends Frame implements ActionListener{
	Button bt;
	TextField tfa, tfb, tfc, tfkq;
	public minFrame(){
		bt = new Button("Tim");
		tfa = new TextField();
		tfb = new TextField();
		tfc = new TextField();
		tfkq = new TextField();
		bt.addActionListener(this);
		setLayout(new FlowLayout());
		add(bt); add(tfa); add(tfb); add(tfc); add(tfkq); pack(); setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e){
		int a = Integer.parseInt(tfa.getText());
		int b = Integer.parseInt(tfb.getText());
		int c = Integer.parseInt(tfc.getText());
		tfkq.setText(String.valueOf(Math.min(Math.min(a,b),c)));
	}
	public static void main(String[] args){
		new minFrame();
	}
}