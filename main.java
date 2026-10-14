
public class ClothingRecommendation {

    public static void main(String[] args) {

        // Sample customer reviews for testing the program
        String[] reviews = {
            "The fit is perfect and the material is comfortable.",
            "The quality is great, but the price is expensive.",
            "I love the style and color of this shirt.",
            "The sizing is too small and the fabric is itchy.",
            "The quality is durable and the shirt is comfortable.",
            "The price is affordable and the design is stylish.",
            "The fit is too large, but the material is soft.",
            "The style is nice, but the quality is poor."
        };

        // Factors that may influence clothing recommendations
        String[] factors = {
            "Fit and sizing",
            "Quality",
            "Comfort",
            "Style",
            "Price"
        };

        int[] counts = new int[factors.length];

        // Analyze every customer review
        for (int i = 0; i < reviews.length; i++) {
            analyzeReview(reviews[i], counts);
        }

        System.out.println("CLOTHING RECOMMENDATION ANALYSIS");
        System.out.println("--------------------------------");

        // Display how often each factor appears
        for (int i = 0; i < factors.length; i++) {
            System.out.println(factors[i] + ": "
                    + counts[i] + " reviews mentioned this factor");
        }

        // Find the most frequently mentioned factor
        int highest = 0;
        String mostImportant = "";

        for (int i = 0; i < factors.length; i++) {
            if (counts[i] > highest) {
                highest = counts[i];
                mostImportant = factors[i];
            }
        }

        System.out.println();
        System.out.println("Most discussed factor: " + mostImportant);
        System.out.println("A recommendation engine should consider "
                + "this factor when suggesting clothing.");
    }

    // Analyzes one review and updates the factor counts
    public static void analyzeReview(String review, int[] counts) {

        String text = review.toLowerCase();

        if (text.contains("fit") || text.contains("size")
                || text.contains("sizing")) {
            counts[0]++;
        }

        if (text.contains("quality") || text.contains("durable")
                || text.contains("poor")) {
            counts[1]++;
        }

        if (text.contains("comfortable") || text.contains("comfort")
                || text.contains("soft") || text.contains("itchy")) {
            counts[2]++;
        }

        if (text.contains("style") || text.contains("color")
                || text.contains("design") || text.contains("stylish")) {
            counts[3]++;
        }

        if (text.contains("price") || text.contains("expensive")
                || text.contains("affordable")) {
            counts[4]++;
        }
    }
}
