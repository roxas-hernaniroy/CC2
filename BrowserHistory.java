import java.util.LinkedList;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        LinkedList<String> historyList = new LinkedList<>();
        String current = null;
        int currentPageIndex = 0;

        while (true) { 
            if (historyList.isEmpty()) {
                current = "home page";
            }
            System.out.println("You are on " + current + "\n[n = new page | b = backward | f = forward | h = history | s = stop]");
            String operation = userInput.nextLine();
            int listSize = historyList.size();

            switch (operation) {
                case "n": //new page
                    currentPageIndex = historyList.lastIndexOf(current);
                    System.out.println("Input URL:");
                    current = userInput.nextLine();
                    historyList.add(currentPageIndex + 1, current);
                    currentPageIndex = historyList.lastIndexOf(current);

                    if (currentPageIndex != listSize) { //deletes forward history if new page is chosen after backward
                        for (int removalIndex = listSize; removalIndex > currentPageIndex; removalIndex--) {
                            historyList.remove(removalIndex);
                        }
                    }
                    break;

                case "b": //go back
                    if (currentPageIndex == 0) {
                        current = "home page";
                        break;
                    } else {
                        current = historyList.get(currentPageIndex - 1);
                        currentPageIndex = historyList.lastIndexOf(current);
                        break;
                    }
                    
                case "f": //go forward
                    currentPageIndex = historyList.lastIndexOf(current);
                    if (currentPageIndex == (listSize - 1)) {
                        System.out.println("No forward history available.");
                        break;
                    }
                    else if (listSize != 0 && currentPageIndex < listSize) {
                        current = historyList.get(currentPageIndex + 1);
                        break;
                    }

                case "h": //show history
                    System.out.println("History: " + historyList);
                    break;

                case "s": //stop
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
