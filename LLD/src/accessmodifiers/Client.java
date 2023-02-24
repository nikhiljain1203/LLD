package accessmodifiers;


public class Client {

    public static void main(String[] args) {
        Student st = new Student();
        st.Name = "XYZ";
        st.age = 12;
        st.batchName = "ABC";
        //st.psp = 10.0; // ERROR as psp is private
    }
}
