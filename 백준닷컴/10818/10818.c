#include <stdio.h>

int main()
{
	int n,i,a,max=0,min=0;

	scanf("%d",&n);
	scanf("%d",&max);

	min=max;

	for(i=1;i<n;i++)
	{
		scanf("%d",&a);

		if(a<min)
		{
			min=a;
		}

		if(a>max)
		{
			max=a;
		}
	}

	printf("%d %d",min,max);
}