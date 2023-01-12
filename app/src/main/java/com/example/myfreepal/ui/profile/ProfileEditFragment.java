package com.example.myfreepal.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myfreepal.R;
import com.example.myfreepal.databinding.FragmentProfileBinding;
import com.example.myfreepal.databinding.FragmentProfileEditBinding;

public class ProfileEditFragment extends Fragment {
    private FragmentProfileEditBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentProfileEditBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        root.findViewById(R.id.button_profile_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(ProfileEditFragment.this).navigate(R.id.action_navigation_profile_edit_to_navigation_profile);
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
