package genericexampleproject;


public class GenericExampleProject {

    public static <E extends Candidate> E topRanked(E n1, E n2){
        if(n1.puanHesapla() > n2.puanHesapla())
            return n1;
        else
            return n2;
        
    }
    
    public static void main(String[] args) {
        Numerical numerical1 = new Numerical(38,34,36,32);
        Numerical numerical2 = new Numerical(34,32,38,36);
        
        Numerical topRanked = topRanked(numerical1, numerical2);
        
        Verbal verbal1 = new Verbal(38,34,36,32);
        Verbal verbal2 = new Verbal(34,32,38,36);
        
        Verbal topRankedd = topRanked(verbal1,verbal2);
        
        System.out.println("Top Ranked Student: " + topRanked.puanHesapla());
        System.out.println("Top Ranked Student: " + topRankedd.puanHesapla());
        
        
    }
    
}
