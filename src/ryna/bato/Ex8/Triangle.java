package ryna.bato.Ex8;

    //inherit (extends) Shape
    //implements Perimeter
    public class Triangle extends Shape implements Perimeter {

        public double tsideA, tsideB, tsideC;

        public Triangle(double tsideA, double tsideB, double tsideC){
            shapeType = "TRIANGLE";
            this.tsideA=tsideA;
            this.tsideB=tsideB;
            this.tsideC=tsideC;
        }

        //implements Perimeter
        //@Override
        public double calcPerimeter(){
            //double perimeter;
            return tsideA+tsideB+tsideC;
            //return perimeter;
        }

        public double getTsideA() {
            return tsideA;
        }

        public void setTsideA(double tsideA) {
            this.tsideA = tsideA;
        }

        public double getTsideB() {
            return tsideB;
        }

        public void setTsideB(double tsideB) {
            this.tsideB = tsideB;
        }

        public double getTsideC() {
            return tsideC;
        }

        public void setTsideC(double tsideC) {
            this.tsideC = tsideC;
        }
    }