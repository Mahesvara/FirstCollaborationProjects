package frameclasses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PropertyGUI extends JFrame
{
	private JPanel inputPanel;
	private JPanel assessPanel;
	private JPanel taxPanel;
	private JLabel inputLabel;
	private JLabel assessLabel;
	private JLabel taxLabel;
	private JTextField inputField;
	private JTextField assessField;
	private JTextField taxField;
	public PropertyGUI()
	{
		setSize(500,125);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createInputPanel();
		createAssessPanel();
		createTaxPanel();
		setVisible(true);
	}
	public void createInputPanel()
	{
		inputPanel = new JPanel();
		inputLabel = new JLabel("Actual Value of Property");
		inputField = new JTextField(10);
		inputField.addActionListener(new textListener());
		inputPanel.add(inputLabel);
		inputPanel.add(inputField);
		add(inputPanel,BorderLayout.NORTH);
	}
	public void createAssessPanel()
	{
		assessPanel = new JPanel();
		assessLabel = new JLabel("Assessed Value of Property");
		assessField = new JTextField(10);
		assessField.setEditable(false);
		assessPanel.add(assessLabel);
		assessPanel.add(assessField);
		add(assessPanel,BorderLayout.CENTER);
	}
	public void createTaxPanel()
	{
		taxPanel = new JPanel();
		taxLabel = new JLabel("Property Tax on Property");
		taxField = new JTextField(10);
		taxField.setEditable(false);
		taxPanel.add(taxLabel);
		taxPanel.add(taxField);
		add(taxPanel,BorderLayout.SOUTH);
	}
	private class textListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Property home = new Property(Double.parseDouble(inputField.getText()));
			assessField.setText(String.valueOf(home.getAssessedValue()));
			taxField.setText(String.valueOf(home.getPropertyTax()));
		}
	}
	public static void main(String args[])
	{
		new PropertyGUI();
	}
}
