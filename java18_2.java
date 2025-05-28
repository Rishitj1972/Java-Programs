import java.util.*;

interface Bill {
double calculate(double price, int quantity);
}

class Product implements Bill {
int productId;
String name;
double unitPrice;
Product(int productId, String name, double unitPrice) {
this.productId = productId;
this.name = name;
this.unitPrice = unitPrice;
}
public double calculate(double price, int quantity) {
return price * quantity;
}

}
public class java18_2{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
Product p[]= {
new Product(101, "Milk", 25.0),
new Product(102, "Bread", 80.0),
new Product(103, "Wheat", 50.0),
new Product(104, "Rice", 75.0)
};
System.out.println("\nAvailable Products:");
System.out.println("Product ID   Name    Unit Price");
System.out.println("-------------------------------");
for (int i=0;i<4;i++) {
System.out.println(p[i].productId+"\t\t"+ p[i].name+"\t\t"+ p[i].unitPrice);
}

System.out.print("\nEnter Order No.: ");
int orderNo = in.nextInt();
in.nextLine();

System.out.print("Enter Date (DD/MM/YYYY): ");
String date = in.nextLine();

System.out.print("Enter the number of items you want to buy: ");
int n = in.nextInt();
in.nextLine();
int s[] = new int[n];
int quantities[] = new int[n];
double netAmount = 0;
for (int i = 0; i < n; i++) {
System.out.println("\nEnter Product ID: ");
s[i] = in.nextInt();
System.out.println("Enter Quantity: ");
quantities[i] = in.nextInt();
}

// Generate Bill
System.out.println("\nOrder No.: " + orderNo);
System.out.println("Date : " + date);
System.out.println("\nProduct Id     Name    Quantity   Unit Price   Total");
System.out.println("----------------------------------------------------");

for (int i = 0; i < n; i++) {
for (int j=0;j<4;j++) {
if (p[j].productId == s[i]) {
double total = p[j].calculate(p[j].unitPrice, quantities[i]);
netAmount += total;
System.out.println(p[i].productId+"\t \t"+p[i].name+"\t" +quantities[i]+"\t "+ p[i].unitPrice+"\t\t"+ total);
}
}
}

System.out.println("----------------------------------------------------");
System.out.println("Net Amount: "+ netAmount);

}
}
