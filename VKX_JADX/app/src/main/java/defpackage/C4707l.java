package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4707l {
    public final boolean crashlytics;
    public final Function2 loadAd;
    public final String yandex;

    public C4707l(String str, Function2 function2) {
        this.yandex = str;
        this.loadAd = function2;
    }

    public final String toString() {
        return AbstractC14814l.startapp("AccessibilityKey: ", this.yandex);
    }

    public /* synthetic */ C4707l(String str) {
        this(str, C0772l.f2341l);
    }

    public C4707l(String str, int i) {
        this(str);
        this.crashlytics = true;
    }

    public C4707l(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.crashlytics = z;
    }
}
