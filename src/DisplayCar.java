
public class DisplayCar extends MyFrame{
	public void run() {
		car car1=new car(50,150,10,0);
		car car2=new car(200,250,-10,0);
		for(int i=0; i<30;i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car1.move();
			car2.move();
			sleep(0.1);
		}
	}
}
