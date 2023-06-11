//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override //General doesn't support cloning
	public GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Generals are unqiue");
	}

	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset not supported");	
	}
}
