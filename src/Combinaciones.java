import java.util.Scanner;
public class Combinaciones {


    static void CombinationPossible(int Input_Array[], int Empty_Array[], int Start_Element, int End_Element, int Array_Index, int r) {
        if (Array_Index == r) {
            for (int x=0; x<r; x++) {
                System.out.print(Empty_Array[x]+" ");
            }
            System.out.println("");
            return;
        }

        for (int y=Start_Element; y<=End_Element && End_Element-y+1 >= r-Array_Index; y++) {
            Empty_Array[Array_Index] = Input_Array[y];
            CombinationPossible(Input_Array, Empty_Array, y+1, End_Element, Array_Index+1, r);
        }
    }

    static void Print_Combination(int Input_Arrary[], int n, int r) {
        int Empty_Array[]=new int[r];
        CombinationPossible(Input_Arrary, Empty_Array, 0, n-1, 0, r);
    }

}

