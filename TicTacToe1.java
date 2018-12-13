import java.util.*;
class Show {
		int a1,a2,a3,a4,a5,a6,a7,a8;
		int g1,g2,g3,g4,g5,g6,g7,g8;
	public void disp(int b[]) {
			System.out.println(" | "+b[0] +" | " +b[1] +" | "+b[2]+" | \n" );
			
			System.out.println(" | "+b[3] +" | " +b[4]+" | "+b[5]+" | \n");
			System.out.println(" | "+b[6] +" | " +b[7] +" | "+b[8]+" | \n" );
			a1=b[0]+b[1]+b[2];
			a2=b[3]+b[4]+b[5];
			a3=b[6]+b[7]+b[8];
			a4=b[0]+b[4]+b[8];
			a5=b[2]+b[4]+b[6];
			a6=b[0]+b[3]+b[6];
			a7=b[1]+b[4]+b[7];
			a8=b[2]+b[5]+b[8];

			if(a1==3 || a2==3 ||a3==3 || a4==3 || a5==3 || a6==3 || a7==3 || a8==3) {
				System.out.println("X is Winner");
				System.exit(0);
			}
			else if(a1==-3 || a2==-3 ||a3==-3 || a4==-3 || a5==-3 || a6==-3 || a7==-3 || a8==-3) {
				System.out.println("O is Winner");
				System.exit(0);
			}
	}
	public void check(int b[]) {
			g1=b[0]+b[1]+b[2];
			g2=b[3]+b[4]+b[5];
			g3=b[6]+b[7]+b[8];
			g4=b[0]+b[4]+b[8];
			g5=b[2]+b[4]+b[6];
			g6=b[0]+b[3]+b[6];
			g7=b[1]+b[4]+b[7];
			g8=b[2]+b[5]+b[8];	

		if(g5==-2)	{
			if(b[2]==0 && b[2]!=1) {
				b[2]=-1;
			}
			if(b[6]==0 && b[6]!=1) {
				b[6]=-1;
			}
		}
		else if(g4==-2)	{
			if(b[0]==0 && b[0]!=1) {
				b[0]=-1;
			}
			if(b[8]==0 && b[8]!=1) {
				b[8]=-1;
			}
		}
		else if(g1==-2)	{
			if(b[0]==0 && b[0]!=1) {
				b[0]=-1;
			}
			if(b[1]==0 && b[1]!=1) {
				b[1]=-1;
			}
			if(b[2]==0 && b[2]!=1) {
				b[2]=-1;
			}
		}
		else if(g2==-2)	{
			if(b[3]==0 && b[3]!=1) {
				b[3]=-1;
			}
			if(b[5]==0 && b[5]!=1) {
				b[5]=-1;
			}
		}
		else if(g3==-2)	{
			if(b[6]==0 && b[6]!=1) {
				b[6]=-1;
			}
			if(b[7]==0 && b[7]!=1) {
				b[7]=-1;
			}
			if(b[8]==0 && b[8]!=1) {
				b[8]=-1;
			}
		}
		else if(g6==-2)	{
			if(b[0]==0 && b[0]!=1) {
				b[0]=-1;
			}
			if(b[3]==0 && b[3]!=1) {
				b[3]=-1;
			}
			if(b[6]==0 && b[6]!=1) {
				b[6]=-1;
			}
		}
		else if(g7==-2)	{
			if(b[1]==0 && b[1]!=1) {
				b[1]=-1;
			}
			if(b[7]==0 && b[7]!=1) {
				b[7]=-1;
			}
		}
		else if(g8==-2)	{
			if(b[2]==0 && b[2]!=1) {
				b[2]=-1;
			}
			if(b[5]==0 && b[5]!=1) {
				b[5]=-1;
			}
			if(b[8]==0 && b[8]!=1) {
				b[8]=-1;
			}
		}
		else if(g5==2)	{
			if(b[2]==0 && b[2]!=1) {
				b[2]=-1;
			}
			if(b[6]==0 && b[6]!=1 && b[6]!=-1) {
				b[6]=-1;
			}
		}
		else if(g4==2)	{
			if(b[0]==0 && b[0]!=1) {
				b[0]=-1;
			}
			if(b[8]==0 && b[8]!=1) {
				b[8]=-1;
			}
		}
		else if(g1==2)	{
			if(b[0]==0 && b[0]!=1) {
				b[0]=-1;
			}
			if(b[1]==0 && b[1]!=1) {
				b[1]=-1;
			}
			if(b[2]==0 && b[2]!=1) {
				b[2]=-1;
			}
		}
		else if(g2==2)	{
			if(b[3]==0 && b[3]!=1) {
				b[3]=-1;
			}
			if(b[5]==0 && b[5]!=1) {
				b[5]=-1;
			}
		}
		else if(g3==2)	{
			if(b[6]==0 && b[6]!=1) {
				b[6]=-1;
			}
			if(b[7]==0 && b[7]!=1) {
				b[7]=-1;
			}
			if(b[8]==0 && b[8]!=1) {
				b[8]=-1;
			}
		}
		else if(g6==2)	{
			if(b[0]==0 && b[0]!=1) {
				b[0]=-1;
			}
			if(b[3]==0 && b[3]!=1) {
				b[3]=-1;
			}
			if(b[6]==0 && b[6]!=1) {
				b[6]=-1;
			}
		}
		else if(g7==2)	{
			if(b[1]==0 && b[1]!=1) {
				b[1]=-1;
			}
			if(b[7]==0 && b[7]!=1) {
				b[7]=-1;
			}
		}
		else if(g8==2)	{
			if(b[2]==0 && b[2]!=1) {
				b[2]=-1;
			}
			if(b[5]==0 && b[5]!=1) {
				b[5]=-1;
			}
			if(b[8]==0 && b[8]!=1) {
				b[8]=-1;
			}
		}
		else if(g1==1)	{
			if(b[0]==0 && b[0]!=1) {
				b[0]=-1;
			}
			else if(b[2]==0 && b[2]!=1) {
				b[2]=-1;
			}
		}
		else if(g8==1)	{
			if(b[2]==0 && b[2]!=1) {
				b[2]=-1;
			}
			else if(b[8]==0 && b[8]!=1) {
				b[8]=-1;
			}
		}
		else if(g3==1)	{
			if(b[6]==0 && b[6]!=1) {
				b[6]=-1;
			}
			else if(b[8]==0 && b[8]!=1) {
				b[8]=-1;
			}
		}
		else if(g4==1)	{
			if(b[0]==0 && b[0]!=1) {
				b[0]=-1;
			}
			else if(b[8]==0 && b[8]!=1) {
				b[8]=-1;
			}
		}
		else if(g5==1)	{
			if(b[2]==0 && b[2]!=1) {
				b[2]=-1;
			}
			else if(b[6]==0 && b[6]!=-1) {
				b[6]=-1;
			}
		}
		else if(g6==1)	{
			if(b[6]==0 && b[6]!=1) {
				b[6]=-1;
			}
			else if(b[0]==0 && b[0]!=1) {
				b[0]=-1;
			}
		}
	}
}

