import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList {
    private String[] str = new String[15];
    private int index = 0;


    public String get(int x) {
        return str[x];
    }

    public void add(String s) {
        if (index == str.length - 1) {
            str = Arrays.copyOf(str, str.length * 2);
        }
        str[index++] = s;

    }

    public void remove(String s) {
        int sIndex = index + 1;
        for (int i = 0; i < index; i++) {
            if (str[i].equals(s)) {
                str[i] = null;
                sIndex = i;
                break;
            }
        }
        for (int i = sIndex; i < index; i++) {
            if (i != index - 1)
                str[i] = str[i + 1];
        }
        index--;
    }

    public int size() {
        return index;
    }

    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }
}
