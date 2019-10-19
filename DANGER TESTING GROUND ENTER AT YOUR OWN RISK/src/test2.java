public class test2 {

        public void main (String[]args)
        {
            String s = "This will be the input from the user";
            s = s.replace(" ", "");
            char[] c = s.toCharArray();

            for (Character ss : c)
                System.out.println(ss - 'a' + 1);


        }
    }



