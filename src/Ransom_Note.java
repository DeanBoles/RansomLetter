import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ransom_Note {
    public static void main(String args[]) {

        int tries = 1;
        boolean foundNote = false;

        while (!foundNote) {

            List<Character> noteList = new ArrayList<>();
            List<Character> articleList = new ArrayList<>();
            int letterSuccess = 0;

            System.out.println("Enter ransom note: ");
            Scanner inputNote = new Scanner(System.in); //This is the note
            String note = inputNote.nextLine();
            String article = "…If it eventually becomes law, New Mexico would be the first state in the nation to require post-high school plans of students, said Jennifer Zinth, who is the director of high school and STEM research at the Education Commission of the States, a Denver-based group that tracks education policy.\n" +
                    "\n" +
                    "The bill (House Bill 23) is sponsored by Rep. Nate Gentry, a Republican, and Sen. Daniel Ivey-Soto, a Democrat, would make it mandatory for public school juniors to apply to at least one two- or four-year college. Exceptions would be made for students who can prove they have committed to military service, a vocational program, or work upon graduation in an apprenticeship or internship. Parents and school guidance counselors would have to approve of the students’ plans.\n" +
                    "\n" +
                    "The measure was drafted with the aim of reversing declines in college enrollment across the state, which fell nearly 14% from 155,065 enrolled students in 2010 to 133,830 in 2016. [According to the Las Cruces Sun, that’s likely at least partly due to an aging state population and a cut in the value of the state legislative lottery scholarship, which covers about 60 percent of tuition costs for students who qualify for the assistance.]\n" +
                    "\n" +
                    "Ivey-Soto, an attorney and former educator, said it also could encourage prospective first-generation college students to seriously consider getting into a higher education institution. …\n" +
                    "\n" +
                    "The New Mexico bill is modeled after a similar requirement that Gentry said was put in place for high school students in San Marcos, Texas, more than a decade ago [that led to an 11 percent jump among high school students going on to college]. And last year in Chicago, Mayor Rahm Emanuel made post-high school plans a graduation requirement – saying students had to either have plans to enter the military, take part in a “gap year” program, get a job offer or apprenticeship, or have an acceptance letter from a college.\n" +
                    "\n" +
                    "…The New Mexico bill seeks to boost the state’s college enrollment rate in the hopes the state would have a better-educated workforce. That could attract more companies to New Mexico, where the unemployment rate is 6.5%, the second highest in the U.S. and more than two percentage points higher than the national rate.\n" +
                    "\n" +
                    "While students would not be required to attend college, Gentry thinks requiring them to fill out applications will make them more likely to do so. Many of the state’s community college don’t charge application fees and applying online can take as little as 20 minutes.\n" +
                    "\n" +
                    "Applying to the University of New Mexico, however, costs $25 [and US News suggests “might place a financial burden on students. In an effort to combat this issue, Gentry, who is sponsoring the bill, would like to address the possibility of waiving the fees for in-state institutions.”] …..\n" +
                    "\n" +
                    "From an Associated Press report published on Jan. 31 at USAToday .com. Reprinted here for educational purposes only. May not be reproduced on other websites without permission from USA Today. \n";

            for (int i = 0; i < article.length(); i++) {
                articleList.add(article.charAt(i));
            }

            for (int i = 0; i < note.length(); i++) {
                noteList.add(note.charAt(i));
            }

            for (Character c : noteList) {
                if (!articleList.contains(c)) continue;
                letterSuccess++;
                articleList.remove(c);
            }

            if (letterSuccess == noteList.size()) {
                System.out.println(String.format("success you got {%s] letters", letterSuccess));
                foundNote = true;
            } else {
                System.out.println(String.format("fail : [%s] letters missing ", (noteList.size() - letterSuccess)));
                tries++;
            }
        }
        System.out.println("Well done");
        System.out.println(String.format("it took you [%s] tries", tries));
    }
}
