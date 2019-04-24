package com.kgisl.code;

/**
 * Block
 */
public class Block {

    Block() {
        System.out.println("Executes 3rd:  Constructor");
    }

    {
        System.out.println("Executes 2nd:  Instance initialization block");
    }
    static {
        System.out.println("Excutes  1st:  Static block always  ");
    }

    public static void main(String[] args) {
        Block b = new Block();
    }
}