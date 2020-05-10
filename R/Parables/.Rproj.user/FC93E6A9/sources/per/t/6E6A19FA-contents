library(MASS)
options(digits=5)

# VARIABILI & CALCOLI

  # VALORI MINIMI E MASSIMI DI x;
min = -10;
max = 10;
x = 0;
y = 0;

  # INPUT 3 PUNTI
print("> Inserisci le coordinate dei 3 punti: ");
Ax = readline(prompt = "> Ax: ");
Ax = as.double(Ax);
Ay= readline(prompt = "> Ay: ");
Ay = as.double(Ay); 

Bx = readline(prompt = "> Bx: ");
Bx = as.double(Bx);
By = readline(prompt = "> By: ");
By = as.double(By); 

Cx = readline(prompt = "> Cx: ");
Cx = as.double(Cx);
Cy = readline(prompt = "> Cy: ");
Cy = as.double(Cy);

  # SISTEMA (CRAMER) PER TROVARE a, b, c
D = ( Ax^2 * Bx ) + ( Ax * Cx^2 ) + ( Bx^2 * Cx ) - ( Ax^2 * Cx ) - ( Ax * Bx^2 ) - ( Bx * Cx^2 );

if( D == 0 ){
  print("> Parabola non rappresentabile - sistema impossibile")
}else{
  
  Da = ( Ay * Bx ) + ( Ax * Cy ) + ( By * Cx ) - ( Ay * Cx ) - ( Ax * By ) - ( Bx * Cy );
  Db = ( Ax^2 * By ) + ( Ay * Cx^2 ) + ( Bx^2 * Cy ) - ( Ax^2 * Cy ) - ( Ay * Bx^2 ) - ( By * Cx^2 );
  Dc = ( Ax^2 * Bx * Cy ) + ( Ax * Cx^2 * By ) + ( Bx^2 * Cx * Ay ) - ( Ax^2 * Cx * By ) - ( Ax * Bx^2 * Cy ) - ( Bx * Cx^2 * Ay );
  
  a = Da / D;
  b = Db / D;
  c = Dc / D;
  
  if( a == 0 ){
    print("> Il fattore 'a' risulta 0 - l'equazione delinea una retta");
  }
  
  delta = b * b - 4 * a * c;
  
    # COORDINATE VERTICE
  Vx = -1 * ( b / (2 * a));
  Vy = -1 * ( delta / (4 * a));
  
    
    # COORDINATE FUOCO
  Fx = Vx;
  Fy = ( 1 - delta ) / ( 4 * a );
  
    # Y DIRETTRICE
  dir = -1 * (( 1 + delta ) / ( 4 * a ));
  
  
# PLOT
  
  func = function(x) {a*x*x + b*x + c};
  
    # DISEGNO PARABOLA
  curve( func,
         from = min,
         to = max,
         main = "Parabola",
         ylab = "y",
         xlab = "x",
         type = "l",
         col = "black"
  )
  
    # DISEGNO VERTICE
  points( Vx, Vy,
          type = "p",
          col = "red",
          pch = 21,
          bg = "red",
          ylim = c(min, max)
  )
    # DISEGNO FUOCO
  points( Fx, Fy,
          type = "p",
          col = "green",
          pch = 21,
          bg = "green"
  )  
  
    # DISEGNO DIRETTRICE
  abline( h = dir, 
          col = "blue"
  )
  
    # DISEGNO ASSE DI SIMMETRIA
  abline( v = Vx, 
          col = "orange"
  )

  
    # AGGIUNGO LEGENDA
  legend(
    "topright", 
    legend=c("Parabola" , "Vertice" , "Fuoco" , "Direttrice", "Asse"),
    col=c("black", "red", "green", "blue", "orange"), 
    lty = 1:2, 
    cex=0.8
  )
  
  
    # OUTPUT CONSOLE
  print(paste0("- Equazione: y = ", fractions(a), "x^2 + ", fractions(b), "x + ", fractions(c)));
  print("Punti:");
  print(paste0("A(", fractions(Ax), ";", fractions(Ay), ")"));
  print(paste0("B(", fractions(Bx), ";", fractions(By), ")"));
  print(paste0("C(", fractions(Cx), ";", fractions(Cy), ")"));
  
  print(paste0("Vertice: V(", fractions(Vx), ";", fractions(Vy), ")"));
  print(paste0("Fuoco: F(", fractions(Fx), ";", fractions(Fy), ")"));
  
  print(paste0("Equazione direttrice: y = ", fractions(dir)));
  print(paste0("Equazione asse di simmetria: x = ", fractions(Vx)));
    
}
