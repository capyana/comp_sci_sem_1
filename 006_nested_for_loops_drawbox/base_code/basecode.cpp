// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
char sym;
	int row;
	int col;
	int i;

	cout<<"Please type the symbol: ";
	cin>>sym;
	cout<<"Please type the amount of rows: ";
	cin>>row;
	cout<<"Please type the amount of columns: ";
	cin>>col;
	
	for(int a = 0; a<row ; a++){
		for(int b = 0; b<col ; b++){
	
			cout<<sym;
	
	}
	cout<<endl;
	}
 	
      getch();
}

