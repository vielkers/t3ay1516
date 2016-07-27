package ysai.bravo.Ex6;

/**
 * Created by IE on 7/26/2016.
 */
public class item {
    public static void main(String[] args){
        int num = 12345;
        String[] descr = new String[]{"Magnum Almond", "Ziploc bag", "Nestle Koko Krunch"};
        int[] qty=new int[]{1,2,5};
        String[] uom=new String[]{"EA", "BT", "PK"};

        po po = new po(num,descr,qty,uom);

        int[] CompanyId=new int[]{941253, 845602, 45936};
        String[] CompanyName=new String[]{"Unilever", "SC Johnson", "Nestle"};
        String[] address={"United Kingdom", "USA", "Philippines"};
        String[] phone= {"8969586", "1598631", "7865234"};

        Company CO = new Company(CompanyId, CompanyName, address, phone);

        int[] ID = {912646, 159863, 879652};
        String[] type = {"Food", "Household products", "Groceries"};
        float[] price = {50.75f, 1699.50f, 500.80f};

                System.out.println("PO Number: " + po.num + "\n\n---------------\n");
        int c;

                for (c = 0; c < 3; c++) {
            System.out.println("Item ID: " + ID[c]);
            System.out.println("Item Description: " + po.descr[c]);
            System.out.println("Item Type: " + type[c] + "\n");
            System.out.println("Vendor ID: " + CO.CompanyId[c]);
            System.out.println("Vendor Name: " + CO.CompanyName[c]);
            System.out.println("Vendor Address: " + CO.address[c]);
            System.out.println("Vendor Phone: " + CO.phone[c] + "\n");
            System.out.println("Price: " + price[c]);
            System.out.println("UOM: " + po.uom[c]);
            System.out.println("Quantity: " + po.qty[c]);
            System.out.println("\n---------------\n");
            }

                float a = 0;
               float n = 0;
               for(c = 0; c < 3; c++) {
                       n = price[c]*po.qty[c];
                  a = a+n;
                    }
                System.out.println("TOTAL PRICE: " + "PHP " + a);
            }
    }
