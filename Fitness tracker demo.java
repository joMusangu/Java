import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class User {
    private String name;
    private int age;
    private double weight;
    private List<Double> weightHistory;

    public User(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.weightHistory = new ArrayList<>();
        this.weightHistory.add(weight);
    }

    // Getters and setters for profile information

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        weightHistory.add(weight);
    }

    public double getWeight() {
        return weight;
    }

    public List<Double> getWeightHistory() {
        return weightHistory;
    }
}

abstract class Activity {
    // ...

    public abstract double calculateCaloriesBurnt(User user);

    // ...
}

// ...

class Tracker {
    // ...

    private double weightGoal;
    private double activityGoal;

    public Tracker(double weightGoal, double activityGoal) {
        // ...
        this.weightGoal = weightGoal;
        this.activityGoal = activityGoal;
    }

    public void setWeightGoal(double weightGoal) {
        this.weightGoal = weightGoal;
    }

    public double getWeightGoal() {
        return weightGoal;
    }

    public void setActivityGoal(double activityGoal) {
        this.activityGoal = activityGoal;
    }

    public double getActivityGoal() {
        return activityGoal;
    }

    public boolean checkWeightGoalAchievement(User user) {
        double currentWeight = user.getWeight();
        return currentWeight <= weightGoal;
    }

    public boolean checkActivityGoalAchievement(User user) {
        // Calculate user's total activity duration
        double totalDuration = 0;
        for (Record record : records) {
            totalDuration += record.getActivity().getDuration();
        }
        return totalDuration >= activityGoal;
    }

    public double calculateWeightLoss(User user) {
        List<Double> weightHistory = user.getWeightHistory();
        if (weightHistory.size() < 2) {
            return 0.0;
        } else {
            double initialWeight = weightHistory.get(0);
            double currentWeight = user.getWeight();
            return initialWeight - currentWeight;
        }
    }

    // ...
}

class TrackerUI {
    // ...

    private Tracker tracker;

    public TrackerUI() {
        // ...
        this.tracker = new Tracker(70.0, 3600.0); // Example weight goal and activity goal
    }

    // ...

    private void showProgressDashboard(User user) {
        System.out.println("===== Progress Dashboard =====");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Weight: " + user.getWeight());

        // Weight loss progress
        double weightLoss = tracker.calculateWeightLoss(user);
        System.out.println("Weight Loss: " + weightLoss);

        // Weight goal achievement
        boolean weightGoalAchieved = tracker.checkWeightGoalAchievement(user);
        System.out.println("Weight Goal Achieved: " + weightGoalAchieved);

        // Activity goal achievement
        boolean activityGoalAchieved = tracker.checkActivityGoalAchievement(user);
        System.out.println("Activity Goal Achieved: " + activityGoalAchieved);
    }

    // ...
}

// Example usage:

public class FitnessTracker {
    public static void main(String[] args) {
        // Create a user
        User user = new User("John Doe", 30, 70.0);

        // Create a tracker UI
        TrackerUI trackerUI = new TrackerUI();

        // Show progress dashboard
        trackerUI.showProgressDashboard(user);

        // ...
    }
}
