package day5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;//array 검색의 속도가 더 빠르다.


public class ArraysMethod {
    public static void main(String[] args) {

        int[] arr={5,2,8,1,9,3};

        //====주요 메서드=====
        //=======1.배열 출력(toString)=========
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        //=========2.정렬(sort)===========
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //=========3.이진검색(binarySearch)
        int index = Arrays.binarySearch(arr,5);
        System.out.println("5의 인덱스"+index);

        //===4.채우기(fill)====
        int[] zeros = new int[5];
        Arrays.fill(zeros,0);
        System.out.println(Arrays.toString(zeros));

        int[] tens = new int[5];
        Arrays.fill(tens,10);
        System.out.println(Arrays.toString(tens));
        //===5.복사 --기본 타입의 배열의 경우는 깊은 복사
        int[] original={1,2,3};
        int[] copy = Arrays.copyOf(original, original.length);
        int[] longer = Arrays.copyOf(original,5);

        //====6.비교(equals)====
        int[] a ={1,2,3};
        int[] b ={1,2,3};
        int[] c ={1,2,4};

        System.out.println(a==b);
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));

        //배열의 한계
        //1. 크기 고정 (한번 생성하면 크기 변경 불가)
        //2. 중간 삽입/삭제 어려움
        //3. 같은 타입만 저장 => 컬렉션을 통해 해결



// ArrayList: 크기가 자동으로 조절되는 배열
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);       // 추가
        list.add(20);
        list.add(30);

        list.remove(1);     // 삭제 (인덱스 1)

        System.out.println(list);  // [10, 30]
        System.out.println(list.size());  // 2

// → 크기가 자동으로 늘어나고 줄어듦!


    }
}

//오늘의 정리
//선언 :int[] arr;
//생성 arr = new int[크기];
//초기화 int[] arr={값1,값2,값3);
//순회 for(int i =0; i <arr.length; i++)
        //for(int num:arr)
//2차원 int[][] matrix = new int[행][열]
//matrix[행 인덱스][열 인덱스]

