package day38_methods;

import sun.security.rsa.RSAUtil;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};
        ArrayUtils.printArray(nums);

        //bu da kisa yolu yukardakinin
        ArrayUtils.printArray(new int[] {23,64,23,534,234,45,234,45});//bu sekilde de declare edilebilir.

        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int[]{23,64,23,534,234,45,234,45}));
    }
}
