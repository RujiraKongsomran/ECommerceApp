package com.rujirakongsomran.ecommerceapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.ecommerceapp.databinding.CategoryRowItemBinding;
import com.rujirakongsomran.ecommerceapp.model.ProductCategory;

import java.util.List;

public class ProductCategoryAdapter extends RecyclerView.Adapter<ProductCategoryAdapter.ProductCategoryViewHolder> {

    Context context;
    List<ProductCategory> productCategoryList;

    public ProductCategoryAdapter(Context context, List<ProductCategory> productCategoryList) {
        this.context = context;
        this.productCategoryList = productCategoryList;
    }

    @NonNull
    @Override
    public ProductCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductCategoryViewHolder(CategoryRowItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductCategoryViewHolder holder, int position) {
        holder.binding.tvCategoryName.setText(productCategoryList.get(position).getProductName());
    }

    @Override
    public int getItemCount() {
        return productCategoryList.size();
    }


    public static final class ProductCategoryViewHolder extends RecyclerView.ViewHolder {
        CategoryRowItemBinding binding;

        public ProductCategoryViewHolder(@NonNull CategoryRowItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
