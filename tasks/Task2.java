package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getStreamAbs(new int[]{2, -4, 33, -44, -98, 312})));
        System.out.println(Arrays.toString(getStream100(new int[]{12, 43, 123, 234, 345, 456, 567, 1011})));
        System.out.println(getStreamStrings(Arrays.asList("Абвгд", "Рарар", "Ьыаыа", "Астов")));
    }

    public static int[] getStreamAbs(int[] arr){
        return Arrays.stream(arr).map(Math::abs).toArray();
    }

    public static int[] getStream100(int[] arr){
        return Arrays.stream(arr).map(x -> (x % 2 == 0) ? x * 100 : x - 100).toArray();
    }

    public static List<String> getStreamStrings(List<String> stringsList){
        return stringsList.stream().filter(x -> (x.startsWith("А"))).collect(Collectors.toList());
    }
}