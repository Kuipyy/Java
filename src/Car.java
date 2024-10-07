
class Car {
    //variables: sınıfın en başında tanımlanmalıdır.
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    //methods:
    void increaseSpeed(int increment) { //arabanın hızlanması davranışı
        if ((speed + speedLimit) < speedLimit) {
            speed += increment;
        }

    }
    void decreaseSpeed(int decrement) { //arabanın yavaşlaması davranışı
        if (speed > 0) {
            speed -= decrement;
        }
    }
    void printSpeed(){ //hız göstergesi davranışı
        System.out.println("Hızınız:  " + speed);
    }
}