public class TicTacToe1 {
	public static void main(String[] args) {
	Show s = new Show();
	Random r = new Random();
	Scanner in =new Scanner(System.in);
	int b[] = new int[9];
	int c[] = {0,1,2,3,4,5,6,7,8};
	int p=1,i=0,y=-2,x,d=0,e=1;
	s.disp(b);
	do{
	if(p==1) {
		System.out.println("Enter X turn :");
		x = in.nextInt();
		i++;
		if(x<=8 && x>=0 ) {
			 if(b[x]!=0){
			System.out.println(" position occupied!!!" );
				System.out.println("Enter X turn :");
				 x = in.nextInt();
				s.disp(b);
			}
			if(x==4){
				d=1;
			}
			if(b[x]==0) {
				b[x]=1;
				p=-p;
				s.disp(b);
			}	
		}
 		else {
			System.out.println("Invalid Position!! \n Enter between 0-8 only");
				System.out.println("Enter X turn :");
				 x = in.nextInt();
				b[x]=1;
				s.disp(b);
		}
	}
	else {

		System.out.println("O turn :");	
		if(d==0) {
		System.out.println("4");
			b[4]=-1;
			p=-p;
			i++;
			d=1;
			e=0;
			s.disp(b);
		}
		else{
			if(d==1 && e==1){
				do {
				y=r.nextInt(c.length);
				if(y==0 || y==2 || y==6 || y==8) {
					System.out.println(y);
				b[y]=-1;
				s.disp(b);
				e=0;
				p=-p;
				i++;
				}
				}while(e==1);
			}
			else if(i>0) {
				s.check(b);
				i++;
				p=-p;
				s.disp(b);
			}
		}
	}
	if(i==9) {
		System.out.println("Draw");
		System.exit(0);
	}	
	}while(i<=9);
		System.out.println("Draw");
}
}