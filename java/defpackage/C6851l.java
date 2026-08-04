package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؙۣۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6851l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C6851l(int i) {
        this.yandex = i;
    }

    public final void yandex(C11421l c11421l, Iterator it, C16979l c16979l) {
        switch (this.yandex) {
            case 0:
                break;
            default:
                if (!c11421l.crashlytics) {
                    C8339l.smaato("non repeating key");
                } else if (c11421l.amazon && ((C11321l) C11321l.f22814l.get()).f22815l > 20) {
                    while (it.hasNext()) {
                        c16979l.yandex(it.next(), c11421l.yandex);
                    }
                } else {
                    c11421l.yandex(it, c16979l);
                }
                break;
        }
    }

    private final void loadAd(C11421l c11421l, Iterator it, C16979l c16979l) {
    }
}
