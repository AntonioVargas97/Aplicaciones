public class Triangle extends GeometricObject {

        double side1, side2, side3, s, area, perimeter;

        Triangle(){
        } 

        Triangle (double side1, double side2, double side3, String color, boolean filled){
        }

        public double getSide1() {
            this.getSide1();
            return side1;
        }

        public double getSide2() {
            this.getSide2();
            return side2;
        }

        public double getSide3() {
            this.getSide3();
            return side3;
        }

        double getArea(){
            s = (side1 + side2 + side3);

            area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

            return area;
        }

        double getPerimeter(){
            perimeter = side1+side2+side3;
            return perimeter;
        }

        @Override
        public String toString() {
        return "Triangulo: side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3;
        }

        

}

