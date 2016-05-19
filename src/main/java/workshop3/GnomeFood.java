package workshop3;

import java.util.*;

public class GnomeFood {

    private class ForGnomeFood implements Comparable{
        int growth;
        int number;

        public ForGnomeFood(int growth, int number) {
            this.growth = growth;
            this.number = number;
        }

        public int getGrowth() {
            return growth;
        }

        @Override
        public String toString() {
            return "GnomeFood{" +
                    "growth=" + growth +
                    ", number=" + number +
                    '}';
        }

        public void setGrowth(int growth) {
            this.growth = growth;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int compareTo(Object o) {
            ForGnomeFood tmp = (ForGnomeFood) o;
            return this.growth - tmp.getGrowth();
        }
    }

    public int[] find(int[] gnames, int[] portions) {

        ArrayList<ForGnomeFood> listGnomes = new ArrayList<ForGnomeFood>();
        ArrayList<ForGnomeFood> listPortions = new ArrayList<ForGnomeFood>();

        for (int i = 0; i < gnames.length; i++) {
            listGnomes.add(new ForGnomeFood(gnames[i], i));
            listPortions.add(new ForGnomeFood(portions[i], i));
        }

        Collections.sort(listGnomes);
        Collections.sort(listPortions);

        int[] arrayGnomes = new int[listGnomes.size()];

        for (int i = 0; i < listGnomes.size(); i++) {
            arrayGnomes[listGnomes.get(i).getNumber()] = listPortions.get(i).getNumber();
        }

        return arrayGnomes;
    }
}
