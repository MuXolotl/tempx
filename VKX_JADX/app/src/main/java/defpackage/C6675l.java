package defpackage;

/* JADX INFO: renamed from: lؙۖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6675l extends AbstractC11737l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C3844l f14030l = AbstractC3670l.yandex("0021F904");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0869l f14031l;

    public C6675l(InterfaceC9473l interfaceC9473l) {
        super(interfaceC9473l);
        this.f14031l = new C0869l();
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) {
        long j2;
        long j3;
        yandex(j);
        C0869l c0869l2 = this.f14031l;
        long j4 = 0;
        if (c0869l2.f2526l == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long jIsVip = -1;
            while (true) {
                C3844l c3844l = f14030l;
                j2 = j4;
                jIsVip = c0869l2.isVip(c3844l.f7953l[0], jIsVip + 1, Long.MAX_VALUE);
                if (jIsVip == -1 || (yandex(c3844l.f7953l.length) && c0869l2.mo716l(jIsVip, c3844l))) {
                    break;
                }
                j4 = j2;
            }
            if (jIsVip == -1) {
                break;
            }
            long jAd = c0869l2.ad(c0869l, jIsVip + 4);
            if (jAd < j2) {
                jAd = j2;
            }
            j5 += jAd;
            if (yandex(5L) && c0869l2.ads(4L) == 0 && (((c0869l2.ads(2L) & 255) << 8) | (c0869l2.ads(1L) & 255)) < 2) {
                c0869l.m709instanceof(c0869l2.ads(j2));
                c0869l.m709instanceof(10);
                c0869l.m709instanceof(0);
                c0869l2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long jAd2 = c0869l2.ad(c0869l, j - j5);
            j3 = 0;
            if (jAd2 < 0) {
                jAd2 = 0;
            }
            j5 += jAd2;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }

    public final boolean yandex(long j) {
        C0869l c0869l = this.f14031l;
        long j2 = c0869l.f2526l;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return this.f23514l.ad(c0869l, j3) == j3;
    }
}
