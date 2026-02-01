package own.java;
public class DuplicateEasy {
    public static void main(String[] args) {
        String str="Aseel";
        for (int i=0;i<str.length();i++) {
            for (int j=i+1;j<str.length();j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("Duplicate character: " + str.charAt(i));
                    return;
            }
            }
    }
    }
}

