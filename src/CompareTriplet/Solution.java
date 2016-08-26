package CompareTriplet;

import java.util.Scanner;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int a[]=new int[3];
        int b[]=new int [3];
        int al=0;
    	int bo=0;
        for (int i=0;i<3;i++){
        	
        	
        	if(a[i]>b[i]){
        		al++;
        	}
        	
        if(a[i]<b[i]){
        	bo++;
        }
        	
        	
        
        
       /* int a=0;
       int  b=0;
       int c;
      
        if(a0>b0){
            a++;
           
        }else 
             if(a1>b1){
            a++;
           
        }else
             if(a2>b2){
            a++;
           
        }
         if(a0<b0){
            b++;
          
        }
        else if(a1<b1){
            b++;
          
        }
        else if(a2<b2){
            b++;
          
        }
         if(a0==b0){
           c=0;
         
         }
         else if(a1==b1){
        	 c=0;
         }
         else if(a2==b2){
        	 c=0;
         }
        */
      System.out.print(al+" "+bo);
          		
        	}
        
	}}


