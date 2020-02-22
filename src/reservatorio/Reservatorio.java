/*Program para calcular um reservatório de água*/
package reservatorio;
import java.util.Scanner;
/**
 *
 * @author Alex Santos
 * @educador.alexsantos@gmail.com
 */
public class Reservatorio {

    /**
     * @param args the command line arguments
     Alterado da web
     */
    public static void main(String[] args) {
        //Variaveis do programa 
        int vReservatorio, vdepois, consumido;
        int altura, comprimento, largura, nivel;
        float resultado;
        //Volume do reservatório capacidade total
        int cReservatorio;
        //declarando o escaneamento de entrada 
        Scanner input = new Scanner(System.in);
        //entradas de dados para calculos
        System.out.println("Informe o Nível de água: Altura dm: ");
        altura = input.nextInt();
        System.out.println("Informe o comprimento dm");
        comprimento = input.nextInt();
        System.out.println("Informe largura dm");
        largura = input.nextInt();
        //Volume do reservatório capacidade total
        cReservatorio = 16 * 30 * 20;
        //Volume depois 
        vReservatorio = altura * comprimento * largura;
        resultado = cReservatorio - vReservatorio;
        System.out.println("Foi consumido: "+resultado+" Litros");
        if(resultado >= 4000)
        {
            System.out.println("Ecomize ÁGUA!");
        }
    }
        
    }
