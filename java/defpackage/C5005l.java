package defpackage;

/* JADX INFO: renamed from: lؗٛۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5005l implements InterfaceC12703l {
    public final int crashlytics;
    public final C3614l[] loadAd;
    public final long yandex;

    public C5005l(long j, C3614l[] c3614lArr, int i) {
        this.yandex = j;
        this.loadAd = c3614lArr;
        this.crashlytics = i;
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return true;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        return this.yandex;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009c A[SYNTHETIC] */
    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        long j2;
        long j3;
        long jMin;
        long j4;
        int i;
        long jMin2;
        C9267l c9267l;
        long[] jArr;
        int iYandex;
        int iYandex2;
        int iLoadAd;
        C3614l[] c3614lArr = this.loadAd;
        int length = c3614lArr.length;
        C4304l c4304l = C4304l.crashlytics;
        if (length == 0) {
            return new C15528l(c4304l, c4304l);
        }
        int i2 = this.crashlytics;
        if (i2 != -1) {
            C9267l c9267l2 = c3614lArr[i2].loadAd;
            int iYandex3 = c9267l2.yandex(j);
            if (iYandex3 == -1) {
                iYandex3 = c9267l2.loadAd(j);
            }
            long[] jArr2 = c9267l2.crashlytics;
            long[] jArr3 = c9267l2.billing;
            if (iYandex3 == -1) {
                return new C15528l(c4304l, c4304l);
            }
            j3 = jArr3[iYandex3];
            j2 = jArr2[iYandex3];
            if (j3 < j && iYandex3 < c9267l2.loadAd - 1 && (iLoadAd = c9267l2.loadAd(j)) != -1 && iLoadAd != iYandex3) {
                j4 = jArr3[iLoadAd];
                jMin = jArr2[iLoadAd];
            }
            jMin2 = j2;
            for (i = 0; i < c3614lArr.length; i++) {
                if (i != i2) {
                    c9267l = c3614lArr[i].loadAd;
                    jArr = c9267l.crashlytics;
                    iYandex = c9267l.yandex(j3);
                    if (iYandex == -1) {
                        iYandex = c9267l.loadAd(j3);
                    }
                    if (iYandex != -1) {
                        jMin2 = Math.min(jArr[iYandex], jMin2);
                    }
                    if (j4 == -9223372036854775807L) {
                        iYandex2 = c9267l.yandex(j4);
                        if (iYandex2 == -1) {
                            iYandex2 = c9267l.loadAd(j4);
                        }
                        if (iYandex2 == -1) {
                            jMin = Math.min(jArr[iYandex2], jMin);
                        }
                    }
                }
            }
            C4304l c4304l2 = new C4304l(j3, jMin2);
            return j4 == -9223372036854775807L ? new C15528l(c4304l2, c4304l2) : new C15528l(c4304l2, new C4304l(j4, jMin));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        jMin = -1;
        j4 = -9223372036854775807L;
        jMin2 = j2;
        while (i < c3614lArr.length) {
            if (i != i2) {
                c9267l = c3614lArr[i].loadAd;
                jArr = c9267l.crashlytics;
                iYandex = c9267l.yandex(j3);
                if (iYandex == -1) {
                    iYandex = c9267l.loadAd(j3);
                }
                if (iYandex != -1) {
                    jMin2 = Math.min(jArr[iYandex], jMin2);
                }
                if (j4 == -9223372036854775807L) {
                    iYandex2 = c9267l.yandex(j4);
                    if (iYandex2 == -1) {
                        iYandex2 = c9267l.loadAd(j4);
                    }
                    if (iYandex2 == -1) {
                        jMin = Math.min(jArr[iYandex2], jMin);
                    }
                }
            }
        }
        C4304l c4304l3 = new C4304l(j3, jMin2);
        if (j4 == -9223372036854775807L) {
        }
    }
}
