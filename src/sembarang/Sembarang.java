/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sembarang;
import java.util.logging.*;
import org.lwjgl.*;
import org.lwjgl.input.*;
import org.lwjgl.opengl.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.gluOrtho2D;

public class Sembarang {

   public static int DISPLAY_WIDTH=600;
   public static int DISPLAY_HEIGHT=600;
   public static int col=225;
   public void draw(){
       
   }
   
   public void render(){
       glClear(GL11.GL_COLOR_BUFFER_BIT);
       glLoadIdentity();
       
       BikinLatar();
       BikinRumput();
       BikinGunung1();
       BikinGunung2();
       BikinGedung1();
       BikinGedung2();
       BikinGedung3();
       BikinGedung4();
       BikinGedung5();
       BikinTrotoarH();
       BikinTrotoarP();
       BikinJalan();
       BikinGJalan1();
       BikinGJalan2();
       BikinGJalan3();
       BikinGJalan4();
       BikinGJalan5();
       BikinGJalan6();
       BikinTrotoarH2();
       glFlush();
   }
   
   
   public void BikinLatar(){
       glBegin(GL_POLYGON);
       glColor3d(0.71,0.71,0.91);
       glVertex2f(0,0);
       glVertex2f(0,600);
       glVertex2f(600,600);
       glVertex2f(600,0);
       glEnd();
   }
   public void BikinRumput(){
       glBegin(GL_POLYGON);
       glColor3d(0.40,0.71,0.30);
       glVertex2f(000,300);
       glVertex2f(000,000);
       glVertex2f(600,000);
       glVertex2f(600,300);
       glEnd();
   }
     public void BikinGunung1(){
       glBegin(GL_POLYGON);
       glColor3d(0.50,0.90,0.30);
       glVertex2f(200,300);
       glVertex2f(400,500);
       glVertex2f(600,300);
       glEnd();
   }
   
