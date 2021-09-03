package com.rujirakongsomran.ecommerceapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.ecommerceapp.databinding.ProductsRowItemBinding;
import com.rujirakongsomran.ecommerceapp.model.Products;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    Context context;
    List<Products> productsList;

    public ProductAdapter(Context context, List<Products> productsList) {
        this.context = context;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(ProductsRowItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.binding.ivProductImage.setImageResource(productsList.get(position).getImageUrl());
        holder.binding.tvProductName.setText(productsList.get(position).getProductName());
        holder.binding.tvProductQty.setText(productsList.get(position).getProductSize());
        holder.binding.tvProductPrice.setText(productsList.get(position).getProductPrice());
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder {

        ProductsRowItemBinding binding;

        public ProductViewHolder(@NonNull ProductsRowItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
