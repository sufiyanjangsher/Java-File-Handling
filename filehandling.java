//creating file
// import java.io.*;
// class filehandling{
//     public static void main(String arg[]){
//        try{
//          File f=new File("file.txt");
//         if(f.createNewFile()){
//             System.out.println("file created");
//         }
//         else {
//               System.out.println("already exist");
//         }
//     }
//     catch(Exception e){
//         System.out.println(e);
//     }
// }
// }



//writing into file
// import java.io.*;
// class filehandling{
//     public static void main(String arg[]){
//        try{
//          FileWriter fw=new FileWriter("file.txt");
//        fw.write("hello file");
//        fw.close();
//        System.out.println("data written");
//     }
//     catch(Exception e){
//         System.out.println(e);
//     }
// }
// }



//reading file
// import java.io.*;
// class filehandling{
//     public static void main(String arg[]){
//        try{
//          FileReader fr=new FileReader("file.txt");
//        int i;
//        while((i=fr.read())!=-1){
//         System.out.print((char)i);
//        }
//        fr.close();
       
//     }
//     catch(Exception e){
//         System.out.println(e);
//     }
// }
// }



//append
// import java.io.*;
// class filehandling{
//     public static void main(String arg[]){
//        try{
//          FileWriter fw=new FileWriter("file.txt",true);
//        fw.write("new data");
//        System.out.println("new data stored");
//        fw.close();
       
//     }
//     catch(Exception e){
//         System.out.println(e);
//     }
// }
// }



// import java.io.*;
// class filehandling{
//     public static void main(String arg[]){
//        try{
//          FileReader fr=new FileReader("file.txt");
//        int i;
//        while((i=fr.read())!=-1){
//         System.out.print((char)i);
//        }
//        fr.close();
       
//     }
//     catch(Exception e){
//         System.out.println(e);
//     }
// }
// }




//file information
// import java.io.*;
// class filehandling{
//     public static void main(String arg[]){
//          File f = new File("file.txt");

//         System.out.println(f.getName());

//         System.out.println(f.getAbsolutePath());

//         System.out.println(f.exists());

//         System.out.println(f.length());

//         System.out.println(f.canRead());

//         System.out.println(f.canWrite());
//     }
// }





//delete file
// import java.io.*;
// class filehandling{
//     public static void main(String arg[]){
//         File f=new File("file.txt");
//         if(f.delete()){
//             System.out.println("deleted");
//         }
//         else {
//             System.out.println("not");
//         }
//     }
// }




//bufferedwriter
// import java.io.*;
// class filehandling{
//     public static void main(String arg[])
//         throws Exception{
//             BufferedWriter bw=new BufferedWriter(new FileWriter("file.txt"));
//             bw.write("hello");
//             bw.newLine();
//             bw.write("file");
//             bw.close();
//         }
//     }



 //bufferedreader
//  import java.io.*;
// class filehandling{
//     public static void main(String arg[])
//         throws Exception{
//             BufferedReader br=new BufferedReader(new FileReader("file.txt"));
//            String line;
//            while((line=br.readLine())!=null){
//             System.out.println(line);
//            }
//         }
//     }
   

//file copy
// import java.io.*;
// class filehandling{
//     public static void main(String arg[])
//         throws Exception{
//             FileReader fr=new FileReader("file.txt");
//             FileWriter fw=new FileWriter("newfile.txt");
//             int ch;
//             while ((ch=fr.read())!=-1){
//                 fw.write(ch);
//             }
//             fr.close();
//             fw.close();
//             System.out.println("copied");
//         }

//     }
   


//Student record example
// import java.io.*;
// class filehandling{
//     public static void main(String arg[])
//         throws Exception{
           
//             FileWriter fw=new FileWriter("newfile.txt");
//             fw.write("sufiyan");
//             fw.write("20");
//             fw.write("cse");

           
//             fw.close();
           
//         }

//     }
   


import java.io.*;
class filehandling{
    public static void main(String arg[])
        throws Exception{
           
           BufferedReader br=new BufferedReader(new FileReader("file.txt"));
           String line;
           while((line=br.readLine())!=null){
            System.out.println(line);
           }
           br.close();
          
           
        }

    }
   