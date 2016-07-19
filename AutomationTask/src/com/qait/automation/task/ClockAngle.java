package com.qait.automation.task;

public class ClockAngle 
{
	public static void main(String []args)
		{
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter Clock Time in hh:mm format\n");
		String s=scn.nextLine();
		String time[]=s.split(":");
		String hour=time[0];
		String minute=time[1];

		int hr= Integer.parseInt(hour);
		int mnt= Integer.parseInt(minute);
		double Anglhr = (double)0.5*(hr*60+mnt);
		double AnglMnt =(double) 6*mnt;

		double RdAngl = Anglhr-AnglMnt;
		double AcAngl= 360-RdAngl;
		double sprimpose=RdAngl-AcAngl;
	 if(hr>12||mnt>60)
	 {
		 System.out.println("Wrong input,please provide valid input!!"); 
	 }
	 else if(RdAngl<180)
		{
		System.out.println("small angle is: "+RdAngl+" degree");
		}
		else if(RdAngl>180)
		{
		System.out.println("small angle is: "+AcAngl+" degree");
		}
		else if(sprimpose==0)
		{ 
		System.out.println("Small angle is:" +0+ "degree");
		}
		else
		{
		System.out.println("Type valid data");
		}
		}
}

