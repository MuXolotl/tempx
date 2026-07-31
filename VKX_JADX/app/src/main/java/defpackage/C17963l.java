package defpackage;

import androidx.car.app.model.Alert;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lٖ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17963l implements Map, Serializable, InterfaceC17350l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C17963l f34955l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f34956l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int[] f34957l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f34958l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f34959l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f34960l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object[] f34961l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C4617l f34962l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f34963l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int[] f34964l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C4617l f34965l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f34966l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34967l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C4764l f34968l;

    static {
        C17963l c17963l = new C17963l(0);
        c17963l.f34956l = true;
        f34955l = c17963l;
    }

    public C17963l(int i) {
        if (i < 0) {
            C8339l.metrica("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f34961l = objArr;
        this.f34960l = null;
        this.f34957l = iArr;
        this.f34964l = new int[iHighestOneBit];
        this.f34963l = 2;
        this.f34967l = 0;
        this.f34958l = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int admob(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f34958l;
    }

    public final void amazon() {
        if (this.f34956l) {
            C3010l.mopub();
        }
    }

    public final void billing(int i) {
        Object[] objArr = this.f34961l;
        int length = objArr.length;
        int i2 = this.f34967l;
        int i3 = length - i2;
        int i4 = i2 - this.f34966l;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            purchase(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Alert.DURATION_SHOW_INDEFINITELY : 2147483639;
            }
            this.f34961l = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f34960l;
            this.f34960l = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f34957l = Arrays.copyOf(this.f34957l, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f34964l.length) {
                subs(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        amazon();
        int i = this.f34967l - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f34957l;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f34964l[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC13831l.amazon(0, this.f34967l, this.f34961l);
        Object[] objArr = this.f34960l;
        if (objArr != null) {
            AbstractC13831l.amazon(0, this.f34967l, objArr);
        }
        this.f34966l = 0;
        this.f34967l = 0;
        this.f34959l++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return mopub(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f34967l;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f34957l[i2] >= 0 && AbstractC8576l.yandex(this.f34960l[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    public final C17963l crashlytics() {
        amazon();
        this.f34956l = true;
        return this.f34966l > 0 ? this : f34955l;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C4617l c4617l = this.f34965l;
        if (c4617l != null) {
            return c4617l;
        }
        C4617l c4617l2 = new C4617l(this, 0);
        this.f34965l = c4617l2;
        return c4617l2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        Map.Entry entry;
        int iMopub;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f34966l == map.size()) {
                    Iterator it = map.entrySet().iterator();
                    do {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next == null) {
                                break;
                            }
                            try {
                                entry = (Map.Entry) next;
                                iMopub = mopub(entry.getKey());
                            } catch (ClassCastException unused) {
                            }
                        } else {
                            z = true;
                        }
                        if (z) {
                        }
                    } while (iMopub < 0 ? false : AbstractC8576l.yandex(this.f34960l[iMopub], entry.getValue()));
                    z = false;
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void firebase(int i) {
        int i2;
        int i3;
        int iAdmob;
        int[] iArr;
        this.f34961l[i] = null;
        Object[] objArr = this.f34960l;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.f34957l[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f34964l.length - 1 : length - 1;
                int[] iArr2 = this.f34964l;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f34963l) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iAdmob = admob(this.f34961l[i3]) - length;
                    iArr = this.f34964l;
                }
            } while ((iAdmob & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f34957l[i3] = i4;
        }
        this.f34957l[i] = -1;
        this.f34966l--;
        this.f34959l++;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iMopub = mopub(obj);
        if (iMopub < 0) {
            return null;
        }
        return this.f34960l[iMopub];
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0437l c0437l = new C0437l(this, 0);
        int i = 0;
        while (c0437l.hasNext()) {
            int i2 = c0437l.f31319l;
            C17963l c17963l = (C17963l) c0437l.f31320l;
            if (i2 >= c17963l.f34967l) {
                C4875l.firebase();
                return 0;
            }
            c0437l.f31319l = i2 + 1;
            c0437l.f31318l = i2;
            Object obj = c17963l.f34961l[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = c17963l.f34960l[c0437l.f31318l];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c0437l.billing();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f34966l == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C4617l c4617l = this.f34962l;
        if (c4617l != null) {
            return c4617l;
        }
        C4617l c4617l2 = new C4617l(this, 1);
        this.f34962l = c4617l2;
        return c4617l2;
    }

    public final int mopub(Object obj) {
        int iAdmob = admob(obj);
        int i = this.f34963l;
        while (true) {
            int i2 = this.f34964l[iAdmob];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (AbstractC8576l.yandex(this.f34961l[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iAdmob = iAdmob == 0 ? this.f34964l.length - 1 : iAdmob - 1;
        }
    }

    public final void purchase(boolean z) {
        int i;
        Object[] objArr = this.f34960l;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f34967l;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f34957l;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f34961l;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f34964l[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC13831l.amazon(i3, i, this.f34961l);
        if (objArr != null) {
            AbstractC13831l.amazon(i3, this.f34967l, objArr);
        }
        this.f34967l = i3;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        amazon();
        int iYandex = yandex(obj);
        Object[] objArr = this.f34960l;
        if (objArr == null) {
            int length = this.f34961l.length;
            if (length < 0) {
                C8339l.metrica("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f34960l = objArr;
        }
        if (iYandex >= 0) {
            objArr[iYandex] = obj2;
            return null;
        }
        int i = (-iYandex) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        amazon();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        billing(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iYandex = yandex(entry.getKey());
            Object[] objArr = this.f34960l;
            if (objArr == null) {
                int length = this.f34961l.length;
                if (length < 0) {
                    C8339l.metrica("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f34960l = objArr;
                }
            }
            if (iYandex >= 0) {
                objArr[iYandex] = entry.getValue();
            } else {
                int i = (-iYandex) - 1;
                if (!AbstractC8576l.yandex(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        amazon();
        int iMopub = mopub(obj);
        if (iMopub < 0) {
            return null;
        }
        Object obj2 = this.f34960l[iMopub];
        firebase(iMopub);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f34966l;
    }

    public final void subs(int i) {
        int[] iArr;
        this.f34959l++;
        int i2 = 0;
        if (this.f34967l > this.f34966l) {
            purchase(false);
        }
        this.f34964l = new int[i];
        this.f34958l = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f34967l) {
            int i3 = i2 + 1;
            int iAdmob = admob(this.f34961l[i2]);
            int i4 = this.f34963l;
            while (true) {
                iArr = this.f34964l;
                if (iArr[iAdmob] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    C8339l.smaato("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iAdmob = iAdmob == 0 ? iArr.length - 1 : iAdmob - 1;
            }
            iArr[iAdmob] = i3;
            this.f34957l[i2] = iAdmob;
            i2 = i3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f34966l * 3) + 2);
        sb.append("{");
        int i = 0;
        C0437l c0437l = new C0437l(this, 0);
        while (c0437l.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c0437l.f31319l;
            C17963l c17963l = (C17963l) c0437l.f31320l;
            if (i2 >= c17963l.f34967l) {
                C4875l.firebase();
                return null;
            }
            c0437l.f31319l = i2 + 1;
            c0437l.f31318l = i2;
            Object obj = c17963l.f34961l[i2];
            if (obj == c17963l) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = c17963l.f34960l[c0437l.f31318l];
            if (obj2 == c17963l) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c0437l.billing();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C4764l c4764l = this.f34968l;
        if (c4764l != null) {
            return c4764l;
        }
        C4764l c4764l2 = new C4764l(1, this);
        this.f34968l = c4764l2;
        return c4764l2;
    }

    public final int yandex(Object obj) {
        amazon();
        while (true) {
            int iAdmob = admob(obj);
            int i = this.f34963l * 2;
            int length = this.f34964l.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f34964l;
                int i3 = iArr[iAdmob];
                if (i3 == 0) {
                    int i4 = this.f34967l;
                    Object[] objArr = this.f34961l;
                    if (i4 >= objArr.length) {
                        billing(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f34967l = i5;
                    objArr[i4] = obj;
                    this.f34957l[i4] = iAdmob;
                    iArr[iAdmob] = i5;
                    this.f34966l++;
                    this.f34959l++;
                    if (i2 > this.f34963l) {
                        this.f34963l = i2;
                    }
                    return i4;
                }
                if (AbstractC8576l.yandex(this.f34961l[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    subs(this.f34964l.length * 2);
                    break;
                }
                iAdmob = iAdmob == 0 ? this.f34964l.length - 1 : iAdmob - 1;
            }
        }
    }

    public C17963l() {
        this(8);
    }
}
