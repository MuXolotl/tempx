package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lّۖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12771l implements InterfaceC2229l {
    public final C10086l crashlytics = AbstractC8020l.smaato(Boolean.FALSE);
    public C10086l loadAd;
    public Function0 yandex;

    public final boolean loadAd() {
        return ((Boolean) this.crashlytics.getValue()).booleanValue();
    }

    public final long yandex() {
        C5502l c5502l;
        if (this.loadAd == null) {
            Function0 function0 = this.yandex;
            if (function0 == null || (c5502l = (C5502l) function0.invoke()) == null) {
                c5502l = C5502l.crashlytics;
            }
            this.loadAd = AbstractC8020l.smaato(c5502l);
            this.yandex = null;
        }
        return ((C5502l) this.loadAd.getValue()).yandex;
    }
}
