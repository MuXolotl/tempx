package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٍؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9266l extends AbstractC7532l {
    @Override // defpackage.AbstractC7532l
    public final void billing(C1080l c1080l, Object obj) {
        C8222l c8222l = (C8222l) obj;
        c1080l.m788class(c8222l.yandex());
        C6555l.f13685l.yandex().subs(c1080l, 1, c8222l.f17121l);
    }

    @Override // defpackage.AbstractC7532l
    public final Object crashlytics(C7084l c7084l) {
        ArrayList arrayList = new ArrayList();
        long jAmazon = c7084l.amazon();
        while (true) {
            int iMopub = c7084l.mopub();
            if (iMopub == -1) {
                return new C8222l(arrayList, c7084l.purchase(jAmazon));
            }
            if (iMopub == 1) {
                arrayList.add(C6555l.f13685l.crashlytics(c7084l));
            } else {
                c7084l.remoteconfig(iMopub);
            }
        }
    }

    @Override // defpackage.AbstractC7532l
    public final int isPro(Object obj) {
        C8222l c8222l = (C8222l) obj;
        return C6555l.f13685l.yandex().firebase(1, c8222l.f17121l) + c8222l.yandex().purchase();
    }

    @Override // defpackage.AbstractC7532l
    public final void purchase(C13161l c13161l, Object obj) {
        C8222l c8222l = (C8222l) obj;
        C6555l.f13685l.yandex().admob(c13161l, 1, c8222l.f17121l);
        c13161l.m3586switch(c8222l.yandex());
    }
}
