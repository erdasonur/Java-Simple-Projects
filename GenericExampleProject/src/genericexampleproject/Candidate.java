package genericexampleproject;

public abstract class Candidate {
    
    private int turkceNet;
    private int matematikNet;
    private int edebiyatNet;
    private int fizikNet;

    public Candidate(int turkceNet, int matematikNet, int edebiyatNet, int fizikNet) {
        this.turkceNet = turkceNet;
        this.matematikNet = matematikNet;
        this.edebiyatNet = edebiyatNet;
        this.fizikNet = fizikNet;
    }

    public int getTurkceNet() {
        return turkceNet;
    }

    public void setTurkceNet(int turkceNet) {
        this.turkceNet = turkceNet;
    }

    public int getMatematikNet() {
        return matematikNet;
    }

    public void setMatematikNet(int matematikNet) {
        this.matematikNet = matematikNet;
    }

    public int getEdebiyatNet() {
        return edebiyatNet;
    }

    public void setEdebiyatNet(int edebiyatNet) {
        this.edebiyatNet = edebiyatNet;
    }

    public int getFizikNet() {
        return fizikNet;
    }

    public void setFizikNet(int fizikNet) {
        this.fizikNet = fizikNet;
    }
    
    abstract int puanHesapla();
}
