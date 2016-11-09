package com.tripoin.kawaii.swing.component;

import com.tripoin.kawaii.swing.component.base.ISwingInitalizer;
import org.springframework.stereotype.Component;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class PanelTransparentImageable extends JPanel implements ISwingInitalizer {
    
    private static final long serialVersionUID = -7526972036898494500L;

    private Image imageResource;
    private String imageURL;
    
    @Override
    public void init() {
        setOpaque(false);
        imageResource = new ImageIcon(getClass().getResource(imageURL)).getImage();    
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D image=(Graphics2D)g.create();
        image.setComposite(AlphaComposite.SrcOver.derive(0.9F));
        image.drawImage(imageResource, 0, 0, null);
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
        
}
