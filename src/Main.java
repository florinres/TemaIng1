import java.util.*;

//P1.5.1. Creati un proiect nou. Apoi creati o functie care primeste parametru un obiect String si returneaza un
//obiect String cu literele inversate.
//Apelati aceasta functie din main(), folosind parametrul "A inceput scoala." Afisati rezultatul.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();

        adauga(x, y);
        unesteXY(x, y, xPlusY);
        reuniune(x, y, zSet);
        intersectie(x,y,xMinusY);
        xPlusYLimitedByP(x,y,xPlusYLimitedByP, 3);
    }

    private static void xPlusYLimitedByP(List<Integer> x, List<Integer> y, List<Integer> xPlusYLimitedByP, int p) {
        xPlusYLimitedByP.addAll(x);
        xPlusYLimitedByP.addAll(y);

        for (int j = 0; j < xPlusYLimitedByP.size(); j++) {
            if (xPlusYLimitedByP.get(j) > p) {
                xPlusYLimitedByP.remove(j);
            }
        }
    }

    private static List<Integer> intersectie(List<Integer> x, List<Integer> y, List<Integer> xMinusY) {
        for (int i = 0; i < x.size(); i++) {
            if(!y.contains(x.get(i))) {
                xMinusY.add(x.get(i));
            }
        }

        return xMinusY;
    }

    private static void reuniune(List<Integer> x, List<Integer> y, Set<Integer> zSet) {
        zSet.addAll(x);
        zSet.retainAll(y);
    }

    private static void unesteXY(List<Integer> x, List<Integer> y, List<Integer> xPlusY) {
        xPlusY.addAll(x);
        xPlusY.addAll(y);
    }

    private static void adauga(List<Integer> x, List<Integer> y) {
        for (int i  = 5; i != 0;i--){
            x.add(i);
        }
        Collections.sort(x);
        y.add(7);
        y.add(6);
        y.add(10);
        y.add(9);
        y.add(8);
        y.add(7);
        y.add(3);
        Collections.sort(y);
    }


}