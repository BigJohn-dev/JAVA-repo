package Polymorphism;
import javax.swing.*;

public class geeks {
    //Java program to create a showMessageDialog in JOptionPane
    public static void main(String[] args) {
        // Message output in box
        JOptionPane.showInternalMessageDialog(null, "FISH EVERYWHERE");
        JOptionPane.showMessageDialog(null, "FISH EVERYWHERE");

        String name = JOptionPane.showInputDialog("Enter your Profile Name:");
        if (name != null && !name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Welcome... " + name, "PATHFINDER PROFILE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No profile name entered.", "PATHFINDER PROFILE", JOptionPane.WARNING_MESSAGE);
        }
        String id = JOptionPane.showInputDialog("Enter your ID:");
        JPopupMenu popup = new JPopupMenu();
        popup.getUI();
        JOptionPane.showInternalMessageDialog(null, "ID saved successfully", "PATHFINDER PROFILE", JOptionPane.PLAIN_MESSAGE);

        }
}