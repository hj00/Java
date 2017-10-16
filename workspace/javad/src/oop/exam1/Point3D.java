package oop.exam1;

public class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	public void print() {
		super.print(); //기존 부모에게서 받은 것 그대로 사용하고 재정의 해서 확장하여 사용
		//->overriding오버라이딩.
		System.out.println("z = " + getZ());
	}

}
