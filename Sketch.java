import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // makes all the lines black
    stroke(12,12,12);
    
    // Quadrant 1 Line For Statements

    // Creating the vertical lines
	  for(int intLine1 = width / 20; intLine1 <= width / 2; intLine1 += width / 20){
      line(intLine1, 0, intLine1, height / 2);
    }
    // Creatting the horizontal lines
    for(int intLine2 = height / 20; intLine2 <= height / 2; intLine2 += height / 20){
      line(0, intLine2, width / 2, intLine2);
    }
    
    // Quadrant 2 Circles

    // Colour of the circles
    fill(170,51,106);
    // Setting up the horizontal and vertical position of the circles
    for(int intCircleY = height / 20; intCircleY <= height / 2; intCircleY += height / 10){
      for(float intCircleX = width / (float) 1.8181; intCircleX <= width; intCircleX += width / 10){
        // Creating the circles
        ellipse(intCircleX, intCircleY, width / 20, height / 20);
      }
    }
    
    // Quadrant 3

    // Setting a base colour value
    int intColour = 32;
    // Setting up the for loop for the gradient
    for(int intGreyScale = 0; intGreyScale <= width / 2; intGreyScale += width / 400){
      // Changes the colour of the lines every loop
      intColour = intColour + 1;
      stroke(intColour,intColour,intColour);
      // Creates the lines
      line(intGreyScale, height / 2, intGreyScale, height);
      }
    
      // Quadrant 4  
    // Change the lines to black
    stroke(12,12,12);
    // Dark Orange Petal
    fill(240,128,0);
    // Translate the point to the center of the fourth quadrant
    translate(width * (float)0.75, height * (float) 0.75);
    // Loop for petals
    for(int intPetal = 0; intPetal < 8; intPetal++){
      // Rotating the petals
      rotate(PI/4);
      // Creating the petals
    ellipse(0,0, width / 20 , height / (float)3);
    }
    noStroke();
    // Changing the middle colour and creating the middle
    fill(45,180,78);
    ellipse(0,0,width/10,height/10);
  }
  
  // define other methods down here.
}