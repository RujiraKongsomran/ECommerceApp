package com.rujirakongsomran.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.rujirakongsomran.ecommerceapp.adapter.ProductAdapter;
import com.rujirakongsomran.ecommerceapp.adapter.ProductCategoryAdapter;
import com.rujirakongsomran.ecommerceapp.databinding.ActivityMainBinding;
import com.rujirakongsomran.ecommerceapp.model.ProductCategory;
import com.rujirakongsomran.ecommerceapp.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ProductCategoryAdapter productCategoryAdapter;
    ProductAdapter productAdapter;

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

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Japanese Cherry Blossom", "250 ml", "$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2, "African Mango Shower Gel", "350 ml", "$ 25.00", R.drawable.prod1));
        productsList.add(new Products(1, "Japanese Cherry Blossom", "250 ml", "$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2, "African Mango Shower Gel", "350 ml", "$ 25.00", R.drawable.prod1));
        productsList.add(new Products(1, "Japanese Cherry Blossom", "250 ml", "$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2, "African Mango Shower Gel", "350 ml", "$ 25.00", R.drawable.prod1));

        setProductItemRecyclerView(productsList);



    }

    private void setProductRecyclerView(List<ProductCategory> productCategoryList) {
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        binding.rcCategory.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        binding.rcCategory.setAdapter(productCategoryAdapter);
    }

    private void setProductItemRecyclerView(List<Products> productsList) {
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        binding.rcProduct.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        binding.rcProduct.setAdapter(productAdapter);
    }
}