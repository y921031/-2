import java.awt.event.*;

public class VerSlider extends MouseAdapter {
    double minVal, maxVal;
    double val;
    int minY, maxY;

    public VerSlider(double v, double minVal, double maxVal, int minY, int maxY) {
        this.minVal = minVal;
        this.maxVal = maxVal;
        this.minY = minY;
        this.maxY = maxY;
        setValue(v);
    }

    public double getThumbRatio() {
        return (val - minVal) / (maxVal - minVal);
    }

    public int getThumbY() {
        return (int)(minY + (maxY - minY) * getThumbRatio());
    }

    public void setValue(double v) {
        if (v < minVal) v = minVal;
        if (v > maxVal) v = maxVal;
        this.val = v;
    }

    public double getValue() {
        return val;
    }

    public void setValueFromY(int y) {
        if (y < minY) y = minY;
        if (y > maxY) y = maxY;
        double ratio = (double)(y - minY) / (maxY - minY);
        this.val = minVal + (maxVal - minVal) * ratio;
    }
}
