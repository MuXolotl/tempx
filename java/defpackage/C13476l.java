package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lْٖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13476l {
    public final ArrayList yandex = new ArrayList();

    public static void loadAd(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    loadAd(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final List crashlytics(ArrayList arrayList) {
        EnumC18632l enumC18632l;
        EnumC18632l enumC18632l2;
        EnumC18632l enumC18632l3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.yandex;
        if (size != arrayList2.size()) {
            return null;
        }
        int size2 = arrayList2.size();
        ArrayList<int[]> arrayList3 = new ArrayList();
        boolean z = false;
        loadAd(arrayList3, size2, new int[size2], 0);
        C2483l[] c2483lArr = new C2483l[arrayList.size()];
        for (int[] iArr : arrayList3) {
            boolean z2 = true;
            for (int i = 0; i < arrayList2.size(); i++) {
                if (iArr[i] < arrayList.size()) {
                    C2483l c2483l = (C2483l) arrayList2.get(i);
                    C2483l c2483l2 = (C2483l) arrayList.get(iArr[i]);
                    c2483l.getClass();
                    z2 &= c2483l2.loadAd.f14694l <= c2483l.loadAd.f14694l && c2483l2.yandex == c2483l.yandex && ((enumC18632l = c2483l.crashlytics) == (enumC18632l2 = EnumC18632l.DEFAULT) || (enumC18632l3 = c2483l2.crashlytics) == enumC18632l2 || enumC18632l3 == enumC18632l);
                    if (!z2) {
                        break;
                    }
                    c2483lArr[iArr[i]] = (C2483l) arrayList2.get(i);
                }
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z) {
            return Arrays.asList(c2483lArr);
        }
        return null;
    }

    public final void yandex(C2483l c2483l) {
        this.yandex.add(c2483l);
    }
}
