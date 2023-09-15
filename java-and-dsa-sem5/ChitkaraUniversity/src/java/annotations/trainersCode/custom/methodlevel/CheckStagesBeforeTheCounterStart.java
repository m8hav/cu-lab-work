package java.annotations.trainersCode.custom.methodlevel;

public class CheckStagesBeforeTheCounterStart {

	public CheckStagesBeforeTheCounterStart() {
		System.out.println("Checking All Systems ON...");
	}

	public boolean isPowerOn() {
		boolean isPowerOn = true;
		return isPowerOn;
	}
	
	@OnSuperPriority
	public String isOxygenOn() {
		boolean isOxygenOn = true;
		//return isOxygenOn;
		return String.valueOf(isOxygenOn).toUpperCase();
	}

	public boolean isFuelOn() {
		boolean isFuelOn = true;
		return isFuelOn;
	}

	public boolean isNetlinkOn() {
		boolean isNetlinkOn = true;
		return isNetlinkOn;
	}
	
	@OnSuperPriority
	public String isWaterOn() {
		boolean isWaterOn = true;
		return String.valueOf(isWaterOn).toUpperCase();
	}

	
}
