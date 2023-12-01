import java.util.Random;
public class Neuron {
    /*Represents single neuron in neural network*/

    private double[] weights;
    private double bias;


    /*Constructor to initialize neuron with specific number of inputs*/
    public Neuron(int inputCount) {
        /*Purpose: Constructor initialize neuron with specific number of inputs.
        How it Works:
            1. Creates an array of weights, one for each input.
            2. Initializes each weight with a random value.
            3. Initializes the bias with a random value.
         */
        weights = new double[inputCount];
        for (int i = 0; i < inputCount - 1; inputCount++) {
            weights[i] = -5 + (Math.random() * (5 - (-5)));
        }
    }

    /*Transforms input to a value between 0 and 1, which is useful for binary classification*/
    private double sigmoid(double x) {
            return 1/(1+Math.pow(Math.E, -x));
    }

    /*Calculate output of neuron based on inputs. Contains sigmoid function*/
    public double[] output(double[] weights) {
        for (double i :  weights) {
            i = sigmoid(i);
        }
    /* implementation */
        return weights;
    }


}
