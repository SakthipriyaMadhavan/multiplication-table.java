class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int mul;
       int n=sc.nextInt();
      for(int i=1;i<=10;i++)
      {
          mul=n*i;
          System.out.println(n+"*"+i+"="+mul);
      }
     
    }
}
