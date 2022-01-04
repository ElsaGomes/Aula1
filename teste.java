Class teste
{
      public static void main(String args[])
  {
    Scanner consola = new Scanner(System.in);

    System.out.println("Escreva o seu ano de nascimento: ");
    int anoNascimento = consola.nextInt();



    int idade = calculaIdade(anoNascimento);


    System.out.println("A sua idade é: " + idade);

    consola.close();

  }

  public static int calculaIdade(int aAnoNascimento)
  {
    int anoAtual = Calendar.getInstance().get(Calendar.YEAR); 

    return anoAtual - aAnoNascimento;
  }
}
