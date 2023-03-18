import java.util.Arrays;

public class DynamicArray<T extends Comparable<T>> {
    private int size = 0;
    private T[] array;

    public DynamicArray() {
        this.size = 0;
        this.array = (T[]) new Comparable[0];
    }

    public DynamicArray(T[] array) {
        this.array = Arrays.copyOf(array, array.length);
        this.size = array.length;
    }

    public void add(T el) {
        if (this.size == this.array.length) {
            this.array = Arrays.copyOf(this.array, this.array.length + 1);
        }

        this.array[this.size] = el;
        ++this.size;
    }

    public void remove(int index) {
        if (index >= 0 && index < this.array.length) {
            for(int i = index; i < this.array.length - 1; ++i) {
                this.array[i] = this.array[i + 1];
            }

            --this.size;
            this.array = Arrays.copyOf(this.array, this.size);
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }

    public void removeByValue(int value) {
        if (this.size == 0) {
            throw new IllegalArgumentException("Преданный массив пустой");
        } else {
            int count = 0;

            for(int i = 0; i < this.array.length; ++i) {
                if (this.array[i].equals(value)) {
                    ++count;
                } else {
                    this.array[i - count] = this.array[i];
                }
            }

            this.size -= count;
            this.array = Arrays.copyOf(this.array, this.size);
        }
    }

    public void findMin() {
        if (this.size == 0) {
            throw new IllegalArgumentException("Переданный массив пуст");
        } else {
            T min = this.array[0];

            for(int i = 0; i < this.array.length; ++i) {
                if (this.array[i].compareTo(min) < 0) {
                    min = this.array[i];
                }
            }

            System.out.println("Минимальный элемент  = " + String.valueOf(min));
        }
    }

    public void findMax() {
        if (this.size == 0) {
            throw new IllegalArgumentException("Переданный массив пуст");
        } else {
            T max = this.array[0];

            for(int i = 0; i < this.array.length; ++i) {
                if (this.array[i].compareTo(max) > 0) {
                    max = this.array[i];
                }
            }

            System.out.println("Максимальный элемент =" + String.valueOf(max));
        }
    }

    public void findSumm() {
        if (this.size == 0) {
            throw new IllegalArgumentException("Переданный массив пуст");
        } else {
            Comparable var2 = this.array[0];
            if (var2 instanceof Integer) {
                Integer summ = (Integer)var2;

                for(int i = 1; i < this.array.length; ++i) {
                    summ = summ + (Integer)this.array[i];
                }

                System.out.println("сумма = " + summ);
            }

        }
    }

    public void findMultiply() {
        if (this.size == 0) {
            throw new IllegalArgumentException("Переданный массив пуст");
        } else {
            Comparable var2 = this.array[0];
            if (var2 instanceof Integer) {
                Integer mult = (Integer)var2;

                for(int i = 1; i < this.array.length; ++i) {
                    mult = mult * (Integer)this.array[i];
                }

                System.out.println("Произведение = " + mult);
            }

        }
    }

    public int findIndGetEl(int value) {
        for(int i = 0; i < this.array.length; ++i) {
            if (this.array[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public boolean haveElmt(int value) {
        for(int i = 0; i < this.array.length; ++i) {
            if (this.array[i].equals(value)) {
                return true;
            }
        }

        return false;
    }

    public void bubbleSort() {
        for(int i = 0; i < this.array.length; ++i) {
            for(int j = 0; j < this.array.length - i - 1; ++j) {
                if (this.array[j].compareTo(this.array[j + 1]) > 0) {
                    T tmp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = tmp;
                }
            }
        }

    }

    public void simpleInsertSort() {
        for(int i = 0; i < this.array.length; ++i) {
            T tmp = this.array[i];

            int j;
            for(j = i; j > 0 && this.array[j - 1].compareTo(tmp) > 0; --j) {
                this.array[j] = this.array[j - 1];
            }

            this.array[j] = tmp;
        }

    }

    public void selectionSort() {
        for(int i = 0; i < this.array.length; ++i) {
            int tmp = i;
            T min = this.array[i];

            for(int j = i + 1; j < this.array.length; ++j) {
                if (this.array[j].compareTo(min) < 0) {
                    tmp = j;
                    min = this.array[j];
                }
            }

            this.array[tmp] = this.array[i];
            this.array[i] = min;
        }

    }

    public T getElByInd(int index) {
        return this.array[index];
    }

    public T getValByInd(int index, T value) {
        if (index >= 0 && index <= this.array.length) {
            return this.array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(this.array));
    }

    public int getLength() {
        return this.array.length;
    }
}

