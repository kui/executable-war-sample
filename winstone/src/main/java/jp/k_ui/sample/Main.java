package jp.k_ui.sample;

import java.net.URL;
import java.util.*;

import winstone.Launcher;

public class Main {
    public static void main(String[] args) throws Exception {
        URL warLocation = Main.class.getProtectionDomain().getCodeSource()
                .getLocation();

        List<String> argList = new ArrayList<String>(Arrays.asList(args));
        argList.add("--warfile=" + warLocation.getPath());
        System.out.println(argList);

        Launcher.main(argList.toArray(new String[0]));
    }
}
