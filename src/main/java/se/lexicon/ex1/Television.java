package se.lexicon.ex1;

public interface Television {

    int MAX_CHANNELS = 999;

    void powerToggle();
    void raiseVolume();
    void on();
    void off();
    //More abstract methods

    default void menuTemplate(){
        System.out.println("default font, size, and color");
    }

    static void televisionCompanyConfiguration(){
        System.out.println("default configuration");
    }
    static void resetFactory(){
        System.out.println("back to default configuration");
    }

}
