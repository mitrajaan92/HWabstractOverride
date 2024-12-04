package com.binary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Laptop l1 = new Laptop(12,4,123,2);
        Laptop l2 = new Laptop(12,5,456,2);
        boolean r = l1.equals(l2);
        System.out.println("l1 compared with l2: "+r);
        System.out.println(l2.toString());

        Table t1 = new Table(5,5,5);
        Table t2 = new Table(2,2,2);
        System.out.println(t1.toString());
        t2.checkTotalSale();

        Light lt1 = new Light(300,3);
        Light lt2 = new Light(400,3);
        System.out.println( lt2.checkPowerUTil(0));
        System.out.println(lt1.toString());
        System.out.println(lt1.equals(lt2));

    }
}