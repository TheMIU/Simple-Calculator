import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test {
    public static void main(String[] args) throws ScriptException {
        // "1+2+3" ---> 1+2+3
        String textFieldValue = "1+2+3";

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Object answer = engine.eval(textFieldValue);

        System.out.println(answer.toString());
    }
}



















  /*  // get numeric answers using string formula eg: "10*3+2" -> 32
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    String foo = "7+3+6-5/4*(4/0)";
        System.out.println(engine.eval(foo));  */


/*
    String str = "Grepper Answer123"; // For eg : removing 5th element
        str = str.substring(0,str.length()-1) + ""; // "e"
                System.out.println(str); //Output : Greppr Answer*/
