package main.src;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static List<Integer> mergeSort(List<Integer> l) {
        if (l.size() == 1) return l;

        var x = l.size() / 2;
        var a = mergeSort(l.subList(0, x));
        var b = mergeSort(l.subList(x, l.size()));

        return merge(a, b);
    }
    // 1 2 3 10     2 27 78

    private static ArrayList<Integer> merge(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> retorno = new ArrayList<>();
        int cont_a = 0;
        int cont_b = 0;
        while(retorno.size() < a.size()+b.size()){
            if(cont_a == a.size()) retorno.add(b.get(cont_b++));
            else if(cont_b == b.size()) retorno.add(a.get(cont_a++));
            else {
                if (a.get(cont_a) > b.get(cont_b)) {
                    retorno.add(b.get(cont_b++));
                } else {
                    retorno.add(a.get(cont_a++));
                }
            }
        }
        return retorno;
    }
}


