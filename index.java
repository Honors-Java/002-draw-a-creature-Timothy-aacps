void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  //body
  ellipse(120,260,200,100);
  //beak
  ellipse(237,234,80,50);
  //head
  ellipse(200,200,100,100);
  //left wing
  ellipse(100,260,200,100);
  //eye
  ellipse(225,220,25,25);

 
}