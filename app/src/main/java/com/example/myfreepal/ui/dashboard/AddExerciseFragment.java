package com.example.myfreepal.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myfreepal.R;
import com.example.myfreepal.databinding.FragmentAddExerciseBinding;

public class AddExerciseFragment extends Fragment {
    private FragmentAddExerciseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentAddExerciseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        root.findViewById(R.id.button_save_exercise).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(AddExerciseFragment.this).navigate(R.id.action_navigation_add_exercise_to_navigation_new);
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
