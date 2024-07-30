package practice;

public class oddeven {

	public static void main(String[] args) {
		int []array= {1,2,3,4,5};
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0)
				System.out.println(array[i]+" ");
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
				System.out.print(array[i]+" ");
			
		}

	}

}
