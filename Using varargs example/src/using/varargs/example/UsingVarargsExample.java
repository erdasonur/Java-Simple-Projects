package using.varargs.example;

/**
 *
 * @author onure
 */
public class UsingVarargsExample {

    public static void main(String[] args) {
        String i1 = "Banana";
        String i2 = "Apple";
        String i3 = "Orange";
        String i4 = "Peach";
        String items[] = {"Banana", "Apple", "Orange", "Peach"};
        printShoppingList();
        printShoppingList(i1);
        printShoppingList(i1, i2);
        printShoppingList(i1, i2, i3);
        printShoppingList(i1, i2, i3, i4);
        printShoppingList(items);
    }
    
    public static void printShoppingList(String... strings){
        System.out.println("Shopping List");
        for (int i =0; i < strings.length ; i++) {
            System.out.println(i + 1  + ". " + strings[i]);            
        }
    }
    
}
