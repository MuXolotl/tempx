package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lُۜٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11349l implements Map, InterfaceC17350l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f22889l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C6715l f22890l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C4764l f22891l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f22894l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C6715l f22896l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final String[] f22887l = new String[0];

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final Object[] f22886l = new Object[0];

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final int[] f22888l = new int[0];

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String[] f22893l = f22887l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f22892l = f22886l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int[] f22895l = f22888l;

    @Override // java.util.Map
    public final void clear() {
        if (this.f22889l > 0) {
            String[] strArr = this.f22893l;
            Arrays.fill(strArr, 0, strArr.length, (Object) null);
            Object[] objArr = this.f22892l;
            Arrays.fill(objArr, 0, objArr.length, (Object) null);
            AbstractC8669l.m2411package(-1, 0, 6, this.f22895l);
            this.f22889l = 0;
            this.f22894l = 0;
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return (obj instanceof String) && yandex((String) obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj != null && this.f22889l != 0) {
            int length = this.f22892l.length;
            for (int i = 0; i < length; i++) {
                if (this.f22893l[i] != null && AbstractC8576l.yandex(this.f22892l[i], obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public final Object put(Object obj, String str) {
        int i;
        int[] iArr;
        String str2;
        int i2 = 0;
        if (this.f22893l == f22887l) {
            this.f22893l = new String[8];
            this.f22892l = new Object[8];
            int[] iArr2 = new int[8];
            for (int i3 = 0; i3 < 8; i3++) {
                iArr2[i3] = -1;
            }
            this.f22895l = iArr2;
        }
        int iCrashlytics = C7472l.crashlytics(str);
        int length = (this.f22893l.length - 1) & iCrashlytics;
        while (true) {
            String[] strArr = this.f22893l;
            String str3 = strArr[length];
            if (str3 == null) {
                if (this.f22889l * 4 >= strArr.length * 3) {
                    int length2 = strArr.length * 2;
                    Object[] objArr = this.f22892l;
                    int[] iArr3 = this.f22895l;
                    int i4 = this.f22894l;
                    this.f22893l = new String[length2];
                    this.f22892l = new Object[length2];
                    int[] iArr4 = new int[length2];
                    for (int i5 = 0; i5 < length2; i5++) {
                        iArr4[i5] = -1;
                    }
                    this.f22895l = iArr4;
                    this.f22889l = 0;
                    this.f22894l = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        int i7 = iArr3[i6];
                        if (i7 >= 0 && (str2 = strArr[i7]) != null) {
                            put(objArr[i7], str2);
                        }
                    }
                }
                int length3 = this.f22893l.length;
                while (true) {
                    i = iCrashlytics & (length3 - 1);
                    String[] strArr2 = this.f22893l;
                    if (strArr2[i] == null) {
                        break;
                    }
                    iCrashlytics = i + 1;
                    length3 = strArr2.length;
                }
                int i8 = this.f22894l;
                if (i8 == this.f22895l.length && i8 != 0) {
                    int i9 = 0;
                    while (true) {
                        iArr = this.f22895l;
                        if (i2 >= i8) {
                            break;
                        }
                        int i10 = iArr[i2];
                        if (i10 >= 0 && this.f22893l[i10] != null) {
                            iArr[i9] = i10;
                            i9++;
                        }
                        i2++;
                    }
                    int length4 = iArr.length;
                    for (int i11 = i9; i11 < length4; i11++) {
                        this.f22895l[i11] = -1;
                    }
                    this.f22894l = i9;
                }
                this.f22893l[i] = str;
                this.f22892l[i] = obj;
                int[] iArr5 = this.f22895l;
                int i12 = this.f22894l;
                this.f22894l = i12 + 1;
                iArr5[i12] = i;
                this.f22889l++;
                return null;
            }
            if (str3.equalsIgnoreCase(str)) {
                Object[] objArr2 = this.f22892l;
                Object obj2 = objArr2[length];
                objArr2[length] = obj;
                return obj2;
            }
            length = (length + 1) & (this.f22893l.length - 1);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C6715l c6715l = this.f22890l;
        if (c6715l != null) {
            return c6715l;
        }
        C6715l c6715l2 = new C6715l(this, 0);
        this.f22890l = c6715l2;
        return c6715l2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11349l) {
            C11349l c11349l = (C11349l) obj;
            if (c11349l.f22889l == this.f22889l) {
                int length = this.f22893l.length;
                for (int i = 0; i < length; i++) {
                    String str = this.f22893l[i];
                    if (str != null) {
                        if (!AbstractC8576l.yandex(c11349l.get(str), this.f22892l[i])) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iYandex;
        if ((obj instanceof String) && (iYandex = yandex((String) obj)) >= 0) {
            return this.f22892l[iYandex];
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int length = this.f22893l.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            String str = this.f22893l[i];
            if (str != null) {
                int iCrashlytics = C7472l.crashlytics(str);
                Object obj = this.f22892l[i];
                iHashCode += iCrashlytics ^ (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f22889l == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C6715l c6715l = this.f22896l;
        if (c6715l != null) {
            return c6715l;
        }
        C6715l c6715l2 = new C6715l(this, 1);
        this.f22896l = c6715l2;
        return c6715l2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getValue(), (String) entry.getKey());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int iYandex;
        int i;
        if (!(obj instanceof String) || (iYandex = yandex((String) obj)) < 0) {
            return null;
        }
        Object obj2 = this.f22892l[iYandex];
        int i2 = this.f22894l;
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr = this.f22895l;
            if (iArr[i3] == iYandex) {
                iArr[i3] = -1;
                break;
            }
        }
        String[] strArr = this.f22893l;
        strArr[iYandex] = null;
        this.f22892l[iYandex] = null;
        this.f22889l--;
        int i4 = iYandex + 1;
        int length = strArr.length;
        while (true) {
            int i5 = i4 & (length - 1);
            String[] strArr2 = this.f22893l;
            String str = strArr2[i5];
            if (str == null) {
                return obj2;
            }
            Object[] objArr = this.f22892l;
            Object obj3 = objArr[i5];
            strArr2[i5] = null;
            objArr[i5] = null;
            this.f22889l--;
            int iCrashlytics = C7472l.crashlytics(str);
            int length2 = this.f22893l.length;
            while (true) {
                i = iCrashlytics & (length2 - 1);
                String[] strArr3 = this.f22893l;
                String str2 = strArr3[i];
                if (str2 == null) {
                    strArr3[i] = str;
                    this.f22892l[i] = obj3;
                    this.f22889l++;
                    break;
                }
                if (str2.equalsIgnoreCase(str)) {
                    this.f22892l[i] = obj3;
                    break;
                }
                iCrashlytics = i + 1;
                length2 = this.f22893l.length;
            }
            int i6 = this.f22894l;
            for (int i7 = 0; i7 < i6; i7++) {
                int[] iArr2 = this.f22895l;
                if (iArr2[i7] == i5) {
                    iArr2[i7] = i;
                    break;
                }
            }
            i4 = i5 + 1;
            length = this.f22893l.length;
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f22889l;
    }

    @Override // java.util.Map
    public final Collection values() {
        C4764l c4764l = this.f22891l;
        if (c4764l != null) {
            return c4764l;
        }
        C4764l c4764l2 = new C4764l(this);
        this.f22891l = c4764l2;
        return c4764l2;
    }

    public final int yandex(String str) {
        if (this.f22889l == 0) {
            return -1;
        }
        int iCrashlytics = C7472l.crashlytics(str);
        int length = this.f22893l.length;
        while (true) {
            int i = iCrashlytics & (length - 1);
            String str2 = this.f22893l[i];
            if (str2 == null) {
                return -1;
            }
            if (str2.equalsIgnoreCase(str)) {
                return i;
            }
            iCrashlytics = i + 1;
            length = this.f22893l.length;
        }
    }
}
