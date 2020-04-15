package bkp.com.javatutorial.ui.introductionToClasses;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bkp.com.javatutorial.R;

public class IntroductionToClassesFragment extends Fragment {

    private IntroductionToClassesViewModel mViewModel;

    public static IntroductionToClassesFragment newInstance() {
        return new IntroductionToClassesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_introduction_to_classes, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(IntroductionToClassesViewModel.class);
        // TODO: Use the ViewModel
    }

}
