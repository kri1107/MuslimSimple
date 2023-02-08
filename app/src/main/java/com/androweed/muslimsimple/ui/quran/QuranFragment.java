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

import org.w3c.dom.Text;

public class QuranFragment extends Fragment {

    private FragmentQuranBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        QuranViewModel quranViewModel =
                new ViewModelProvider(this).get(QuranViewModel.class);

        binding = FragmentQuranBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        /*final TextView textView = binding.textQuran;
        quranViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);*/
        final  TextView tvQuranTest = (TextView) binding.tvQuranTest;
        tvQuranTest.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ornare orci lorem, vel ullamcorper dui mattis a. Morbi sit amet venenatis arcu. Maecenas pulvinar aliquam bibendum. Curabitur nec vulputate arcu. Etiam euismod dolor eget lobortis bibendum. Phasellus in dolor at quam luctus interdum. Morbi scelerisque, sem et feugiat efficitur, nisi libero tincidunt erat, et feugiat massa quam sed augue. Phasellus in est ante. Aliquam aliquet in mi quis fringilla. Duis in lorem rhoncus, efficitur elit nec, convallis leo. Duis id ante lacus. Sed ullamcorper eleifend aliquam. Cras fermentum, nisi tempor bibendum semper, neque ex laoreet nisi, vitae pharetra libero metus eu eros. "
                        + "\n\nVivamus at nunc laoreet, commodo sapien efficitur, vulputate nunc. Praesent ultrices consequat varius. Sed in ligula vitae eros imperdiet fringilla. Suspendisse elementum, velit id imperdiet suscipit, turpis justo congue velit, sit amet maximus eros dolor eu magna. Praesent id enim sed tortor sagittis sollicitudin. Aliquam ornare lacinia gravida. Suspendisse tempor, lectus at tempus viverra, nisl turpis volutpat neque, tincidunt hendrerit justo ex ac est. Donec quis maximus metus, nec ultricies mauris. Duis fringilla, libero sed tincidunt gravida, quam nisl venenatis ante, a porttitor sapien orci sed urna."
                        + "\n\nCurabitur pharetra rutrum turpis eget blandit. Cras a dapibus nulla, quis sagittis neque. Donec a dui quis diam dapibus ornare eu a ex. Quisque malesuada vestibulum leo. Curabitur sodales enim ac arcu suscipit aliquam. Maecenas vulputate porta lacus in tincidunt. Curabitur et malesuada ligula. Aenean lacinia, ante in dignissim mollis, leo nisi congue dolor, nec auctor ex ipsum nec nulla. "
                        + "\n\nAliquam tristique condimentum lacus eu efficitur. Praesent ultrices ultrices est, vitae vehicula mauris luctus a. Fusce sagittis pulvinar arcu, eu posuere ante finibus vel. Vestibulum vel nisi euismod, posuere dui facilisis, elementum ante. Quisque euismod convallis tristique. Quisque blandit dignissim congue. Sed volutpat tortor a est imperdiet, vitae egestas ipsum dictum."
                        + "\n\nNulla urna justo, sollicitudin in sem consectetur, fermentum consequat augue. Nulla a tincidunt purus, at convallis mi. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam ac vehicula eros. Aenean nec sodales nisl. Curabitur accumsan malesuada nulla, sit amet ullamcorper eros finibus id. Fusce lobortis nunc a massa accumsan, dignissim efficitur sem ultricies. Nulla consequat lacus sit amet risus fringilla porta. Praesent vitae maximus quam. Donec ut sapien fringilla, fringilla nunc eu, ultrices tortor. Suspendisse potenti. Integer lacus tellus, fringilla nec purus nec, ultricies euismod sapien. Aenean enim ante, lacinia sit amet elit ut, aliquet egestas nunc. Vestibulum et nunc in ante tincidunt mattis a tempus mi. Proin quis massa tristique, gravida nunc a, ultricies arcu. Aenean ornare ante vitae mollis auctor."
                        + "\n\nNulla urna justo, sollicitudin in sem consectetur, fermentum consequat augue. Nulla a tincidunt purus, at convallis mi. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam ac vehicula eros. Aenean nec sodales nisl. Curabitur accumsan malesuada nulla, sit amet ullamcorper eros finibus id. Fusce lobortis nunc a massa accumsan, dignissim efficitur sem ultricies. Nulla consequat lacus sit amet risus fringilla porta. Praesent vitae maximus quam. Donec ut sapien fringilla, fringilla nunc eu, ultrices tortor. Suspendisse potenti. Integer lacus tellus, fringilla nec purus nec, ultricies euismod sapien. Aenean enim ante, lacinia sit amet elit ut, aliquet egestas nunc. Vestibulum et nunc in ante tincidunt mattis a tempus mi. Proin quis massa tristique, gravida nunc a, ultricies arcu. Aenean ornare ante vitae mollis auctor. Nulla urna justo, sollicitudin in sem consectetur, fermentum consequat augue. Nulla a tincidunt purus, at convallis mi. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam ac vehicula eros. Aenean nec sodales nisl. Curabitur accumsan malesuada nulla, sit amet ullamcorper eros finibus id. Fusce lobortis nunc a massa accumsan, dignissim efficitur sem ultricies. Nulla consequat lacus sit amet risus fringilla porta. Praesent vitae maximus quam. Donec ut sapien fringilla, fringilla nunc eu, ultrices tortor. Suspendisse potenti. Integer lacus tellus, fringilla nec purus nec, ultricies euismod sapien. Aenean enim ante, lacinia sit amet elit ut, aliquet egestas nunc. Vestibulum et nunc in ante tincidunt mattis a tempus mi. Proin quis massa tristique, gravida nunc a, ultricies arcu. Aenean ornare ante vitae mollis auctor."
        );
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}