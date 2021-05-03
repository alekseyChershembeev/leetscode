import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Aleksey Chershembeev
 * created : 03.05.2021 - 11:42
 * description:
 */
public class TwoSum1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int []{2,7,11,15},9)));;
        System.out.println(Arrays.toString(twoSum2(new int []{2,7,11,15},9)));;
    }

    //On^2
    public static int [] twoSum(int [] arr,int target ){



        for (int i = 0; i < arr.length ; i++) {


            for (int j = 1; j < arr.length ; j++) {

                if (arr[i]+arr[j]==target){

                    return new int[]{i,j};
                }

            }
        }




        return new int []{};
    }


    //On + memory
    public static int [] twoSum2(int[] arr, int target){

        Map<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length ; i++) {

            int diff = target - arr[i];

            if (map.containsKey(diff)){
                return new int []{map.get(diff),i};
            }else {
                map.put(arr[i],i);
            }
        }


        throw  new IllegalArgumentException();
    }
}
