public class Mammals {
	protected int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
	public Mammals(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}