package org;

import javassist.CtMethod;
import util.FileUtil;

public class ApiCheck {

    //check java api
    public static boolean check(CtMethod[] declaredMethods) {
        if(declaredMethods == null || declaredMethods.length == 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (CtMethod declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getLongName());
            if (declaredMethod.getLongName().startsWith("java.") || declaredMethod.getLongName().startsWith("jdk.")) {
                //store contents into a String
                stringBuilder.append(declaredMethod.getLongName()).append("\n");
                return true;
            }
        }
        FileUtil.writeTmpFile("./statistic",".csv",stringBuilder.toString());

        return false;
    }
}
