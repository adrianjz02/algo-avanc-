package algoAvance;

public class ArrayList {

    String[] data;
    int nb;

    public ArrayList() {
        this.data = new String[4];
        this.nb = 0;
    }

    boolean ajout(String s) {
        ensureCapacity(this.nb + 1);
        this.data[nb] = s;
        for (String i : this.data) {
            nb++;
            if (i == s) {
                return true;
            }
        }
        return false;

    }

    public void ensureCapacity(int n) {
        if (n <= data.length) {
            return;
        }
        String[] tab2 = new String[2 * data.length];
        for (int i = 0; i < data.length; i++) {
            tab2[i] = data[i];
        }
        this.data = tab2;
    }

    public String get(int i) {
        if (i >= 0 && i < data.length) {
            return this.data[i];
        }
        return "erreur";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String i : data) {
            if (i != null)
                sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        System.out.println(alist.toString());
        alist.ajout("");
        System.out.println(alist.toString());
        for (int i = 0; i < 12; i++) {
            alist.ajout("test" + i);
        }
        System.out.println(alist.toString());
        System.out.println(alist.get(0));

    }
}