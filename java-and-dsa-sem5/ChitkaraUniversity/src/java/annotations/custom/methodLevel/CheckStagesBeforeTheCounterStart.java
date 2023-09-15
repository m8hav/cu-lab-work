package java.annotations.custom.methodLevel;

@SuppressWarnings(value = "all")
public class CheckStagesBeforeTheCounterStart {
    private boolean status;
    public CheckStagesBeforeTheCounterStart(boolean status) {
        this.status = status;
    }
    @OnSuperPriority
    public String isOxygenOn() {
        return String.valueOf(status).toUpperCase();
    }
    public boolean isNetLinkOn() {
        return status;
    }
    public boolean isFuelOn() {
        return status;
    }
    public boolean isPowerOn() {
        return status;
    }
}
