package oop.exam1;

public class Point3D2 extends Point2D2 {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("z = " + z);
	}

}
