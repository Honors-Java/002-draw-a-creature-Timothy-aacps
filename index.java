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
  ellipse(120,260,200,100);
  ellipse(237,234,80,50);
  ellipse(200,200,100,100);
  ellipse(100,260,200,100);
  ellipse(225,220,25,25);

 
}