package cn.kerninventory.demo.datatype;

/**
 * @author Kern
 * @date 2020/4/24 11:34
 * @description
 */
public class IntegerAndIntTest {

    public static void main(String[] args) {

        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);//false

        Integer m=1;
        Integer n=1;
        System.out.println(m==n);//true

        Integer x=128;
        Integer y=128;
        System.out.println(x==y);//false

        /**
         *
         * integer 赋值的时候实际调用了 Integer.valueOf() 方法.
         * IntegerCache 是Integer的内部类，默认情况下缓存了-128 - 127 之间的所有整数对象的引用。
         * 当赋值发生时，会比较当前数值是否在缓存中，如果不在这个区间内，则调用 new Integer() 方法，
         * 因此 在任何情况下比较一个基础数据类型的包装类的值是否相同时。 应该使用.equals() 方法会更加保险,
         * 所有基础数据类型的都重写了equals方法，以确保返回的是当前引用的对象所保存的真实数学值
        public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }

         private static class IntegerCache {
         static final int low = -128;
         static final int high;
         static final Integer cache[];

         static {
         // high value may be configured by property
         int h = 127;
         String integerCacheHighPropValue =
         sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
         if (integerCacheHighPropValue != null) {
         try {
         int i = parseInt(integerCacheHighPropValue);
         i = Math.max(i, 127);
         // Maximum array size is Integer.MAX_VALUE
         h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
         } catch( NumberFormatException nfe) {
         // If the property cannot be parsed into an int, ignore it.
         }
         }
         high = h;

         cache = new Integer[(high - low) + 1];
         int j = low;
         for(int k = 0; k < cache.length; k++)
         cache[k] = new Integer(j++);

         // range [-128, 127] must be interned (JLS7 5.1.7)
         assert IntegerCache.high >= 127;
         }

         private IntegerCache() {}
         }

         public boolean equals(Object obj) {
         if (obj instanceof Integer) {
         return value == ((Integer)obj).intValue();
         }
         return false;
         }

         */


//        基础数据类型就没有这样的风险了
        int i1 = 128 ;
        int i2 = 128 ;
        System.out.println( i1 == i2); //true

        int i3 = 0;
        int i4 = 0;
        System.out.println(i3 == i4); //true

    }
}
