#include <stdio.h>

int main()
{
	int h,m,cnt=0;

	scanf("%d %d",&h,&m);

	if(m<45)
	{
		m=m+60;
		cnt++;

		if(h==0)
		{
			h=24;
		}
	}

	printf("%d %d",h-cnt,m-45);
}