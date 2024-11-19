public class Animal {
    private String name = "";
    private String exhibit = "";
    public Animal(String animalName, String animalExhibit) {
        name = animalName;
        exhibit = animalExhibit;
    }
    public String getName() {
        return name;
    }
    public String getExhibit() {
        return exhibit;
    }
}