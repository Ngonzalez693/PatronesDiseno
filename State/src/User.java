public class User {
    private State currentState;
    private boolean buying;
    private boolean enabled;

    public User() {
        this.currentState = new ActiveState(this);
        this.buying = false;
        this.enabled = true;
    }

    public void changeState(State state) {
        this.currentState = state;
    }

    public boolean isBuying() {
        return buying;
    }

    public void setBuying(boolean buying) {
        this.buying = buying;
    }

    public boolean getEnable() {
        return enabled;
    }

    public void setEnable(boolean enabled) {
        this.enabled = enabled;
    }

    public String startBuy() {
        if (!enabled) {
            return "Cannot buy, card is disabled.";
        }
        if (!buying) {
            buying = true;
            return "Purchase started.";
        } else {
            return "Already in purchase mode.";
        }
    }

    public String onActive() {
        return currentState.onActive();
    }

    public String onDisable() {
        return currentState.onDisable();
    }

    public String onLock() {
        return currentState.onLock();
    }

    public String onBuy() {
        return currentState.onBuy();
    }
}
