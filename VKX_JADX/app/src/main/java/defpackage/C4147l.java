package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4147l {
    public final int[] yandex;

    public C4147l(int[] iArr) {
        this.yandex = AbstractC14024l.amazon(iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4147l) {
            return Arrays.equals(this.yandex, ((C4147l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.yandex;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }
}
