#include <stdio.h>

int main()
{
	int num[5], v_num=0;

	for(int i=0;i<5;i++)
	{
		scanf("%d",&num[i]);
		v_num+=num[i]*num[i];
	}

	printf("%d",v_num%10);

	return 0;
}