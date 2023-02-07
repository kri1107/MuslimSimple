package com.androweed.muslimsimple.ui.quran;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.androweed.muslimsimple.databinding.FragmentQuranBinding;

public class QuranFragment extends Fragment {

    private FragmentQuranBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        QuranViewModel quranViewModel =
                new ViewModelProvider(this).get(QuranViewModel.class);

        binding = FragmentQuranBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textQuran;
        quranViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}