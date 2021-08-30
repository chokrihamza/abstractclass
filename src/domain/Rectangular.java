package domain;

public class Rectangular extends GeometricFigure {

	public Rectangular(String figureType) {
		super(figureType);

	}

	@Override
	public void draw() {
		System.out.println("We draw an/a "+this.getClass());
		

	}

}
