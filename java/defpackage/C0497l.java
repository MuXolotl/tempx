package defpackage;

import java.io.Serializable;
import java.util.TreeMap;

/* JADX INFO: renamed from: lٟؑۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0497l implements Serializable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final transient long f1805l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final TreeMap f1806l = new TreeMap();

    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    public C0497l(C15509l c15509l, long j, byte[] bArr, byte[] bArr2) {
        TreeMap treeMap;
        TreeMap treeMap2;
        C15509l c15509l2 = c15509l;
        long j2 = 1;
        this.f1805l = (1 << c15509l2.crashlytics) - 1;
        long j3 = 0;
        while (j3 < j) {
            TreeMap treeMap3 = this.f1806l;
            C15980l c15980l = c15509l2.loadAd;
            int i = c15980l.loadAd;
            long j4 = j2;
            long j5 = j3 >> i;
            long j6 = (j4 << i) - j4;
            int i2 = (int) (j3 & j6);
            C13549l c13549l = new C13549l(1);
            c13549l.loadAd = j5;
            c13549l.purchase = i2;
            C13068l c13068l = new C13068l(c13549l);
            int i3 = 1 << i;
            int i4 = i3 - 1;
            if (i2 < i4) {
                if (((C0391l) treeMap3.get(0)) == null || i2 == 0) {
                    treeMap3.put(0, new C0391l(c15980l, bArr, bArr2, c13068l));
                }
                TreeMap treeMap4 = this.f1806l;
                C0391l c0391l = (C0391l) treeMap4.get(0);
                c0391l.getClass();
            }
            int i5 = 1;
            while (true) {
                long j7 = j5;
                if (i5 < c15509l2.amazon) {
                    int i6 = (int) (j7 & j6);
                    long j8 = j3;
                    long j9 = j7 >> i;
                    C13549l c13549l2 = new C13549l(1);
                    c13549l2.crashlytics = i5;
                    c13549l2.loadAd = j9;
                    c13549l2.purchase = i6;
                    C13068l c13068l2 = new C13068l(c13549l2);
                    if (treeMap3.get(Integer.valueOf(i5)) != null) {
                        if (j8 == 0) {
                            j5 = j9;
                            treeMap = treeMap3;
                        } else {
                            treeMap = treeMap3;
                            j5 = j9;
                            if (j8 % ((long) Math.pow(i3, i5 + 1)) == 0) {
                            }
                        }
                        if (i6 < i4 || j8 == 0) {
                            treeMap2 = treeMap;
                        } else {
                            treeMap2 = treeMap;
                            if ((j8 + j4) % ((long) Math.pow(i3, i5)) == 0) {
                                TreeMap treeMap5 = this.f1806l;
                                Integer numValueOf = Integer.valueOf(i5);
                                C0391l c0391l2 = (C0391l) treeMap5.get(Integer.valueOf(i5));
                                c0391l2.getClass();
                            }
                        }
                        i5++;
                        treeMap3 = treeMap2;
                        j3 = j8;
                        c15509l2 = c15509l;
                    } else {
                        j5 = j9;
                        treeMap = treeMap3;
                    }
                    treeMap.put(Integer.valueOf(i5), new C0391l(c15980l, bArr, bArr2, c13068l2));
                    if (i6 < i4) {
                        treeMap2 = treeMap;
                    } else {
                        treeMap2 = treeMap;
                    }
                    i5++;
                    treeMap3 = treeMap2;
                    j3 = j8;
                    c15509l2 = c15509l;
                }
            }
            j3 += j4;
            c15509l2 = c15509l;
            j2 = j4;
        }
    }

    public final C0497l yandex(Cfor cfor) {
        C0497l c0497l = new C0497l(this.f1805l);
        TreeMap treeMap = this.f1806l;
        for (Integer num : treeMap.keySet()) {
            C0391l c0391l = (C0391l) treeMap.get(num);
            c0391l.getClass();
            c0497l.f1806l.put(num, new C0391l(c0391l, cfor));
        }
        return c0497l;
    }

    public C0497l(C0497l c0497l, long j) {
        for (Integer num : c0497l.f1806l.keySet()) {
            this.f1806l.put(num, new C0391l((C0391l) c0497l.f1806l.get(num)));
        }
        this.f1805l = j;
    }

    public C0497l(long j) {
        this.f1805l = j;
    }
}
