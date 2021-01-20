package kim.nested.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kim.nested.recyclerview.Adapters.ParentRecyclerViewAdapter;
import kim.nested.recyclerview.Models.ParentModel;

public class MainActivity extends AppCompatActivity {
    private RecyclerView parentRecyclerView;
    private RecyclerView.Adapter ParentAdapter;
    ArrayList<ParentModel> parentModelArrayList = new ArrayList<>();
    private RecyclerView.LayoutManager parentLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the Categories for each array list set in the `ParentViewHolder`
        parentModelArrayList.add(new ParentModel("Category1"));
        parentModelArrayList.add(new ParentModel("Category2"));
        parentModelArrayList.add(new ParentModel("Category3"));
        parentModelArrayList.add(new ParentModel("Category4"));
        parentModelArrayList.add(new ParentModel("Category5"));
        parentModelArrayList.add(new ParentModel("Category6"));
        parentRecyclerView = findViewById(R.id.Parent_recyclerView);
        parentRecyclerView.setHasFixedSize(true);
        parentLayoutManager = new LinearLayoutManager(this);
        ParentAdapter = new ParentRecyclerViewAdapter(parentModelArrayList, MainActivity.this);
        parentRecyclerView.setLayoutManager(parentLayoutManager);
        parentRecyclerView.setAdapter(ParentAdapter);
        ParentAdapter.notifyDataSetChanged();
    }
}
