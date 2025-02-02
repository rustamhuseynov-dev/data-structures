package collections;

import java.io.IOException;

public class RuntimeClass {
    public static void main(String[] args)  {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory: "+runtime.totalMemory());
        System.out.println("Free Memory: "+runtime.freeMemory());

        //
        try {
            String path = "D:\\pb\\Point Blank";
            String command = "cmd /c start \"\" \"" + path + "\"";

            // Postman-ı işə salır
            Process exec = Runtime.getRuntime().exec(command);
            System.out.println("Postman açıldı: " + exec);

        } catch (IOException e) {
            System.out.println("Xəta baş verdi:");
            e.printStackTrace();
        }
    }
}
