/*
 * Copyright 2012
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

package org.terasology.events.item;

import org.terasology.entitySystem.EntityRef;
import org.terasology.math.Side;
import org.terasology.math.Vector3i;

/**
 * @author Immortius
 */
public class UseItemOnBlockEvent extends UseItemEvent {
    private Vector3i targetBlock;
    private Side surfaceDirection;
    private Side secondaryDirection;

    public UseItemOnBlockEvent(EntityRef instigator, Vector3i targetBlock, Side surfaceDirection, Side secondaryDirection) {
        super(instigator);
        this.targetBlock = targetBlock;
        this.surfaceDirection = surfaceDirection;
        this.secondaryDirection = secondaryDirection;
    }

    public Vector3i getTargetBlock() {
        return targetBlock;
    }

    public Side getSurfaceDirection() {
        return surfaceDirection;
    }

    public Side getSecondaryDirection() {
        return secondaryDirection;
    }
}