package pack8_3;

public class FileThread 
{
      public static void main(String args[])
    {

          if (args.length!=6)

    {

          System.out.println(" java FileThread filename1 filename1 targetStr1 targetStr2 targetStr3 targetStr4");

    }

    else

    {

           String targetStrings[] = new String[4];

           targetStrings[0] = new String(args[2]);

           targetStrings[1] = new String(args[3]);

           targetStrings[2] = new String(args[4]);

           targetStrings[3] = new String(args[5]);
  
           FileScanner fileScanner1 = new FileScanner(args[0],targetStrings,"scanner1");

           FileScanner fileScanner2 = new FileScanner(args[1],targetStrings,"scanner2");

           fileScanner1.run();

           fileScanner2.run();
     }

    }
 }