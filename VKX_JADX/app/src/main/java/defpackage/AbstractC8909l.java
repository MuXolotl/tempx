package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: lٌٛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8909l extends AbstractC3810l implements Set, j$.util.Set {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ int f18303l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public transient AbstractC0933l f18304l;

    public static AbstractC8909l metrica(int i, Object... objArr) {
        if (i == 0) {
            return C9059l.f18640l;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C11391l(obj);
        }
        int iVip = vip(i);
        Object[] objArr2 = new Object[iVip];
        int i2 = iVip - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            AbstractC7280l.firebase(i5, obj2);
            int iHashCode = obj2.hashCode();
            int iMopub = AbstractC2021l.mopub(iHashCode);
            while (true) {
                int i6 = iMopub & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iMopub++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C11391l(obj4);
        }
        if (vip(i4) < iVip / 2) {
            return metrica(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C9059l(i3, i2, i4, objArr, objArr2);
    }

    public static int vip(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        C8339l.metrica("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC8909l) && (this instanceof C9059l) && (((AbstractC8909l) obj) instanceof C9059l) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
