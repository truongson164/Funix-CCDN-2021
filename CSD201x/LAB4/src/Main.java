public class Main {
    public static void main(String [] args) {
        String [] a = {"f","b","c","a","e","d"};
        int [] b = {25,17,26,19,23,21};
        MyList t = new MyList();
        t.addMany(a,b);

        System.out.println("Traverse:");
        t.traverse();

        System.out.println("Sort by name:");
        t.sortByName();
        t.traverse();
        System.out.println();
    }
}
