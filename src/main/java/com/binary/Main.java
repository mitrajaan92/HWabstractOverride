package com.binary;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//   System.out.println("Laptop 2: enter SSD:");
//        double ssd2 = s.nextDouble();
//        System.out.println("Laptop 2: enter processor:");
//        double proc2 = s.nextDouble();
//        Laptop l2 = new Laptop(size2,ram2,ssd2,proc2);
//        System.out.println(l1.toString());
//        System.out.println(l2.toString());
//
//        boolean r = l1.equals(l2);
//        System.out.println("Is Laptop 1 == Laptop 2? -> "+r);
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Table 1: enter height: ");
//        int h1 = s.nextInt();
//        System.out.println("Table 1: enter width:");
//        int w1 = s.nextInt();
//        System.out.println("Table 1: enter length:");
//        int len1 = s.nextInt();
//        Table t1 = new Table(h1,w1,len1);
//        System.out.println("Table 2: enter height: ");
//        int h2 = s.nextInt();
//        System.out.println("Table 2: enter width:");
//        int w2 = s.nextInt();
//        System.out.println("Table 2: enter length:");
//        int len2 = s.nextInt();
//        Table t2 = new Table(h2,w2,len2);
//        System.out.println(t1.toString());
//        System.out.println(t2.toString());
//        t2.checkTotalSale();
//        System.out.println("------------------------------------------------------------");
//        System.out.println("Light 1: enter wats:");
//        int wat1 = s.nextInt();
//        System.out.println("Light 1: enter lumens:");
//        int lum1 = s.nextInt();
//        Light lt1 = new Light(wat1, lum1);
//        System.out.println("Light 2: enter wats:");
//        int wat2 = s.nextInt();
//        System.out.println("Light 2: enter lumens:");
//        int lum2 = s.nextInt();
//
//        Light lt2 = new Light(wat2,lum2);
//        System.out.println(lt1.toString());
//        System.out.println(lt2.toString());
//        System.out.println( lt2.checkPowerUTil(0));
//        System.out.println(lt1.equals(lt2));


        Laptop[] laptops = new Laptop[10];
        Table[] tables = new Table[10];
        Light[] light = new Light[10];
        int lapCounter =0;
        int tabCounter =0;
        int ligCounter =0;
        boolean stop = false;
        while (!stop){
            int selected = menu();
            if(selected ==1){
                System.out.println("Laptop: enter the screenSize: ");
                double size = s.nextDouble();
                System.out.println("Laptop: enter RAM:");
                double ram = s.nextDouble();
                System.out.println("Laptop: enter SSD:");
                double ssd = s.nextDouble();
                System.out.println("Laptop: enter processor:");
                double proc = s.nextDouble();
                Laptop lap = new Laptop(size,ram,ssd,proc);
                laptops[lapCounter]= lap;
                lapCounter++;
            }
            else if(selected == 2){
                System.out.println("Table: enter height: ");
                int h = s.nextInt();
                System.out.println("Table: enter width:");
                int w = s.nextInt();
                System.out.println("Table: enter length:");
                int len = s.nextInt();
                Table tab = new Table(h,w,len);
                tables[tabCounter]= tab;
                tabCounter++;
            } else if (selected == 3) {
                System.out.println("Light: enter wats:");
                int wat = s.nextInt();
                System.out.println("Light: enter lumens:");
                int lum = s.nextInt();
                Light lt = new Light(wat, lum);
                light[ligCounter]=lt;
                ligCounter++;
            }
            else if(selected == 4){
                for(int i = 0; i<lapCounter; i++){
                    System.out.println(laptops[i].toString());
                }
            }
            else if(selected == 5){
                for(int i = 0; i<ligCounter; i++){
                    System.out.println(light[i].toString());
                }
            }
            else if(selected == 6){
                for(int i = 0; i<tabCounter; i++){
                    System.out.println(tables[i].toString());
                }
            }
            else if(selected == 0){
                System.out.println("You chose to exit! Exiting...");
                stop =true;
            }
        }
    }
    public static int menu(){
        int choice;
        Scanner s = new Scanner(System.in);
            System.out.println("Register Laptop: 1");
            System.out.println("Register Table: 2");
            System.out.println("Register Light: 3");
            System.out.println("Show Laptops: 4");//not done
            System.out.println("Show All Lights: 5");
            System.out.println("Show All Tables: 6");
            System.out.println("Exit: 0");
            System.out.print("Please select one of the above options: ");
            choice = s.nextInt();
        return choice;
    }
}
