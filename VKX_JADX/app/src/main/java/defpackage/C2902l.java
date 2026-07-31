package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: lؔۛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2902l extends AbstractMap {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f6306l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Map f6307l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f6308l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object[] f6309l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile C6542l f6310l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f6311l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Map f6312l;

    public static C2902l billing() {
        C2902l c2902l = new C2902l();
        Map map = Collections.EMPTY_MAP;
        c2902l.f6307l = map;
        c2902l.f6312l = map;
        return c2902l;
    }

    public final Object admob(int i) {
        loadAd();
        Object[] objArr = this.f6309l;
        Object obj = ((C9055l) objArr[i]).f18638l;
        System.arraycopy(objArr, i + 1, objArr, i, (this.f6308l - i) - 1);
        this.f6308l--;
        if (!this.f6307l.isEmpty()) {
            Iterator it = purchase().entrySet().iterator();
            Object[] objArr2 = this.f6309l;
            int i2 = this.f6308l;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new C9055l(this, (Comparable) entry.getKey(), entry.getValue());
            this.f6308l++;
            it.remove();
        }
        return obj;
    }

    public final Set amazon() {
        return this.f6307l.isEmpty() ? Collections.EMPTY_SET : this.f6307l.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        loadAd();
        if (this.f6308l != 0) {
            this.f6309l = null;
            this.f6308l = 0;
        }
        if (this.f6307l.isEmpty()) {
            return;
        }
        this.f6307l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return yandex(comparable) >= 0 || this.f6307l.containsKey(comparable);
    }

    public final C9055l crashlytics(int i) {
        if (i < this.f6308l) {
            return (C9055l) this.f6309l[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6310l == null) {
            this.f6310l = new C6542l(2, this);
        }
        return this.f6310l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2902l)) {
            return super.equals(obj);
        }
        C2902l c2902l = (C2902l) obj;
        int size = size();
        if (size == c2902l.size()) {
            int i = this.f6308l;
            if (i != c2902l.f6308l) {
                return ((AbstractSet) entrySet()).equals(c2902l.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (crashlytics(i2).equals(c2902l.crashlytics(i2))) {
                }
            }
            if (i != size) {
                return this.f6307l.equals(c2902l.f6307l);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iYandex = yandex(comparable);
        return iYandex >= 0 ? ((C9055l) this.f6309l[iYandex]).f18638l : this.f6307l.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.f6308l;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.f6309l[i2].hashCode();
        }
        return this.f6307l.size() > 0 ? this.f6307l.hashCode() + iHashCode : iHashCode;
    }

    public final void loadAd() {
        if (this.f6311l) {
            C3010l.mopub();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: mopub, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        loadAd();
        int iYandex = yandex(comparable);
        if (iYandex >= 0) {
            return ((C9055l) this.f6309l[iYandex]).setValue(obj);
        }
        loadAd();
        if (this.f6309l == null) {
            this.f6309l = new Object[16];
        }
        int i = -(iYandex + 1);
        if (i >= 16) {
            return purchase().put(comparable, obj);
        }
        int i2 = this.f6308l;
        if (i2 == 16) {
            C9055l c9055l = (C9055l) this.f6309l[15];
            this.f6308l = i2 - 1;
            purchase().put(c9055l.f18639l, c9055l.f18638l);
        }
        Object[] objArr = this.f6309l;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.f6309l[i] = new C9055l(this, comparable, obj);
        this.f6308l++;
        return null;
    }

    public final SortedMap purchase() {
        loadAd();
        if (this.f6307l.isEmpty() && !(this.f6307l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6307l = treeMap;
            this.f6312l = treeMap.descendingMap();
        }
        return (SortedMap) this.f6307l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        loadAd();
        Comparable comparable = (Comparable) obj;
        int iYandex = yandex(comparable);
        if (iYandex >= 0) {
            return admob(iYandex);
        }
        if (this.f6307l.isEmpty()) {
            return null;
        }
        return this.f6307l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6307l.size() + this.f6308l;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0030 A[SYNTHETIC] */
    public final int yandex(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int i4 = this.f6308l;
        int i5 = i4 - 1;
        if (i5 < 0) {
            i = 0;
            while (i <= i5) {
                i3 = (i + i5) / 2;
                iCompareTo = comparable.compareTo(((C9055l) this.f6309l[i3]).f18639l);
                if (iCompareTo < 0) {
                    i5 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C9055l) this.f6309l[i5]).f18639l);
            if (iCompareTo2 > 0) {
                i2 = i4 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i = 0;
                while (i <= i5) {
                    i3 = (i + i5) / 2;
                    iCompareTo = comparable.compareTo(((C9055l) this.f6309l[i3]).f18639l);
                    if (iCompareTo < 0) {
                        i5 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }
}
