// create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int Xvalue = 400;
    int Yvalue = 400;
    int Size = 60;
    
    void setup() {
      //set the size of your sketch
    size(800,800);
    }
    
    void draw() {
      //set the background color of your sketch
      background(#FAA7F2);
      //draw an ellipse. Make sure it fits in the window.
      ellipse(Xvalue,Yvalue,Size,Size);
      //use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      int distance;
      //6b. use the getDistance method to initialize your varible
      //(on this one)
      distance = getDistance(mouseX, mouseY, Xvalue, Yvalue);
      //    use the mouse's x and y and the x and y of your ellipse 
     
      //print the distance variable
    print(distance);
      
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      if(distance<Size){
       Xvalue = (int) random(0,800);
       Yvalue = (int) random(0,800);
      }
        //8b.  set the x and y of the ellipse to a random location on the window
       
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }