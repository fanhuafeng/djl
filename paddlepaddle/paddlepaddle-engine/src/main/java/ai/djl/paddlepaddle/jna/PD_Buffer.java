/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package ai.djl.paddlepaddle.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/** The buffer structure defined by Paddle. */
@SuppressWarnings({"missingjavadocmethod", "typename"})
public class PD_Buffer extends Structure {

    Pointer data;
    NativeSize length;
    NativeSize capacity;

    public PD_Buffer(Pointer peer) {
        super(peer);
    }

    public Pointer getData() {
        return data;
    }

    public void setData(Pointer data) {
        this.data = data;
    }

    public NativeSize getLength() {
        return length;
    }

    public void setLength(NativeSize length) {
        this.length = length;
    }

    public NativeSize getCapacity() {
        return capacity;
    }

    public void setCapacity(NativeSize capacity) {
        this.capacity = capacity;
    }
}
