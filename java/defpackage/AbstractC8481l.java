package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: lٌُؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8481l extends AbstractC5511l implements Set, j$.util.Set {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ int f17529l = 0;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient AbstractC1186l f17530l;

    public static AbstractC8481l Signature(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        AbstractC12442l.subs(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return metrica(length, objArr2);
    }

    public static AbstractC8481l ads(Collection collection) {
        if ((collection instanceof AbstractC8481l) && !(collection instanceof SortedSet)) {
            AbstractC8481l abstractC8481l = (AbstractC8481l) collection;
            if (!abstractC8481l.smaato()) {
                return abstractC8481l;
            }
        }
        Object[] array = collection.toArray();
        return metrica(array.length, array);
    }

    public static AbstractC8481l metrica(int i, Object... objArr) {
        if (i == 0) {
            return C13825l.f26967l;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C12950l(obj);
        }
        int iVip = vip(i);
        Object[] objArr2 = new Object[iVip];
        int i2 = iVip - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                C6541l.subs(AbstractC0653l.vip(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iCrashlytics = AbstractC12027l.crashlytics(iHashCode);
            while (true) {
                int i6 = iCrashlytics & i2;
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
                iCrashlytics++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C12950l(obj4);
        }
        if (vip(i4) < iVip / 2) {
            return metrica(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C13825l(i3, i2, i4, objArr, objArr2);
    }

    public static int vip(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            AbstractC12442l.subs(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    @Override // defpackage.AbstractC5511l
    public AbstractC1186l amazon() {
        AbstractC1186l abstractC1186l = this.f17530l;
        if (abstractC1186l != null) {
            return abstractC1186l;
        }
        AbstractC1186l abstractC1186lTapsense = tapsense();
        this.f17530l = abstractC1186lTapsense;
        return abstractC1186lTapsense;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC8481l) && (this instanceof C13825l) && (((AbstractC8481l) obj) instanceof C13825l) && ((C13825l) this).f26971l != obj.hashCode()) {
            return false;
        }
        return AbstractC5088l.purchase(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC5088l.admob(this);
    }

    public AbstractC1186l tapsense() {
        Object[] array = toArray(AbstractC5511l.f11780l);
        C9258l c9258l = AbstractC1186l.f3181l;
        return AbstractC1186l.vip(array.length, array);
    }
}
