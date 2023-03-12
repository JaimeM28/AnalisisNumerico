public class MetodosCerrados{

    public double funcion(double h){
        return Math.PI*Math.pow(h, 2)*(9-h)/3-30;
    }

    public void Biseccion(double a, double b, int iteraciones){
        double fa = funcion(a);
        double fb = funcion(b); 
        if(fa * fb < 0 ){
            double c = (a + b)/2;
            System.out.print("Aproximacion en la iteración 1: " + c);
            double fc; 
            for(int i = 0; i < iteraciones; i++){
                fc = funcion(c);
                if(fa * fc < 0 ){
                    b = c;
                    fb = fc;
                }else{
                    a = c;
                    fa = fc; 
                }
                c = (a + b)/2;
                System.out.printf("\nAproximación en la iteracion %d: %f ", i+2,c);
            }
        }else{
            System.out.print("El intervalo no cumple con el teorema de Bolzano");
        }
    }

    public void InterpolacionLineal(double a, double b, int iteraciones){
        double fa = funcion(a);
        double fb = funcion(b);
        double errorRelativo = 0.0;
        double cPrevia=0.0;
        System.out.printf("\n\nMétodo de interpolación lineal\n");
        if(fa * fb < 0 ){
            double c = ((fa*(a-b))/(fb-fa))+a;
            System.out.printf("\nIteración 1\t Aproximación: %.6f \t Aún no existe error relativo",c);
            double fc; 
            cPrevia = c;
            for(int i = 0; i < iteraciones; i++){
                fc = funcion(c);
                if(fa * fc < 0 ){
                    b = c;
                    fb = fc;
                }else{
                    a = c;
                    fa = fc; 
                }
                c = ((fa*(a-b))/(fb-fa))+a;
                errorRelativo=((c-cPrevia)/c)*100;
                System.out.printf("\nIteracion %d\t Aproximación: %.6f \t Error relativo: %.6f", i+2,c,errorRelativo);
                cPrevia = c;
            }
        }else{
            System.out.print("El intervalo no cumple con el teorema de Bolzano");
        }
    }

}