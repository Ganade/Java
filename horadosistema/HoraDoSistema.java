package horadosistema;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        Locale local = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        System.out.print(" A data do sistema é: ");
        System.out.println(relogio.toString());
        System.out.print(" A Linguagem do sistema é: ");
        System.out.println(local.getDisplayLanguage());
        System.out.print("A resolução do seu sistema é: ");
        System.out.print(d.getWidth());
        System.out.print(" x ");
        System.out.println(d.getHeight());
    }
}
