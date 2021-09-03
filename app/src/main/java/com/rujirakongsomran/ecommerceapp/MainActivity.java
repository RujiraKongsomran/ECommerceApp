package com.rujirakongsomran.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.rujirakongsomran.ecommerceapp.adapter.ProductAdapter;
import com.rujirakongsomran.ecommerceapp.databinding.ActivityMainBinding;
import com.rujirakongsomran.ecommerceapp.model.ProductCategory;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    private void setProductRecyclerView(List<ProductCategory> productCategoryList) {
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        binding.rcCategory.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productCategoryList);
        binding.rcCategory.setAdapter(productAdapter);
    }
}