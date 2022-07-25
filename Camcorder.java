package c206_L10;

public class Camcorder extends Item{
	private int optical_Zoom;

	public Camcorder(String assetTag, String description, int optical_Zoom) {
		super(assetTag, description);
		this.optical_Zoom = optical_Zoom;
	}

	public int getOptical_Zoom() {
		return optical_Zoom;
	}
	
	public String toString(){ 
		// Write your codes here
		String output = super.toString();
		output = String.format("%-63s %-20d", output,optical_Zoom); 
		return output;
	}
}

