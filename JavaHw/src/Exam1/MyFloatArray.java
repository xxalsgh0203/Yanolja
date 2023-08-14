package Exam1;

import java.util.Arrays;
import java.util.Comparator;

public class MyFloatArray {

    private float[] floatArrays;
    private int size;

    public MyFloatArray(){
        size = 10;
        floatArrays = new float[10];
    }

    public MyFloatArray(int size){
        this.size = size;
        floatArrays = new float[size];
    }
    public void add(float value){
        int newCapacity = floatArrays.length + 1;
        float[] newArray = Arrays.copyOf(floatArrays, newCapacity);
        newArray[newCapacity - 1] = value;
        floatArrays = newArray;
    }

    public int size(){
        return floatArrays.length;
    }

    public float get(int index){
        return floatArrays[index];
    }

    Comparator<Float> descendingComparator = new Comparator<Float>() {
        @Override
        public int compare(Float f1, Float f2) {
            // f2.compareTo(f1)를 사용하여 내림차순 정렬
            return f2.compareTo(f1);
        }
    };

    public void descSort(){
        Arrays.sort(floatArrays, 0, size);
        int left = 0;
        int right = size - 1;
        while (left < right) {
            float temp = floatArrays[left];
            floatArrays[left] = floatArrays[right];
            floatArrays[right] = temp;
            left++;
            right--;
        }
    }
}
