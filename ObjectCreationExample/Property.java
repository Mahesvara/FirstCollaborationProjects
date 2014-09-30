package frameclasses;

public class Property
{
	private double actualValue;
	private final double ASSESSED_VALUE = .6;
	private final double PROPERTY_TAX = .0064;
	public Property()
	{
		actualValue = 0;
	}
	public Property(double actualValue)
	{
		this.actualValue = actualValue;
	}
	public void setActualValue(double actualValue)
	{
		this.actualValue = actualValue;
	}
	public double getActuaValue()
	{
		return actualValue;
	}
	public double getAssessedValue()
	{
		return actualValue * ASSESSED_VALUE;
	}
	public double getPropertyTax()
	{
		return actualValue * PROPERTY_TAX;
	}
}
