package ryna.bato.Ex8;

    //inherit (extends) Shape
    //implements Perimeter
    public class Circle extends Shape implements Perimeter{

        public double radius;
        //public double pi = 3.14;

        public Circle(double radius){
            shapeType = "CIRCLE";
            this.radius=radius;
        }

        //@Override
        public double calcPerimeter(){
            //double perimeter = 2*pi*radius;
            //return 2*pi*radius;
            return 3.14*radius*radius;
        }

        public double calcArea(){
            return 2*3.14*radius;
        }

        public Circle (double radius, double pi){
            this.radius = radius;
            //this.pi = pi;
        }

        public double getRadius() {
            return radius;
        }


        public void setRadius(double radius) {
            this.radius = radius;
        }

        /*public double getPi() {
            return pi;
        }*/

        /*public void setPi(double pi) {
            this.pi = pi;
        }*/
    }

