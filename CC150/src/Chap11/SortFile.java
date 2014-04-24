package Chap11;
import java.io.*;
import java.util.*;
public class SortFile {
    static final int BUFFER_SIZE = 1*1024*1024;
    public static void main(String[] args) throws Exception{
        File file = new File("/home/yin/test");
        file.createNewFile();
        createLargeFile(file);
        int num = splitFile(file);
        kMergeSort(file, num);
    }
    private static void kMergeSort(File f, int num) throws Exception{
        BufferedReader[] bReaders = new BufferedReader[num];
        for(int i = 0; i < num; i++) {
            File newF = new File("/home/yin/test_"+i);
            bReaders[i] = new BufferedReader(new InputStreamReader(
                         new FileInputStream(newF)), BUFFER_SIZE/num);
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(f)), BUFFER_SIZE);
        LoserTree<String> tree = new LoserTree(String.class, num, "", "\uffff");
        String s;
        int i = 0;
        while(!tree.isEmpty()) {
            if(!tree.isMature()) {
                tree.set(i, bReaders[i].readLine());
                i++;
            }else {
                writer.write(tree.winner());
                writer.newLine();
                i = tree.winnerIdx();
                tree.set(i, bReaders[i].readLine());
            }
        }
        writer.close();
        for(BufferedReader reader : bReaders) {
            reader.close();
        }
    }
    private static int splitFile(File f) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                                new FileInputStream(f)), BUFFER_SIZE);
        int i = 0;
        int sizeCount = 0;
        String line;
        List<String> list = new ArrayList<>();
        while((line = reader.readLine())!= null) {
            sizeCount += (line.length()+1)*2+40;
            if(sizeCount > (1<<23)) {
                Collections.sort(list);
                linesToFile(list, i);
                list = new ArrayList<>();
                list.clear();
                sizeCount = (line.length()+1)*2+40;
                i++;
            }
            list.add(line);
        }
	Collections.sort(list);
        linesToFile(list, i);
        return i+1;
    }
    private static void linesToFile(List<String> list, int i) throws Exception{
        File newF = new File("/home/yin/test_"+i);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(newF)), BUFFER_SIZE);
        for(String s : list) {
            writer.write(s);
            writer.newLine();
        }
        writer.close();
    }
    private static void createLargeFile(File f) throws Exception{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(f)), BUFFER_SIZE);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10*1024*1024; i++) {
            sb.append((int)(Math.random()*10000)).append('\n');
            writer.write(sb.toString(), 0, sb.length());
            sb.setLength(0);
        }
        writer.close();
    }
}

            
