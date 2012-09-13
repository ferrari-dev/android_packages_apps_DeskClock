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

package com.android.deskclock;

import android.app.Fragment;
import android.content.Context;

public class DeskClockFragment extends Fragment {
    protected Context mContext;
    private boolean mButtonClicked = false;

    public void setContext(Context c) {
        mContext = c;
    }

    protected void buttonClicked(boolean state) {
        mButtonClicked = state;
    }

    public boolean isButtonClicked() {
        boolean res = mButtonClicked;
        mButtonClicked = false;
        return res;
    }

    public void saveGlobalState() {

    }

}
