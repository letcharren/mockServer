package models;

public class User {
    int id;
    String nickname;
    String country_id;
    Address address;
    String user_type;
    String []tags;
    int point;
    String site_id;
    String permalink;
    Status status;

    public User(int id) {
        this.id = id;
        this.nickname ="COOLSCAPE";
        this.country_id = "MLV";
        this.address = new Address("Caracas","VE-A");
        this.user_type = "normal";
        this.tags= new String[]{"normal"};
        this.point = 4;
        this.site_id = "MLV";
        this.permalink ="http://perfil.mercadolibre.com.ve/COOLSCAPE";
        this.status = new Status("active");
    }

    public class Address{
        String city;
        String State;

        public Address(String city, String state) {
            this.city = city;
            State = state;
        }
    }

    public class Status{
        String site_status;

        public Status(String site_status) {
            this.site_status = site_status;
        }
    }
}