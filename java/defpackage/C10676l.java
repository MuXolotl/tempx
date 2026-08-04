package defpackage;

/* JADX INFO: renamed from: lَۣۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10676l {
    public static final C10676l subs = new C10676l(new C10676l(null, 2047), 2012);
    public final boolean admob;
    public final boolean amazon;
    public final C10676l billing;
    public final C10676l crashlytics;
    public final boolean loadAd;
    public final boolean mopub;
    public final C10676l purchase;
    public final boolean yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C10676l(C10676l c10676l, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        C10676l c10676l2 = (i & 32) != 0 ? null : c10676l;
        this(z, z2, c10676l2, true, c10676l2, c10676l2, (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0, (i & 1024) == 0);
    }

    public C10676l(boolean z, boolean z2, C10676l c10676l, boolean z3, C10676l c10676l2, C10676l c10676l3, boolean z4, boolean z5) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = c10676l;
        this.amazon = z3;
        this.purchase = c10676l2;
        this.billing = c10676l3;
        this.mopub = z4;
        this.admob = z5;
    }
}
