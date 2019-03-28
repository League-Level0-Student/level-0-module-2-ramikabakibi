//Make a variable to hold the X co-ordinate of the dot and set it to void setup() {
    int x;
  void setup(){
   x=0;
    size(800, 200);
}


void draw() {
  background(#CB14E0);
    //make it a nice color
fill(#D83E14);
ellipse(x,150,10,10);

    //if the mouse is pressed...
if(mousePressed){
 x=x+15; 
  
}
    //... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10; Make sure to use your variable for the X position.
    //Make your dot move really fast so that it can win the race 
       // (you have to figure out what part of your code to change)
    //Use this method to play a ding when your dot crosses the finish line. 
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}
