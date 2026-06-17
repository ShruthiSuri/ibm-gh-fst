//package Rock_Paper_Scissors;
//
//public class SaveResults {
//
//}
//
//
//private void writeResults(String userSelection, String compSelection, String result) {
//        try {
//            File file = FileUtils.getFile("src/main/java/fst/rock_paper_scissors/history.txt");
//            if (!file.exists()) {
//                boolean isCreated = file.createNewFile();
//                // System.out.println(isCreated);
//                FileUtils.writeStringToFile(file,
//                        "You Selected ->" + userSelection + " ,Opponent Selected->" + compSelection
//                                + " ,Result is ->" + result + "\n",
//                        Charset.defaultCharset());
//            } else {
//                String data = FileUtils.readFileToString(file, Charset.defaultCharset());
//                FileUtils.writeStringToFile(file,
//                        data + "You Selected ->" + userSelection + " ,Opponent Selected->" + compSelection
//                                + " ,Result is ->" + result + "\n",
//                        Charset.defaultCharset());
//            }
//
//        } catch (Exception ex) {
//            System.out.println("Got some error while saving the results (" + ex.getMessage() + ")");
//        }
//    }
//
//    private void getHistoryData() {
//        try {
//            File file = FileUtils.getFile("src/main/java/fst/rock_paper_scissors/history.txt");
//            if (!file.exists()) {
//                throw new Exception("No history found");
//            } else {
//                String data = FileUtils.readFileToString(file, Charset.defaultCharset());
//                System.out.println(data);
//            }
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//    }
//}