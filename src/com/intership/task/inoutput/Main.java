package com.intership.task.inoutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        //IO Streaming Task: de implementat 5 variante diferite de citire/scriere in fisiere (io/nio libraries)
        //Method1
        String mainPath= "C:\\Users\\vsirbu\\IdeaProjects\\Automation tasks\\src\\com\\intership\\task\\inoutput\\";
        File file = new File(mainPath+"file data input.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        File file1 = new File(mainPath+"file data output.txt");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
            bufferedWriter.write(line + "\n");
        }
        bufferedWriter.close();
        //Method2
        InputStream input = new FileInputStream(mainPath+"input int.txt");
        OutputStream output = new FileOutputStream(mainPath+"file data output1.txt");
        int k;
        while ((k = input.read()) >= 0) {
//            System.out.println(k);
            output.write(k);
        }
        System.out.println();
        //Method3
        int j;
        Reader reader = new FileReader(mainPath+"input int1.txt");
        Writer writer = new FileWriter(mainPath+"file data output2.txt");
        while ((j = reader.read()) >= 0) {
//            System.out.println(j);
            writer.write(j);
        }
        writer.close();
        //Method4 NIO library
        Path p1 = Paths.get(mainPath+"file data input.txt");
        Path p2 = Paths.get(mainPath+"file data output3.txt");
        BufferedReader reader1 = Files.newBufferedReader(p1);
        BufferedWriter writer1 = Files.newBufferedWriter(p2);
        String currentLine = null;
        while ((currentLine = reader1.readLine()) != null) {//while there is content on the current line
//            System.out.println(currentLine); // print the current line
            writer1.write(currentLine + "\n");
        }
        writer1.close();
        //Method5 NIO library
        Path p3 = Paths.get(mainPath+"input int.txt");
        Path p4 = Paths.get(mainPath+"file data output4.txt");
        InputStream is1 = Files.newInputStream(p3);
        OutputStream os1 = Files.newOutputStream(p4);
        int m;
        while ((m = is1.read()) >= 0) {
//            System.out.println(j);
            os1.write(m);
        }
    }
}
