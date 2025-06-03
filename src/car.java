
public class car {
	int x,y,vx,vy;
	public car(int x,int y,int vx) {
		this.x=x;
		this.y=y;
		this.vx=vx;
	}
	public void draw (MyFrame frame) {
		frame.fillOval(x,y,30,30);
		frame.fillOval(x+60,y,30,30);
		frame.fillRect(x-10,y-30,110,30);
		frame.fillRect(x+10,y-60,70,60);
	}
	public void move() {
		x+=vx;
		
	}

}
