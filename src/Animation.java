
public class Animation extends MyFrame{
	public void run() {
		/*5-1
		int y=200;
		int x =30;
		while(y>=60) 
		{
			clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				y-=10;
				sleep(0.1);
		}
		while(x<=200) {
			clear();
			setColor(0,128,0);
			fillOval(x,y,50,50);
			x+=20;
			sleep(0.1);
		}*/
		
		/*5-2
		int x=30;
		int y=30;
		while(x<=200 && y<=200) 
		{
			clear();
			setColor(0,128,0);
			fillOval(x,y,50,50);
			x+=5;
			y+=5;
			sleep(0.1);
		}
		while(x>=30 && y>=200) 
		{
			clear();
			setColor(0,128,0);
			fillOval(x,y,50,50);
			x-=5;
			sleep(0.1);
		}
		while (x<=200 && y>=30)
		{
			clear();
			setColor(0,128,0);
			fillOval(x,y,50,50);
			x+=5;
			y-=5;
			sleep(0.1);
		}*/
		
		/*5-3
		int x =40;
		for(int i=1;i<=3;i++) 
		{
			while(x<200) 
			{
				clear();
				setColor(0,128,0);
				fillOval(x,40,50,50);
				x+=5;
				sleep(0.1);
			}
			while(x>40) 
			{
				clear();
				setColor(0,128,0);
				fillOval(x,40,50,50);
				x-=5;
				sleep(0.1);
			}
		}*/
		/*5-EX
		int x=40;
		int y=40;
		
		while(true) 
		{
			if(x<150 && y==40) 
			{
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				x+=5;
				sleep(0.1);
			}
			if(x==150 && y<150) 
			{
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				y+=5;
				sleep(0.1);
			}
			if(x<=150 && y==150) 
			{
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				x-=5;
				sleep(0.1);
			}
			if(x==40 && y<=150) 
			{
				clear();
				setColor(0,128,0);
				fillOval(40,y,50,50);
				y-=5;
				sleep(0.1);
			}
		}*/
		
		int x=40;
		int y=40;
		int i=0;
		while(true) 
		{	
		 while (x<150 && i % 40==0) 
			{
				x+=5;
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				sleep(0.1);
				i=0;
			}
			//下方向
			    y+=5;
				clear();
				setColor(0,128,0);
				fillOval(x,y,50,50);
				i++;
				sleep(0.1);
			while(x>40 && i % 20==0) 
			{
				x-=5;
			    clear();
			    setColor(0,128,0);
			    fillOval(x,y,50,50);
			    sleep(0.1);
			}
			
			
		 }
		
		
	}
}


