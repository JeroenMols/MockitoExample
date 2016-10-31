/*
 *  Copyright 2016 Jeroen Mols
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.jeroenmols.mockitoexample.matchers;

import android.support.annotation.Nullable;

import java.util.List;

import static org.mockito.ArgumentMatchers.argThat;

/**
 * @author Jeroen Mols on 11/09/16.
 */

public class ListMatchers {

    @Nullable
    public static <K> List listContains(K object) {
        return argThat(new ListContains<>(object));
    }

    @Nullable
    public static <K> List listDoesNotContain(K object) {
        return argThat(new ListDoesNotContain<>(object));
    }

    public static List listOfSize(int size) {
        return argThat(new ListOfSize(size));
    }
}
