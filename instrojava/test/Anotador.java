    import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

    public class Anotador extends AppCompatActivity {

        private EditText taskEditText;
        private Button addButton;
        private ListView taskListView;
        private TaskList taskList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            taskEditText = findViewById(R.id.taskEditText);
            addButton = findViewById(R.id.addButton);
            taskListView = findViewById(R.id.taskListView);
            taskList = new TaskList();

            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String taskText = taskEditText.getText().toString();
                    Task task = new Task(taskText);
                    taskList.addTask(task);
                    updateTaskList();
                    taskEditText.setText("");
                }
            });

            taskListView.setOnItemClickListener((parent, view, position, id) -> {
                taskList.removeTask(position);
                updateTaskList();
            });
        }

        private void updateTaskList() {
            ArrayList<String> taskTexts = new ArrayList<>();
            for (Task task : taskList.getTasks()) {
                taskTexts.add(task.getText());
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, taskTexts);
            taskListView.setAdapter(adapter);
        }

        private static class Task {
            private final String text;

            Task(String text) {
                this.text = text;
            }

            String getText() {
                return text;
            }
        }

        private static class TaskList {
            private final ArrayList<Task> tasks = new ArrayList<>();

            void addTask(Task task) {
                tasks.add(task);
            }

            void removeTask(int index) {
                tasks.remove(index);
            }

            ArrayList<Task> getTasks() {
                return tasks;
            }
        }
    }

