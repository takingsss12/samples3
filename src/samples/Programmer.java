package samples;

public class Programmer {

	public Programmer(String name, Class<? extends Number> lovesNumber) {
		this.name = name;
		this.lovesNumber = lovesNumber;
	}
	
	private final String name;
	private final Class<? extends Number> lovesNumber;
	
	public String getName() {
		return name;
	}
	
	public Class<? extends Number> getLovesNumber() {
		return lovesNumber;
	}

	@Override
	public String toString()
	{
		return name.toUpperCase();
	}
	
}
