class MyClass implements Cloneable{
    private double value;

    public MyClass(double value) {
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public Object clone() {
        MyClass copy = null;
        try {
            // Call the clone() method of the Object class
            copy = (MyClass) super.clone();
        } catch (CloneNotSupportedException e) {
            // If anything goes wrong during cloning, print the error details
            e.printStackTrace();
        }
        return copy;
    }

}
