package cn.kerninventor.demos.observer.graze;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Graze
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.observer.graze
 * @Author Kern
 * @Date 2019/12/11 12:46
 * @Description: TODO
 */
public class Pastoralist {

    static List<Grazer> grazers = new ArrayList<Grazer>();

    public static void attach(Grazer grazer){
        grazers.add(grazer);
    }

    public static void detach(Grazer grazer){
        grazers.remove(grazer);
    }

    public static int notifyCount(){
        int count = grazers.stream().mapToInt(e -> e.count()).sum();
        System.out.println(count);
        return count;
    }

    public static void notifyBrowseOn(){
        grazers.forEach(e -> e.browseOn());
    }

    public static void notifyBackToTheFence(){
        grazers.forEach(e -> e.backToTheFence());
    }



}
