package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًؙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C8091l {
    public static final C1951l Companion = new C1951l();
    public static final InterfaceC16588l[] crashlytics = {null, new C0087l(C4828l.yandex, 0)};
    public final List loadAd;
    public final C7695l yandex;

    public /* synthetic */ C8091l(int i, C7695l c7695l, List list) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C5164l.yandex.purchase());
            throw null;
        }
        this.yandex = c7695l;
        this.loadAd = list;
    }

    public C8091l(C7695l c7695l, ArrayList arrayList) {
        this.yandex = c7695l;
        this.loadAd = arrayList;
    }
}
