public class Animal {
    public Animal(String animalName, String animalExhibit) {
        name = animalName;
        exhibit = animalExhibit;
    }
    private static String name = "";
    private static String exhibit = "";
    public String getName() {
        return name;
    }
    public String getExhibit() {
        return exhibit;
    }
}