package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lؙٙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6551l {
    public final LinkedHashMap yandex;

    public C6551l(int i) {
        switch (i) {
            case 1:
                this.yandex = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.yandex = new LinkedHashMap();
                break;
        }
    }

    public C18645l loadAd() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C18645l c18645l : this.yandex.values()) {
            arrayList.add(c18645l.loadAd);
            arrayList2.add(c18645l.crashlytics);
            arrayList3.add(c18645l.amazon);
            arrayList4.add(c18645l.purchase);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        AbstractC12442l.billing(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new C18645l(iArr3, AbstractC3105l.purchase((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), AbstractC3105l.purchase((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), AbstractC3105l.purchase((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public void yandex(C18645l c18645l) {
        long[] jArr = c18645l.purchase;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.yandex;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(c18645l.purchase[0]), c18645l);
        }
    }
}
