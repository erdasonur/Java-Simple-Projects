/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.game;

/**
 *
 * @author onure
 */
public class Card {
    
    private char value;
    private boolean estimation;
    
    public Card(char value){
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isEstimation() {
        return estimation;
    }

    public void setEstimation(boolean estimation) {
        this.estimation = estimation;
    }
    
}
