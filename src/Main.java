public class Main {
    public static void main(String[] args) {

        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goBackward(100);
        tank.printPosition();

    }
}
