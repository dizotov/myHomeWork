package HomeWork_06;

public class Animals {

    String name = "Без Имени";
    int runLimit;
    float jumpLimit;
    int swimLimit;

    public Animals(){

    }

    public boolean swim(int meter) {
        boolean canSwim = false;
        if (meter > 0) {
            canSwim = true;
        }
        return canSwim;
    }

    public boolean run(int meter) {
        boolean canRun = false;
        if(meter > 0) {
            canRun = true;
        }
        return canRun;
    }

    public boolean jump(float meter) {
        boolean canJump = false;
        if (meter > 0) {
            canJump = true;
        }
        return canJump;
    }

}
