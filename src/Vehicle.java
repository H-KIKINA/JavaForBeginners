
public class Vehicle {
	int x,y,vx,vy;
    protected int startX; 
	public Vehicle(int x,int y,int vx ,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
		this.startX = x;
	}
	
	public void resetIfOut(int width, int height) {
        // 画面外（左右上下）に出たら初期位置に戻す
        if (x < -90 ) {
            x = startX+100; 
        }
        else if( x > width + 60) {
        	x = startX-90;
        }
    }
	
	public void draw(MyFrame f) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	public void move() {
		x+=vx;
		y+=vy;
		}
	
}
