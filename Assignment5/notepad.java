// package Assignment5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;

public class notepad extends JFrame implements ActionListener {
    JTextArea body;

    notepad() {
        setVisible(true);
        setSize(600, 600);
        setTitle("Notepad");

        // Menu Bar
        JMenuBar mbr = new JMenuBar();
        JMenu file = new JMenu("File");
        mbr.add(file);
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem newWin = new JMenuItem("New Window");
        JMenuItem openFile = new JMenuItem("Open");
        JMenuItem saveFile = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Save As");
        file.add(newFile);
        file.add(newWin);
        file.addSeparator();
        file.add(openFile);
        file.addSeparator();
        file.add(saveFile);
        file.add(saveAs);
        JMenu edit = new JMenu("Edit");
        mbr.add(edit);
        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem redo = new JMenuItem("Redo");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        edit.add(undo);
        edit.add(redo);
        edit.addSeparator();
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        setJMenuBar(mbr);

        // Body
        body = new JTextArea();
        // Font f = new Font("Arial", Font.PLAIN, 24);
        // setFont(f);
        add(body);

        // All action listeners
        newFile.addActionListener(e -> body.setText(""));
        newWin.addActionListener(e -> new notepad());
        saveFile.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    File fl = fc.getSelectedFile();
                    FileWriter fw = new FileWriter(fl);
                    fw.write(body.getText());
                    fw.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }

        });
        newFile.addActionListener(this);
        newFile.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

    public static void main(String[] args) {
        new notepad();
    }
}
