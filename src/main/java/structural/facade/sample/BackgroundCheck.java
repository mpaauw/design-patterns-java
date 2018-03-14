package structural.facade.sample;

public class BackgroundCheck {

    private boolean hasCleanHistory;

    public BackgroundCheck() {}

    public BackgroundCheck(boolean hasCleanHistory) {
        this.hasCleanHistory = hasCleanHistory;
    }

    public boolean isHasCleanHistory() {
        return hasCleanHistory;
    }

    public void setHasCleanHistory(boolean hasCleanHistory) {
        this.hasCleanHistory = hasCleanHistory;
    }
}
