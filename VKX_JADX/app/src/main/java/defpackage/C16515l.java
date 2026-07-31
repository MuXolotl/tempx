package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: lٖٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16515l extends AbstractMap {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ int f32281l = 0;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f32284l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public volatile C6542l f32285l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f32286l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public List f32283l = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Map f32282l = Collections.EMPTY_MAP;

    public C16515l(int i) {
        this.f32284l = i;
    }

    public final SortedMap amazon() {
        loadAd();
        if (this.f32282l.isEmpty() && !(this.f32282l instanceof TreeMap)) {
            this.f32282l = new TreeMap();
        }
        return (SortedMap) this.f32282l;
    }

    public final Object billing(int i) {
        loadAd();
        Object obj = ((C12603l) this.f32283l.remove(i)).f24825l;
        if (!this.f32282l.isEmpty()) {
            Iterator it = amazon().entrySet().iterator();
            List list = this.f32283l;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C12603l(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        loadAd();
        if (!this.f32283l.isEmpty()) {
            this.f32283l.clear();
        }
        if (this.f32282l.isEmpty()) {
            return;
        }
        this.f32282l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return yandex(comparable) >= 0 || this.f32282l.containsKey(comparable);
    }

    public final Iterable crashlytics() {
        return this.f32282l.isEmpty() ? AbstractC11990l.loadAd : this.f32282l.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f32285l == null) {
            this.f32285l = new C6542l(1, this);
        }
        return this.f32285l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iYandex = yandex(comparable);
        return iYandex >= 0 ? ((C12603l) this.f32283l.get(iYandex)).f24825l : this.f32282l.get(comparable);
    }

    public final void loadAd() {
        if (this.f32286l) {
            C3010l.mopub();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: purchase, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        loadAd();
        int iYandex = yandex(comparable);
        if (iYandex >= 0) {
            return ((C12603l) this.f32283l.get(iYandex)).setValue(obj);
        }
        loadAd();
        boolean zIsEmpty = this.f32283l.isEmpty();
        int i = this.f32284l;
        if (zIsEmpty && !(this.f32283l instanceof ArrayList)) {
            this.f32283l = new ArrayList(i);
        }
        int i2 = -(iYandex + 1);
        if (i2 >= i) {
            return amazon().put(comparable, obj);
        }
        if (this.f32283l.size() == i) {
            C12603l c12603l = (C12603l) this.f32283l.remove(i - 1);
            amazon().put(c12603l.f24826l, c12603l.f24825l);
        }
        this.f32283l.add(i2, new C12603l(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        loadAd();
        Comparable comparable = (Comparable) obj;
        int iYandex = yandex(comparable);
        if (iYandex >= 0) {
            return billing(iYandex);
        }
        if (this.f32282l.isEmpty()) {
            return null;
        }
        return this.f32282l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f32282l.size() + this.f32283l.size();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int yandex(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.f32283l.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((C12603l) this.f32283l.get(i3)).f24826l);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((C12603l) this.f32283l.get(i4)).f24826l);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((C12603l) this.f32283l.get(i3)).f24826l);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
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
