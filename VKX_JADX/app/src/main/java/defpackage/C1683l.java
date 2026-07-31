package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: lؚؓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1683l {
    public static final Set crashlytics;
    public final C18028l loadAd;
    public final C0511l yandex;

    static {
        C2312l c2312lSubs = AbstractC3333l.crashlytics.subs();
        crashlytics = Collections.singleton(new C3624l(c2312lSubs.loadAd(), c2312lSubs.yandex.mopub()));
    }

    public C1683l(C0511l c0511l) {
        this.yandex = c0511l;
        this.loadAd = ((C16412l) c0511l.yandex).crashlytics(new C6238l(11, this));
    }
}
