package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lٌؘٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8829l implements InterfaceC12703l {
    public final int amazon;
    public final long crashlytics;
    public final SparseArray loadAd;
    public final C18645l yandex;

    public C8829l(SparseArray sparseArray, long j, int i, long j2, long j3) {
        C18645l c18645l;
        int i2;
        this.loadAd = sparseArray;
        this.crashlytics = j;
        this.amazon = i;
        List list = (List) sparseArray.get(i);
        if (list == null || list.isEmpty()) {
            c18645l = null;
        } else {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C7745l c7745l = (C7745l) list.get(i4);
                jArrCopyOf3[i4] = c7745l.f16254l;
                jArrCopyOf[i4] = c7745l.f16253l;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                AbstractC6427l.vip("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
            }
            c18645l = new C18645l(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.yandex = c18645l;
    }

    @Override // defpackage.InterfaceC12703l
    public final /* synthetic */ boolean amazon() {
        return false;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        List list = (List) this.loadAd.get(this.amazon);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.InterfaceC12703l
    public final long mopub() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC12703l
    public final C15528l purchase(long j) {
        C18645l c18645l = this.yandex;
        if (c18645l != null) {
            return c18645l.purchase(j);
        }
        C4304l c4304l = C4304l.crashlytics;
        return new C15528l(c4304l, c4304l);
    }
}
