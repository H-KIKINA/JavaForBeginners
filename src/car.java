
public class car {
	int x,y,vx,vy;
	double i=0.1;
	public car(int x,int y,int vx) {
		this.x=x;
		this.y=y;
		this.vx=vx;
	}
	public void draw (MyFrame frame) {
		frame.fillRect(x,y,20,20);
		frame.fillRect(x-10,y+10,40,10);
		frame.fillOval(x-5,y+20,10,10);
		frame.fillOval(x+15,y+20,10,10);
	}
	public void move() {
	
		//7-EX2
		i+=0.1;
		x+=vx*i;;
		//7-EX
		if(x>=400) {
			x=0;
		}
		
	}

}
