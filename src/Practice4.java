
public class Practice4 extends MyFrame{
	public void run() {
		setColor(0,0,0);
		fillRect(10,80,10,100);
		int x=30;
		int y =20;

		for(int i=0;i<20;i++) {
			if(i<9) 
			{
			setColor(y,y,y);
			y+=20;
			}
			else
			{
				setColor(y,y,y);
				y=y-20;
			}
			fillRect(x,80,10,100);
			x+=20;
		}
		
	}
}
