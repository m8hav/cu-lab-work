package annotations.custom.methodLevel;

@SuppressWarnings("redundant")
public class CheckStagesBeforeTheCounterStart {
    @OnSuperPriority
    public String isOxygenOn() {
        boolean isOxygenOn = true;
//        return isOxygenOn;
        return String.valueOf(isOxygenOn).toUpperCase();
    }
    public boolean isNetLinkOn() {
        boolean isNetLinkOn = true;
        return isNetLinkOn;
    }
    public boolean isFuelOn() {
        boolean isFuelOn = true;
        return isFuelOn;
    }
    public boolean isPowerOn() {
        boolean isPowerOn = true;
        return isPowerOn;
    }
}
