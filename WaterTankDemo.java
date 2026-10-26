package cce;

public class WaterTankDemo {
		public static void main(String[] args) {
			//No-argument Constructor
			WaterTank tank1 = new WaterTank();
			tank1.pour(10);
			tank1.pour(20);
			tank1.pour(15);
			System.out.println("Top bucket: " + tank1.checkTop() + "L");
			tank1.drain();
			System.out.println("Buckets left: " + tank1.bucketCount() + " | Total water: " + tank1.bucketCount());
			
			WaterTank tank2 = new WaterTank("Mini Tank" , 3);
			tank2.pour(5);
			tank2.pour(10);
			tank2.pour(15);
			tank2.pour(20);
			tank2.drain();
			tank2.drain();
			tank2.drain();
			tank2.drain();
			System.out.println("Is the tank empty? " + tank2.isEmpty());
		}
	}
