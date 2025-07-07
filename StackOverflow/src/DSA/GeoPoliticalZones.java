package DSA;

public enum GeoPoliticalZones {

    NORTH_CENTRAL ("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    NORTH_EAST ("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST ("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST ("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH ("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    SOUTH_WEST ("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo", "Plateau");

    private String[] geoPoliticalZones;

    GeoPoliticalZones(String...geoPoliticalZones) {
        this.geoPoliticalZones = geoPoliticalZones;
    }
}
