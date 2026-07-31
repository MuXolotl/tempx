package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: lؔۦۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3052l extends AbstractMap {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Map f6576l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f6577l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object[] f6578l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile C6542l f6579l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f6580l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Map f6581l;

    public C3052l() {
        Map map = Collections.EMPTY_MAP;
        this.f6576l = map;
        this.f6581l = map;
    }

    public final Object amazon(int i) {
        billing();
        Object[] objArr = this.f6578l;
        Object obj = ((C9504l) objArr[i]).f19390l;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f6577l - i) - 1);
        this.f6577l--;
        if (!this.f6576l.isEmpty()) {
            Iterator it = mopub().entrySet().iterator();
            Object[] objArr2 = this.f6578l;
            int i2 = this.f6577l;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C9504l(this, (Comparable) entry.getKey(), entry.getValue());
            this.f6577l++;
            it.remove();
        }
        return obj;
    }

    public final void billing() {
        if (this.f6580l) {
            C3010l.mopub();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        billing();
        if (this.f6577l != 0) {
            this.f6578l = null;
            this.f6577l = 0;
        }
        if (this.f6576l.isEmpty()) {
            return;
        }
        this.f6576l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return purchase(comparable) >= 0 || this.f6576l.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        billing();
        int iPurchase = purchase(comparable);
        if (iPurchase >= 0) {
            return ((C9504l) this.f6578l[iPurchase]).setValue(obj);
        }
        billing();
        if (this.f6578l == null) {
            this.f6578l = new Object[16];
        }
        int i = -(iPurchase + 1);
        if (i >= 16) {
            return mopub().put(comparable, obj);
        }
        if (this.f6577l == 16) {
            C9504l c9504l = (C9504l) this.f6578l[15];
            this.f6577l = 15;
            mopub().put(c9504l.f19391l, c9504l.f19390l);
        }
        Object[] objArr = this.f6578l;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f6578l[i] = new C9504l(this, comparable, obj);
        this.f6577l++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6579l == null) {
            this.f6579l = new C6542l(3, this);
        }
        return this.f6579l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3052l)) {
            return super.equals(obj);
        }
        C3052l c3052l = (C3052l) obj;
        int size = size();
        if (size == c3052l.size()) {
            int i = this.f6577l;
            if (i != c3052l.f6577l) {
                return entrySet().equals(c3052l.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (yandex(i2).equals(c3052l.yandex(i2))) {
                }
            }
            if (i != size) {
                return this.f6576l.equals(c3052l.f6576l);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iPurchase = purchase(comparable);
        return iPurchase >= 0 ? ((C9504l) this.f6578l[iPurchase]).f19390l : this.f6576l.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f6577l;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f6578l[i2].hashCode();
        }
        return this.f6576l.size() > 0 ? this.f6576l.hashCode() + iHashCode : iHashCode;
    }

    public final Set loadAd() {
        return this.f6576l.isEmpty() ? Collections.EMPTY_SET : this.f6576l.entrySet();
    }

    public final SortedMap mopub() {
        billing();
        if (this.f6576l.isEmpty() && !(this.f6576l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6576l = treeMap;
            this.f6581l = treeMap.descendingMap();
        }
        return (SortedMap) this.f6576l;
    }

    public final int purchase(Comparable comparable) {
        int i = this.f6577l;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((C9504l) this.f6578l[i2]).f19391l);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((C9504l) this.f6578l[i4]).f19391l);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        billing();
        Comparable comparable = (Comparable) obj;
        int iPurchase = purchase(comparable);
        if (iPurchase >= 0) {
            return amazon(iPurchase);
        }
        if (this.f6576l.isEmpty()) {
            return null;
        }
        return this.f6576l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6576l.size() + this.f6577l;
    }

    public final C9504l yandex(int i) {
        if (i < this.f6577l) {
            return (C9504l) this.f6578l[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }
}
