package com.example.recyclerviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkedList<Recipe> recipeList = new LinkedList<>();
        buildRecipeList(recipeList);
    }

    public void buildRecipeList(LinkedList<Recipe> recipeList)
    {
        Recipe recipe1 = new Recipe("Chocolate Cupcakes",
                "super moist chocolate cupcakes pack TONS of chocolate flavor in each cupcake wrapper",
                "https://cdn.sallysbakingaddiction.com/wp-content/uploads/2017/06/moist-chocolate-cupcakes-5-600x900.jpg",
                "Flour \n Sugar \n Chocolate",
                "Mix and bake");
        Recipe recipe2 = new Recipe("Chocolate Cupcakes",
                "super moist chocolate cupcakes pack TONS of chocolate flavor in each cupcake wrapper",
                "https://cdn.sallysbakingaddiction.com/wp-content/uploads/2017/06/moist-chocolate-cupcakes-5-600x900.jpg",
                "Flour \n Sugar \n Chocolate",
                "Mix and bake");
        Recipe recipe3 = new Recipe("Chocolate Cupcakes",
                "super moist chocolate cupcakes pack TONS of chocolate flavor in each cupcake wrapper",
                "https://cdn.sallysbakingaddiction.com/wp-content/uploads/2017/06/moist-chocolate-cupcakes-5-600x900.jpg",
                "Flour \n Sugar \n Chocolate",
                "Mix and bake");
        recipeList.add(recipe1);
        recipeList.add(recipe2);
        recipeList.add(recipe3);
    }
}