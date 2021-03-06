/* -*- Mode: Java; c-basic-offset: 4; tab-width: 4; indent-tabs-mode: nil; -*-
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.scryer.setting

import androidx.lifecycle.LiveData

interface SettingsRepository {
    var serviceEnabled: Boolean
    val serviceEnabledObserver: LiveData<Boolean>

    var floatingEnable: Boolean
    val floatingEnableObservable: LiveData<Boolean>

    var addToCollectionEnable: Boolean
    val addToCollectionEnableObservable: LiveData<Boolean>
}
