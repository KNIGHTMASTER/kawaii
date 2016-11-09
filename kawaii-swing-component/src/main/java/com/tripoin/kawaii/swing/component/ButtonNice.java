package com.tripoin.kawaii.swing.component;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.annotation.PostConstruct;
import javax.swing.JButton;

import com.tripoin.kawaii.swing.component.base.ISwingInitalizer;
import org.springframework.stereotype.Component;

/**
 *
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ButtonNice extends JButton implements ISwingInitalizer {

    private static final long serialVersionUID = 3544733510100385931L;

    private boolean fokus;
    private Paint cat;

    @PostConstruct
    @Override
    public void init() {
        setOpaque(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setFokus(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setFokus(false);
            }

        });
    }

    public boolean isFocus() {
        return fokus;
    }

    public void setFokus(boolean fokus) {
        this.fokus = fokus;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D grafis = (Graphics2D) g.create();
        if (isFocus()) {
            cat = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.01F), 0, getHeight(), new Color(1F, 1F, 1F, 0.5F));
        } else {
            cat = new GradientPaint(0, 0, new Color(1F, 1F, 1F, 0.5F), 0, getHeight(), new Color(1F, 1F, 1F, 0.01F));
        }

        grafis.setPaint(cat);
        grafis.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
        grafis.dispose();
    }

}
