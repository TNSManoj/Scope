package abstractclass;

public abstract class Shape {
	      abstract void draw();

}
class rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class cricle extends Shape{
	 void draw() {
		System.out.println("drawing circle");
	}
}
