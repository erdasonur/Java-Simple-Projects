
package comparator.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player{
    private int id;
    private String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

class sortByIdAsc implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId()){
            return -1;
        }
        else if(o1.getId() > o2.getId()){
            return 1;
        }
        return 0;
    }
    
}

class sortByNameAsc implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class sortByIdDesc implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId()){
            return 1;
        }
        else if(o1.getId() > o2.getId()){
            return -1;
        }
        return 0;
    }
    
}

class sortByNameDesc implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return -o1.getName().compareTo(o2.getName());
    }
    
}
public class ComparatorExample {

    public static void main(String[] args) {
        List<Player> list = new ArrayList<>();
        list.add(new Player(0, "Mehmet"));
        list.add(new Player(1, "Ayse"));
        list.add(new Player(2, "Ahmet"));
        list.add(new Player(3, "Zeynep"));
        list.add(new Player(4, "Kemal"));
        
        Collections.sort(list, new sortByIdAsc());
        print(list);
        Collections.sort(list, new sortByIdDesc());
        print(list);
        Collections.sort(list, new sortByNameAsc());
        print(list);
        Collections.sort(list, new sortByNameDesc());
        print(list);
    }
    public static void print(List<Player> list) {
        for(Player player : list){
            System.out.println("id : " + player.getId() + " name : " + player.getName());
        }
        System.out.println("----------------------------------------------------------");
    }
}
