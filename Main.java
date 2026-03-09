class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class Main {

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4.");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно преобразовать данные в ячейке [" + i + "][" + j + "].");
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new ArrayIndexOutOfBoundsException("Выход за пределы массива в ячейке [" + i + "][" + j + "].");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] array = {
                {"0", "0", "9", "457"},
                {"333", "75", "784", "8"},
                {"1000", "10", "35", "12"},
                {"95", "56", "15", "9"}
        };

        try {
            int result = sumArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}