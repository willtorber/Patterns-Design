package patterns.bussiness.pattern.flyweight;

import java.util.HashMap;

public class ColorFlyWeight{

	private HashMap<String, Color> mapColor;
	
	
	
	public ColorFlyWeight() {
		super();
		this.mapColor = new HashMap<>();
	}



	public Color getColor(String color) {
		Color colorF = (Color)mapColor.get(color);
		if(colorF==null) {
			colorF = new Color(color);
			mapColor.put(color, colorF);
			System.out.println("Creando color " + color);
		}
		return colorF;
	}

}
