package Ch9_AdvancedArrays;

import org.jetbrains.annotations.NotNull;

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        names.add("Abigail");
        nums.add(1);
        display(names);
        display(nums);
        names.add("Brian");
        nums.add(2);
        display(names);
        display(nums);
        names.add("Zachary");
        nums.add(3);
        display(names);
        display(nums);
        names.add(2, "Christy");
        display(names);
        names.remove(1);
        display(names);
        nums.remove(2);
        display(nums);
        names.set(0, "Annette");
        display(names);
        nums.set(0, 3);
        display(nums);
    }
    public static void display(@NotNull ArrayList arrList) {
        String type = " Element: ";
        if(!arrList.isEmpty()){
            if(arrList.get(0) instanceof String)
                type = " Name: ";
            if(arrList.get(0) instanceof Integer)
                type = " Integer: ";
        }
        System.out.println("\nThe size of the list is " + arrList.size());
        for(int x = 0; x < arrList.size(); ++x)
            System.out.println("position " + x + type +
                    arrList.get(x));
    }

}
