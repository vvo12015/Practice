package workshop5;

public class KmpSubMove {
        public int subMoveQuantity(String inputStr, String resultStr) {

            if (inputStr.length() == 0) return 0;
            int result = -1;

            if (resultStr.indexOf(inputStr.charAt(inputStr.length() - 1)) > -1) {
                for (int i = 0; i < resultStr.length()-2; i++) {
                    if ((resultStr.charAt(i) == inputStr.charAt(inputStr.length() - 1)) && (inputStr.equals(restoreString(resultStr, i+1)))) {
                        return i+1;
                    }
                }

            }
            return result;
        }

        private String restoreString(String input, int index){

            String result = "";
            if (index != input.length() - 1 ){
                result = input.substring(index) + input.substring(0, index);
            }
            return result;
        }
    }
