package io.github.rimberse.Java_Programming_Exercises;

public class MovableUser {
	public static void main(String[] args) {
		ConstantSpeedMovable constantSpeed = new ConstantSpeedMovable();
		GenericMovable generic1 = new GenericMovable();
		GenericMovable generic2 = new GenericMovable();
		
		if (generic2.canAccelerate())
			generic2.accelerate();
		
		System.out.println("Time to move 1 km for a constant speed movable: " + constantSpeed.getTimeToMove(1));
		System.out.println("Time to move 1 km for a first generic movable: " + generic1.getTimeToMove(1));
		System.out.println("Time to move 1 km for a second generic movable: " + generic2.getTimeToMove(1));
		
		generic1.brake();
		System.out.println("Time to move 1 km for a first generic movable: " + generic1.getTimeToMove(1));
		
		System.out.println("Total time for a first generic movable: " + getTotalTime(generic1));
		System.out.println("Total time for a second generic movable: " + getTotalTime(generic2));

		// test
		try {
			System.out.println("Total time for a constant speed movable: " + getTotalTime(constantSpeed));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	public static double getTotalTime(MovableObject movableObject) throws IllegalArgumentException {
		if (movableObject instanceof ConstantSpeedMovable) 
			throw new IllegalArgumentException("The given object can neither brake, nor accelerate");
		
		double totalTime = movableObject.getTimeToMove(1);
		System.out.println(totalTime);
		movableObject.brake();
		System.out.println(mToKm(100));
		totalTime += movableObject.getTimeToMove(mToKm(100));
		System.out.println(totalTime);
		movableObject.accelerate();
		totalTime += movableObject.getTimeToMove(1);
		System.out.println(totalTime);
		
		return totalTime;
	}
	
	public static double mToKm(double meters) {
		return meters / 1000;
	}
}