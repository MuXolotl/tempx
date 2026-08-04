package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: l٘ۢۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18291l implements InterfaceC14991l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f35782l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C7013l f35783l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6705l f35784l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C8417l f35785l;

    public AbstractC18291l(C8417l c8417l, C6705l c6705l) {
        this.f35785l = c8417l;
        this.f35784l = c6705l;
        this.f35783l = new C7013l(((C1503l) c8417l.crashlytics.f20586l).f3756l.isPro());
    }

    @Override // defpackage.InterfaceC14991l
    public long ad(C0869l c0869l, long j) {
        C8417l c8417l = this.f35785l;
        try {
            return ((C1503l) c8417l.crashlytics.f20586l).ad(c0869l, j);
        } catch (IOException e) {
            c8417l.loadAd.purchase();
            yandex(C8417l.billing);
            throw e;
        }
    }

    @Override // defpackage.InterfaceC14991l
    public final C3446l isPro() {
        return this.f35783l;
    }

    public final void yandex(C8309l c8309l) {
        C11610l c11610l;
        C13863l c13863l;
        C8417l c8417l = this.f35785l;
        int i = c8417l.amazon;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            C8936l.admob(c8417l.amazon, "state: ");
            return;
        }
        C7013l c7013l = this.f35783l;
        C3446l c3446l = c7013l.purchase;
        c7013l.purchase = C3446l.amazon;
        c3446l.yandex();
        c3446l.loadAd();
        c8417l.amazon = 6;
        if (c8309l.size() <= 0 || (c11610l = c8417l.yandex) == null || (c13863l = c11610l.isPro) == null) {
            return;
        }
        AbstractC0548l.amazon(c13863l, this.f35784l, c8309l);
    }
}
