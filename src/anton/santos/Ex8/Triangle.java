package anton.santos.Ex8;

/**
 * Created by Anton on 7/30/2016.
 */
public class Triangle extends Shape implements Perimeter {

    float s1; float s2; float s3;

    public Triangle (float x, float y, float s1, float s2, float s3){
        super(x,y);
        this.s1=s1; this.s2=s2; this.s3=s3;
    }
    @Override
    public double getPeri(){
        double peri;
        peri =s1+s2+s3;
        return peri;
    }
    public float getS1(){
        return s1;
    }
    public void setS1(float s1){
        this.s1=s1;
    }
    public float gets2(){
        return s2;
    }
    public void setS2(float s2){
        this.s2=s2;
    }
    public float getS3(float s3){
        return s3;
    }
    public void setS3(float s3){
        this.s3=s3;
    }
}
