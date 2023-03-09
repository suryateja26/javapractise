public class Invoice {
    private int invoiceId;
    private String itemName;
    private int qty;
    private double unitPrice;

    public Invoice(int invoiceId, String itemName, int qty, double unitPrice) {
        this.invoiceId = invoiceId;
        this.itemName = itemName;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return invoiceId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return qty * unitPrice;
    }



    public static void main(String[] args) {
    Invoice item = new Invoice(1, "surya", 2, 10.0); 
    int id = item.getId(); // id = 1
    String itemName = item.getItemName(); // itemName = "item1"
    int qty = item.getQty(); // qty = 2
    double unitPrice = item.getUnitPrice(); // unitPrice = 10.0
    double totalPrice = item.getTotalPrice(); 

    System.out.println("item: Invoice id is "+ id + " itemname is: "+ itemName + " qty is : "+ qty + " unitprice is: " + unitPrice + " totalPrice is: " + totalPrice);
    
    
    }
}
