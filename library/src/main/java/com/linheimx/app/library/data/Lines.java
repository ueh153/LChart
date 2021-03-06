package com.linheimx.app.library.data;

import java.util.List;

/**
 * Created by Administrator on 2016/11/13.
 */

public class Lines {

    private List<Line> lines;

    protected float mYMax = -Float.MAX_VALUE;
    protected float mYMin = Float.MAX_VALUE;
    protected float mXMax = -Float.MAX_VALUE;
    protected float mXMin = Float.MAX_VALUE;

    public Lines(List<Line> lines) {
        setLines(lines);
    }

    public List<Line> getLines() {
        return lines;
    }

    public void setLines(List<Line> lines) {
        this.lines = lines;
        calMinMax(lines);
    }

    private void calMinMax(List<Line> lines) {

        for (Line line : lines) {
            if (line.getmXMin() < mXMin) {
                mXMin = line.getmXMin();
            }
            if (line.getmXMax() > mXMax) {
                mXMax = line.getmXMax();
            }

            if (line.getmYMin() < mYMin) {
                mYMin = line.getmYMin();
            }
            if (line.getmYMax() > mYMax) {
                mYMax = line.getmYMax();
            }
        }
    }


    public float getmYMax() {
        return mYMax;
    }

    public float getmYMin() {
        return mYMin;
    }

    public float getmXMax() {
        return mXMax;
    }

    public float getmXMin() {
        return mXMin;
    }
}
