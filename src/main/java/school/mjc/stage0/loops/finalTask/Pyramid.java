package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String res="";
        for(int i=1; i<=cathetusLength; i++){
            for (int j=cathetusLength; j>1; j--){
                if(j>i){
                    System.out.print(" ");
                }else {
                    System.out.print(j);
                }
           }
            for (int j=1; j<=cathetusLength; j++) {
                if (j <= i) {
                    System.out.print(j);
                }
            }
           System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
