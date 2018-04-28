import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {

        System.out.println(railFence("Leo", 2));

        System.out.println(rectangleTransp("Leonardo", 3));

    }

    public static String railFence(String text, Integer key) {
        String textTransp = "";
        ArrayList<String> controlTransp = new ArrayList<String>();
        Integer controlList = 0;
        Boolean firstTime = true;

        for (int i = 0; i < text.length(); i++) {
            if (!firstTime) {
                String temp = controlTransp.get(controlList) + "" + text.charAt(i);
                controlTransp.set(controlList, temp);
                controlList++;
                if (controlList == key) {
                    controlList = 0;
                }
            } else {
                if (controlTransp.size() < key) {
                    controlTransp.add(String.valueOf(text.charAt(i)));
                    controlList++;
                    if (controlTransp.size() == key) {
                        firstTime = false;
                        controlList = 0;
                    }
                }
            }
        }

        for (int i = 0; i < controlTransp.size(); i++) {
            textTransp += controlTransp.get(i);
        }

        return "Rail Fence: " + textTransp.replace(" ", "#") + " and key: " + key;
    }

    public static String rectangleTransp(String text, Integer key) {
        String textTransp = "";
        String textKeys = "";
        ArrayList<String> controlTransp = new ArrayList<String>();
        ArrayList<Integer> controlPosition = new ArrayList<Integer>();
        Integer controlList = 0;

        for (int i = 0; i < key; i++) {
            controlPosition.add(i);
            controlTransp.add("");
        }
        Collections.shuffle(controlPosition);

        for (int i = 0; i < text.length(); i++) {
            String temp = controlTransp.get(controlPosition.get(controlList)) + "" + text.charAt(i);
            controlTransp.set(controlPosition.get(controlList), temp);
            controlList++;
            if (controlList >= key) {
                controlList = 0;
            }
        }

        for (int i = 0; i < controlTransp.size(); i++) {
            textTransp += controlTransp.get(controlPosition.get(i));
            textKeys += controlPosition.get(i) + " ";
        }

        return "Transposition by rectangle: " + textTransp + " and key: " + textKeys;
    }

}
