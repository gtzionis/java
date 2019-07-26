import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
	
	private JPanel panel = new JPanel();
	private JPanel fieldPanel = new JPanel();
	private JPanel calcPanel = new JPanel();
	
	private JTextField codeField = new JTextField("Code");
	private JTextField destinationField = new JTextField("Destination");
	private JTextField weightField = new JTextField("Weight");
	private JTextField powerField = new JTextField("Power");
	
	private JButton bulkButton = new JButton("Create Bulk");
	private JButton refrButton = new JButton("Create Refridgerator");

	private JButton calcButton = new JButton("Calculate Charge");
	
	private Ship ship;
	
	public GUI(Ship aShip) {
		
		ship = aShip;
		panel.setLayout(new BorderLayout());
		
		fieldPanel.setLayout(new GridLayout(3,2));
		
		fieldPanel.add(codeField);
		fieldPanel.add(destinationField);
		fieldPanel.add(weightField);
		fieldPanel.add(powerField);
		fieldPanel.add(bulkButton);
		fieldPanel.add(refrButton);
		
		calcPanel.add(calcButton);
		
		panel.add(fieldPanel, BorderLayout.NORTH);
		panel.add(calcPanel, BorderLayout.CENTER);
		
		this.setContentPane(panel);
		
		ButtonListener listener = new ButtonListener();
		bulkButton.addActionListener(listener);
		refrButton.addActionListener(listener);
		
		ButtonListener2 listener2 = new ButtonListener2();
		calcButton.addActionListener(listener2);
		
		this.setVisible(true);
		this.setSize(300, 300);
		this.setTitle("Containers");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			String code = codeField.getText();
			String destination = destinationField.getText();
			
			Container container;
			
			if(arg0.getSource().equals(bulkButton)) {
				//επιλέχθηκε το πληκτρο δημιουργίας bulk
				String weightText = weightField.getText();
				double weight = Double.parseDouble(weightText);
				container = new Bulk(code, destination, weight);
			}
			else  {
				String powerText = powerField.getText();
				double power = Double.parseDouble(powerText);
				container = new Refridgerator(code, destination, power);
			}
			ship.addContainer(container);
			System.out.println("Container has been created and added to the ship");
		}	
	}
	
	class ButtonListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Total charge for ship: " + ship.getName() + 
					" is " + ship.calcTotalCharge());
			
		}
		
	}
}
