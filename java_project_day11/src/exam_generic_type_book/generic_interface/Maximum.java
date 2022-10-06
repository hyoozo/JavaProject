package exam_generic_type_book.generic_interface;

public interface Maximum<T extends Comparable<T>> {
    T max();
}

class NumUtil<T extends Comparable<T>> implements Maximum<T> {
    T[] value;

    public NumUtil(T[] value) {
        this.value = value;
    }

    @Override
    public T max() {
        T v = value[0];
        for (int i = 0; i < value.length; i++) {
            if (value[i].compareTo(v) > 0) {
                v = value[i];
            }
        }
        return v;
    }
}


