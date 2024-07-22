package org.example;

public class Rectangle {
    // 사각형을 구성하는 점과 크기 정보
    int x;
    int y;
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square(){
    return width * height;
    }      //int

    public void show(){
        System.out.println("사각형의 x좌표 = " + x + "    y좌표 = " + y);
    }
    protected boolean contains(Rectangle r){      //boolean
    if((r.x + r.width) <= (x+width) && (r.y + r.height) <= (y+height)){
        return true;
    }else
        return false;
    }
}

