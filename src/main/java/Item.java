public class Item {
    int id;
    String title;
    String category_id;
    float precio;
    String currecy_id;
    int quantity;
    String condition;
    String[] pictures;


    public Item(int id) {
        this.id = id;
        this.title = "Creando elemento";
        this.category_id = "MLA1034";
        this.precio = 102.00f;
        currecy_id = "ARS";
        quantity = 10;
        condition = "new";
        pictures = new String[]{"piture1.png","pinture2.jpg"};
    }

}


