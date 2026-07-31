package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lؒۤٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1454l {
    public final int loadAd;
    public final int yandex;

    public C1454l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1454l.class == obj.getClass()) {
            C1454l c1454l = (C1454l) obj;
            int i = c1454l.yandex;
            Set set = C3963l.f8145l;
            if (this.yandex == i) {
                int i2 = c1454l.loadAd;
                Set set2 = C15702l.f30842l;
                if (this.loadAd == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = C3963l.f8145l;
        int i = this.yandex * 31;
        Set set2 = C15702l.f30842l;
        return i + this.loadAd;
    }

    public final String toString() {
        String str;
        Set set = C3963l.f8145l;
        String str2 = "";
        int i = this.yandex;
        if (i == 0) {
            str = "Compact";
        } else if (i == 1) {
            str = "Medium";
        } else {
            str = i == 2 ? "Expanded" : "";
        }
        String strConcat = "WindowWidthSizeClass.".concat(str);
        Set set2 = C15702l.f30842l;
        int i2 = this.loadAd;
        if (i2 == 0) {
            str2 = "Compact";
        } else if (i2 == 1) {
            str2 = "Medium";
        } else if (i2 == 2) {
            str2 = "Expanded";
        }
        return AbstractC14814l.ads("WindowSizeClass(", strConcat, ", ", "WindowHeightSizeClass.".concat(str2), ")");
    }
}
