/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steganography.in.jpeg;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Anwar
 */
public class SteganographyInJpegGUI extends javax.swing.JFrame {

    GrafixTools GT;
    DCT dctTrans;
    byte[] inputMsg, outputMsg;
    String inputBinaryMsg = "", outputBinaryMsg = "";

    /**
     * Creates new form SteganographyInJpegGUI
     */
    public SteganographyInJpegGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        srcImgChooseBtn = new javax.swing.JButton();
        srcImgPath = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputMessageBox = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        encodeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        secretMsgImgChooseBtn = new javax.swing.JButton();
        secretImagePath = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputMessage = new javax.swing.JTextArea();
        decodeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        srcImgChooseBtn.setText("Choose");
        srcImgChooseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcImgChooseBtnActionPerformed(evt);
            }
        });

        srcImgPath.setText("Choose the jpg/jpeg picture to embed the secret message.");

        inputMessageBox.setColumns(20);
        inputMessageBox.setLineWrap(true);
        inputMessageBox.setRows(20);
        jScrollPane1.setViewportView(inputMessageBox);

        jLabel2.setText("Enter the secrete message below:");

        encodeBtn.setText("Embed secret message and save as jpg picture");
        encodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Encode the Message");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Decode the Message");

        secretMsgImgChooseBtn.setText("Choose");
        secretMsgImgChooseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secretMsgImgChooseBtnActionPerformed(evt);
            }
        });

        secretImagePath.setText("Choose the jpg/jpeg picture to decode the secret message.");

        outputMessage.setEditable(false);
        outputMessage.setColumns(20);
        outputMessage.setLineWrap(true);
        outputMessage.setRows(20);
        jScrollPane2.setViewportView(outputMessage);

        decodeBtn.setText("Decode the message from the choosen picture");
        decodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(361, 361, 361))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(srcImgChooseBtn)
                        .addGap(23, 23, 23)
                        .addComponent(srcImgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(encodeBtn))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(secretMsgImgChooseBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secretImagePath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decodeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(srcImgChooseBtn)
                    .addComponent(srcImgPath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encodeBtn)
                .addGap(3, 3, 3)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secretMsgImgChooseBtn)
                    .addComponent(secretImagePath)
                    .addComponent(decodeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        srcImgPath.getAccessibleContext().setAccessibleName("srcImage");
        encodeBtn.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void srcImgChooseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcImgChooseBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG/JPEG Picture", "jpg", "jpeg");
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            srcImgPath.setText(file.getAbsolutePath());
            // What to do with the file, e.g. display it in a TextArea
            //  textarea.read(new FileReader(file.getAbsolutePath()), null);
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_srcImgChooseBtnActionPerformed

    private void encodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeBtnActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG/JPEG Picture", "jpg", "jpeg");
        fileChooser.setFileFilter(filter);
        File file1 = null;
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
          file1 = fileChooser.getSelectedFile();
          // save to file
        }
        
        
        inputMsg = inputMessageBox.getText().getBytes();
        inputBinaryMsg = toBinary(inputMsg);

        Image image = Toolkit.getDefaultToolkit().getImage(srcImgPath.getText());

        MediaTracker tracker = new MediaTracker(this);
        tracker.addImage(image, 0);
        try {
            tracker.waitForID(0);
        } catch (InterruptedException e) {
            System.out.println("Loaded image." + e.toString());
            return;
        }

        GT = new GrafixTools(image);
        int[][] pixelArrayR = new int[GT.imageWidth][GT.imageHeight];
        int[][] pixelArrayR_new = new int[GT.imageWidth][GT.imageHeight];
        int[][] pixelArrayG = new int[GT.imageWidth][GT.imageHeight];
        int[][] pixelArrayB = new int[GT.imageWidth][GT.imageHeight];
        pixelArrayR_new = pixelArrayR = GT.getRedArray();
        pixelArrayG = GT.getGreenArray();
        pixelArrayB = GT.getBlueArray();

