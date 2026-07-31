package defpackage;

import java.util.RandomAccess;

/* JADX INFO: renamed from: lَۗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10514l extends AbstractC9813l implements RandomAccess {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21388l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21389l;

    public /* synthetic */ C10514l(int i, Object obj) {
        this.f21389l = i;
        this.f21388l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0024 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.f21389l;
        Object obj2 = this.f21388l;
        switch (i) {
            case 0:
                if (!(obj instanceof Integer)) {
                    return false;
                }
                return AbstractC8669l.tapsense((int[]) obj2, ((Number) obj).intValue());
            default:
                if (!(obj instanceof C10882l)) {
                    return false;
                }
                long j = ((C10882l) obj).f21996l;
                long[] jArr = (long[]) obj2;
                int length = jArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (j == jArr[i2]) {
                        if (i2 >= 0) {
                            return true;
                        }
                        return false;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f21389l;
        Object obj = this.f21388l;
        switch (i2) {
            case 0:
                return Integer.valueOf(((int[]) obj)[i]);
            default:
                return new C10882l(((long[]) obj)[i]);
        }
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final int indexOf(Object obj) {
        int i = this.f21389l;
        int i2 = 0;
        Object obj2 = this.f21388l;
        switch (i) {
            case 0:
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                int iIntValue = ((Number) obj).intValue();
                int[] iArr = (int[]) obj2;
                int length = iArr.length;
                while (i2 < length) {
                    if (iIntValue == iArr[i2]) {
                        return i2;
                    }
                    i2++;
                }
                return -1;
            default:
                if (!(obj instanceof C10882l)) {
                    return -1;
                }
                long j = ((C10882l) obj).f21996l;
                long[] jArr = (long[]) obj2;
                int length2 = jArr.length;
                while (i2 < length2) {
                    if (j == jArr[i2]) {
                        return i2;
                    }
                    i2++;
                }
                return -1;
        }
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f21389l;
        Object obj = this.f21388l;
        switch (i) {
            case 0:
                return ((int[]) obj).length == 0;
            default:
                return ((long[]) obj).length == 0;
        }
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f21389l;
        Object obj2 = this.f21388l;
        switch (i) {
            case 0:
                if (!(obj instanceof Integer)) {
                    return -1;
                }
                int iIntValue = ((Number) obj).intValue();
                int[] iArr = (int[]) obj2;
                int length = iArr.length - 1;
                if (length < 0) {
                    return -1;
                }
                while (true) {
                    int i2 = length - 1;
                    if (iIntValue == iArr[length]) {
                        return length;
                    }
                    if (i2 < 0) {
                        return -1;
                    }
                    length = i2;
                }
                break;
            default:
                if (!(obj instanceof C10882l)) {
                    return -1;
                }
                long j = ((C10882l) obj).f21996l;
                long[] jArr = (long[]) obj2;
                int length2 = jArr.length - 1;
                if (length2 < 0) {
                    return -1;
                }
                while (true) {
                    int i3 = length2 - 1;
                    if (j == jArr[length2]) {
                        return length2;
                    }
                    if (i3 < 0) {
                        return -1;
                    }
                    length2 = i3;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        int i = this.f21389l;
        Object obj = this.f21388l;
        switch (i) {
            case 0:
                return ((int[]) obj).length;
            default:
                return ((long[]) obj).length;
        }
    }
}
