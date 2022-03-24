
public class SortInsertion {
	public void insertionsort(int[] a)
	{
		int item,j;
		int n=a.length;
		for(int i=1;i<=n-1;i++)
		{
			item=a[i];
			j=i-1;
			while(j>=0 && a[j]<item)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=item;
		}
	}

}
