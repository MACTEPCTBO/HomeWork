class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int shiftRows = 1; // Параметры для изменения
        int shiftCols = 0;

        System.out.println("Начальный массив");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        shiftArray(arr, shiftRows, shiftCols);

        System.out.println("Изменённый массив");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shiftArray(int[][] arr, int shiftRows, int shiftCols) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] temp = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[(i + shiftRows) % rows][(j + shiftCols) % cols] = arr[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = temp[i][j];
            }
        }

    }
}
