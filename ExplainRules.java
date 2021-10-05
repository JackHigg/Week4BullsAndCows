public class ExplainRules {

    String rules;
    String gameName;

    public ExplainRules(String rules, String gameName){

        this.gameName=gameName;
        this.rules=rules;

    }

    public void showRules(){

        System.out.println("\nRules for "+gameName);
        System.out.println("\n"+rules);

    }





}
