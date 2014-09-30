package frameclasses;

public class MonthlySalesTaxSystem 
{
	final double STATE_SALES_TAX = .04;
	final double NATION_SALES_TAX = .02;
	double monthlySales;
	public MonthlySalesTaxSystem()
	{
		monthlySales = 0;
	}
	public MonthlySalesTaxSystem(double monthlySales)
	{
		this.monthlySales = monthlySales;
	}
	public double getSales()
	{
		return monthlySales;
	}
	public double getStateTax()
	{
		return monthlySales * STATE_SALES_TAX;
	}
	public double getNationTax()
	{
		return monthlySales * NATION_SALES_TAX;
	}
}
