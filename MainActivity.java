package com.ualr.simpletasklist;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.simpletasklist.databinding.ActivityMainBinding;
import com.ualr.simpletasklist.model.TaskList;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private TaskList taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // taskList is initialized
        taskList = new TaskList();
    }

    // ADD button will call function
    public void onAddBtnClicked(View view) {
        String description = binding.deleteBtn.getText().toString();
        taskList.add(description);
        binding.deleteBtn.setText(""); // Clear the text field
        updateTaskListDisplay();
    }

    // DELETE button will call function
    public void onDeleteBtnClicked(View view) {
        int taskId = Integer.parseInt(view.getTag().toString());
        taskList.delete(taskId);
        updateTaskListDisplay();
    }

    // DONE button will call function
    public void onDoneBtnClicked(View view) {
        int taskId = Integer.parseInt(view.getTag().toString());
        taskList.markDone(taskId);
        updateTaskListDisplay();
    }

    // task list is updated in display
    private void updateTaskListDisplay() {
        binding.taskList.setText(taskList.toString());
    }
}

        // TODO 05. Add a TaskList member to the MainActivity. Initialize the new member.

        //TODO 06.02 Bind the onAddBtnClicked method to the add button, so the onAddBtnClicked is
        // triggered whenever the user clicks on that button

        //TODO 07.02 Bind the onDeleteBtnClicked method to the delete button, so that method is
        // triggered whenever the user clicks on that button

        //TODO 08.02 Bind the onDoneBtnClicked method to the done button, so the onDoneBtnClicked method is
        // triggered whenever the user clicks on that button


    // TODO 06. Create a new functionality to add a new task using the description provided
    //  through the text field on the top of the screen by tapping the "+" on the right

    // TODO 06.01. Create a new method called onAddBtnClicked.

    // TODO 06.05. Invoke TaskList class' add method to ask the TaskList to
    //  add a new Task with the description provided through the text field.

    // TODO 06.06. Use TaskList class' toString method to get a string with the formatted task list
    //  and display it on screen in the TextView with the id "textView"


    // TODO 07. Create a new functionality to delete a task from the task list

    // TODO 07.01. Create a new method called onDeleteBtnClicked.

    // TODO 07.04. Invoke TaskList class' delete method to ask the TaskList to
    //  delete a Task given the id provided through the text field on the bottom.

    // TODO 07.05. Use TaskList class' toString method to get a string with the formatted task list
    //  and display it on screen in the TextView with the id "textView"


    // TODO 08. Create a new functionality to mark a task as done.

    // TODO 08.01. Create a new method called onDoneBtnClicked

    // TODO 08.04. Invoke TaskList class' markDone method to ask the TaskList to
    //  mark a Task given the id provided through the text field on the bottom.

    // TODO 08.05. Use TaskList class' toString method to get a string with the formatted task list
    //  and display it on screen in the TextView with the id "textView"

