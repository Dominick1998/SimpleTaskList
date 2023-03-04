package com.ualr.simpletasklist.model;

import androidx.annotation.NonNull;

import java.util.HashMap;

public class TaskList {

    private final HashMap<Integer, Task> tasks;
    private int nextTaskId;

    //HashMap for TaskList implementation
    public TaskList() {
        tasks = new HashMap<>();
        nextTaskId = 1;
    }

    // This will add the new task with a given description
    public void add(String description) {
        Task task = new Task(description, false);
        tasks.put(nextTaskId, task);
        nextTaskId++;
    }

    // This will erase or remove task
    public void delete(int taskId) {
        tasks.remove(taskId);
    }

    // This will mark the task as done or complete
    public void markDone(int taskId) {
        Task task = tasks.get(taskId);
        assert task != null;
        task.setTaskComplete(true);
    }

    // This will give a string(formatted) with all tasks
    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int taskId : tasks.keySet()) {
            Task task = tasks.get(taskId);
            assert task != null;
            sb.append(taskId).append(": ")
                    .append(task.getDescription()).append(" (")
                    .append(task.isTaskComplete() ? "DONE" : "TODO")
                    .append(")\n");
        }
        return sb.toString();
    }
}
    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    // TODO 04. Define the class constructor and the corresponding getters and setters.

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.

    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.


