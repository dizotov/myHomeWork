package HomeWork_06;

public class Dog extends Animals {

    @Override
    public boolean run(int meter){
        boolean canRun = false;
        if (meter < 500){
            canRun = true;
        }
        return canRun;
    }

    @Override
    public boolean jump(float meter){
        boolean canJump = false;
        if (meter < 0.5){
            canJump = true;
        }
        return canJump;
    }
}
