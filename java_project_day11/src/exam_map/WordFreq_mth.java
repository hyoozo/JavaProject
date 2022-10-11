package exam_map;

import java.util.Objects;

public class WordFreq_mth {
    private String key;
    private int value;

    public WordFreq_mth(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordFreq_mth that = (WordFreq_mth) o;
        return value == that.value && Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
