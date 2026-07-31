package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lً٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17762l extends AbstractMap {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C7943l f34586l = new C7943l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C4187l f34587l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int[] f34588l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object[] f34589l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f34590l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Integer f34591l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, lً٘] */
    /* JADX WARN: Type inference failed for: r0v1, types: [lً٘] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public C17762l(C17762l c17762l, C17762l c17762l2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f34587l = new C4187l(abstractMap, -1);
        abstractMap.f34591l = null;
        abstractMap.f34590l = null;
        int size = c17762l2.size() + c17762l.size();
        int i = c17762l.f34588l[c17762l.size()] + c17762l2.f34588l[c17762l2.size()];
        int i2 = size + 1;
        Object[] objArr2 = new Object[i];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryCrashlytics = c17762l.crashlytics(0);
        Map.Entry entryCrashlytics2 = c17762l2.crashlytics(0);
        int i4 = 0;
        int i5 = 0;
        int iYandex = size;
        int i6 = 0;
        while (true) {
            if (entryCrashlytics == null && entryCrashlytics2 == null) {
                break;
            }
            i6++;
            if (entryCrashlytics != null) {
                if (entryCrashlytics2 != null) {
                    int iCompareTo = ((String) entryCrashlytics.getKey()).compareTo((String) entryCrashlytics2.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryCrashlytics.getKey(), new C4187l(abstractMap, i6));
                        C4187l c4187l = (C4187l) entryCrashlytics.getValue();
                        C4187l c4187l2 = (C4187l) entryCrashlytics2.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iBilling = c4187l.billing();
                            C17762l c17762l3 = c4187l.f8602l;
                            if (i9 >= iBilling - c4187l.amazon() && i10 >= c4187l2.billing() - c4187l2.amazon()) {
                                break;
                            }
                            int iCompare = i9 == c4187l.billing() - c4187l.amazon() ? 1 : i10 == c4187l2.billing() - c4187l2.amazon() ? -1 : 0;
                            if (iCompare == 0) {
                                C7943l c7943l = C13059l.loadAd;
                                iCompare = C13059l.loadAd.compare(c17762l3.f34589l[c4187l.amazon() + i9], c4187l2.f8602l.f34589l[c4187l2.amazon() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = c17762l3.f34589l[c4187l.amazon() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = c4187l2.f8602l.f34589l[c4187l2.amazon() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iYandex] = obj;
                            abstractMap = this;
                            iYandex++;
                        }
                        iArr[i6] = iYandex;
                        entryCrashlytics = c17762l.crashlytics(i8);
                        entryCrashlytics2 = c17762l2.crashlytics(i7);
                        i5 = i8;
                        i4 = i7;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iYandex = yandex(entryCrashlytics, i6, iYandex, objArr2, iArr);
                entryCrashlytics = c17762l.crashlytics(i5);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryCrashlytics;
            i4++;
            int iYandex2 = yandex(entryCrashlytics2, i6, iYandex, objArr2, iArr);
            entryCrashlytics2 = c17762l2.crashlytics(i4);
            iYandex = iYandex2;
            entryCrashlytics = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i12 = iArr[i3];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i3; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (loadAd(i, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.f34589l = objArr2;
        int i17 = iArr[i3] + 1;
        abstractMap.f34588l = loadAd(i2, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    public static boolean loadAd(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public final Map.Entry crashlytics(int i) {
        if (i < this.f34588l[0]) {
            return (Map.Entry) this.f34589l[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f34587l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f34591l == null) {
            this.f34591l = Integer.valueOf(super.hashCode());
        }
        return this.f34591l.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f34590l == null) {
            this.f34590l = super.toString();
        }
        return this.f34590l;
    }

    public final int yandex(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        C4187l c4187l = (C4187l) entry.getValue();
        int iBilling = c4187l.billing() - c4187l.amazon();
        System.arraycopy(c4187l.f8602l.f34589l, c4187l.amazon(), objArr, i2, iBilling);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new C4187l(this, i));
        int i3 = i2 + iBilling;
        iArr[i + 1] = i3;
        return i3;
    }

    public C17762l() {
        List list = Collections.EMPTY_LIST;
        this.f34587l = new C4187l(this, -1);
        this.f34591l = null;
        this.f34590l = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f34589l = loadAd(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f34588l = iArr;
                return;
            }
            throw AbstractC15560l.adcel(it2);
        }
        throw AbstractC15560l.adcel(it);
    }
}
