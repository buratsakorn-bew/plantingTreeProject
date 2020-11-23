/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planting.trees;

import java.util.Scanner;
public class TestPlantingTrees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tree slot : ");
        int numberOfSlot = sc.nextInt();
        if(numberOfSlot<0){
            System.out.println("Input number greater than 0 !");
            System.out.println("Try again");
            System.out.print("Enter number of tree slot : ");
            numberOfSlot = sc.nextInt();
        }
        
        PlantingTrees treeslot = new PlantingTrees(numberOfSlot);
        System.out.println(treeslot);

        int flag = 0;
        while(flag==0){
            getMenu();
            int selectedMenu = sc.nextInt();
            switch (selectedMenu){
                case 1 :
		    System.out.println();
                    System.out.println("-------- All Plants --------");
                    System.out.print(treeslot);
                    System.out.println("----------------------------");
		    System.out.println();
                    
 		break;
                case 2 :
                    System.out.println();
                    System.out.println("------ Watering Plant ------");
                    System.out.print("Choose number of Slot 0-"+(treeslot.getNumberOfSlot()-1)+" : #" );
                   
                    int slotnumber = sc.nextInt();
                    if(slotnumber < 0 || slotnumber > treeslot.getNumberOfSlot()-1){
                        System.out.println("Please input again");
                        System.out.print("Choose number of Slot 0-"+(treeslot.getNumberOfSlot()-1)+" : #" );
                        slotnumber = sc.nextInt();
                    }
                        treeslot.watering(slotnumber);
			System.out.println();
			System.out.println("L O A D I N G . . .");
			System.out.println();
                        System.out.println("--------- Success ----------");
                        System.out.print(treeslot);
                        System.out.println("----------------------------");
			System.out.println();
  			                   
                    break;
                case 3 :
                    flag = 1;
		    System.out.println("---------THANK YOU----------");
                    
		    break;
                default:
                    flag = 0;
                    System.out.println();
		    System.out.println("--------- TRY AGAIN --------");
                    System.out.println(" Please select menu 1-3 ");
                    break;
            }
        }

    }
    
    public static void getMenu(){
        System.out.println("MENU -----------------------");
        System.out.println("1: Get All Status of Plant");
        System.out.println("2: Water the plants");
        System.out.println("3: Exit Program");
        System.out.println("----------------------------");
        System.out.print("Select : ");
	
    }
} 
