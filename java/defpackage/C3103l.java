package defpackage;

/* JADX INFO: renamed from: lؕؐۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3103l implements InterfaceC7630l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f6644l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f6645l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f6646l = true;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C13660l f6647l = new C13660l();

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[LOOP:0: B:5:0x000d->B:19:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[EDGE_INSN: B:23:0x0054->B:20:0x0054 BREAK  A[LOOP:0: B:5:0x000d->B:19:0x0051], SYNTHETIC] */
    public final void yandex() {
        C13660l c13660l = this.f6647l;
        Object[] objArr = c13660l.crashlytics;
        long[] jArr = c13660l.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof C12463l) {
                                C12463l c12463l = (C12463l) obj;
                                Object[] objArr2 = c12463l.yandex;
                                int i4 = c12463l.loadAd;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c13660l.yandex();
    }
}
