package com.ualr.simpletasklist.model;

public class Task {
    private String description;
    private boolean taskComplete;

    public Task(String description, boolean taskComplete) {
        this.description = description;
        this.taskComplete = taskComplete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTaskComplete() {
        return taskComplete;
    }

    public void setTaskComplete(boolean taskComplete) {
        this.taskComplete = taskComplete;
    }

    //Task name would be "Finish App". Task description would be "Write Java Code".
    static {
    Task task = new Task("Finish App", false);
    task.setDescription("Write Java Code");
    task.setTaskComplete(true);
}

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not

    // TODO 02. Define the class constructor and the corresponding getters and setters.

}
