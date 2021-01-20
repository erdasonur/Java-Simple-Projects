/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericexampleproject;

/**
 *
 * @author onure
 */
public class Numerical extends Candidate{

    public Numerical(int turkceNet, int matematikNet, int edebiyatNet, int fizikNet) {
        super(turkceNet, matematikNet, edebiyatNet, fizikNet);
    }
   
    @Override
    public int puanHesapla() {
        return getTurkceNet() * 4 + getMatematikNet() * 5 + getEdebiyatNet() * 1 + getFizikNet() * 5;
    }
    
}
