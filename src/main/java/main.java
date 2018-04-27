import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        System.out.printf(railFence("Paulo", 2));

    }

    public static String railFence(String text, Integer key){
        String textTransp = "";
        ArrayList<String> controlTransp = new ArrayList<String>();
        Integer controlList = 0;
        Boolean firstTime = true;

        for (int i = 0; i < text.length(); i++) {
            if (!firstTime) {
                String temp = controlTransp.get(controlList)+""+text.charAt(i);
                controlTransp.set(controlList, temp);
                controlList++;
                if (controlList == key) {
                    controlList = 0;
                }
            }
            else {
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

        for (int i = 0; i<controlTransp.size(); i++){
            textTransp += controlTransp.get(i);
        }

        return "Rail Fence: "+ textTransp.replace(" ", "#") + " and key: "+key;
    }

}
