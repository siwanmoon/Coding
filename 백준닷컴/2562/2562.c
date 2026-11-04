#include <stdio.h>

int main(void)
{
	int max=0,max_n,i,n;

	for(i=1;i<=9;i++)
	{
		scanf("%d",&n);

		if(n>max)
		{
			max=n;
			max_n=i;
		}
	}

	printf("%d\n%d",max,max_n);

	return 0;
}