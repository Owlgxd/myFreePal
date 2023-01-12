package com.example.myfreepal.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myfreepal.R;
import com.example.myfreepal.databinding.FragmentNewBinding;
import com.example.myfreepal.ui.profile.ProfileFragment;

public class NewFragment extends Fragment {

    private FragmentNewBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentNewBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        root.findViewById(R.id.button_add_exercise).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(NewFragment.this).navigate(R.id.action_navigation_new_to_navigation_add_exercise);
            }
        });

        root.findViewById(R.id.button_add_weight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(NewFragment.this).navigate(R.id.action_navigation_new_to_navigation_add_weight);
            }
        });

        root.findViewById(R.id.button_add_workout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(NewFragment.this).navigate(R.id.action_navigation_new_to_navigation_add_workout);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}