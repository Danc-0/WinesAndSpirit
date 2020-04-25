package com.example.databindingdrinks;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.databindingdrinks.adapters.ProductsAdapter;
import com.example.databindingdrinks.databinding.FragmentMainBinding;
import com.example.databindingdrinks.models.Product;
import com.example.databindingdrinks.util.Products;


/**
 * Created by User on 2/6/2018.
 */

public class MainFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener{

        private static final String TAG = "MainFragment";

        // Data binding
        FragmentMainBinding mBinding;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            mBinding = FragmentMainBinding.inflate(inflater);
            mBinding.swipeRefreshLayout.setOnRefreshListener(this);

            setupProductsList();
            return mBinding.getRoot();
        }



        private void setupProductsList(){
            Products products = new Products();
            List<Product> productList = new ArrayList<>();
            productList.addAll(Arrays.asList(products.PRODUCTS));
            mBinding.setProducts(productList);
        }


        @Override
        public void onRefresh() {
            Products products = new Products();
            List<Product> productList = new ArrayList<>();
            productList.addAll(Arrays.asList(products.PRODUCTS));
            ((ProductsAdapter)mBinding.recyclervView.getAdapter()).refreshList(productList);
            onItemsLoadComplete();
        }

        void onItemsLoadComplete() {
            (mBinding.recyclervView.getAdapter()).notifyDataSetChanged();
            mBinding.swipeRefreshLayout.setRefreshing(false);
        }
    }
















