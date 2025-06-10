import java.util.Vector;
public class practice8 extends MyFrame{
		public void run() {
			Vector<Vehicle> vehicles=new Vector<Vehicle>();
			vehicles.add(new car(10,30,3,0));
			vehicles.add(new car(350,100,-3,0));
			vehicles.add(new Train(10,170,7,0));
			vehicles.add(new Train(350,210,-7,0));
			vehicles.add(new Truck(10,280,10,0));
			vehicles.add(new Truck(10,350,10,0));
			
			 while (true) {
	                clear();
	                int width = getWidth();
	                int height = getHeight();

	                for (Vehicle v : vehicles) {
	                    v.draw(this);
	                    v.move();
	                    v.resetIfOut(width, height);  // ← ここで判定＆戻す
	                }

	                sleep(0.1);
	            }
			
			/*while(true)
			{
				while(i <=windowWidth || i>=windowWidth)
				clear();
				for(int j=0;j<vehicles.size();j++) {
					vehicles.get(j).draw(this);
					vehicles.get(j).move();
				}
				sleep(0.1);
			}*/
			}
		}


