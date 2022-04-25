import java.util.Scanner;
public class fruitJuice {
    private int product_code;
    private int pack_size;
    private int product_price;
    private String flavour;
    private String pack_type;

    public fruitJuice() {
        product_code=0;
        pack_size=0;
        product_price=0;
        flavour="";
        pack_type="";
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Product Code: ");
        product_code = in.nextInt();
        System.out.print("Pack Size: ");
        pack_size = in.nextInt();
        System.out.print("Product Price: ");
        product_price = in.nextInt();
        System.out.print("Flavour: ");
        flavour = in.nextLine();
        System.out.print("Pack Type: ");
        pack_type = in.nextLine();
    }
    public void discount() {
        product_price -= 10;
    }
    public void display() {
        System.out.println("Product Code: " + product_code);
        System.out.println("Pack Size: " + pack_size);
        System.out.println("Product Price: " + product_price);
        System.out.println("Flavour: " + flavour);
        System.out.println("Pack Type: " + pack_type);
    }
    public static void main(String args[]) {
        fruitJuice obj = new fruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}
