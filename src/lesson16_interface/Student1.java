package lesson16_interface;

public class Student1 implements IScore{

    @Override
    public int[] getScore() {
        return new int[]{100, 90, 80, 70, 60};
    }
    
}
