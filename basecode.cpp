// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main()
{
      srand(time(NULL)); 
 	int a;
	int b;
	int ii;
	int i;
	char sym;
	cout<< "Please type a character: ";
	cin>>sym;
	cout<<"Please type a width: ";
	cin>>a;
	cout<<"Please type a height: ";
	cin>>b;
	
	
	for(i=0;i<a;i++)
	{
	cout<<sym;
	}
	for(i=0;i<b;i++)
	{
	gotoxy(0,3+i);
	cout<<sym;
	}
	for(i=0;i<a;i++)
	{
	gotoxy(0+i,b+2);
	cout<<sym;
	}
	for(i=0;i<b;i++)
	{
	gotoxy(a-1,3+i);
	cout<<sym;
	}
	//gotoxy()

      getch();
}
