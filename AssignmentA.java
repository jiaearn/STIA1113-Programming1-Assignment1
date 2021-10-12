import java.util.Scanner;
public class AssignmentA
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int vehicleCount= 0;
      System.out.print("Please enter a vehicle count: ");
      vehicleCount= sc.nextInt();
      String[] purchaseDate=new String[vehicleCount];
      String[] plateNumber=new String[vehicleCount];
      String[] model=new String[vehicleCount];
      String[] type=new String[vehicleCount];
      double[] tonnage=new double [vehicleCount];
      double[] price=new double[vehicleCount];
      String[] registrationNumber=new String[vehicleCount];
      double[] fuelCapacity=new double[vehicleCount];
      int[] no = new int[vehicleCount];
    System.out.printf("%nE-Transport Management System (ETMS)%n");
    System.out.println("--------------------------------------------");      
    System.out.println("");  
    
      for(int count=0;count<vehicleCount;count++)
      { 
   {
   do{
   System.out.print("Plate number(inculde character): ");
   plateNumber[count]= sc.next();
   plateNumber[count]=plateNumber[count].toUpperCase();
   if(plateNumber[count].length()<=7&&plateNumber[count].length()>=2);
   else
   System.out.println("Please enter a correct plate number.");}
   while(plateNumber[count].length()>7||plateNumber[count].length()<2);
   
   
   do{
   System.out.print("Model(ISUZU/HINO/MAN_SE)       : ");
   model[count]= sc.next();
   model[count]=model[count].toUpperCase();
   
      if(model[count].equals("ISUZU"))
      model[count]="ISUZU (JAPAN)";
      else if(model[count].equals("HINO"))
      model[count]="HINO (JAPAN)";
      else if(model[count].equals("MAN_SE"))
      model[count]="MAN_SE (GERMANY)";
      else
      System.out.println("Please ENTER a correct model.");
      }while(!model[count].equals("ISUZU (JAPAN)")&&!model[count].equals("HINO (JAPAN)")&&!model[count].equals("MAN_SE (GERMANY)"));
      
      
    
   System.out.print("Price                          : ");
   price[count]= sc.nextDouble();
   
   do{
   System.out.print("Purchase Date(dd/mm/yyyy)      : ");
   purchaseDate[count]= sc.next();
   if(purchaseDate[count].length()==10);
   else
   System.out.println("Wrong format for purchase date.");}
   while(purchaseDate[count].length()!=10);
   
   do{
   System.out.print("Registration Number(6digit)    : ");
   registrationNumber[count]= sc.next();
   if(registrationNumber[count].length()==6);
   else
   System.out.println("Please enter a 6digit number.");}
   while(registrationNumber[count].length()!=6);

   do{
   System.out.print("Tonnage(1.0T-4.5T)             : ");
   tonnage[count]= sc.nextDouble();
   
      if(tonnage[count]>=1.0 && tonnage[count]<=2.0)
      type[count]="Light Vehicle";
      else if(tonnage[count]>=2.1 && tonnage[count]<=4.5)
      type[count]="Heavy Vehicle";
      else
      System.out.println("Error:The tonnage of lorry is between 1.0T-4.5T");}
      while(tonnage[count]<1||tonnage[count]>4.5);
     
         switch (type[count])
         {
         case "Light Vehicle":
         fuelCapacity[count]=150;
         break;
         case "Heavy Vehicle":
         fuelCapacity[count]=200;
         break;   
         default:
         fuelCapacity[count]=0 ;              
         }
   no[count]=count+1;
   System.out.println("");
   }}
    
   System.out.printf("%n%n`````````````````````````````````````````%n");
   System.out.println("E-Transport Management System (ETMS)");
   System.out.printf("`````````````````````````````````````````%n%n");
   System.out.printf("%-10s%-20s%-25s%-15s%-15s%-22s%-15s%-15s%-15s","NO. ","Plate number","Model","Price(RM)","Purchase Date","Registration Number","Tonnage(T)","Type","Fuel Capacity(L)");
   System.out.printf("%n-------------------------------------------------------------------------------");  
   System.out.printf("---------------------------------------------------------------------------------%n");
   for(int count=0;count<vehicleCount;count++)
   { 
   System.out.printf("%-10s%-20s%-25s%-15.2f%-20s%-20s%-9.2f%-20s%-10.1f%n",no[count],plateNumber[count],model[count],price[count],purchaseDate[count],registrationNumber[count],tonnage[count],type[count],fuelCapacity[count]);
   }
   
  }
}