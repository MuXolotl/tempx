package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lِ۟ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12147l implements InterfaceC12550l {
    public static final C4926l loadAd = new C4926l(new C11406l(new C2922l(13), C0058l.f957l), new C11406l(new C2922l(14), C0058l.f956l));
    public final ArrayList yandex = new ArrayList();

    @Override // defpackage.InterfaceC12550l
    public final long amazon(long j) {
        ArrayList arrayList = this.yandex;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C8755l) arrayList.get(0)).loadAd) {
            return -9223372036854775807L;
        }
        long jMax = ((C8755l) arrayList.get(0)).loadAd;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((C8755l) arrayList.get(i)).loadAd;
            long j3 = ((C8755l) arrayList.get(i)).amazon;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.InterfaceC12550l
    public final void clear() {
        this.yandex.clear();
    }

    @Override // defpackage.InterfaceC12550l
    public final AbstractC1186l crashlytics(long j) {
        ArrayList arrayList = this.yandex;
        if (!arrayList.isEmpty()) {
            if (j >= ((C8755l) arrayList.get(0)).loadAd) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C8755l c8755l = (C8755l) arrayList.get(i);
                    if (j >= c8755l.loadAd && j < c8755l.amazon) {
                        arrayList2.add(c8755l);
                    }
                    if (j < c8755l.loadAd) {
                        break;
                    }
                }
                C13708l c13708lAppmetrica = AbstractC1186l.appmetrica(loadAd, arrayList2);
                C16971l c16971lMetrica = AbstractC1186l.metrica();
                for (int i2 = 0; i2 < c13708lAppmetrica.f26765l; i2++) {
                    c16971lMetrica.amazon(((C8755l) c13708lAppmetrica.get(i2)).yandex);
                }
                return c16971lMetrica.mopub();
            }
        }
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC12550l
    public final boolean loadAd(C8755l c8755l, long j) {
        long j2 = c8755l.loadAd;
        AbstractC12442l.admob(j2 != -9223372036854775807L);
        AbstractC12442l.admob(c8755l.crashlytics != -9223372036854775807L);
        boolean z = j2 <= j && j < c8755l.amazon;
        ArrayList arrayList = this.yandex;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C8755l) arrayList.get(size)).loadAd) {
                arrayList.add(size + 1, c8755l);
                return z;
            }
        }
        arrayList.add(0, c8755l);
        return z;
    }

    @Override // defpackage.InterfaceC12550l
    public final void purchase(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.yandex;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C8755l) arrayList.get(i)).loadAd;
            if (j > j2 && j > ((C8755l) arrayList.get(i)).amazon) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC12550l
    public final long yandex(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.yandex;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((C8755l) arrayList.get(i)).loadAd;
            long j3 = ((C8755l) arrayList.get(i)).amazon;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }
}
