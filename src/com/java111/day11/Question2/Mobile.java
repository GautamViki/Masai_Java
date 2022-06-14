package com.java111.day11.Question2;

import java.util.Scanner;

public class Mobile {
    String[] outDatedModel = {"note4", "note5", "note6", "note7"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter model name : ");
        String model = scanner.next();
        model = model.toLowerCase();

        Mobile mobile = new Mobile();
        mobile.searchOutdatedModel(model);
    }

    public void searchOutdatedModel(String modelName) {
        String res = "";
        for (String model : outDatedModel) {
            if (modelName.equals(model)) {
                res = modelName + "_OUTDATED";
                break;
            } else {
                res = model + " not OUTDATED";
            }
        }
        System.out.println(res);
    }
}
