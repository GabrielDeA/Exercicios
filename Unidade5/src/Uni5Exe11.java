public class Uni5Exe11 {
    public static void main(String[] args) throws Exception {
        int Bquebrado = 0;
        for (int index = 1; index < 17; index++) {
            if (index==1) {
                Bquebrado = Bquebrado + 1;
            } else {
                Bquebrado = Bquebrado * 3;
            }
            System.out.println(Bquebrado);
            }
            System.out.println("Biscoitos quebrados ao final do dia: " + Bquebrado);
        }
    }

