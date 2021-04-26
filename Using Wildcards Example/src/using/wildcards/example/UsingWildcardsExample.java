package using.wildcards.example;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author onure
 */
public class UsingWildcardsExample {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        Home home = new Home();
        /*
            As we see here printBuilding method is working with office and home 
            objects because they are substitution of Building 
        */
        System.out.println("******************************************");
        printBuilding(building);
        printBuilding(office);
        printBuilding(home);
        System.out.println("******************************************");
        
        List<Building> buildings = new ArrayList();
        List<Office> offices = new ArrayList();
        List<Home> homes = new ArrayList();
        buildings.add(new Building());
        offices.add(new Office());
        homes.add(new Home());
        buildings.add(new Building());
        offices.add(new Office());
        homes.add(new Home());
        printBuildings(buildings);
        System.out.println("******************************************");
        /*
            As we see here when we try to send offices and homes lists to printBuildings 
            method we see an error as incompatible types can't be converted to
            List<Buildings> because offices and homes lists are not a 
            substitution of List<Buildings>
            printBuildings(offices);
            printBuildings(homes);
        */
        
        /*
            Here with using wildCards to solve the problem and avoiding writing 
            multiple methods
        */
        printBuildingswithWildCards(buildings);
        printBuildingswithWildCards(offices);
        printBuildingswithWildCards(homes);
        System.out.println("******************************************");
        
        /*
            Here we can see using wildCards with super
        */
        printOffices(buildings);
        printOffices(offices);
        
        System.out.println("******************************************");
        
        printHomes(buildings);
        printHomes(homes);
        System.out.println("******************************************");
    }
    
    private static void printBuilding(Building building){
        System.out.println("Constructing a new " + building);
    }

    private static void printBuildings(List<Building> buildings){
        for(int i = 0; i< buildings.size(); i++){
            System.out.println(i + 1 + ". " + buildings.get(i) + " is constructing");
        }
    }
    
    private static void printBuildingswithWildCards(List<? extends Building> buildings){
        for(int i = 0; i< buildings.size(); i++){
            System.out.println(i + 1 + ". " + buildings.get(i) + " is constructing");
        }
    }
    
    private static void printOffices(List<? super Office> offices){
        for(int i = 0; i< offices.size(); i++){
            System.out.println(i + 1 + ". " + offices.get(i) + " is constructing");
        }
    }
    
    private static void printHomes(List<? super Home> homes){
        for(int i = 0; i< homes.size(); i++){
            System.out.println(i + 1 + ". " + homes.get(i) + " is constructing");
        }
    }
}
