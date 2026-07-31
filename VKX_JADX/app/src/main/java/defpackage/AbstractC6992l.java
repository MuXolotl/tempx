package defpackage;

/* JADX INFO: renamed from: lؚؓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6992l {
    public static final /* synthetic */ int loadAd = 0;
    public static final long yandex;

    static {
        C12735l[] c12735lArr = C1794l.loadAd;
        yandex = C1794l.crashlytics;
    }

    public static final C9077l yandex(C9077l c9077l, int i, int i2, long j, C13299l c13299l, C4361l c4361l, C3183l c3183l, int i3, int i4, C10068l c10068l) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        C13299l c13299l2 = c13299l;
        C4361l c4361l2 = c4361l;
        C3183l c3183l2 = c3183l;
        int i7 = i3;
        int i8 = i4;
        C10068l c10068l2 = c10068l;
        if (i5 == 0 || i5 == c9077l.yandex) {
            C12735l[] c12735lArr = C1794l.loadAd;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (C1794l.yandex(j3, c9077l.crashlytics)) {
                }
            }
            if ((c13299l2 == null || c13299l2.equals(c9077l.amazon)) && ((i6 == 0 || i6 == c9077l.loadAd) && ((c4361l2 == null || c4361l2.equals(c9077l.purchase)) && ((c3183l2 == null || c3183l2.equals(c9077l.billing)) && ((i7 == 0 || i7 == c9077l.mopub) && ((i8 == 0 || i8 == c9077l.admob) && (c10068l2 == null || c10068l2.equals(c9077l.subs)))))))) {
                return c9077l;
            }
        } else {
            j2 = 0;
        }
        C12735l[] c12735lArr2 = C1794l.loadAd;
        if ((j3 & 1095216660480L) == j2) {
            j3 = c9077l.crashlytics;
        }
        if (c13299l2 == null) {
            c13299l2 = c9077l.amazon;
        }
        if (i5 == 0) {
            i5 = c9077l.yandex;
        }
        if (i6 == 0) {
            i6 = c9077l.loadAd;
        }
        C4361l c4361l3 = c9077l.purchase;
        if (c4361l3 != null && c4361l2 == null) {
            c4361l2 = c4361l3;
        }
        if (c3183l2 == null) {
            c3183l2 = c9077l.billing;
        }
        if (i7 == 0) {
            i7 = c9077l.mopub;
        }
        if (i8 == 0) {
            i8 = c9077l.admob;
        }
        if (c10068l2 == null) {
            c10068l2 = c9077l.subs;
        }
        return new C9077l(i5, i6, j3, c13299l2, c4361l2, c3183l2, i7, i8, c10068l2);
    }
}
