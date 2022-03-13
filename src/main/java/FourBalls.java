import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public int XAXIS = 0;
    public static final int YAXIS  = HEIGHT / 5;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawBallOne();
        drawBallTwo();
        drawBallThree();
        drawBallFour();
        XAXIS++;
    }

    private void drawBallFour() {
        ellipse(XAXIS * 4,YAXIS * 4, 20,20);
    }

    private void drawBallThree() {
        ellipse(XAXIS * 3,YAXIS * 3, 20,20);
    }

    private void drawBallTwo() {
        ellipse(XAXIS * 2,YAXIS * 2, 20,20);
    }

    private void drawBallOne() {
        ellipse(XAXIS * 1,YAXIS, 20,20);
    }

}
