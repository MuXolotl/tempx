package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: lٌؚۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9205l extends C4970l {

    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public static final String f18919l;

    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public static final String f18920l;

    /* JADX INFO: renamed from: lٖؖ۠, reason: contains not printable characters */
    public static final String f18921l;

    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public static final String f18922l;

    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public static final String f18923l;

    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public static final String f18924l;

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public static final String f18925l;

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public static final String f18926l;

    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public static final String f18927l;

    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public static final String f18928l;

    /* JADX INFO: renamed from: lٍؚۖ, reason: contains not printable characters */
    public static final String f18929l;

    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public static final String f18930l;

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public static final String f18931l;

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public static final C9205l f18932l = new C9205l(new C0725l());

    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public static final String f18933l;

    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public static final String f18934l;

    /* JADX INFO: renamed from: lٕٕۤ, reason: contains not printable characters */
    public static final String f18935l;

    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public static final String f18936l;

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static final String f18937l;

    /* JADX INFO: renamed from: lْٗٔ, reason: contains not printable characters */
    public static final String f18938l;

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public final boolean f18939l;

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public final SparseArray f18940l;

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public final boolean f18941l;

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public final SparseBooleanArray f18942l;

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public final boolean f18943l;

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public final boolean f18944l;

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public final boolean f18945l;

    /* JADX INFO: renamed from: lٕؓٗ, reason: contains not printable characters */
    public final boolean f18946l;

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public final boolean f18947l;

    static {
        String str = AbstractC15323l.yandex;
        f18925l = Integer.toString(1000, 36);
        f18933l = Integer.toString(1001, 36);
        f18934l = Integer.toString(1002, 36);
        f18927l = Integer.toString(1003, 36);
        f18928l = Integer.toString(1004, 36);
        f18920l = Integer.toString(1005, 36);
        f18922l = Integer.toString(1006, 36);
        f18929l = Integer.toString(1007, 36);
        f18919l = Integer.toString(1008, 36);
        f18935l = Integer.toString(1009, 36);
        f18930l = Integer.toString(1010, 36);
        f18923l = Integer.toString(1011, 36);
        f18921l = Integer.toString(1012, 36);
        f18924l = Integer.toString(1013, 36);
        f18938l = Integer.toString(1014, 36);
        f18936l = Integer.toString(1015, 36);
        f18926l = Integer.toString(1016, 36);
        f18937l = Integer.toString(1017, 36);
        f18931l = Integer.toString(1018, 36);
    }

    public C9205l(C0725l c0725l) {
        super(c0725l);
        this.f18947l = c0725l.f2227volatile;
        this.f18943l = c0725l.f2224native;
        this.f18944l = c0725l.f2225private;
        this.f18939l = c0725l.f2222extends;
        this.f18941l = c0725l.f2223for;
        this.f18945l = c0725l.f2226throw;
        this.f18946l = c0725l.f2220catch;
        this.f18940l = c0725l.f2221else;
        this.f18942l = c0725l.f2219case;
    }

    @Override // defpackage.C4970l
    public final Bundle crashlytics() {
        Bundle bundleCrashlytics = super.crashlytics();
        bundleCrashlytics.putBoolean(f18925l, this.f18947l);
        bundleCrashlytics.putBoolean(f18933l, false);
        bundleCrashlytics.putBoolean(f18934l, this.f18943l);
        bundleCrashlytics.putBoolean(f18938l, false);
        bundleCrashlytics.putBoolean(f18927l, this.f18944l);
        bundleCrashlytics.putBoolean(f18928l, false);
        bundleCrashlytics.putBoolean(f18920l, false);
        bundleCrashlytics.putBoolean(f18922l, false);
        bundleCrashlytics.putBoolean(f18936l, false);
        bundleCrashlytics.putBoolean(f18931l, this.f18939l);
        bundleCrashlytics.putBoolean(f18926l, this.f18941l);
        bundleCrashlytics.putBoolean(f18929l, this.f18945l);
        bundleCrashlytics.putBoolean(f18919l, false);
        bundleCrashlytics.putBoolean(f18935l, this.f18946l);
        bundleCrashlytics.putBoolean(f18937l, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.f18940l;
            if (i >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.f18942l;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    iArr[i2] = sparseBooleanArray.keyAt(i2);
                }
                bundleCrashlytics.putIntArray(f18924l, iArr);
                return bundleCrashlytics;
            }
            int iKeyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                if (entry.getValue() != null) {
                    C18725l.loadAd();
                    return null;
                }
                arrayList2.add((C8750l) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleCrashlytics.putIntArray(f18930l, AbstractC9966l.subscription(arrayList));
            bundleCrashlytics.putParcelableArrayList(f18923l, AbstractC3483l.subs(arrayList2, new C2922l(3)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                AbstractC12589l.m3424strictfp(sparseArray.valueAt(0));
                throw null;
            }
            bundleCrashlytics.putSparseParcelableArray(f18921l, sparseArray3);
            i++;
        }
    }

    @Override // defpackage.C4970l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9205l.class == obj.getClass()) {
            C9205l c9205l = (C9205l) obj;
            if (super.equals(c9205l) && this.f18947l == c9205l.f18947l && this.f18943l == c9205l.f18943l && this.f18944l == c9205l.f18944l && this.f18939l == c9205l.f18939l && this.f18941l == c9205l.f18941l && this.f18945l == c9205l.f18945l && this.f18946l == c9205l.f18946l) {
                SparseBooleanArray sparseBooleanArray = c9205l.f18942l;
                SparseBooleanArray sparseBooleanArray2 = this.f18942l;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = c9205l.f18940l;
                    SparseArray sparseArray2 = this.f18940l;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        C8750l c8750l = (C8750l) entry.getKey();
                                        if (!map2.containsKey(c8750l) || !Objects.equals(entry.getValue(), map2.get(c8750l))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.C4970l
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f18947l ? 1 : 0)) * 961) + (this.f18943l ? 1 : 0)) * 961) + (this.f18944l ? 1 : 0)) * 28629151) + (this.f18939l ? 1 : 0)) * 31) + (this.f18941l ? 1 : 0)) * 31) + (this.f18945l ? 1 : 0)) * 961) + (this.f18946l ? 1 : 0)) * 31;
    }

    @Override // defpackage.C4970l
    public final C10806l yandex() {
        return new C0725l(this);
    }
}
