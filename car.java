package Security_Booth;

public class car {
    private String plate;
    private String name;

    public car(String name, String plate) {
        this.name = name;
        this.plate = plate;
    }

    //setters and getters
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public String getPlate() {return this.plate;}
    public void setPlate(String plate) {this.plate = plate;}
}