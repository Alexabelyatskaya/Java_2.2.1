public class BonusMilesService {
    public int calculate(int cost) {
        int step = 20;
        int bonus = cost / step;

        return bonus;
    }
}