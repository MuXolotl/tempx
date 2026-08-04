package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lَۜۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10589l implements InterfaceC13390l {
    public final InterfaceC11865l loadAd;
    public final C16412l yandex;

    public C10589l(C16412l c16412l, C10202l c10202l) {
        this.yandex = c16412l;
        this.loadAd = c10202l;
    }

    @Override // defpackage.InterfaceC13390l
    public final boolean crashlytics(C2312l c2312l, C3498l c3498l) {
        String strLoadAd = c3498l.loadAd();
        return (AbstractC16648l.isVip(strLoadAd, "Function", false) || AbstractC16648l.isVip(strLoadAd, "KFunction", false) || AbstractC16648l.isVip(strLoadAd, "SuspendFunction", false) || AbstractC16648l.isVip(strLoadAd, "KSuspendFunction", false)) && C1578l.loadAd.yandex(c2312l, strLoadAd) != null;
    }

    @Override // defpackage.InterfaceC13390l
    public final Collection loadAd(C2312l c2312l) {
        return C5746l.f12138l;
    }

    @Override // defpackage.InterfaceC13390l
    public final InterfaceC17477l yandex(C3624l c3624l) {
        C2312l c2312l;
        C2473l c2473lYandex;
        if (!c3624l.crashlytics && !c3624l.mopub()) {
            String str = c3624l.loadAd.yandex.yandex;
            if (AbstractC12024l.appmetrica(str, "Function", false) && (c2473lYandex = C1578l.loadAd.yandex((c2312l = c3624l.yandex), str)) != null) {
                AbstractC1514l abstractC1514l = c2473lYandex.yandex;
                int i = c2473lYandex.loadAd;
                C2278l c2278l = this.loadAd.mo2270l(c2312l).f21350l;
                InterfaceC13922l interfaceC13922l = C10486l.f21345l[0];
                List list = (List) c2278l.invoke();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof C8913l) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (AbstractC16901l.m4217extends(arrayList2) == null) {
                    return new C11012l(this.yandex, (C8913l) AbstractC16901l.m4231native(arrayList), abstractC1514l, i);
                }
                C18725l.loadAd();
            }
        }
        return null;
    }
}
