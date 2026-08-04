package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: lَِۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11751l implements AutoCloseable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final CameraManager f23532l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C7549l f23533l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C8490l f23534l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f23535l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11969l f23536l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C4394l f23537l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C18474l f23538l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C18662l f23539l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8084l f23540l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C1008l f23541l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C7504l f23542l;

    public C11751l(InterfaceC15897l interfaceC15897l, C11969l c11969l, String str, InterfaceC7042l interfaceC7042l) {
        this.f23536l = c11969l;
        this.f23535l = str;
        this.f23532l = (CameraManager) interfaceC15897l.get();
        C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(new C2993l(interfaceC7042l), AbstractC10586l.billing(c11969l.billing, new C0499l("CXCP-CameraStatusMonitor"))));
        this.f23539l = c18662lYandex;
        this.f23538l = AbstractC1805l.yandex(false);
        C1008l c1008lYandex = AbstractC11190l.yandex(C15282l.yandex);
        this.f23541l = c1008lYandex;
        this.f23533l = AbstractC0622l.yandex(c1008lYandex);
        C8490l c8490lLoadAd = AbstractC3861l.loadAd(0, 0, 7);
        this.f23534l = c8490lLoadAd;
        InterfaceC14029l interfaceC14029l = null;
        this.f23540l = new C8084l(c8490lLoadAd, null);
        this.f23537l = AbstractC0622l.amazon(new C5163l(this, interfaceC14029l, 23));
        this.f23542l = AbstractC10999l.mopub(c18662lYandex, null, 0, new C11039l(this, interfaceC14029l, 11), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f23538l.yandex()) {
            this.f23542l.ads(null);
            AbstractC11990l.billing(this.f23539l, null);
        }
    }
}
