package pack8_3;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import java.lang.Runnable;

class FileScanner implements Runnable

{

   private String filename;

   private String [] targetStrings;

   private String monikerName;

   public FileScanner(String filename, String [] targetStr,String name)

   {

        this.filename = new String(filename);

        this.monikerName = new String(name);
        
        this.targetStrings = new String[4];

        for (int iLoop=0; iLoop<4; iLoop++)

        {

           this.targetStrings[iLoop] = new String(targetStr[iLoop]);

        }

   }

  public void run()

  {

      try

      {

         String content = new String(Files.readAllBytes(Paths.get(filename)));

         System.out.println(content);

         int strlen = content.length();

         for (int iLoop=0; iLoop<4; iLoop++)

         {

           int iIndexPos= -1;

           while (iIndexPos<strlen)

           {

               int iTemp = content.indexOf(targetStrings[iLoop],iIndexPos+1);

               if (iTemp>=0)

               {
                System.out.println(this.monikerName + " : target string " + targetStrings[iLoop] + " at index " + iTemp);

                     iIndexPos = iTemp;

               }

               else

               {

                  break;

               }

           }

         }

      }

      catch (IOException ex) { System.out.println("IO Exception "); }

  }

}