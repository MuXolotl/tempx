package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًؘ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17721l {
    public static final C17721l admob;
    public static final C17721l amazon;
    public static final C17721l billing;
    public static final C17721l crashlytics;
    public static final List firebase;
    public static final C17721l isPro;
    public static final C17721l loadAd;
    public static final C17721l mopub;
    public static final C17721l purchase;
    public static final C17721l subs;
    public final String yandex;

    static {
        C17721l c17721l = new C17721l("GET");
        loadAd = c17721l;
        C17721l c17721l2 = new C17721l("POST");
        crashlytics = c17721l2;
        C17721l c17721l3 = new C17721l("PUT");
        amazon = c17721l3;
        C17721l c17721l4 = new C17721l("PATCH");
        purchase = c17721l4;
        C17721l c17721l5 = new C17721l("DELETE");
        billing = c17721l5;
        C17721l c17721l6 = new C17721l("HEAD");
        mopub = c17721l6;
        C17721l c17721l7 = new C17721l("OPTIONS");
        admob = c17721l7;
        subs = new C17721l("TRACE");
        isPro = new C17721l("QUERY");
        firebase = AbstractC14055l.remoteconfig(c17721l, c17721l2, c17721l3, c17721l4, c17721l5, c17721l6, c17721l7);
    }

    public C17721l(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17721l) && AbstractC8576l.yandex(this.yandex, ((C17721l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return this.yandex;
    }
}
