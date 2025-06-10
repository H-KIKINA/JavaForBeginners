
public class Truck extends Vehicle{
	public Truck(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw (MyFrame frame) {
		frame.fillRect(x,y,100,20);
		frame.fillRect(x+70,y-20,30,30);
		frame.fillOval(x+5,y+20,10,10);
		frame.fillOval(x+15,y+20,10,10);
		frame.fillOval(x+85,y+20,10,10);
	}

}
