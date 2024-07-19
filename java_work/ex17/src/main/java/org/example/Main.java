package org.example;

import org.example.aa.KiaCar;
import org.example.aa.SamsungCar;

public class Main {
    public static void main(String[] args) {

        SamsungCar samsungCar = new SamsungCar("XM3","예쁨","삼성");
        KiaCar kiaCar = new KiaCar();

        //생성자의용도는 메모리화도 맞지만, 인스턴스에 있는 값을 선언(변경)
        // 초기화 하는데

        System.out.println(samsungCar);
        kiaCar.show();
        }
    }
