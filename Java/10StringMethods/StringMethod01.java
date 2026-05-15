class StringMethod{
    public static void main(String[] args) {
        String msg = "Welcome Java String Method";

        System.out.println(msg);

        // length
        System.out.println("Length : " + msg.length());

        // toUpperCase
        System.out.println("toUpperCase : " + msg.toUpperCase());

        // toLowerCase
        System.out.println("toLowerCase : " + msg.toLowerCase());

        // charAt
        System.out.println("charAt(0) : " + msg.charAt(0));

        // substring
        System.out.println("substring(0, 7) : " + msg.substring(0, 7));

        // indexOf
        System.out.println("indexOf('Java') : " + msg.indexOf("Java"));

        // equals
        System.out.println("equals('Welcome Python String Method') : " + msg.equals("Welcome Python String Method"));

        // replace
        System.out.println("replace('Java', 'Python') : " + msg.replace("Java", "Python"));

        // contains
        System.out.println("contains('String') : " + msg.contains("String"));

        // trim
        String msgWithSpaces = "   Welcome Java String Method   ";

        System.out.println("trim() : '" + msgWithSpaces.trim() + "'");

        // replaceAll
        String msgWithNumbers = "12 Welcome Java String Method 12345";
        System.out.println("replaceAll('[0-9]', '') : " + msgWithNumbers.replaceAll("[0-9]", ""));

        System.out.println("-------------------------------------------------");
        // split
        String[] words = msg.split(" ");

        System.out.println("split(' ') : ");
        
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("-------------------------------------------------");

        System.out.println(words[0]);

    }
}

/*
1. startsWith
2. endsWith
3. isEmpty
4. concat
5. format
*/