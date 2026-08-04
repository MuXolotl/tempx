package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lُؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1513l {
    public final int yandex;

    public C1513l(int i) {
        this.yandex = i;
        if (i > 0) {
            return;
        }
        AbstractC14825l.yandex("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1513l) {
            return this.yandex == ((C1513l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return -this.yandex;
    }

    public final ArrayList yandex(int i, int i2) {
        int i3 = this.yandex;
        int i4 = i - ((i3 - 1) * i2);
        int i5 = i4 / i3;
        int i6 = i4 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i7 = 0;
        while (i7 < i3) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }
}
