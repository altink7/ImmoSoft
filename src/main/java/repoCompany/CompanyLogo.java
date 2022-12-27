package repoCompany;

import java.awt.*;

public class CompanyLogo extends Canvas {
    Graphics graphics = getGraphics();
    public CompanyLogo() {
        Frame frame = new Frame();
        frame.setSize(500, 500);
        frame.add(this);
        frame.setVisible(true);
    }

    public void paint() {
        graphics.setColor(Color.BLUE);
        graphics.fillOval(50, 50, 100, 100);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(65, 65, 70, 70);
        graphics.setColor(Color.BLUE);
        graphics.fillOval(80, 80, 40, 40);
    }

}
