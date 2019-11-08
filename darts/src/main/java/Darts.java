class Darts {

      double dart;
      
    Darts(double x, double y) {
      dart = (x * x) + (y * y);
        
        
    }

    int score() {
        if (dart <= 1){
          return 10;
        }else if(dart > 1 && dart <= 25){
          return 5;
        }else if (dart > 25 && dart <= 100){
          return 1;
        }else{
          return 0;
        }

    }

}
