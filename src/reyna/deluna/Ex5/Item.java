package reyna.deluna.Ex5;

/**
 * Created by IE on 7/22/2016.
 */
public class Item {

    public static void main(String[] args) {

        int num = 12345;
        String[] descr = new String[]{"Toshiba Canvio Ready 3.0 1TB Portable Hard", "Olay Night Ritual", "Nestle Koko Krunch 500g"};
        int[] qty = new int[]{1, 2, 5};
        String[] uom = new String[]{"EA", "BT", "PK"};

        PurchaseOrder PO = new PurchaseOrder(num, descr, qty, uom);

        int[] CoId = new int[]{941253, 845602, 45936};
        String[] CoName = new String[]{"Toshiba", "Olay", "Nestle"};
        String[] address = {"Japan", "USA", "Philippines"};
        String[] phone = {"8969586", "1598631", "7865234"};

        Company CO = new Company(CoId, CoName, address, phone);

        int[] ID = {912646, 159863, 879652};
        String[] type = {"Computers & Laptops", "Health & Beauty", "Groceries"};
        float[] price = {2650.75f, 1699.50f, 500.80f};

        System.out.println("PO Number: " + PO.num + "\n\n---------------\n");
        int c;

        for (c = 0; c < 3; c++) {
            System.out.println("Item ID: " + ID[c]);
            System.out.println("Item Description: " + PO.descr[c]);
            System.out.println("Item Type: " + type[c] + "\n");
            System.out.println("Vendor ID: " + CO.CoId[c]);
            System.out.println("Vendor Name: " + CO.CoName[c]);
            System.out.println("Vendor Address: " + CO.address[c]);
            System.out.println("Vendor Phone: " + CO.phone[c] + "\n");
            System.out.println("Price: " + price[c]);
            System.out.println("UOM: " + PO.uom[c]);
            System.out.println("Quantity: " + PO.qty[c]);
            System.out.println("\n---------------\n");
        }

        float a = 0;
        float n = 0;
        for(c = 0; c < 3; c++) {
            n = price[c]*PO.qty[c];
            a = a+n;
        }
        System.out.println("TOTAL PRICE: " + "PHP " + a);
    }
}
