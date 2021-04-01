/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Rhegan - 219273693
 */
public class pet_parlour {
    public String petIn, petOut, Balance;

    public String getPetIn() {
        return petIn;
    }

    public void setPetIn(String petIn) {
        this.petIn = petIn;
    }

    public String getPetOut() {
        return petOut;
    }

    public void setPetOut(String petOut) {
        this.petOut = petOut;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    @Override
    public String toString() {
        return "pet_parlour{" + "petIn=" + petIn + ", petOut=" + petOut + ", Balance=" + Balance + '}';
    }
    
}