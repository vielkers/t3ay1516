package keith.lim.ex7;

public class Item {

    int itemID;
    String itemDesc;
    String itemType;
    float price;
    float qty;
    String uom;

    public Item(int itemID, float qty) {
        this.itemID = itemID;
        this.qty = qty;


        if(this.itemID==1){
            itemDesc = "Chihuahua";
            itemType = "Dog";
            price = 6000;
            uom = "Box";
        }

        if(this.itemID==2){
            itemDesc = "Shark";
            itemType = "Fish";
            price = 20000;
            uom = "Aquarium";
        }

        if(this.itemID==3){
            itemDesc = "Gerbil";
            itemType = "Rodent";
            price = 500;
            uom = "Handful";
        }

        else{
            System.out.println("Please input an available item code:\n1 = Chihuahua\n2 = Shark\n3 = Gerbil");
        }
    }

    public static float getTotal (Item thing){

        float totPrice = thing.price*thing.qty;
        return totPrice;
    }
}
