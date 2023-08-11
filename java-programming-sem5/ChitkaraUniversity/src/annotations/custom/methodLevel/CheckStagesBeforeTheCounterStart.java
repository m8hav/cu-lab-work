package annotations.custom.methodLevel;

public class CheckStagesBeforeTheCounterStart {
    private boolean status;
    public CheckStagesBeforeTheCounterStart(boolean status) {
        this.status = status;
    }
    @OnSuperPriority
    public String isOxygenOn() {
//        boolean isOxygenOn = true;
//        return status;
        return String.valueOf(status).toUpperCase();
    }
    public boolean isNetLinkOn() {
//        boolean isNetLinkOn = true;
        return status;
    }
    public boolean isFuelOn() {
//        boolean isFuelOn = true;
        return status;
    }
    public boolean isPowerOn() {
//        boolean isPowerOn = true;
        return status;
    }
}
