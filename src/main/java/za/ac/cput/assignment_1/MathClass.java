/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

/**
 *
 * @author Lelihle - 214258041
 */
public class MathClass {
    public int math1, math2, math3;

    public int getMath1() {
        return math1;
    }

    public void setMath1(int math1) {
        this.math1 = math1;
    }

    public int getMath2() {
        return math2;
    }

    public void setMath2(int math2) {
        this.math2 = math2;
    }

    public int getMath3() {
        return math3;
    }

    public void setMath3(int math3) {
        this.math3 = math3;
    }

    @Override
    public String toString() {
        return "MathClass{" + "math1=" + math1 + ", math2=" + math2 + ", math3=" + math3 + '}';
    }
}
