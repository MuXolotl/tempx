package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lًِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12544l implements InterfaceC3841l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f24715l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC7760l f24716l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10038l f24717l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C18028l f24718l;

    public C12544l(C10038l c10038l, InterfaceC7760l interfaceC7760l, boolean z) {
        this.f24717l = c10038l;
        this.f24716l = interfaceC7760l;
        this.f24715l = z;
        this.f24718l = ((C7757l) c10038l.f20463l).yandex.crashlytics(new C6238l(21, this));
    }

    @Override // defpackage.InterfaceC3841l
    public final boolean isEmpty() {
        return this.f24716l.getAnnotations().isEmpty();
    }

    @Override // defpackage.InterfaceC3841l
    public final boolean isPro(C2312l c2312l) {
        return loadAd(c2312l) != null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C8767l c8767l;
        InterfaceC7760l interfaceC7760l = this.f24716l;
        C11100l c11100l = new C11100l(new C17798l(1, interfaceC7760l.getAnnotations()), this.f24718l);
        C3498l c3498l = AbstractC7012l.yandex;
        int i = 0;
        InterfaceC11075l interfaceC11075lAds = AbstractC8669l.ads(new InterfaceC11075l[]{c11100l, new C17798l(5, AbstractC7012l.yandex(AbstractC3333l.remoteconfig, interfaceC7760l, this.f24717l))});
        C10557l c10557l = new C10557l(27);
        if (interfaceC11075lAds instanceof C11100l) {
            C11100l c11100l2 = (C11100l) interfaceC11075lAds;
            c8767l = new C8767l(c11100l2.yandex, c11100l2.loadAd, c10557l);
        } else {
            c8767l = new C8767l(interfaceC11075lAds, new C10557l(28), c10557l);
        }
        return new C12588l(AbstractC17587l.smaato(c8767l, new C1698l(i)));
    }

    @Override // defpackage.InterfaceC3841l
    public final InterfaceC1910l loadAd(C2312l c2312l) {
        InterfaceC1910l interfaceC1910l;
        InterfaceC7760l interfaceC7760l = this.f24716l;
        C8673l c8673lLoadAd = interfaceC7760l.loadAd(c2312l);
        if (c8673lLoadAd != null && (interfaceC1910l = (InterfaceC1910l) this.f24718l.invoke(c8673lLoadAd)) != null) {
            return interfaceC1910l;
        }
        C3498l c3498l = AbstractC7012l.yandex;
        return AbstractC7012l.yandex(c2312l, interfaceC7760l, this.f24717l);
    }
}
