package lab1.compgraflab1;

import lab1.compgraflab1.function.Function;
import lab1.compgraflab1.function.Point;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @PostMapping("show_data")
    public String updateClient(@RequestParam double x1, @RequestParam double x2, @RequestParam double step, Model model) {
        Function function = new Function();
        List<Point> points = function.getPoints(x1, x2, step);
        List<Double> xData = points.stream().map(Point::getX).toList();
        List<Double> yData = points.stream().map(Point::getY).toList();
        model.addAttribute("xData", xData);
        model.addAttribute("yData", yData);
        return "index";
    }

}
