public class ArrayList {

    String[] data;
    int nb;


    public ArrayList() {
        this.data = new String[4];
        this.nb = 0;
    }

    void ajout(String s) {
        ensureCapacity(this.nb + 1);
        this.data[nb] = s;
        nb++;
    }

    void ensureCapacity(int n) {
        if ( n <= data.length) {
            return;
        }
        String[] tab2 = new String[2* data.length];
        for (int i = 0; i < data.length; i ++) {
            tab2[i] = data[i];
        }
        this.data = tab2;
    }

    String  get(int i ) {

        return this.data[i];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String i : data) {
            if(i != null)
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        System.out.println(alist.toString());
        alist.ajout("test");
        System.out.println(alist.toString());
        alist.ajout("test");
        System.out.println(alist.toString());
        System.out.println(alist.get(1));


    }
}