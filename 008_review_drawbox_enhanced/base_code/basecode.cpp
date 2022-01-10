// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main()
{

      srand(time(NULL)); 
  // write code here
//cout<<"yeah we are starting c++";  // leave the following line in all programs
	char sym;
	int row;
	int col;
	int i;
	int x;
	int y;

	cout<<"Please type the symbol: ";
	cin>>sym;
	cout<<"Please type the amount of rows: ";
	cin>>row;
	cout<<"Please type the amount of columns: ";
	cin>>col;
	cout<<"Please type a x value: ";
	cin>>x;
	cout<<"Please type a y value: ";
	cin>>y;
	
	gotoxy(x,y);
	for(int a = 0; a<row ; a++){
		for(int b = 0; b<col ; b++){
	
			cout<<sym;
	
	}
	y = y + 1;
	gotoxy(x,y);
	}
 	
      getch();
}
