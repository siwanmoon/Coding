#include <stdio.h>

int main(void)
{
	int i,n;
	int arr[100];
	int fib[2][50];

	scanf("%d",&n);

	for(i=1;i<=n;i++)
		scanf("%d",&arr[i]);

	fib[0][0]=1;
	fib[0][1]=0;
	fib[1][0]=0;
	fib[1][1]=1;

	for(i=2;i<=40;i++)
	{
		fib[0][i]=fib[0][i-1]+fib[0][i-2];
		fib[1][i]=fib[1][i-1]+fib[1][i-2];
	}

	for(i=1;i<=n;i++)
		printf("%d %d\n",fib[0][arr[i]],fib[1][arr[i]]);

	return 0;
}