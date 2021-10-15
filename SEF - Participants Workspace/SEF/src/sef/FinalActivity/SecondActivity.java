package sef.FinalActivity;

public class SecondActivity {

    public static class Calculator {

        public Calculator() {
        }

        //Classic, expected function - adding two numbers
        public double add(double x, double y) {
            return x + y;
        }

        //A convenient alternative for performing addition on an array
        public double add(double[] nums) {
            double res = 0;
            for (int i = 0; i < nums.length; i++) {
                res = res + nums[i];
            }
            return res;
        }

        //Subtraction
        public double subtract(double x, double y) {
            return x - y;
        }

        //Multiplication of two numbers
        public double multiply(double x, double y) {
            return x * y;
        }

        //Multiplication of a whole array
        public double multiply(double[] nums) {
            double res = 1;

            for (int i = 0; i < nums.length; i++) {
                res = res * nums[i];
            }
            return res;
        }

        // Division
        public double divide(double x, double y) {
            return x / y;
        }

    }

}
