package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: lّۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17501l extends AbstractSet implements Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public transient Object[] f34084l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public transient int[] f34085l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient Object f34086l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public transient int f34087l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public transient int f34088l;

    public static C17501l amazon(int i) {
        C17501l c17501l = new C17501l();
        AbstractC12442l.subs(i >= 0, "Expected size must be >= 0");
        c17501l.f34088l = AbstractC9966l.purchase(i, 1);
        return c17501l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        char c = 31;
        if (mopub()) {
            AbstractC12442l.ads("Arrays already allocated", mopub());
            int i = this.f34088l;
            int iMax = Math.max(i + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f34086l = AbstractC15576l.mopub(iMax2);
            this.f34088l = AbstractC15576l.subs(this.f34088l, 32 - Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.f34085l = new int[i];
            this.f34084l = new Object[i];
        }
        Set setBilling = billing();
        if (setBilling != null) {
            return setBilling.add(obj);
        }
        int[] iArrFirebase = firebase();
        Object[] objArrAdmob = admob();
        int i2 = this.f34087l;
        int i3 = i2 + 1;
        int iAmazon = AbstractC12027l.amazon(obj);
        int iSmaato = (1 << (this.f34088l & 31)) - 1;
        int i4 = iAmazon & iSmaato;
        Object obj2 = this.f34086l;
        Objects.requireNonNull(obj2);
        int iSmaato2 = AbstractC15576l.smaato(i4, obj2);
        if (iSmaato2 != 0) {
            int i5 = ~iSmaato;
            int i6 = iAmazon & i5;
            int i7 = 0;
            while (true) {
                int i8 = iSmaato2 - 1;
                int i9 = iArrFirebase[i8];
                char c2 = c;
                if ((i9 & i5) == i6 && AbstractC7000l.loadAd(obj, objArrAdmob[i8])) {
                    return false;
                }
                int i10 = i9 & iSmaato;
                i7++;
                if (i10 == 0) {
                    if (i7 < 9) {
                        if (i3 <= iSmaato) {
                            iArrFirebase[i8] = AbstractC15576l.subs(i9, i3, iSmaato);
                            break;
                        }
                        iSmaato = smaato(iSmaato, AbstractC15576l.isPro(iSmaato), iAmazon, i2);
                        break;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.f34088l & 31), 1.0f);
                    int i11 = isEmpty() ? -1 : 0;
                    while (i11 >= 0) {
                        linkedHashSet.add(admob()[i11]);
                        i11++;
                        if (i11 >= this.f34087l) {
                            i11 = -1;
                        }
                    }
                    this.f34086l = linkedHashSet;
                    this.f34085l = null;
                    this.f34084l = null;
                    this.f34088l += 32;
                    return linkedHashSet.add(obj);
                }
                iSmaato2 = i10;
                c = c2;
            }
        } else if (i3 > iSmaato) {
            iSmaato = smaato(iSmaato, AbstractC15576l.isPro(iSmaato), iAmazon, i2);
        } else {
            Object obj3 = this.f34086l;
            Objects.requireNonNull(obj3);
            AbstractC15576l.remoteconfig(i4, i3, obj3);
        }
        int length = firebase().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f34085l = Arrays.copyOf(firebase(), iMin);
            this.f34084l = Arrays.copyOf(admob(), iMin);
        }
        firebase()[i2] = AbstractC15576l.subs(iAmazon, 0, iSmaato);
        admob()[i2] = obj;
        this.f34087l = i3;
        this.f34088l += 32;
        return true;
    }

    public final Object[] admob() {
        Object[] objArr = this.f34084l;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Set billing() {
        Object obj = this.f34086l;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (mopub()) {
            return;
        }
        this.f34088l += 32;
        Set setBilling = billing();
        if (setBilling != null) {
            this.f34088l = AbstractC9966l.purchase(size(), 3);
            setBilling.clear();
            this.f34086l = null;
            this.f34087l = 0;
            return;
        }
        Arrays.fill(admob(), 0, this.f34087l, (Object) null);
        Object obj = this.f34086l;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(firebase(), 0, this.f34087l, 0);
        this.f34087l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (mopub()) {
            return false;
        }
        Set setBilling = billing();
        if (setBilling != null) {
            return setBilling.contains(obj);
        }
        int iAmazon = AbstractC12027l.amazon(obj);
        int i = (1 << (this.f34088l & 31)) - 1;
        Object obj2 = this.f34086l;
        Objects.requireNonNull(obj2);
        int iSmaato = AbstractC15576l.smaato(iAmazon & i, obj2);
        if (iSmaato == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iAmazon & i2;
        do {
            int i4 = iSmaato - 1;
            int i5 = firebase()[i4];
            if ((i5 & i2) == i3 && AbstractC7000l.loadAd(obj, admob()[i4])) {
                return true;
            }
            iSmaato = i5 & i;
        } while (iSmaato != 0);
        return false;
    }

    public final int[] firebase() {
        int[] iArr = this.f34085l;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setBilling = billing();
        return setBilling != null ? setBilling.iterator() : new C6255l(this);
    }

    public final boolean mopub() {
        return this.f34086l == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!mopub()) {
            Set setBilling = billing();
            if (setBilling != null) {
                return setBilling.remove(obj);
            }
            int i3 = (1 << (this.f34088l & 31)) - 1;
            Object obj2 = this.f34086l;
            Objects.requireNonNull(obj2);
            int iFirebase = AbstractC15576l.firebase(obj, null, i3, obj2, firebase(), admob(), null);
            if (iFirebase != -1) {
                Object obj3 = this.f34086l;
                Objects.requireNonNull(obj3);
                int[] iArrFirebase = firebase();
                Object[] objArrAdmob = admob();
                int size = size();
                int i4 = size - 1;
                if (iFirebase < i4) {
                    Object obj4 = objArrAdmob[i4];
                    objArrAdmob[iFirebase] = obj4;
                    objArrAdmob[i4] = null;
                    iArrFirebase[iFirebase] = iArrFirebase[i4];
                    iArrFirebase[i4] = 0;
                    int iAmazon = AbstractC12027l.amazon(obj4) & i3;
                    int iSmaato = AbstractC15576l.smaato(iAmazon, obj3);
                    if (iSmaato == size) {
                        AbstractC15576l.remoteconfig(iAmazon, iFirebase + 1, obj3);
                    } else {
                        while (true) {
                            i = iSmaato - 1;
                            i2 = iArrFirebase[i];
                            int i5 = i2 & i3;
                            if (i5 == size) {
                                break;
                            }
                            iSmaato = i5;
                        }
                        iArrFirebase[i] = AbstractC15576l.subs(i2, iFirebase + 1, i3);
                    }
                } else {
                    objArrAdmob[iFirebase] = null;
                    iArrFirebase[iFirebase] = 0;
                }
                this.f34087l--;
                this.f34088l += 32;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setBilling = billing();
        return setBilling != null ? setBilling.size() : this.f34087l;
    }

    public final int smaato(int i, int i2, int i3, int i4) {
        Object objMopub = AbstractC15576l.mopub(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC15576l.remoteconfig(i3 & i5, i4 + 1, objMopub);
        }
        Object obj = this.f34086l;
        Objects.requireNonNull(obj);
        int[] iArrFirebase = firebase();
        for (int i6 = 0; i6 <= i; i6++) {
            int iSmaato = AbstractC15576l.smaato(i6, obj);
            while (iSmaato != 0) {
                int i7 = iSmaato - 1;
                int i8 = iArrFirebase[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iSmaato2 = AbstractC15576l.smaato(i10, objMopub);
                AbstractC15576l.remoteconfig(i10, iSmaato, objMopub);
                iArrFirebase[i7] = AbstractC15576l.subs(i9, iSmaato2, i5);
                iSmaato = i8 & i;
            }
        }
        this.f34086l = objMopub;
        this.f34088l = AbstractC15576l.subs(this.f34088l, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (mopub()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setBilling = billing();
        if (setBilling != null) {
            return setBilling.toArray(objArr);
        }
        Object[] objArrAdmob = admob();
        int i = this.f34087l;
        AbstractC12442l.adcel(0, i, objArrAdmob.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrAdmob, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (mopub()) {
            return new Object[0];
        }
        Set setBilling = billing();
        return setBilling != null ? setBilling.toArray() : Arrays.copyOf(admob(), this.f34087l);
    }
}
