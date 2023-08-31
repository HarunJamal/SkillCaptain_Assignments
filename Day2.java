public class Day2 {
    public static void main(String[] args){
        byte a = 12;
        short b = 32000;
        int c = 298;
        long d = 244134;
        float e = 234.462f;
        double f = 1.8e307;
        boolean g = true;
        char h = 'f';

        System.out.println(a+" of type "+ ((Object)a).getClass().getSimpleName());
        System.out.println(b+" of type "+ ((Object)b).getClass().getSimpleName());
        System.out.println(c+" of type "+ ((Object)c).getClass().getSimpleName());
        System.out.println(d+" of type "+ ((Object)d).getClass().getSimpleName());
        System.out.println(e+" of type "+ ((Object)e).getClass().getSimpleName());
        System.out.println(f+" of type "+ ((Object)f).getClass().getSimpleName());
        System.out.println(g+" of type "+ ((Object)g).getClass().getSimpleName());
        System.out.println(h+" of type "+ ((Object)h).getClass().getSimpleName());

    }
}
