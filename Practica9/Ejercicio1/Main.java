public class Main {
    public static void main(String[] args) {
        Boleto boleto1 = new BoletoPalco(13, "Derecha");
        Boleto boleto2 = new BoletoPlatea(14, 5);
        Boleto boleto3 = new BoletoGaleria(15, true);

        System.out.println(boleto1.obtenerInformacion());
        System.out.println(boleto2.obtenerInformacion());
        System.out.println(boleto3.obtenerInformacion());
        
        //b)
        System.out.println("-------Inciso B-------");
                Palco boletoPalco = new Palco(13); 
                
                System.out.println(boletoPalco.obtenerInformacionBoleto());
                
                //C)
                System.out.println("-------Inciso C-------");
                Platea boleto11 = new Platea(201, 15); 
                Platea boleto21 = new Platea(202, 5);  
                
                System.out.println(boleto11.obtenerInformacion()); 
                
                
                System.out.println(boleto21.obtenerInformacion());
                
                System.out.println("-------Inciso D-------");
                
                Galeria boleto111 = new Galeria(301, 12); 
                Galeria boleto211 = new Galeria(302, 7);  
                
                System.out.println(boleto111.obtenerInformacion()); 
               
                
                System.out.println(boleto2.obtenerInformacion()); 
            }
        
    }
