
package singers;

import java.util.ArrayList;


public class Singers {

    private ArrayList<String> singers_list = new ArrayList<String>();
    
    public void showSingers(){
        System.out.println("There are " + singers_list.size() + " singer in the singers list");
        for(int i = 0; i < singers_list.size(); i++){
            System.out.println((i+1) + ". singer : " + singers_list.get(i));
        }
    }
    
    public void addSinger(String name){
        singers_list.add(name);
        System.out.println(name + " has been added to the singers list");
    }
    
    public void updateSinger(String name, int position){
        singers_list.set(position, name);
        System.out.println("Singers list has been updated");
    }
    
    public void removeSinger(int position){
        String name = singers_list.get(position);
        singers_list.remove(position);
        System.out.println(name + " has been deleted from the singers list");
    }
    public void searchSinger(String name){
        if(singers_list.indexOf(name) != -1){
            System.out.println(name + " is on the list");
        }
        else
            System.out.println(name + " isn't on the list");
    }
    
}
