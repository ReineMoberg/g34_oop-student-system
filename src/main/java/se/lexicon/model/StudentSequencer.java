package se.lexicon.model;

public class StudentSequencer {

    private static int sequencer = 1000000;

    public static int nextId(){
        return  ++sequencer; // 1000001
    }

    public static void restSequencer(){
        sequencer = 1000000;
    }

}
