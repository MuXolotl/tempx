package defpackage;

import android.util.Range;

/* JADX INFO: renamed from: lؒۛۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1335l {
    public static final Range crashlytics;
    public static final Range loadAd;
    public static final C11550l yandex;

    static {
        EnumC18632l enumC18632l = EnumC18632l.VIDEO_RECORD;
        C7925l c7925l = new C7925l();
        loadAd = new Range(30, 30);
        crashlytics = new Range(120, 120);
        C14929l c14929l = new C14929l(c7925l);
        C6916l c6916l = InterfaceC0048l.f920l;
        C5104l c5104l = c14929l.f29382l;
        c5104l.mopub(c6916l, 5);
        c5104l.mopub(InterfaceC0048l.f926l, enumC18632l);
        c5104l.mopub(C11550l.f23222l, C15955l.f31327l);
        c5104l.mopub(InterfaceC16352l.signatures, C15421l.amazon);
        yandex = new C11550l(C7420l.yandex(c5104l));
    }
}
