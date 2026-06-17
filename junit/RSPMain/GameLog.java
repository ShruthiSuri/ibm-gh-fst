//package Rock_Paper_Scissors;
//
//public class GameLog {
//	public void log() {
//		try {
//			File file= new File("RPSLog.txt"); 
//			if(file.createNewFile()) {
//				System.out.println("File created: " + file.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//		}
//		catch(Exception e){
//			 System.err.println(e);
//			 e.printStackTrace();
//			 
//		}
//	}
//}
//
//
//
//
//public class CreateFileExample {
//    public static void main(String[] args) {
//        try {
//            File file = new File("example.txt");
//
//            // Create the file if it does not exist
//            if (file.createNewFile()) {
//                System.out.println("File created: " + file.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred while creating the file.");
//            e.printStackTrace();
//        }
//    }
//}
//
//
//2. Writing to a File
//Javaimport java.io.FileWriter;
//import java.io.IOException;
//import java.io.File;
//
//// true = append mode
//            writer.write("Hello, this is a file handling example in Java.\n");
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred while writing to the file.");
//            e.printStackTrace();
//        }
//    }
//}
//
//
//3. Reading from a File
//Javaimport java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class ReadFileExample {
//    public static void main(String[] args) {
//        try {
//            File file = new File("example.txt");
//            Scanner reader = new Scanner(file);
//
//            while (reader.hasNextLine()) {
//                String data = reader.nextLine();
//                System.out.println(data);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found.");
//            e.printStackTrace();
//        }
//    }
//}
//
//
//4. Deleting a File
//Javaimport java.io.File;
//
//public class DeleteFileExample {
//    public static void main(String[] args) {
//        File file = new File("example.txt");
//
//        if (file.delete()) {
//            System.out.println("Deleted the file: " + file.getName());
//        } else {
//            System.out.println("Failed to delete the file.");
//        }
//    }
//}
//
//
//Best Practices
//
//Always close file streams (try-with-resources is recommended).
//Use absolute paths for reliability.
//Handle exceptions properly to avoid crashes.
//For large files, prefer BufferedReader / BufferedWriter for efficiency.
//For modern Java (Java 7+), java.nio.file.Files provides simpler methods like:JavaFiles.readAllLines(Paths.get("example.txt"));
//Files.write(Paths.get("example.txt"), "Text".getBytes(), StandardOpenOption.APPEND);
//
//
//
//
//If you want, I can give you a single Java program that creates, writes, reads, and deletes a file in one go so you can test all operations together.
//Do you want me to prepare that?
