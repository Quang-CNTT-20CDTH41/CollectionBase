package advance.dev;

import java.io.*;
import java.util.*;


public class MainApp {
	public static List<Shape> readFromFile(String fileName) throws IOException {
		List<Shape> shapes = new ArrayList<>(); 
		FileInputStream fis = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String strLine;

		while ((strLine = br.readLine()) != null) {
			if(strLine.indexOf("#") == 0) {
				String name = strLine.substring(1, strLine.length() - 1);
				double a = Double.parseDouble(br.readLine());
				shapes.add(new Circle(a, name));
			}
		}
		fis.close();
		br.close();
		return shapes;
	}
	public static void print(List<Shape> shapes) {
		for (Shape shape : shapes) {
			System.out.println(shape.toString());
		}
	}
	public static void main(String[] args) throws IOException {
		List<Shape> shapes = readFromFile("input.txt");
		print(shapes);


	}

}
