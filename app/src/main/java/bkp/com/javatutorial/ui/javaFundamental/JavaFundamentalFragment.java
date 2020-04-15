package bkp.com.javatutorial.ui.javaFundamental;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bkp.com.javatutorial.R;

public class JavaFundamentalFragment extends Fragment {

    private JavaFundamentalViewModel mViewModel;

    public static JavaFundamentalFragment newInstance() {
        return new JavaFundamentalFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_java_fundamental, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(JavaFundamentalViewModel.class);
        // TODO: Use the ViewModel
    }

}
