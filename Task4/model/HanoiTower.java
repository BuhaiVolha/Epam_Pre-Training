package by.epam_pre_training.task4.model;

import static by.epam_pre_training.task4.view.View.*;

public class HanoiTower {
    
    public static String showTowerMovement(int rings, char source, char receiver, char temp) {
        
        if (rings == 0) {
            return "";
        }
        return moveTower(Math.abs(rings), source, receiver, temp).toString();
    }
    
    
    private static StringBuilder moveTower(int rings, char source, char receiver, char temp) {
        StringBuilder stringWithTowerMoves = new StringBuilder();

        if (rings > 0) {
            stringWithTowerMoves.append(moveTower(rings - 1, source, temp, receiver));
            stringWithTowerMoves.append(source + " --> " + receiver + "\n");
            stringWithTowerMoves.append(moveTower(rings - 1, temp, receiver, source));
        }
        return stringWithTowerMoves;
    }
}
