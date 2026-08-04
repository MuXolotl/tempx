package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lِٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11873l {
    public final C4622l loadAd;
    public final C6264l yandex;

    public C11873l(C18666l c18666l, AbstractC14183l abstractC14183l) {
        this.yandex = c18666l.amazon;
        List listIsPro = C18666l.isPro(4, c18666l);
        this.loadAd = new C4622l(listIsPro.size());
        int size = listIsPro.size();
        for (int i = 0; i < size; i++) {
            C18666l c18666l2 = (C18666l) listIsPro.get(i);
            if (abstractC14183l.yandex(c18666l2.billing)) {
                this.loadAd.yandex(c18666l2.billing);
            }
        }
    }
}
