package defpackage;

/* JADX INFO: renamed from: lُۣٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11436l {
    public final int admob;
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final int firebase;
    public final long[] isPro;
    public final int loadAd;
    public final C5978l mopub;
    public final long purchase;
    public final C4098l[] smaato;
    public final long[] subs;
    public final int yandex;

    public C11436l(int i, int i2, long j, long j2, long j3, long j4, C5978l c5978l, int i3, C4098l[] c4098lArr, int i4, long[] jArr, long[] jArr2) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = j;
        this.amazon = j2;
        this.purchase = j3;
        this.billing = j4;
        this.mopub = c5978l;
        this.admob = i3;
        this.smaato = c4098lArr;
        this.firebase = i4;
        this.subs = jArr;
        this.isPro = jArr2;
    }

    public final C11436l yandex(C5978l c5978l) {
        return new C11436l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, c5978l, this.admob, this.smaato, this.firebase, this.subs, this.isPro);
    }
}
