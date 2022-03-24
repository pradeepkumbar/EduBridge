
public class SortingEx {

	void selectionSorting(int a[])
	{
		int temp=0;
		int n=a.length;
		for(int i=0;i<=n-2;i++)
		{
			int max=a[i];
			int pos=i;
			for(int j=i+1;j<=n-1;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
					pos=j;
				}
			}
			temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
		}
		
	}
	
	
}
