package com.digdes.school;

import java.util.*;

public class JavaSchoolStarter {

    public JavaSchoolStarter() {}

    public List<Map<String, Object>> execute(String request) throws Exception {
        if(!validatingRequest(request)){
            System.out.println("Mistake. The request check failed. Error in the request");
            return null;
        }
        List<Map<String, Object>> currentList = new ArrayList<>();
        switch (determineCommand(request.toLowerCase(Locale.ROOT))){
            case "INSERT":
                currentList.add(insertInToList(request));
                break;
            case "UPDATE":
                updateList(request);
                break;
            case "DELETE":
                deleteInList(request);
                break;
            case "SELECT":
                selectInList(request);
                break;
            default:
                System.out.println("Mistake.The request dont have commands");
                break;
        }
        return currentList;
    }
    public HashMap<String, Object> updateList(String request){
        System.out.println("Update " + request);

        return new HashMap<>();
    }

    public  HashMap<String, Object> insertInToList(String request){
        System.out.println("Insert " + request);
        return new HashMap<>();
    }

    public  HashMap<String, Object> deleteInList(String request){
        System.out.println("Delete " + request);
        return new HashMap<>();
    }

    public  HashMap<String, Object> selectInList(String request){
        System.out.println("Select " + request);
        return new HashMap<>();
    }

    //podymats
    public boolean validatingRequest(String request){
        String cur = request.toLowerCase(Locale.ROOT);

        return true;
    }

    public String determineCommand(String request){
        if(request.contains("insert values")){
            return "INSERT";
        }
        if(request.contains("update values")){
            return "UPDATE";
        }
        if(request.contains("delete")){
            return "DELETE";
        }
        if(request.contains("select")){
            return "SELECT";
        }
        return "Mistake";
    }
}

