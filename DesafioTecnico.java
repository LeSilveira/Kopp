public class DesafioTecnico
{
 public static void main()
 {
  float valores[] = {90f, 105.2f, 165.75f, 75.93f, 85.33f};
  int quantiaDeValores = (valores.length);
  String retorno;
  float total;

  retorno = "Remessa gerada: ";
  for (float valor : valores)
   {
    total = total + valor;    
   }

  for (int x=1; x<=quantiaDeValores; x++)
   {
     if (x==quantiaDeValores)
     {
      retorno = retorno + "/x/ cujo valor é R$ /valores[x]/. Total = /total/.";
     }
     else
     {
      retorno = retorno + "/x/ cujo valor é R$ /valores[x-1]/, ";
     }
   }
  System.out.println(retorno);
 }
}