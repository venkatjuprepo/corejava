public class MainFinalize {
    public static void main(String[] args) {
            // Create many objects, say 20000 objects.
            for(int i = 0; i < 20000; i++) {
                new Finalize(i);
            }  //  ww w  .j  a va2  s.  co  m
        }
}
