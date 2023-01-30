/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasuas;

/**
 *
 * @author ASUS
 */
public class Tugasuas
{

    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=3; j++){
                if(j==1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
        for(int j=n; j<=9; j++){
            if (j==9)
                System.out.print("  ");
            else if (j==8||i==1||i==n||i==3)
                System.out.print("* ");
            else 
                System.out.print("  ");
        }      
        for(int j=11; j<=15; j++)  {
            if(j==15)
                System.out.print("  ");
            else if (j==11 || j==12 && j+i==15 || j==13 && j+i==15 || j==13 && j+i==17 || j==14 && j+i==15 || j==14 && j+i==19 )
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
}
    }
}