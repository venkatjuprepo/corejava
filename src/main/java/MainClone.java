public class MainClone {
        public static void main(String[] args) {
            MyClass dh = new MyClass(100.00);
            // Clone dh//from   w ww .j  a v a 2 s  .  c o  m
            MyClass dhClone = (MyClass) dh.clone();

            // Print the values in original and clone
            System.out.println("Original:" + dh.getValue());
            System.out.println("Clone :" + dhClone.getValue());

            // Change the value in original and clone
            dh.setValue(2.00);
            dhClone.setValue(4.00);

            // Print the values in original and clone again
            System.out.println("Original:" + dh.getValue());
            System.out.println("Clone :" + dhClone.getValue());
        }
}
