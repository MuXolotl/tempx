package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: lْٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13639l extends AbstractMap {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f26663l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Map f26664l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f26665l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object[] f26666l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile C6542l f26667l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f26668l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Map f26669l;

    public C13639l() {
        Map map = Collections.EMPTY_MAP;
        this.f26664l = map;
        this.f26669l = map;
    }

    public final int amazon(Comparable comparable) {
        int i = this.f26665l;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((C0900l) this.f26666l[i2]).f2553l);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((C0900l) this.f26666l[i4]).f2553l);
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

    public final SortedMap billing() {
        mopub();
        if (this.f26664l.isEmpty() && !(this.f26664l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f26664l = treeMap;
            this.f26669l = treeMap.descendingMap();
        }
        return (SortedMap) this.f26664l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        mopub();
        if (this.f26665l != 0) {
            this.f26666l = null;
            this.f26665l = 0;
        }
        if (this.f26664l.isEmpty()) {
            return;
        }
        this.f26664l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return amazon(comparable) >= 0 || this.f26664l.containsKey(comparable);
    }

    public final C0900l crashlytics(int i) {
        if (i < this.f26665l) {
            return (C0900l) this.f26666l[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f26667l == null) {
            this.f26667l = new C6542l(4, this);
        }
        return this.f26667l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13639l)) {
            return super.equals(obj);
        }
        C13639l c13639l = (C13639l) obj;
        int size = size();
        if (size == c13639l.size()) {
            int i = this.f26665l;
            if (i != c13639l.f26665l) {
                return entrySet().equals(c13639l.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (crashlytics(i2).equals(c13639l.crashlytics(i2))) {
                }
            }
            if (i != size) {
                return this.f26664l.equals(c13639l.f26664l);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iAmazon = amazon(comparable);
        return iAmazon >= 0 ? ((C0900l) this.f26666l[iAmazon]).f2552l : this.f26664l.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f26665l;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f26666l[i2].hashCode();
        }
        return this.f26664l.size() > 0 ? this.f26664l.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: loadAd, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        mopub();
        int iAmazon = amazon(comparable);
        if (iAmazon >= 0) {
            return ((C0900l) this.f26666l[iAmazon]).setValue(obj);
        }
        mopub();
        if (this.f26666l == null) {
            this.f26666l = new Object[16];
        }
        int i = -(iAmazon + 1);
        if (i >= 16) {
            return billing().put(comparable, obj);
        }
        if (this.f26665l == 16) {
            C0900l c0900l = (C0900l) this.f26666l[15];
            this.f26665l = 15;
            billing().put(c0900l.f2553l, c0900l.f2552l);
        }
        Object[] objArr = this.f26666l;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.f26666l[i] = new C0900l(this, comparable, obj);
        this.f26665l++;
        return null;
    }

    public final void mopub() {
        if (this.f26668l) {
            C3010l.mopub();
        }
    }

    public final Object purchase(int i) {
        mopub();
        Object[] objArr = this.f26666l;
        Object obj = ((C0900l) objArr[i]).f2552l;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f26665l - i) - 1);
        this.f26665l--;
        if (!this.f26664l.isEmpty()) {
            Iterator it = billing().entrySet().iterator();
            Object[] objArr2 = this.f26666l;
            int i2 = this.f26665l;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C0900l(this, (Comparable) entry.getKey(), entry.getValue());
            this.f26665l++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        mopub();
        Comparable comparable = (Comparable) obj;
        int iAmazon = amazon(comparable);
        if (iAmazon >= 0) {
            return purchase(iAmazon);
        }
        if (this.f26664l.isEmpty()) {
            return null;
        }
        return this.f26664l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f26664l.size() + this.f26665l;
    }

    public final Set yandex() {
        return this.f26664l.isEmpty() ? Collections.EMPTY_SET : this.f26664l.entrySet();
    }
}
