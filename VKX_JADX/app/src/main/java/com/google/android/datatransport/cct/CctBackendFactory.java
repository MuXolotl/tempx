package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.AbstractC17942l;
import defpackage.C12795l;
import defpackage.C16171l;
import defpackage.InterfaceC9691l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory {
    public InterfaceC9691l create(AbstractC17942l abstractC17942l) {
        Context context = ((C12795l) abstractC17942l).yandex;
        C12795l c12795l = (C12795l) abstractC17942l;
        return new C16171l(context, c12795l.loadAd, c12795l.crashlytics);
    }
}
