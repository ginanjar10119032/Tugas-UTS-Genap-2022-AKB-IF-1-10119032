package com.example.tugasutsgenap2022akbif_110119032.ui.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.tugasutsgenap2022akbif_110119032.R;
import com.example.tugasutsgenap2022akbif_110119032.databinding.NotesManagerBinding;

import java.util.ArrayList;

public class NotesManager extends AppCompatActivity implements NoteClickListener, FetchDatabaseResults {

    private NotesAdapter notesAdapter;
    NotesManagerBinding notesManagerBinding;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        notesManagerBinding = notesManagerBinding.inflate(getLayoutInflater());
        setContentView(notesManagerBinding.getRoot());

        notesAdapter = new NotesAdapter(this);
        notesAdapter.setHasStableIds(true);
        notesAdapter.setNoteClickListener(this);

        notesManagerBinding.recycelrView.setHasFixedSize(true);
        notesManagerBinding.recycelrView.setAdapter(notesAdapter);
        notesManagerBinding.recycelrView.setLayoutManager(new LinearLayoutManager(this));

        AppPresenter appPresenter = new AppPresenter(this, this);
        appPresenter.requestNotesFromDatabase();
    }

    @Override
    public void onNoteClicked(int rowId, String subject, String description) {
        Intent intent = new Intent(this, AddNotesActivity.class);
        intent.putExtra("rowId", rowId);
        intent.putExtra("subject", subject);
        intent.putExtra("description", description);

        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.addNotes) {
            startActivity(new Intent(this, AddNotesActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDataFetched(ArrayList<NotesModel> notesModelArrayList) {
        if (notesModelArrayList.isEmpty()) {
            notesManagerBinding.emptyMsg.setVisibility(View.VISIBLE);
        } else {
            notesManagerBinding.emptyMsg.setVisibility(View.GONE);
        }
        notesAdapter.setNotesList(notesModelArrayList);
    }
}