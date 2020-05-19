package cn.kerninventory.demo.java8stream;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Kern
 * @date 2020/4/24 12:17
 * @description
 */
public class PeekTest {


    public static void main(String[] args) {
        String [] arr = {"123","abc","123456","abcdef"};
        Arrays.stream(arr).filter(e -> e.length() > 3)
                .peek(e -> System.out.println("符合条件的:" + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("转换结果:" + e))
                .distinct()
                .collect(Collectors.toList());




    }

}
