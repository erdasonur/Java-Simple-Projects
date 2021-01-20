package genericexampleproject;


public class Verbal extends Candidate{

    public Verbal(int turkceNet, int matematikNet, int edebiyatNet, int fizikNet) {
        super(turkceNet, matematikNet, edebiyatNet, fizikNet);
    }

    @Override
    public int puanHesapla() {
        return getTurkceNet() * 5 + getMatematikNet() * 4 + getEdebiyatNet() * 5 + getFizikNet() * 1;
    }
    
}
