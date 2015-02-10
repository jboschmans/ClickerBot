package data;

import domain.DomainController;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DataController
{
    public static void save()
    {
        JFileChooser save = new JFileChooser();
        save.setFileFilter(new FileNameExtensionFilter(".ser","ser"));
        int option = save.showSaveDialog(DomainController.hf);
        if (option == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                String s = save.getSelectedFile().getPath();
                if (!s.substring(s.length()-4, s.length()).equals(".ser"))
                    s+=".ser";

                FileOutputStream fileOut = new FileOutputStream(s);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(DomainController.er);
                out.close();
                fileOut.close();
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public static void open()
    {
        JFileChooser open = new JFileChooser();
        open.setFileFilter(new FileNameExtensionFilter(".ser","ser"));
        int option = open.showOpenDialog(DomainController.hf);
        if (option == JFileChooser.APPROVE_OPTION)
        {
            DomainController.er.getEventList().clear();
            try
            {
                FileInputStream fileIn = new FileInputStream(open.getSelectedFile().getPath());
                ObjectInputStream in = new ObjectInputStream(fileIn);
                DomainController.er = (domain.EventRepository) in.readObject();
                in.close();
                fileIn.close();
                DomainController.hf.tm.fireTableDataChanged();
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}
