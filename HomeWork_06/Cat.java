package HomeWork_06;

public class Cat extends Animals {


    @Override
    public boolean jump(float meter){
        boolean canJump = false;
        if (meter < 2){
            canJump = true;
        }
        return canJump;
    }

    @Override
    public boolean run(int meter){
        boolean canRun = false;
        if (meter < 200) {
            canRun = true;
        }
        return canRun;
    }

    @Override
    public boolean swim(int meter){
        boolean canSwim = false;
        return canSwim;
    }
}
