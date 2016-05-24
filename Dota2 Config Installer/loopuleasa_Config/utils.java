package loopuleasa_Config;
import java.io.PrintWriter;
/**
 * Write a description of class DirChooser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class utils
{

    public utils()
    {

    }

    public boolean verifyPath(String s){
        boolean b=true;
        String v="dota 2 beta";
        int i=s.length()-1;

        for (int j=0; j<10; j++){
            if(s.charAt(i-10+j) != v.charAt(j)) b=false;
            //System.out.println(j+": "+s.charAt(i-10+j) +"="+ v.charAt(j));
        }
        return b;

    }
    

    public void cfgLaunch(int i, String dir) throws Exception{
        if(i==1){

            PrintWriter writer = new PrintWriter(dir+"\\loop.cfg", "UTF-8");
            writer.println("exec loop/autoexec.cfg");
            
            writer.close();
        }
        if(i==2){

            PrintWriter writer = new PrintWriter(dir+"\\tab.cfg", "UTF-8");
            writer.println("exec tab/autoexec.cfg");
            
            writer.close();
        }
        if(i==3){

            PrintWriter writer = new PrintWriter(dir+"\\core.cfg", "UTF-8");
            writer.println("exec core/autoexec.cfg");
            
            writer.close();
        }
        if(i==4){
        	PrintWriter writer = new PrintWriter(dir+"\\manta.cfg", "UTF-8");
        	writer.println("exec manta/autoexec.cfg");
        
        	writer.close();
    }
        
    }

}
