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
        //Pon el codigo xd
    }

}