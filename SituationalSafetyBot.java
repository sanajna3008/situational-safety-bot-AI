import java.util.*;

public class SituationalSafetyBot {
    
    public static List<String> safetyTips(String situation) {
        situation = situation.toLowerCase();
        List<String> tips = new ArrayList<>();

        if (situation.contains("fire")) {
            tips.add(" Stay low to avoid smoke.");
            tips.add(" Check doors for heat before opening.");
            tips.add(" Exit immediately — do not use elevators.");
            tips.add(" Call emergency services once safe.");
        } 
        else if (situation.contains("earthquake")) {
            tips.add(" Drop, cover, and hold under a sturdy table.");
            tips.add(" Stay away from windows and heavy objects.");
            tips.add(" After shaking stops, move to open ground.");
            tips.add(" Check for injuries and call for help if needed.");
        } 
        else if (situation.contains("stranger") || situation.contains("harassment")) {
            tips.add(" Keep distance from the stranger.");
            tips.add(" Speak confidently and leave the area quickly.");
            tips.add(" Call a trusted person or police if you feel unsafe.");
            tips.add(" Avoid isolated places and stay in public areas.");
        } 
        else if (situation.contains("travel")) {
            tips.add(" Keep your belongings close and zipped.");
            tips.add(" Share your live location with a trusted friend.");
            tips.add(" Use verified taxi apps only.");
            tips.add(" Save emergency contacts in your phone.");
        } 
        else if (situation.contains("online") || situation.contains("cyber")) {
            tips.add(" Never share OTPs, passwords, or personal data.");
            tips.add(" Use strong passwords and enable two-factor authentication.");
            tips.add(" Don’t click unknown links or attachments.");
            tips.add(" Report and block suspicious accounts.");
        } 
        else if (situation.contains("night") || situation.contains("alone")) {
            tips.add(" Stay in well-lit areas.");
            tips.add(" Keep emergency numbers on speed dial.");
            tips.add(" Walk confidently and avoid distractions (like headphones).");
            tips.add(" If driving, lock doors and avoid stopping in dark areas.");
        } 
        else {
            tips.add(" Sorry, I don’t have specific advice for that situation.");
            tips.add(" Try words like 'fire', 'earthquake', 'stranger', 'online', or 'travel'.");
        }

        return tips;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("         Situational Safety Bot        ");
        System.out.println("===================================\n");

        System.out.println("Hello! I'm your Safety Assistant.");
        System.out.println("I can help you with safety tips for various situations.");
        System.out.println("Examples: fire, earthquake, stranger, travel, online safety, etc.\n");

        while (true) {
            System.out.print("Enter a situation (or type 'exit' to quit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("bye")) {
                System.out.println("\nStay safe and take care! ");
                break;
            }

            List<String> tips = safetyTips(input);
            System.out.println("\nSafety Tips:");
            for (String tip : tips) {
                System.out.println(" - " + tip);
            }
            System.out.println();
        }

        sc.close();
    }
}