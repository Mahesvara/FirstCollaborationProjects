package frameclasses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.io.*;

public class MonthlySalesTaxGUI extends JFrame implements Serializable
{

	private JPanel monthlySaleInputPanel;
	private JPanel stateTaxOutputPanel;
	private JPanel nationTaxOutputPanel;
	private JTextField inputLine;
	private JTextField stateTax;
	private JTextField nationTax;
	private double stateTaxValue = 0 ;
	private double nationTaxValue = 0;
	DecimalFormat moneyFormat = new DecimalFormat("$0.00");
	
	
	public MonthlySalesTaxGUI()
	{
		setSize(500,125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		createMonthlySaleInputPanel();
		createStateTaxOutputPanel();
		createNationTaxOutputPanel();
		add(monthlySaleInputPanel,BorderLayout.NORTH);
		add(stateTaxOutputPanel,BorderLayout.CENTER);
		add(nationTaxOutputPanel,BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void createMonthlySaleInputPanel()
	{
		monthlySaleInputPanel = new JPanel();
		JLabel inputLineLabel = new JLabel("Monthly Sales");
		inputLine = new JTextField(10);
		inputLine.addActionListener(new SaleListener());
		monthlySaleInputPanel.add(inputLineLabel);
		monthlySaleInputPanel.add(inputLine);
	
	
		

	}
	public void createStateTaxOutputPanel()
	{
		stateTaxOutputPanel = new JPanel();
		JLabel stateOutputLabel = new JLabel("State Sales Tax");
		stateTax = new JTextField(10);
		stateTax.setEditable(false);
		stateTax.setText(String.valueOf(stateTaxValue));
		stateTaxOutputPanel.add(stateOutputLabel);
		stateTaxOutputPanel.add(stateTax);
	}
	public void createNationTaxOutputPanel()
	{
		nationTaxOutputPanel = new JPanel();
		JLabel nationOutputLabel = new JLabel("Nation Sales Tax");
		nationTax = new JTextField(10);
		nationTax.setEditable(false);
		nationTax.setText(String.valueOf(nationTaxValue));
		nationTaxOutputPanel.add(nationOutputLabel);
		nationTaxOutputPanel.add(nationTax);
		
	}
	private class SaleListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			MonthlySalesTaxSystem salesTax = new MonthlySalesTaxSystem(Double.parseDouble(inputLine.getText()));
			stateTaxValue = salesTax.getStateTax();
			nationTaxValue = salesTax.getNationTax();
			stateTax.setText(String.valueOf(stateTaxValue));
			nationTax.setText(String.valueOf(nationTaxValue));
		}
		
	}
	
}
