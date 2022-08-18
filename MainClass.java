package com.Homeworks.one;

import java.util.*;

public class MainClass{

	static String randomCharacter(int l){
	String randomChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 		+ "0123456789"
                + "abcdefghijklmnopqrstuvxyz"
                + "!@#$%^&*()_+";

	StringBuilder sb = new StringBuilder(l);
	for (int i = 0 ; i < l ; i ++){
	int Index = (int) (randomChar.length() * Math.random());
	sb.append(randomChar.charAt(Index));
	}

	return sb.toString();

}

	public static int  Occurence(String arr[][] , String element){
       int count = 0;
         for(int i = 0 ; i < arr.length;i++){
             for (int j = 0 ; j <arr.length;j++){
                 if(arr[i][j].contains(element)){
                     count++;
                     System.out.println("index ["+i+","+j+"] - " +count/count+ " Occurrence");
                 }
             }
         }

        return count ;
    }



	public static void main(String [] args){


	Scanner sc = new Scanner(System.in);
	int row = 0;
	int column = 0;
	int l = 3;
	System.out.println("How many row?");
	row = sc.nextInt();
	System.out.println("How many columns?");
	column = sc.nextInt();

	System.out.println("Rows = "+row);
	System.out.println("Columns = "+column);

	String[][] stringArray = new String[row][column];


	 for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j< column; j++) {

                stringArray [i][j] = MainClass.randomCharacter(l);
            }
        }

        for(int k= 0 ; k < row; k++){
            System.out.print("Array");
            for(int n = 0 ; n< column; n++) {
                System.out.print("["+stringArray[k][n]+"]");
            }
            System.out.println("");
        }

   System.out.println("find any elements in this array");
        String elements = sc.next();
        Occurence(stringArray,elements);
    }

}