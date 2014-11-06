/*
 * name:xp
 * 回溯法，八皇后简易版----四皇后
 * */
package eightqueen.com;


public class queen {

	public static int m[]=new int[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show(8);//八皇后
		//show(4);//四皇后


	}

	public static void show(int d)
	{
		int i=0;
		
		m[i]=0;
		i++;
		while(i>=0)
		{
			
			while(test(i,m[i])==false && m[i]<d)
				m[i]++;
			
			if(m[i]<d && i<d)
			{
				
				if(i==d-1)
				{
					print(d);	
					
					m[i]++;
					
				}
				else
				{
					
					i++;
					m[i]=0;
					
					
				}
				
				
			}
			else
			{
				if(i>0)
				{
				i--;
				m[i]++;
				}
			}
			
			
		}
	}
	public static void print(int d)
	{
		for(int i=0;i<d;i++)
		{
		System.out.print(m[i]+",");
		}
		System.out.println();
	}
	public static boolean test(int x,int y)//判断位置能不能放置
	{
		int i=0;
		while(i<x)
		{
			if(m[i]==y || Math.abs(x-i)==Math.abs(y-m[i]))
			{
				return false;
			}
			
			i++;
					
			
		}
		return true;
	}

}
