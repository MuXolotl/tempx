package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٖٜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16684l {
    public static final C16684l amazon;
    public static final String billing;
    public static final C11406l crashlytics = new C11406l(new C2922l(1), C0058l.f957l);
    public static final String purchase;
    public final long loadAd;
    public final C13708l yandex;

    static {
        C9258l c9258l = AbstractC1186l.f3181l;
        amazon = new C16684l(0L, C13708l.f26763l);
        String str = AbstractC15323l.yandex;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
    }

    public C16684l(long j, List list) {
        this.yandex = AbstractC1186l.appmetrica(crashlytics, list);
        this.loadAd = j;
    }
}
