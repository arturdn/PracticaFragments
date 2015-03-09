/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mycompany.practicafragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Futbolista extends Fragment {
    final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
        Bundle savedInstanceState) {

        // If activity recreated (such as from screen rotate), restore
        // the previous Futbolista selection set by onSaveInstanceState().
        // This is primarily necessary when in the two-pane layout.
        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmessi, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();


        Bundle args = getArguments();
        if (args != null) {
            updateFutbolistaView(args.getInt(ARG_POSITION));
        } else if (mCurrentPosition != -1) {
            // Set Futbolista based on saved instance state defined during onCreateView
            updateFutbolistaView(mCurrentPosition);
        }
    }

    public void updateFutbolistaView(int position) {
        ImageView img = (ImageView) getActivity().findViewById(R.id.imageView);
        switch (position) {
            case 1:
                img.setImageResource(R.drawable.messigran);
                break;
            case 2:
                img.setImageResource(R.drawable.iniestagran);
                break;
            case 3:
                img.setImageResource(R.drawable.xavigran);
                break;
        }
        mCurrentPosition = position;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the current Futbolista selection in case we need to recreate the fragment
        outState.putInt(ARG_POSITION, mCurrentPosition);
    }
}