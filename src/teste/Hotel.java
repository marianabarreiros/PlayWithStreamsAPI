package teste;

public class Hotel {
  private char classification;
  private String name;

    public Hotel(char classification, String name) {
        this.classification = classification;
        this.name = name;
    }

    public char getClassification() {
        return classification;
    }

    public String getName() {
        return name;
    }
}
