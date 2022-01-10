// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main()
{
      srand(time(NULL)); 
  // write code here
//cout<<"yeah we are starting c++";  // leave the following line in all programs
 	int a;
	int b;
	int i;
	char sym;
	int xx;
	int yy;
	cout<< "Please type a character: ";
	cin>>sym;
	cout<<"Please type a width: ";
	cin>>a;
	cout<<"Please type a height: ";
	cin>>b;
	cout<<"Please type a x value: ";
	cin>>xx;
	cout<<"Please type a y value: ";
	cin>>yy;
	
	
	
	//across top good
	for(i=0;i<a;i++)
	{
	gotoxy(xx+i,yy);
	cout<<sym;
	}
	//down on the left good
	for(i=0;i<b;i++)
	{
	gotoxy(xx,yy+i);
	cout<<sym;
	}
	//across bot
	for(i=0;i<a;i++)
	{
	gotoxy(xx+i,yy+b-1);
	cout<<sym;
	}
	//down on the right
	for(i=0;i<b;i++)
	{
	gotoxy(a-1+xx,yy+i);
	cout<<sym;
	}


      getch();
}

