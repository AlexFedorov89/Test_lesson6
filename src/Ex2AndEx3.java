import java.util.ArrayList;
import java.util.List;

public class Ex2AndEx3 {

    private static final int DIG_TO_FIND = 4;

    /*
    2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
    Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
    Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
    Написать набор тестов для этого метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
     */

    public Integer[] arrHandle(Integer[] source) {
        List<Integer> arrToConvert = new ArrayList<>();

        int indPos = -1;

        for (int i = 0; i < source.length; i++) {
            if (source[i] == DIG_TO_FIND) {
                indPos = i;
            }
        }

        if (indPos == -1 || indPos == (source.length - 1)) throw new RuntimeException();

        else {
            for (int i = ++indPos; i < source.length; i++) {
                arrToConvert.add(source[i]);
            }

            return arrToConvert.toArray(new Integer[arrToConvert.size()]);
        }
    }

    /*
    3. Написать метод, который проверяет состав массива из чисел 1 и 4.
    Если в нем нет хоть одной четверки или единицы, то метод вернет false;
    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     */

    public boolean checkArr(int[] source) {
        boolean result = false;

        for (int i = 0; i < source.length; i++) {
            if (source[i] == 1 || source[i] == 4) {
                result = true;
                break;
            }
        }

        return result;
    }
}
