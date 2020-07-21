/*find circle area*/
public class CircleArea {
	float pi = 3.14f;

	public float area(float radius) {

		float ar = pi + radius * radius;
		return ar;

	}

	public static void main(String[] args) {

		CircleArea circle = new CircleArea();
		System.out.println(circle.area(2f));

	}

}
