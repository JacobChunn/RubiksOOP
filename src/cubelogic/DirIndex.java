package cubelogic;

public enum DirIndex
{
	primary(0),
	secondary(1);
	
	private int value;

	private DirIndex(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return this.value;
	}
}
