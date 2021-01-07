package se.lexicon.ex1;

public class TelevisionImpl implements Television, SmartTelevision {

    @Override
    public void connectToInternet() {

    }

    @Override
    public void powerToggle() {

    }

    @Override
    public void raiseVolume() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    private void testReset() {
        int max = MAX_CHANNELS;
        //resetFactory();
        Television.resetFactory();
    }

}
