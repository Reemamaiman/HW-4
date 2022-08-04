package HW4;

public class MainClass4 {

        public static int getSmallPositive(int[] arr) {
            int smalNumber = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0)
                    throw new ArithmeticException("Number is negative");

                if (arr[i] < smalNumber)
                    smalNumber = arr[i];
            }

            return smalNumber;
        }

        public static void main(String[] args) {

            int[] arr = {1, 2, 3 , 4};

            try {
                System.out.println(getSmallPositive(arr));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }


