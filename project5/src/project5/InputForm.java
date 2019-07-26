package project5;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InputForm extends JFrame {

	private ArrayList<Tameio> tameia;
	private JPanel panel;
	private JList list;
	
	private JButton kataxwrisi;
	private JButton ektypwsi;
	
	public InputForm(ArrayList<Tameio> tameia) {
		
		this.tameia = tameia;
		
		panel = new JPanel();
		
		DefaultListModel model = new DefaultListModel();
		for(Tameio t: tameia) {
			model.addElement(t.getTitlos());
		}
		
		list = new JList(model);
		
		kataxwrisi = new JButton("Kataxwrisi");
		ektypwsi = new JButton("Ektypwsi");
		
		panel.add(list);
		panel.add(kataxwrisi);
		panel.add(ektypwsi);
		
		this.setContentPane(panel);
		
		ButtonListener listener = new ButtonListener();
		kataxwrisi.addActionListener(listener);
		ektypwsi.addActionListener(listener);
		
		this.setSize(500, 250);
		this.setVisible(true);
		this.setTitle("Input Form");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == kataxwrisi) {
				new InputForm(tameia);
			}
			
		    if (e.getSource() == ektypwsi) {
			
			 String selectedTameioTitlos = (String)list.getSelectedValue();
			 Tameio selectedTameio = null;
			 for(Tameio t: tameia)
				 if (t.getTitlos().equals(selectedTameioTitlos))
					 selectedTameio = t;
			}		
			
		}
		
	}
	
}
