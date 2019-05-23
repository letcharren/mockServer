package models;

public class Country {

    String id;
    String name;
    String locale;
    String currency_id;
    String decimal_separator;
    String thousands_separator;
    String time_zone;
    GeoInformation geoInformation;
    States []states;

    public Country(String id) {
        this.id = id;
        this.name = "Venezuela";
        this.locale = "es_VE";
        this.currency_id = "VES";
        this.decimal_separator = ";";
        this.thousands_separator = ".";
        this.time_zone = "GMT-04:00";
        this.geoInformation= new GeoInformation(new Location(6.42375f,-66.58973f));
        this.states = new States[]{new States("VE-C", "Apure"), new States("VE-Z", "Amazonas")};
    }

    public class GeoInformation{
        Location location;
        public GeoInformation(Location location) {
            this.location = location;
        }
    }
    public class Location{
        float latitude;
        float longitude;

        public Location(float latitude, float longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }
    public class States{
        String id;
        String name;

        public States(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }

}
