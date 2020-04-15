package bkp.com.javatutorial.ui.introductionToJava;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bkp.com.javatutorial.R;

public class IntroductionToJavaFragment extends Fragment {

    private IntroductionToJavaViewModel mViewModel;

    public static IntroductionToJavaFragment newInstance() {
        return new IntroductionToJavaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_introduction_to_java, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(IntroductionToJavaViewModel.class);
        // TODO: Use the ViewModel
    }

}
