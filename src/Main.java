public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 12);
        Triangle triangle = new Triangle("Треугольник", 3, 4, 2);
        Square square = new Square("Квадрат", 24);


        Dog dog = new Dog("Бублик");
        Cat cat = new Cat("Ласточка");

        Drawable[] drawables = {circle, square, triangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure){
          System.out.println(((Figure)drawables[i]).getName() + " Периметр >- " +
                  ((Figure)drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }
            drawables[i].draw();
        }
    }
}
