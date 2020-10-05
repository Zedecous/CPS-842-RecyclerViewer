package com.example.recyclerviewer;

import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecipeViewHolder> {
    @NonNull
    @Override
    public RecycleAdapter.RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.RecipeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class RecipeViewHolder extends RecyclerView.ViewHolder{
        public final TextView recipeName;
        public final TextView recipeDescription;

        RecipeViewHolder() {
            super();
            recipeName = null;
            recipeDescription = null;
        }
    }
}
