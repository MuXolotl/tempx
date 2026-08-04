package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؙؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6264l implements InterfaceC17593l, Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f13223l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Map f13224l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13660l f13225l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f13226l;

    public C6264l() {
        long[] jArr = AbstractC12154l.yandex;
        this.f13225l = new C13660l();
    }

    public final void admob(C6264l c6264l) {
        C13660l c13660l = c6264l.f13225l;
        Object[] objArr = c13660l.loadAd;
        Object[] objArr2 = c13660l.crashlytics;
        long[] jArr = c13660l.yandex;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C4707l c4707l = (C4707l) obj;
                        C13660l c13660l2 = this.f13225l;
                        Object objInvoke = c4707l.loadAd.invoke(c13660l2.mopub(c4707l), obj2);
                        if (objInvoke != null) {
                            c13660l2.vip(c4707l, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC17593l
    public final void amazon(C4707l c4707l, Object obj) {
        boolean z = obj instanceof C7629l;
        C13660l c13660l = this.f13225l;
        if (z && c13660l.crashlytics(c4707l)) {
            C7629l c7629l = (C7629l) c13660l.mopub(c4707l);
            C7629l c7629l2 = (C7629l) obj;
            String str = c7629l2.yandex;
            if (str == null) {
                str = c7629l.yandex;
            }
            InterfaceC14328l interfaceC14328l = c7629l2.loadAd;
            if (interfaceC14328l == null) {
                interfaceC14328l = c7629l.loadAd;
            }
            c13660l.vip(c4707l, new C7629l(str, interfaceC14328l));
        } else {
            c13660l.vip(c4707l, obj);
        }
        c4707l.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005a A[LOOP:0: B:5:0x0023->B:15:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x005d A[EDGE_INSN: B:18:0x005d->B:16:0x005d BREAK  A[LOOP:0: B:5:0x0023->B:15:0x005a], SYNTHETIC] */
    public final C6264l billing() {
        C6264l c6264l = new C6264l();
        c6264l.f13223l = this.f13223l;
        c6264l.f13226l = this.f13226l;
        C13660l c13660l = c6264l.f13225l;
        c13660l.getClass();
        C13660l c13660l2 = this.f13225l;
        Object[] objArr = c13660l2.loadAd;
        Object[] objArr2 = c13660l2.crashlytics;
        long[] jArr = c13660l2.yandex;
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
                            int i4 = (i << 3) + i3;
                            c13660l.vip(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return c6264l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6264l)) {
            return false;
        }
        C6264l c6264l = (C6264l) obj;
        return AbstractC8576l.yandex(this.f13225l, c6264l.f13225l) && this.f13223l == c6264l.f13223l && this.f13226l == c6264l.f13226l;
    }

    public final int hashCode() {
        return (((this.f13225l.hashCode() * 31) + (this.f13223l ? 1231 : 1237)) * 31) + (this.f13226l ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f13224l;
        if (map == null) {
            C13660l c13660l = this.f13225l;
            C3132l c3132l = c13660l.billing;
            if (c3132l == null) {
                c3132l = new C3132l(c13660l);
                c13660l.billing = c3132l;
            }
            map = c3132l;
            this.f13224l = map;
        }
        return map.entrySet().iterator();
    }

    public final Object mopub(C4707l c4707l) {
        Object objMopub = this.f13225l.mopub(c4707l);
        if (objMopub != null) {
            return objMopub;
        }
        C18262l.firebase(c4707l, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f13223l) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f13226l) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        C13660l c13660l = this.f13225l;
        Object[] objArr = c13660l.loadAd;
        Object[] objArr2 = c13660l.crashlytics;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((C4707l) obj).yandex);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return AbstractC14312l.smaato(this) + "{ " + ((Object) sb) + " }";
    }
}
