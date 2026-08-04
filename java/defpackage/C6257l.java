package defpackage;

/* JADX INFO: renamed from: lؙٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6257l {
    public final C2403l yandex;
    public final C12376l loadAd = new C12376l();
    public final C15308l crashlytics = new C15308l(16);

    public C6257l(C2403l c2403l) {
        this.yandex = c2403l;
    }

    public final void crashlytics(boolean z) {
        C15308l c15308l = this.crashlytics;
        c15308l.subs((z ? 1 : 0) | (c15308l.admob() & (-2)));
    }

    public final void loadAd(boolean z) {
        C15308l c15308l = this.crashlytics;
        c15308l.subs((z ? 2 : 0) | (c15308l.admob() & (-3)));
    }

    public final void yandex(boolean z) {
        C15308l c15308l = this.crashlytics;
        c15308l.subs((z ? 4 : 0) | (c15308l.admob() & (-5)));
    }
}
