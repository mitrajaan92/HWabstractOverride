package com.binary;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Laptop 1: enter the screenSize: ");
        double size1 = s.nextDouble();
        System.out.println("Laptop 1: enter RAM:");
        double ram1 = s.nextDouble();
        System.out.println("Laptop 1: enter SSD:");
        double ssd1 = s.nextDouble();
        System.out.println("Laptop 1: enter processor:");
        double proc1 = s.nextDouble();
        Laptop l1 = new Laptop(size1,ram1,ssd1,proc1);
        System.out.println("Laptop 2: enter the screenSize: ");
        double size2 = s.nextDouble();
        System.out.println("Laptop 2: enter RAM:");
        double ram2 = s.nextDouble();
        System.out.println("Laptop 2: enter SSD:");
        double ssd2 = s.nextDouble();
        System.out.println("Laptop 2: enter processor:");
        double proc2 = s.nextDouble();
        Laptop l2 = new Laptop(size2,ram2,ssd2,proc2);
        System.out.println(l1.toString());
        System.out.println(l2.toString());

        boolean r = l1.equals(l2);
        System.out.println("Is Laptop 1 == Laptop 2? -> "+r);
        System.out.println("------------------------------------------------------------");
        System.out.println("Table 1: enter height: ");
        int h1 = s.nextInt();
        System.out.println("Table 1: enter width:");
        int w1 = s.nextInt();
        System.out.println("Table 1: enter length:");
        int len1 = s.nextInt();
        Table t1 = new Table(h1,w1,len1);
        System.out.println("Table 2: enter height: ");
        int h2 = s.nextInt();
        System.out.println("Table 2: enter width:");
        int w2 = s.nextInt();
        System.out.println("Table 2: enter length:");
        int len2 = s.nextInt();
        Table t2 = new Table(h2,w2,len2);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        t2.checkTotalSale();
        System.out.println("------------------------------------------------------------");
        System.out.println("Light 1: enter wats:");
        int wat1 = s.nextInt();
        System.out.println("Light 1: enter lumens:");
        int lum1 = s.nextInt();
        Light lt1 = new Light(wat1, lum1);
        System.out.println("Light 2: enter wats:");
        int wat2 = s.nextInt();
        System.out.println("Light 2: enter lumens:");
        int lum2 = s.nextInt();

        Light lt2 = new Light(wat2,lum2);
        System.out.println(lt1.toString());
        System.out.println(lt2.toString());
        System.out.println( lt2.checkPowerUTil(0));
        System.out.println(lt1.equals(lt2));

    }
    public int menu(){
        int choice =1;
        Scanner s = new Scanner(System.in);

        while( choice != 0){
            System.out.println("Laptop: 1");
            System.out.println("Table: 2");
            System.out.println("Light: 3");
            System.out.println("Exit: 0");
            choice = s.nextInt();
        }
        return choice;
    }
}
