package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7215l {
    public final C7215l[] amazon;
    public final ArrayList crashlytics;
    public final List loadAd;
    public final char yandex;

    /* JADX WARN: Multi-variable type inference failed */
    public C7215l(char c, List list, ArrayList arrayList) {
        this.yandex = c;
        this.loadAd = list;
        this.crashlytics = arrayList;
        C7215l[] c7215lArr = new C7215l[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i = 0; i < 256; i++) {
            Iterator it = this.crashlytics.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                } else {
                    Object next = it.next();
                    if (((C7215l) next).yandex == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                }
            }
            c7215lArr[i] = obj;
        }
        this.amazon = c7215lArr;
    }
}
