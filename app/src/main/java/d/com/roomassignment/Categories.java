package d.com.roomassignment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Categories extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] categories = {"FAMILY","FRIEND","COLLEAGUE","TUTORS","STUDENTS"};
        mAdapter = new myAdapter(this,categories);
        recyclerView.setAdapter(mAdapter);

    }

    public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder>{

        String[] strings;
        Context context;

        public myAdapter(Context context, String[] strings){
            this.context = context;
            this.strings = strings;
        }

        public class ViewHolder extends RecyclerView.ViewHolder{

            public TextView title;
            public View mylayout;
            public ViewHolder(View itemView){
                super(itemView);
                title = (TextView)itemView.findViewById(R.id.mytitle);
                mylayout = (ViewGroup)itemView.findViewById(R.id.mylayout);
            }
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View customView = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder,parent,false);
            ViewHolder vh = new ViewHolder(customView);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.title.setText(strings[position]);
            holder.mylayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(MainActivity.this,strings[position],Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context,Contact.class);
                    intent.putExtra("title",strings[position]);
                    startActivity(intent);
                }
            });

        }

        @Override
        public int getItemCount() {
            return strings.length;
        }
    }
}