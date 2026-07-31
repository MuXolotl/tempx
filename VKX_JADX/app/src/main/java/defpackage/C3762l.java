package defpackage;

/* JADX INFO: renamed from: lؕۥً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3762l implements InterfaceC12703l {
    public long crashlytics;
    public final C15206l loadAd;
    public final C15206l yandex;

    public C3762l(long j, long[] jArr, long[] jArr2) {
        AbstractC12442l.admob(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.yandex = new C15206l(length);
            this.loadAd = new C15206l(length);
        } else {
            int i = length + 1;
            C15206l c15206l = new C15206l(i);
            this.yandex = c15206l;
            C15206l c15206l2 = new C15206l(i);
            this.loadAd = c15206l2;
            c15206l.yandex(0L);
            c15206l2.yandex(0L);
        }
        this.yandex.loadAd(jArr);
        this.loadAd.loadAd(jArr2);
        this.crashlytics = j;
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return this.loadAd.loadAd > 0;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        C15206l c15206l = this.loadAd;
        if (c15206l.loadAd == 0) {
            C4304l c4304l = C4304l.crashlytics;
            return new C15528l(c4304l, c4304l);
        }
        int iCrashlytics = AbstractC15323l.crashlytics(c15206l, j);
        long jAmazon = c15206l.amazon(iCrashlytics);
        C15206l c15206l2 = this.yandex;
        C4304l c4304l2 = new C4304l(jAmazon, c15206l2.amazon(iCrashlytics));
        if (jAmazon == j || iCrashlytics == c15206l.loadAd - 1) {
            return new C15528l(c4304l2, c4304l2);
        }
        int i = iCrashlytics + 1;
        return new C15528l(c4304l2, new C4304l(c15206l.amazon(i), c15206l2.amazon(i)));
    }
}
