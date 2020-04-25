package com.example.databindingdrinks.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databindingdrinks.R;
import com.example.databindingdrinks.databinding.CartItemBinding;

import java.util.ArrayList;
import java.util.List;

import com.example.databindingdrinks.models.CartItem;
import com.example.databindingdrinks.models.CartItemViewModel;


/**
 * Created by User on 2/9/2018.
 */

public class CartItemAdapter extends RecyclerView.Adapter<CartItemAdapter.BindingHolder>{

    private static final String TAG = "CartItemAdapter";

    private List<CartItem> mCartItems = new ArrayList<>();
    private Context mContext;

    public CartItemAdapter(Context context, List<CartItem> cartItems) {
        mCartItems = cartItems;
        mContext = context;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CartItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(mContext), R.layout.cart_item, parent, false);

        return new CartItemAdapter.BindingHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        CartItem cartItem = mCartItems.get(position);
        CartItemViewModel viewModel = new CartItemViewModel();
        viewModel.setCartItem(cartItem);
        holder.binding.setCartItemView(viewModel);
        holder.binding.executePendingBindings();
    }

    public void updateCartItems(List<CartItem> cartItems){
        mCartItems.clear();
        mCartItems.addAll(cartItems);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mCartItems.size();
    }


    public class BindingHolder extends RecyclerView.ViewHolder{

        CartItemBinding binding;

        public BindingHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}



















