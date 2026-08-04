package defpackage;

/* JADX INFO: renamed from: lٕؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2634l {
    public int admob;
    public InterfaceC17732l amazon;
    public long billing;
    public InterfaceC2053l crashlytics;
    public long firebase;
    public InterfaceC8979l loadAd;
    public long mopub;
    public long purchase;
    public boolean remoteconfig;
    public boolean smaato;
    public int subs;
    public final C11587l yandex = new C11587l();
    public C2494l isPro = new C2494l(22, false);

    public void amazon(boolean z) {
        if (z) {
            this.isPro = new C2494l(22, false);
            this.billing = 0L;
            this.admob = 0;
        } else {
            this.admob = 1;
        }
        this.purchase = -1L;
        this.mopub = 0L;
    }

    public abstract boolean crashlytics(C13143l c13143l, long j, C2494l c2494l);

    public abstract long loadAd(C13143l c13143l);

    public void yandex(long j) {
        this.mopub = j;
    }
}
