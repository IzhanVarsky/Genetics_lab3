package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        // your implementation:
        double bound = 5.0;
        ArrayList<double[]> result = new ArrayList<>();
        for (double[] individual : population) {
            final double[] clone = individual.clone();
            for (int i = 0; i < clone.length; i++) {
                double prob = random.nextDouble();
                if (prob < 1.0 / clone.length) {
                    clone[i] = random.nextDouble(-bound, bound);
                }
            }
            result.add(clone);
        }
        return result;
    }
}
