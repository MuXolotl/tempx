package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lَؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10115l extends AbstractC16178l {
    public static final C3813l amazon;
    public static final C8397l crashlytics = new C8397l();
    public static final C3813l purchase;

    static {
        C3813l c3813l = new C3813l(0);
        c3813l.billing.put("URI", new C13728l(c3813l, 11));
        amazon = c3813l;
        C3813l c3813l2 = new C3813l(1);
        C13728l c13728l = new C13728l(c3813l2, 12);
        HashMap map = c3813l2.billing;
        map.put("AUDIO", c13728l);
        map.put("SUBTITLES", new C13728l(c3813l2, 13));
        map.put("CLOSED-CAPTIONS", new C13728l(c3813l2, 14));
        purchase = c3813l2;
    }

    public abstract void purchase(C7972l c7972l, C15019l c15019l);

    @Override // defpackage.AbstractC16178l, defpackage.InterfaceC7922l
    public final void yandex(C7972l c7972l, C2434l c2434l) {
        if (c2434l.yandex()) {
            purchase(c7972l, c2434l.yandex);
        }
    }
}
