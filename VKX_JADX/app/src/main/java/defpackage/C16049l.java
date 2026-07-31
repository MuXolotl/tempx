package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٕۥّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C16049l<C> {
    public static final C16283l Companion = new C16283l();
    public static final C13637l crashlytics;
    public final int loadAd;
    public final List yandex;

    static {
        C13637l c13637l = new C13637l("com.arkivanov.decompose.router.pages.SerializablePages", null, 2);
        c13637l.smaato("items", false);
        c13637l.smaato("selectedIndex", false);
        crashlytics = c13637l;
    }

    public /* synthetic */ C16049l(int i, int i2, List list) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, crashlytics);
            throw null;
        }
        this.yandex = list;
        this.loadAd = i2;
    }

    public C16049l(int i, List list) {
        this.yandex = list;
        this.loadAd = i;
    }
}
