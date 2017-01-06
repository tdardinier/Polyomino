import java.util.*;

class Main {
    public static void main(String[] args) {
//        Polyomino P = new Polyomino("[(0,0), (0,1), (0,2), (0,3), (0,4), (1,2), (1,3), (2,1), (2,2), (3,0), (3,1), (3,2), (3,3), (3,4)]");
//        P.dilation(3);
//        P.rotation();
//        P.draw();
        List<Polyomino> l = Manipulate.openFile();
        for (Polyomino p : l) {
            p.reflection_horizontal();
        }
//        Polyomino.draw(l);
        List<Polyomino> all = Manipulate.generateAllFreePolyominoes(3,3);
        System.out.println(all);
        System.out.println(all.size());
        Manipulate.draw(all);
    }
}
