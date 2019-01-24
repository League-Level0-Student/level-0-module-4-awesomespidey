 void setup(){
        size(1000,1000);
        background(0,88876543,0);
    
 
 PImage face = loadImage("KRTiapr.jpg");
    
 face.resize(width,height);
 background(face);
}

    void draw(){
     
   if(mousePressed){
    println(mouseX+" "+mouseY);
    
   }
   fill(255,255,255);
   ellipse(391,357,300,350); 
   ellipse(782,374,200,255);
   fill(255,255,255);//white part of the eyes
  
}