//        int[][] reconstImage = new int[GT.imageWidth][GT.imageHeight];
//        System.exit(0);
//        System.out.println("Initializing DCT");
        dctTrans = new DCT(20);
//        System.out.println("Done initializing DCT");

        try {
            encodeMessage(pixelArrayR, pixelArrayR_new, pixelArrayG, pixelArrayB, GT.imageWidth, GT.imageHeight, file1.getAbsolutePath());
        } catch (IOException ex) {
            Logger.getLogger(SteganographyInJpegGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SteganographyInJpegGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_encodeBtnActionPerformed

    private void secretMsgImgChooseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secretMsgImgChooseBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG/JPEG Picture", "jpg", "jpeg");
        fileChooser.setFileFilter(filter);
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            secretImagePath.setText(file.getAbsolutePath());
            // What to do with the file, e.g. display it in a TextArea
            //  textarea.read(new FileReader(file.getAbsolutePath()), null);
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_secretMsgImgChooseBtnActionPerformed

    private void decodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeBtnActionPerformed
        Image image = Toolkit.getDefaultToolkit().getImage(secretImagePath.getText());
        // Make sure it gets loaded
        MediaTracker tracker = new MediaTracker(this);
        tracker.addImage(image, 0);
//        System.out.println("Initialized tracker.");
        try {
//            System.out.println("Waiting for tracker...");
            tracker.waitForID(0);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException: " + e.toString());
            return;
        }
//        System.out.println("Loaded image.");

        GT = new GrafixTools(image);
//        System.out.println("Dimensions: " + GT.imageHeight + "," + GT.imageWidth);

//        System.out.println("Getting array information");
        int[][] pixelArrayR = new int[GT.imageWidth][GT.imageHeight];
        pixelArrayR = GT.getRedArray();

//        System.out.println("Initializing DCT");
        dctTrans = new DCT(20);
        try {
            //        System.out.println("Done initializing DCT");
//
            decodeMessage(pixelArrayR, GT.imageWidth, GT.imageHeight);
        } catch (IOException ex) {
            Logger.getLogger(SteganographyInJpegGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_decodeBtnActionPerformed

    public void decodeMessage(int[][] pixelArrayR, int imgWidth, int imgHeight) throws IOException {

//        System.out.println("Decoding Starts");
        int i, j, a, b, counter = 0;

//      int temp1 = 0, temp2 = 0, count = 0;
        int xpos, ypos;

        char pixelCharArray[][] = new char[8][8];
        int dctArray[][] = new int[8][8];
//        int quanArray[][] = new int[8][8];
//        int dctArray4[][] = new int[8][8];
//
//        int reconstImage[][] = new int[imgWidth][imgHeight];
//        int candidate = 0;

//        System.out.println("Initializing compression - DCT & Qualitization");
//        bit = 0;
        int xLen = (int) Math.floor(imgWidth / 8);
        int yLen = (int) Math.floor(imgHeight / 8);
        for (i = 0; i < xLen; i++) {
            for (j = 0; j < yLen; j++) {
                // Read in a 8x8 block, starting at (i * 8) -> 8;
                xpos = i * 8;
                ypos = j * 8;

                for (a = 0; a < 8; a++) {
                    for (b = 0; b < 8; b++) {
                        pixelCharArray[a][b] = (char) pixelArrayR[xpos + a][ypos + b];
                    }
                }

                // Apply the forward DCT to the block
                dctArray = dctTrans.forwardDCT(pixelCharArray);

//                System.out.println("DCT Matrix of 8 pixel for Image");
//                System.out.println("................. new ......................");
//                System.out.println();
//                for (int ii = 0; ii < 8; ii++) {
//                    for (int jj = 0; jj < 8; jj++) {
//                        System.out.print(dctArray[ii][jj] + "\t");
//                    }
//                    System.out.println();
//                }
                int jj = 7;
                int one_count = 0;
                int zero_count = 0;
                for (int ii = 0; ii < 8; ii++) {
                    if (dctArray[ii][jj] > 0) {
                        one_count++;
                    } else {
                        zero_count++;
                    }
                    jj--;
                }

                if (one_count >= zero_count) {
                    outputBinaryMsg += "1";
                } else {
                    outputBinaryMsg += "0";
                }
//                quanArray = dctTrans.quantitizeImage(dctArray, false);
//                System.out.println("Quantize Matrix of 8 pixel for Image");
//                System.out.println(".......................................");
//                System.out.println();
//                candidate = 0;
//                for (int ii = 0; ii < 8; ii++) {
//                    for (int jj = 0; jj < 8; jj++) {
//                        System.out.print(quanArray[ii][jj] + "\t");
//                    }
//                    System.out.println();
//                }

            }
        }

//        System.out.println("----------");
//        System.out.println(".........outputBinaryMsg............");
//        System.out.println(outputBinaryMsg);

        outputMsg = fromBinary(outputBinaryMsg);
        String s = new String(outputMsg);

        outputMessage.setText(s);
        //System.out.println(s);
    }

    byte[] fromBinary(String s) {
        int sLen = s.length();
        byte[] toReturn = new byte[(sLen + Byte.SIZE - 1) / Byte.SIZE];
        char c;
        for (int i = 0; i < sLen; i++) {
            if ((c = s.charAt(i)) == '1') {
                toReturn[i / Byte.SIZE] = (byte) (toReturn[i / Byte.SIZE] | (0x80 >>> (i % Byte.SIZE)));
                if (toReturn[i / Byte.SIZE] == '!') {
                    break;
                }
            } else if (c != '0') {
                throw new IllegalArgumentException();
            }
        }
        return toReturn;
    }

    public void encodeMessage(int[][] pixelArrayR, int[][] pixelArrayR_new,
            int[][] pixelArrayG, int[][] pixelArrayB, int imgWidth, int imgHeight, String saveFile) throws IOException {
        int i, j, a, b;
        int counter = 0;

//        int temp1 = 0, temp2 = 0, count = 0;
        int xpos;
        int ypos;

        char pixelCharArray[][] = new char[8][8];
        int dctArray[][] = new int[8][8];
        int quanArray[][] = new int[8][8];
        int invQuanArray[][] = new int[8][8];
        int dctArray4[][] = new int[8][8];
        int candidate = 0;

        //  System.out.println("Initializing compression - DCT & Qualitization");
        int bit = 0;
        int xLen = (int) Math.floor(imgWidth / 8);
        int yLen = (int) Math.floor(imgHeight / 8);
        for (i = 0; i < xLen; i++) {
            for (j = 0; j < yLen; j++) {
                // Read in a 8x8 block, starting at (i * 8) -> 8;
                xpos = i * 8;
                ypos = j * 8;

                // System.out.println("============RED PIXELS============" + xpos + "|" + ypos);
                for (a = 0; a < 8; a++) {
                    for (b = 0; b < 8; b++) {
//                        System.out.print("" + pixelArrayR[xpos + a][ypos + b] + "\t");
                        pixelCharArray[a][b] = (char) pixelArrayR[xpos + a][ypos + b];
                    }
//                    System.out.println("");
                }

                // Apply the forward DCT to the block
                dctArray = dctTrans.forwardDCT(pixelCharArray);
                //makeImage(reconstImage);

//                System.out.println("DCT Matrix of 8 pixel for Image");
//                System.out.println(".......................................");
//                System.out.println();
//                for (int ii = 0; ii < 8; ii++) {
//                    for (int jj = 0; jj < 8; jj++) {
//                        System.out.print(dctArray[ii][jj] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//                System.out.println(".......................................");
//                System.out.println();
                quanArray = dctTrans.quantitizeImage(dctArray, false);
//                System.out.println("Quantize Matrix of 8 pixel for Image");
//                System.out.println(".......................................");
//                System.out.println();
                candidate = 0;

//                for (int ii = 0; ii < 8; ii++) {
//                    for (int jj = 0; jj < 8; jj++) {
//
//                        System.out.print(quanArray[ii][jj] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//                System.out.println(".......................................");
//                System.out.println();
                if ((bit < inputBinaryMsg.length())) {

                    switch (Integer.parseInt(inputBinaryMsg.charAt(bit) + "")) {
                        case 1:
//                                  
                            quanArray[7][0] = quanArray[6][1] = quanArray[5][2] = quanArray[4][3] = quanArray[3][4] = quanArray[2][5] = quanArray[1][6] = quanArray[0][7] = 20;
                            break;
                        case 0:
//                                 
                            quanArray[7][0] = quanArray[6][1] = quanArray[5][2] = quanArray[4][3] = quanArray[3][4] = quanArray[2][5] = quanArray[1][6] = quanArray[0][7] = -20;
                            break;
                        default:
                            break;

                    }
                    bit++;
                }

                // quanArray = dctTrans.quantitizeImage(dctArray, false);
//                System.out.println("New Quantize Matrix of 8 pixel for Image");
//                System.out.println(".......................................");
//                System.out.println();
                candidate = 0;

//                for (int ii = 0; ii < 8; ii++) {
//                    for (int jj = 0; jj < 8; jj++) {
//
//                        System.out.print(quanArray[ii][jj] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//                System.out.println(".......................................");
//                System.out.println();
                //Inverse Quntization
                invQuanArray = dctTrans.dequantitizeImage(quanArray, false);
//                System.out.println("New DCT Matrix of 8 pixel for Image");
//                System.out.println(".......................................");
//                System.out.println();
//
//                for (int ii = 0; ii < 8; ii++) {
//                    for (int jj = 0; jj < 8; jj++) {
//                        System.out.print(invQuanArray[ii][jj] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//                System.out.println(".......................................");
//                System.out.println();

                // Reconstruct the compressed data in an image...
//                System.out.println("Reconstruct the red pixels");
                dctArray4 = dctTrans.inverseDCT(invQuanArray);
//                System.out.println("*****************************RED PIXELS/INVERSE DCT***************");
                for (a = 0; a < 8; a++) {
                    for (b = 0; b < 8; b++) {
                        pixelArrayR_new[xpos + a][ypos + b] = dctArray4[a][b];
//                        System.out.print("" + dctArray4[a][b] + "\t");
                    }
//                    System.out.println("");
                }

                counter++;
            }
        }

//        System.out.println();
//        System.out.println("Constructing the image..");
//        System.out.println("aaaaaaaaaaaaaaaaaa");
        BufferedImage img = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
        for (int r = 0; r < imgHeight; r++) {
//            System.out.println("Hit enter: " + r);
            for (int c = 0; c < imgWidth; c++) {
//                int index = r * 320 + c;
                int red = pixelArrayR_new[c][r];//[index] & 0xFF;
                int green = pixelArrayG[c][r];//[index + 1] & 0xFF;
                int blue = pixelArrayB[c][r];//[index + 2] & 0xFF;
//                System.out.println("eeeeeeeeeeee");
                int rgb = (red << 16) | (green << 8) | blue;
//                System.out.println("dddddddddddd");
                img.setRGB(c, r, rgb);
//                System.out.println("ccccccccccccc: " + c);
            }
        }
//        System.out.println("bbbbbbbbbbbb");
        File outputfile = new File(saveFile);
        ImageIO.write(img, "jpg", outputfile);

//        System.out.println("Hit enter");
    }

    String toBinary(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * Byte.SIZE);
        for (int i = 0; i < Byte.SIZE * bytes.length; i++) {
            sb.append((bytes[i / Byte.SIZE] << i % Byte.SIZE & 0x80) == 0 ? '0' : '1');
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decodeBtn;
    private javax.swing.JButton encodeBtn;
    private javax.swing.JTextArea inputMessageBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outputMessage;
    private javax.swing.JLabel secretImagePath;
    private javax.swing.JButton secretMsgImgChooseBtn;
    private javax.swing.JButton srcImgChooseBtn;
    private javax.swing.JLabel srcImgPath;
    // End of variables declaration//GEN-END:variables
}
