package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٍٟ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9867l {
    public final int yandex;
    public static final C9867l loadAd = new C9867l(0);
    public static final C9867l crashlytics = new C9867l(1);
    public static final C9867l amazon = new C9867l(2);

    public C9867l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9867l) {
            return this.yandex == ((C9867l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        int i = this.yandex;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        return arrayList.size() == 1 ? AbstractC15560l.subscription(arrayList.get(0), "TextDecoration.") : AbstractC15560l.Signature("TextDecoration[", AbstractC2066l.yandex(arrayList, ", ", null, 62), "]");
    }
}
