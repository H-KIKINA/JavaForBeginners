import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		Vector<car> cars =new Vector<car>();
		cars.add(new car(50,100,1,0));
		cars.add(new car(50,150,2,0));
		cars.add(new car(50,200,3,0));
		cars.add(new car(50,250,4,0));
		cars.add(new car(50,300,5,0));
		
		while(true)
		{
			clear();
		for(int j=0;j<cars.size();j++) 
		{
			cars.get(j).draw(this);
			cars.get(j).move();
		}
		sleep(0.1);
		}
	 }

}
