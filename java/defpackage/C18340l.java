package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l٘ۥۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18340l {
    public final Set amazon;
    public final String[] crashlytics;
    public final int[] loadAd;
    public final C18396l yandex;

    public C18340l(C18396l c18396l, int[] iArr, String[] strArr) {
        this.yandex = c18396l;
        this.loadAd = iArr;
        this.crashlytics = strArr;
        if (iArr.length == strArr.length) {
            this.amazon = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : C5746l.f12138l;
        } else {
            C8339l.smaato("Check failed.");
            throw null;
        }
    }
}
