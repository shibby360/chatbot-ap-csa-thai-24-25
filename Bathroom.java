public class Bathroom {
    private String exhibit = "";
    private String direction = "";
    public Bathroom(String exhibitName, String direct) {
        exhibit = exhibitName;
        direction = direct;
    }
    public String getExhibit() {
        return exhibit;
    }
    public String getDirection() {
        return direction;
    }
}