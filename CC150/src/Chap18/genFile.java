import java.io.*;
public class genFile {
    static final int MAXSTICK = 20;
    static final int MAXCOLOR = 20;
    static final int MAXLEN = 10;
    public static void main(String[] args) throws Exception{
        String[] colors = new String[MAXCOLOR];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < MAXCOLOR; i++) {
            int len = (int)(Math.random()*MAXLEN)+1;
            for(int j = 0; j < len; j++) {
                char c = (char)((int)(Math.random()*26)+'a');
                sb.append(c);
            }
            colors[i] = sb.toString();
            sb.setLength(0);
        }
        File file = new File("/home/yin/sticks");
        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(file)));
        for(int i = 0; i < MAXSTICK; i++) {
            int colorIdx = (int)(Math.random()*MAXCOLOR);
            writer.write(colors[colorIdx]);
            writer.write(" ");
            colorIdx = (int)(Math.random()*MAXCOLOR);
            writer.write(colors[colorIdx]);
            writer.newLine();
        }
        writer.close();
    }
}





            

