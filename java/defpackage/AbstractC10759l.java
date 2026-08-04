package defpackage;

import android.util.Pair;

/* JADX INFO: renamed from: lُؐۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10759l {
    public static final String amazon;
    public static final String crashlytics;
    public static final String loadAd;
    public static final C6181l yandex = new C6181l();

    static {
        String str = AbstractC15323l.yandex;
        loadAd = Integer.toString(0, 36);
        crashlytics = Integer.toString(1, 36);
        amazon = Integer.toString(2, 36);
    }

    public abstract int admob();

    public final int amazon(int i, C3904l c3904l, C4322l c4322l, int i2, boolean z) {
        int i3 = billing(i, c3904l, false).crashlytics;
        if (remoteconfig(i3, c4322l, 0L).metrica != i) {
            return i + 1;
        }
        int iPurchase = purchase(i3, i2, z);
        if (iPurchase == -1) {
            return -1;
        }
        return remoteconfig(iPurchase, c4322l, 0L).vip;
    }

    public abstract C3904l billing(int i, C3904l c3904l, boolean z);

    public int crashlytics(boolean z) {
        if (startapp()) {
            return -1;
        }
        return metrica() - 1;
    }

    public boolean equals(Object obj) {
        int iCrashlytics;
        if (this != obj) {
            if (obj instanceof AbstractC10759l) {
                AbstractC10759l abstractC10759l = (AbstractC10759l) obj;
                if (abstractC10759l.metrica() == metrica() && abstractC10759l.admob() == admob()) {
                    C4322l c4322l = new C4322l();
                    C3904l c3904l = new C3904l();
                    C4322l c4322l2 = new C4322l();
                    C3904l c3904l2 = new C3904l();
                    for (int i = 0; i < metrica(); i++) {
                        if (remoteconfig(i, c4322l, 0L).equals(abstractC10759l.remoteconfig(i, c4322l2, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < admob(); i2++) {
                        if (billing(i2, c3904l, true).equals(abstractC10759l.billing(i2, c3904l2, true))) {
                        }
                    }
                    int iYandex = yandex(true);
                    if (iYandex == abstractC10759l.yandex(true) && (iCrashlytics = crashlytics(true)) == abstractC10759l.crashlytics(true)) {
                        while (iYandex != iCrashlytics) {
                            int iPurchase = purchase(iYandex, 0, true);
                            if (iPurchase == abstractC10759l.purchase(iYandex, 0, true)) {
                                iYandex = iPurchase;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int firebase(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == yandex(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == yandex(z) ? crashlytics(z) : i - 1;
        }
        C18073l.admob();
        return 0;
    }

    public int hashCode() {
        C4322l c4322l = new C4322l();
        C3904l c3904l = new C3904l();
        int iMetrica = metrica() + 217;
        for (int i = 0; i < metrica(); i++) {
            iMetrica = (iMetrica * 31) + remoteconfig(i, c4322l, 0L).hashCode();
        }
        int iAdmob = admob() + (iMetrica * 31);
        for (int i2 = 0; i2 < admob(); i2++) {
            iAdmob = (iAdmob * 31) + billing(i2, c3904l, true).hashCode();
        }
        int iYandex = yandex(true);
        while (iYandex != -1) {
            iAdmob = (iAdmob * 31) + iYandex;
            iYandex = purchase(iYandex, 0, true);
        }
        return iAdmob;
    }

    public final Pair isPro(C4322l c4322l, C3904l c3904l, int i, long j, long j2) {
        AbstractC12442l.smaato(i, metrica());
        remoteconfig(i, c4322l, j2);
        if (j == -9223372036854775807L) {
            j = c4322l.smaato;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c4322l.vip;
        billing(i2, c3904l, false);
        while (i2 < c4322l.metrica && c3904l.purchase != j) {
            int i3 = i2 + 1;
            if (billing(i3, c3904l, false).purchase > j) {
                break;
            }
            i2 = i3;
        }
        billing(i2, c3904l, true);
        long jMin = j - c3904l.purchase;
        long j3 = c3904l.amazon;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c3904l.loadAd;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public abstract int loadAd(Object obj);

    public abstract int metrica();

    public C3904l mopub(Object obj, C3904l c3904l) {
        return billing(loadAd(obj), c3904l, true);
    }

    public int purchase(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == crashlytics(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == crashlytics(z) ? yandex(z) : i + 1;
        }
        C18073l.admob();
        return 0;
    }

    public abstract C4322l remoteconfig(int i, C4322l c4322l, long j);

    public abstract Object smaato(int i);

    public final boolean startapp() {
        return metrica() == 0;
    }

    public final Pair subs(C4322l c4322l, C3904l c3904l, int i, long j) {
        Pair pairIsPro = isPro(c4322l, c3904l, i, j, 0L);
        pairIsPro.getClass();
        return pairIsPro;
    }

    public final void vip(int i, C4322l c4322l) {
        remoteconfig(i, c4322l, 0L);
    }

    public int yandex(boolean z) {
        return startapp() ? -1 : 0;
    }
}
