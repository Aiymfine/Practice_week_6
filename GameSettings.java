import java.util.HashMap;
import java.util.Map;

class GameSettings{
    private static GameSettings instance;
    private Map<String, String> gameSettings;

    private GameSettings(){
        gameSettings=new HashMap<>();
        gameSettings.put("language", "german");
    }

    public static GameSettings getInstance(){
        if(instance==null){
            instance=new GameSettings();
        } return instance;
    }

    public String getConf(String k){
        return gameSettings.getOrDefault(k, "key wasnt found");
    }

    public void setLanguage(String language){
        gameSettings.put("language", language);
    }
    public static void main(String[] args){
    GameSettings sett=GameSettings.getInstance();
    String lastlang=sett.getConf("language");
    System.out.println("last language: "+lastlang);
    sett.setLanguage("russian");
    System.out.println("current lang: "+sett.getConf("language"));
}}