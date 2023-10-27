package lab1.compgraflab1.function;


import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Function {
  public List<Point> getPoints(double x1, double x2, double step){
       List<Point> points = new ArrayList<>();
      for (double x = x1; x <= x2 ; x+= step) {
           double y = (1 + 0.55 * x * x) / (1.5 + sqrt(0.2 + x * x));
           points.add(new Point(x, y));
      }
       return points;
   }
}
