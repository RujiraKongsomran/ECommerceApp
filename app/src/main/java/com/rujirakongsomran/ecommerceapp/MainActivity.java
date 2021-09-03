package com.rujirakongsomran.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.rujirakongsomran.ecommerceapp.adapter.ProductCategoryAdapter;
import com.rujirakongsomran.ecommerceapp.databinding.ActivityMainBinding;
import com.rujirakongsomran.ecommerceapp.model.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ProductCategoryAdapter productCategoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Most Popular"));
        productCategoryList.add(new ProductCategory(2, "All Body Products"));
        productCategoryList.add(new ProductCategory(3, "Skin Care"));
        productCategoryList.add(new ProductCategory(4, "Hair"));

        setProductRecyclerView(productCategoryList);


    }

    private void setProductRecyclerView(List<ProductCategory> productCategoryList) {
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        binding.rcCategory.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        binding.rcCategory.setAdapter(productCategoryAdapter);
    }
}