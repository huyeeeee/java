package niuke;

public class FrogJumpFloor {
    public int JumpFloor(int target){
        if (target < 2){
            return 1;
        }
        return JumpFloor(target -1) + JumpFloor(target - 2);
    }
}
