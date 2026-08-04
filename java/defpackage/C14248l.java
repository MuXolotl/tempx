package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lۣٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14248l {
    public static final List loadAd = AbstractC14055l.remoteconfig(new C14248l(1), new C14248l(2), new C14248l(4));
    public final int yandex;

    public /* synthetic */ C14248l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14248l) {
            return this.yandex == ((C14248l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        int i = this.yandex;
        if (i == 1) {
            return "CR";
        }
        if (i == 2) {
            return "LF";
        }
        if (i == 4) {
            return "CRLF";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : loadAd) {
            if ((((C14248l) obj).yandex | i) == i) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }
}
