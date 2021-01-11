package se.lexicon.model;

public enum Gender {
    MALE(1, 'M'), FEMALE(2, 'F'), NON_BINARY(3, 'N');

    private int id;
    private char type;

    Gender(int id, char type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
