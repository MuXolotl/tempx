package defpackage;

/* JADX INFO: renamed from: lٍؚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9828l implements InterfaceC12703l {
    public final Object crashlytics;
    public final long loadAd;
    public final /* synthetic */ int yandex;

    public C9828l(long j, long j2) {
        this.yandex = 2;
        this.loadAd = j;
        C4304l c4304l = j2 == 0 ? C4304l.crashlytics : new C4304l(0L, j2);
        this.crashlytics = new C15528l(c4304l, c4304l);
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        switch (this.yandex) {
        }
        return false;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        switch (this.yandex) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        switch (this.yandex) {
            case 0:
                return this.loadAd;
            case 1:
                return ((C5478l) this.crashlytics).loadAd();
            default:
                return this.loadAd;
        }
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        int i = this.yandex;
        int i2 = 1;
        Object obj = this.crashlytics;
        switch (i) {
            case 0:
                C3297l c3297l = (C3297l) obj;
                C15528l c15528lLoadAd = c3297l.subs[0].loadAd(j);
                while (true) {
                    C6189l[] c6189lArr = c3297l.subs;
                    if (i2 >= c6189lArr.length) {
                        return c15528lLoadAd;
                    }
                    C15528l c15528lLoadAd2 = c6189lArr[i2].loadAd(j);
                    if (c15528lLoadAd2.yandex.loadAd < c15528lLoadAd.yandex.loadAd) {
                        c15528lLoadAd = c15528lLoadAd2;
                    }
                    i2++;
                }
                break;
            case 1:
                C5478l c5478l = (C5478l) obj;
                c5478l.firebase.getClass();
                C18595l c18595l = c5478l.firebase;
                long[] jArr = (long[]) c18595l.f36317l;
                long[] jArr2 = (long[]) c18595l.f36316l;
                int iBilling = AbstractC15323l.billing(jArr, AbstractC15323l.firebase((((long) c5478l.purchase) * j) / 1000000, 0L, c5478l.isPro - 1), false);
                long j2 = iBilling == -1 ? 0L : jArr[iBilling];
                long j3 = iBilling != -1 ? jArr2[iBilling] : 0L;
                int i3 = c5478l.purchase;
                long j4 = (j2 * 1000000) / ((long) i3);
                long j5 = this.loadAd;
                C4304l c4304l = new C4304l(j4, j3 + j5);
                if (j4 == j || iBilling == jArr.length - 1) {
                    return new C15528l(c4304l, c4304l);
                }
                int i4 = iBilling + 1;
                return new C15528l(c4304l, new C4304l((jArr[i4] * 1000000) / ((long) i3), j5 + jArr2[i4]));
            default:
                return (C15528l) obj;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9828l(long j) {
        this(j, 0L);
        this.yandex = 2;
    }

    public /* synthetic */ C9828l(Object obj, long j, int i) {
        this.yandex = i;
        this.crashlytics = obj;
        this.loadAd = j;
    }
}
