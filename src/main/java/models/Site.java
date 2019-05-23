package models;

public class Site {
    String id;
    String name;
    String country_id;
    String sale_fees_mode;
    int    mercadopago_version;
    String default_currency_id;
    String immediate_payment;
    String []payment_method_ids;
    Currency []currencies;
    Category []categories;

    public Site(String id) {

        this.id = id;
        this.name = "Argentina";
        this.country_id = "AR";
        this.sale_fees_mode = "not_free";
        this.mercadopago_version = 3;
        this.default_currency_id = "ARS";
        this.immediate_payment = "optional";
        this.payment_method_ids = new String[]{"MLAMP","MLAWC","MLAAM","MLABC","MLACD","MLAOT"};
        this.currencies = new Currency[]{new Currency("USD", "U$S"),new Currency("ARS","$")};
        this.categories = new Category[]{new Category("MLA5725","Accesorios para vehiculos"),new Category("MLA1071","Animales y Mascotas")};
    }

    public class Currency{
        String id;
        String name;

        public Currency(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public class Category{
        String id;
        String simbol;

        public Category(String id, String simbol) {
            this.id = id;
            this.simbol = simbol;
        }
    }


}
