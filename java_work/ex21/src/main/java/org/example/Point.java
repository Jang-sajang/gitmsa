package org.example;

public class Point implements Cloneable{
    // Cloneable 이 있어야한다. 안에 객체가 있으면 다 클론 해야 함
    private int xpos;
    private int ypos;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Point() {
    }

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }
    public void showPoint(){
        System.out.printf("[%d,%d]\n",xpos,ypos);
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }
}
