package se.lexicon.ex1;

public interface SmartTelevision {

    void connectToInternet();

    // we cannot use same default method in  multiple interfaces
    /*default void menuTemplate(){
        System.out.println("default font, size, and color");
    }*/


    static void televisionCompanyConfiguration() {
        System.out.println("default configuration");
    }

    static void resetFactory() {
        System.out.println("back to default configuration");
    }

}
