package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 5);

        ShapeView view = new ShapeView(square);
        ShapeView view1 = new ShapeView(rectangle);

        view.showArea();
        view1.showArea();
    }
}