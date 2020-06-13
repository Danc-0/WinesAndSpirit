package com.example.databindingdrinks;

import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
import com.google.firebase.auth.FirebaseAuth;


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

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
        return;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.LogOut:
                FirebaseAuth mAuth = FirebaseAuth.getInstance();
                mAuth.signOut();
                return true;

            case R.id.share:
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String ShareBody = "Your body link here";
                String ShareSub = "Your subject here";
                shareIntent.putExtra(Intent.EXTRA_TEXT, ShareBody);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, ShareSub);
                startActivity(Intent.createChooser(shareIntent, "Share Using"));


        }
        return super.onOptionsItemSelected(item);
    }
}
















