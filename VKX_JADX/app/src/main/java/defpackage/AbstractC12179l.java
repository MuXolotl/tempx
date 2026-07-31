package defpackage;

import androidx.car.app.isPro;
import androidx.car.app.subs;

/* JADX INFO: renamed from: lِّۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12179l implements InterfaceC3177l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final subs f24197l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5268l f24198l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5268l f24199l;

    public AbstractC12179l() {
        C4437l c4437l = new C4437l(4, this);
        C5268l c5268l = new C5268l(this, true);
        this.f24199l = c5268l;
        this.f24198l = new C5268l(this, true);
        c5268l.yandex(c4437l);
        this.f24197l = new subs(c5268l, new isPro());
    }

    public final void crashlytics(EnumC14812l enumC14812l) {
        this.f24199l.purchase(enumC14812l);
    }

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return this.f24198l;
    }
}
