package domain;

public abstract class GeometricFigure {
    
	protected String figureType;

	public GeometricFigure(String figureType) {
		this.figureType = figureType;
	}
	
	public abstract void draw();

	public String getFigureType() {
		return figureType;
	}

	public void setFigureType(String figureType) {
		this.figureType = figureType;
	}

	@Override
	public String toString() {
		return "GeometricFigure [figureType=" + figureType + "]";
	}
	
	
	
	
	
	
}
