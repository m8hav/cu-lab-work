#include <stdio.h>
int main()
{
	int days, years, weeks;
  	scanf("%d", &days);
  	years = days/365;
  	days %= 365;
  
  	weeks = days/7;
  	days %= 7;
  	
  	printf("%d %d %d", years, weeks, days);
    return 0;
}