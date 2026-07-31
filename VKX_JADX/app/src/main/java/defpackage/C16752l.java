package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٖۤٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16752l implements InterfaceC1910l {
    public final InterfaceC1220l amazon = AbstractC9968l.crashlytics(2, new C7646l(4, this));
    public final Map crashlytics;
    public final C2312l loadAd;
    public final AbstractC16860l yandex;

    public C16752l(AbstractC16860l abstractC16860l, C2312l c2312l, Map map) {
        this.yandex = abstractC16860l;
        this.loadAd = c2312l;
        this.crashlytics = map;
    }

    @Override // defpackage.InterfaceC1910l
    public final Map admob() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC1910l
    public final InterfaceC5706l billing() {
        return InterfaceC5706l.f12087l;
    }

    @Override // defpackage.InterfaceC1910l
    public final C2312l mopub() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC1910l
    public final AbstractC18041l yandex() {
        return (AbstractC18041l) this.amazon.getValue();
    }
}