     public void BikinGunung2(){
       glBegin(GL_POLYGON);
       glColor3d(0.40,0.90,0.30);
       glVertex2f(0,300);
       glVertex2f(200,500);
       glVertex2f(400,300);
       glEnd();
   }
      public void BikinGedung1(){
       glBegin(GL_POLYGON);
       glColor3d(0.30,0.50,0.80);
       glVertex2f(000,150);
       glVertex2f(000,350);
       glVertex2f(100,350);
       glVertex2f(100,150);
       glEnd();
   }
       public void BikinGedung2(){
       glBegin(GL_POLYGON);
       glColor3d(0.60,0.50,0.50);
       glVertex2f(100,325);
       glVertex2f(250,325);
       glVertex2f(250,150);
       glVertex2f(100,150);
       glEnd();
   }
       public void BikinGedung3(){
       glBegin(GL_POLYGON);
       glColor3d(0.10,0.50,0.50);
       glVertex2f(250,150);
       glVertex2f(250,400);
       glVertex2f(375,400);
       glVertex2f(375,150);
       glEnd();
   }
        public void BikinGedung4(){
       glBegin(GL_POLYGON);
       glColor3d(0.70,0.30,0.40);
       glVertex2f(375,150);
       glVertex2f(375,250);
       glVertex2f(550,250);
       glVertex2f(550,150);
       glEnd();
   }
         public void BikinGedung5(){
       glBegin(GL_POLYGON);
       glColor3d(0.60,0.50,0.30);
       glVertex2f(550,325);
       glVertex2f(600,325);
       glVertex2f(600,150);
       glVertex2f(550,150);
       glEnd();
   }
         public void BikinTrotoarH(){
       glBegin(GL_POLYGON);
       glColor3d(0.15,0.15,0.15);
       glVertex2f(000,150);
       glVertex2f(600,150);
       glVertex2f(600,130);
       glVertex2f(000,130);
       glEnd();
   }
         public void BikinTrotoarP(){
       glBegin(GL_POLYGON);
       glColor3d(0.85,0.85,0.85);
       glVertex2f(000,130);
       glVertex2f(600,130);
       glVertex2f(600,125);
       glVertex2f(000,125);
       glEnd();
   }
     public void BikinJalan(){
       glBegin(GL_POLYGON);
       glColor3d(0.05,0.05,0.05);
       glVertex2f(000,075);
       glVertex2f(600,075);
       glVertex2f(600,125);
       glVertex2f(000,125);
       glEnd();
   }
     public void BikinGJalan1(){
       glBegin(GL_POLYGON);
       glColor3d(0.95,0.95,0.95);
       glVertex2f(000,102);
       glVertex2f(000,105);
       glVertex2f(050,105);
       glVertex2f(050,102);
       glEnd();
   }
     public void BikinGJalan2(){
       glBegin(GL_POLYGON);
       glColor3d(0.95,0.95,0.95);
       glVertex2f(100,102);
       glVertex2f(100,105);
       glVertex2f(150,105);
       glVertex2f(150,102);
       glEnd();
   }
     public void BikinGJalan3(){
       glBegin(GL_POLYGON);
       glColor3d(0.95,0.95,0.95);
       glVertex2f(200,102);
       glVertex2f(200,105);
       glVertex2f(250,105);
       glVertex2f(250,102);
       glEnd();
   }
     public void BikinGJalan4(){
       glBegin(GL_POLYGON);
       glColor3d(0.95,0.95,0.95);
       glVertex2f(300,102);
       glVertex2f(300,105);
       glVertex2f(350,105);
       glVertex2f(350,102);
       glEnd();
   }
     public void BikinGJalan5(){
       glBegin(GL_POLYGON);
       glColor3d(0.95,0.95,0.95);
       glVertex2f(400,102);
       glVertex2f(400,105);
       glVertex2f(450,105);
       glVertex2f(450,102);
       glEnd();
   }
     public void BikinGJalan6(){
       glBegin(GL_POLYGON);
       glColor3d(0.95,0.95,0.95);
       glVertex2f(500,102);
       glVertex2f(500,105);
       glVertex2f(550,105);
       glVertex2f(550,102);
       glEnd();
   }
     public void BikinTrotoarH2(){
       glBegin(GL_POLYGON);
       glColor3d(0.15,0.15,0.15);
       glVertex2f(000,075);
       glVertex2f(600,075);
       glVertex2f(600,050);
       glVertex2f(000,050);
       glEnd();
   }
     
public static void main(String[] args) {
Sembarang main = null; try { 
    System.out.println("Keys:");
    System.out.println("esc – Exit");
    main = new Sembarang(); 
    main.create();
    main.run(); 
} catch (Exception ex) { 
    Logger.getLogger(Sembarang.class.getName()).log(Level.SEVERE, null, ex);
}finally { if (main != null) { main.destroy(); } } }

private void create() throws LWJGLException { 
    Display.setDisplayMode(new DisplayMode(DISPLAY_HEIGHT, DISPLAY_WIDTH)); 
    Display.setFullscreen(false); 
    Display.setTitle("Sembarang"); 
    Display.create(); 
    Keyboard.create(); 
    Mouse.setGrabbed(false); 
    Mouse.create(); 
    initGL();
    resizeGL(); }
private void run() { 
    while (!Display.isCloseRequested() && !Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) { if (Display.isVisible()) { render();
    } else { if (Display.isDirty()) { render();
    } try { Thread.sleep(100); 
    } catch (InterruptedException ex) { 
    } } Display.update();
    Display.sync(60); } }
private void destroy() { 
    Mouse.destroy();
    Keyboard.destroy(); 
    Display.destroy(); }
private void initGL() {
    glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // untuk mengatur warna background 
    glDisable(GL_DEPTH_TEST);
    glDisable(GL_LIGHTING); }
private void resizeGL() { 
    glViewport(0, 0, DISPLAY_WIDTH, DISPLAY_HEIGHT);
    glMatrixMode(GL_PROJECTION); 
    glLoadIdentity(); 
    gluOrtho2D(0.0f, DISPLAY_WIDTH, 0.0f, DISPLAY_HEIGHT);
    glPushMatrix();
    glMatrixMode(GL_MODELVIEW); 
    glLoadIdentity();
    glPushMatrix(); 
   } 
}

