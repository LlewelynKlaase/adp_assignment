package za.ac.cput.adp3_GitAssignment;

/**
 * Assignment 1
 * Small division program
 * author: Llewelyn Klaase
 * student no: 216267072
 * date 01 April 2021
 * **/

public class Division {

    private int dividend;
    private int divisor;

    public Division() {
    }

    public Division(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
}