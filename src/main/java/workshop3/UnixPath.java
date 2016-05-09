package workshop3;

import java.util.ArrayList;

public class UnixPath {

    public static final int OFFSET_LAST_POSITION = 1;

    public String simplify(String input) {

        String[] arrayInput = input.split("/");
        ArrayList<String> forResult = new ArrayList<String>();
        StringBuilder result = new StringBuilder();

        int countElements = arrayInput.length;

        int i = countElements - OFFSET_LAST_POSITION;

        boolean noExit, doubleDots;

        if (i >= 0) {
            noExit = true;
            doubleDots = false;

            while (noExit) {

                if (!arrayInput[i].equals("") && !arrayInput[i].equals(".")
                        && !arrayInput[i].equals("..")) {
                    if (!doubleDots) forResult.add(arrayInput[i]);
                    doubleDots = false;
                }

                if (arrayInput[i].equals("..")) {
                    doubleDots = true;
                }

                i--;

                if (i < 0) noExit = false;
            }

            if (forResult.size() - OFFSET_LAST_POSITION >= 0){
            for (i = forResult.size() - OFFSET_LAST_POSITION; i >= 0; i--) {

                if (!forResult.get(i).equals(""))result.append("/" + forResult.get(i));
            }
            }else {
                result.append("/");
            }
        }
        else
        {
            result.append("/");
        }

        return result.toString();
    }
}
