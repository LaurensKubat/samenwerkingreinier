/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author  Laurens Kubat   s4626249
 * @author  Reinier Sanders s4335422
 */
public class HumanPlayer implements Player {
    private String name;
    private String color;
    
    public HumanPlayer(){
        getNameFromUser();
        getColorFromUser();
    }
    
    @Override
    public int getX() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x cord and press return (between 1 and 3)");
        int xcord = scan.nextInt();
        if (xcord > 0 && xcord < 4) {
            return xcord-1;
        } else {
            System.out.println("make sure it is 1, 2 or 3");
            return getY();
        }
    }
    
    @Override
    public int getY() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the y cord and press return (between 1 and 3)");
        int ycord = scan.nextInt();
        if (ycord > 0 && ycord < 4) {
            return ycord-1;
        } else {
            System.out.println("make sure it is 1, 2 or 3");
            return getY();
        }
        
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return this.color;
    }
    
    @Override
    public void setColor(String color) {
        this.color = color;
    }
        
    public void getNameFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the player's name");
        setName(scan.nextLine());
    }
    
    public void getColorFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + name + "'s symbol (X/O)");
        String color = Character.toString(scan.next().charAt(0));
        switch(color) {
            case "X" : setColor("X"); break;
            case "O" : setColor("O"); break;
            default : System.out.println("Please enter only X or O"); getColorFromUser();
        }
    }
    
}
