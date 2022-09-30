//Inherits from TextInput
// Overrides the add method so that each non-numeric character is ignored
public class UserInput {
    public static class TextInput {

        String value="";
        public  void add(char c){
            this.value+=c;
        }
        public  String getValue(){
            return value;
        }

    }

    public static class NumericInput extends TextInput{

            public void add(char c) {
                if (Character.isDigit(c)){
                    super.add(c);
            }
//            try {
//                super.value+=String.valueOf(Integer.parseInt(String.valueOf(c)));
//            }
//            catch (NumberFormatException ignored){
//
//            }

        }

    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }

}
