package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1000; i > -1; i = i-7){ //lelelet me die
            //im dead inside
            System.out.println(i);
             //ln без нее на одну строку


        }
        for (int i = 1; i <= 10; i++) { // умножение
            System.out.println(7 * i);

        }        for (int i = 10; i >= 1; i--) {
            System.out.println(9 * i);


        }
        int a =3;
        while (a<3){
            System.out.println(a);



        }

     String str = "#";
        while (str.length() < 5) { //do while используется редко
        str = str + "#";

        String [] robots = new String[5];
        System.out.println(Arrays.toString(robots));
        for (int i = 0; i < robots.length; i++) {
            System.out.println("Rbpt00" + 1);

        }
        String [] students = {"maks", "fraky"};
        for (String karan: students     ){
            System.out.println("Hi"+ karan);

        }
        int[] num = {43,-325,56,-3,0};
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0){
                break; //прерывает цикл
            }
            System.out.println(num[1]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("внешний цикл"+i);
            for (int j = 0; j <5 ; j++) {

                System.out.println("внутренний цикл"+j);

            }

        }

    }




}}
