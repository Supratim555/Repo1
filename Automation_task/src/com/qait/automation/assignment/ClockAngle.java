package com.qait.automation.assignment;

public class ClockAngle 
{
			public static void main(String []args)
			{
			java.util.Scanner scn=new java.util.Scanner(System.in);
			System.out.println("Enter Clock Time in hh:mm format\n");
			String s= scn.nextLine();
		  
			try{
				int length=s.length();
				String s1=new String(s);
				int n =s1.indexOf(":");
				String hr=s.substring(0, n);
				String mn=s.substring(n+1, length);
				double h= Double.parseDouble(hr);
				double m= Double.parseDouble(mn);
		 
				if(n!=-1){
				
					ClockAngle r = new ClockAngle();
					r.AngleCondition(h,m); 
				}
				else if(n==-1) {
					System.out.println("Type valid data");
				}

			}catch(NumberFormatException e){System.out.println("Sorry! Please enter hour and minute values as integer");}
			catch(ArrayIndexOutOfBoundsException e){System.out.println("Please enter time in HH:MM format.");}
			catch(StringIndexOutOfBoundsException e){System.out.println("Please enter clock time value HH:MM format.");}
	}
				
		
			
	public void AngleCondition(double h, double m)
	{
		double Anglhr = 0.5*(60*h+m);
		double AnglMnt =6*m;                                                   
		double RdAngl = Anglhr-AnglMnt;
		double AcAngl= 360-RdAngl;
		double sprimpose=RdAngl-AcAngl;
		
	 if(h<0||m<0||h>12||m>60)
		 {
			 System.out.println("Wrong input,please enter '0<=hour value<=12' and '0<=minute value<=60"); 
		 }
		 else if(RdAngl<=180)
			{
			System.out.println("small angle is: "+Math.abs(RdAngl)+" degree");
			}
			else if(RdAngl>180)
			{
			System.out.println("small angle is: "+Math.abs(AcAngl)+" degree");
			}
			else if(sprimpose==0)
			{ 
			System.out.println("Small angle is:" + 0 + "degree");
			}
			else
			{
			System.out.println("Type valid data");
			}
			}
	}

