public class HashCode {

        private String name;

        public HashCode(String name) {
            this.name = name;
        }

        /* Re-implement the equals() method */
        public boolean equals(Object otherObject) {
            // Are they the same?
            if (this == otherObject) {
                return true;
            }

            // Is otherObject a null reference?
            if (otherObject == null) {
                return false;
            }

            // Do they belong to the same class?
            if (this.getClass() != otherObject.getClass()) {
                return false;
            }

            // Get the reference of otherObject is a SmartCat variable
            HashCode otherCat = (HashCode) otherObject;

            // Do they have the same names
            boolean isSameName = (this.name == null ? otherCat.name == null : this.name
                    .equals(otherCat.name));

            return isSameName;
        }

        /*
         * Re-implement the hashCode() method, which is a requirement when you
         * re-implement equals() method
         */
        public int hashCode() {
            return (this.name == null ? 0 : this.name.hashCode());
        }
}
