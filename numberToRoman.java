package pseudoCodes1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class numberToRoman {

	public static void main(String[] args) {
//		Symbol       Value
//		I             1
//		V             5
//		X             10
//		L             50
//		C             100
//		D             500
//		M             1000
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		numberToRoman nr=new numberToRoman();
		nr.numToRoman(num);
		
		
		
	}
     void numToRoman(int num)
    {
    	int [] intCode= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    	String [] sCode= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<intCode.length;i++)//646-500=D;146-100=c;46-40=XL;6-5=V+I
    	{
    	 while(num>=intCode[i]) {
    		 sb.append(sCode[i]);
    		 num-=intCode[i];
    	 }
    	}
    	System.out.println(sb.toString());
    }
}
