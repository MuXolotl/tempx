package defpackage;

import androidx.recyclerview.widget.subs;

/* JADX INFO: renamed from: lٖٟؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16150l {
    public final C13170l amazon;
    public final C13159l billing;
    public final subs crashlytics;
    public final C6565l loadAd;
    public int purchase;
    public final InterfaceC13081l yandex;

    public C16150l(subs subsVar, C13170l c13170l, InterfaceC9432l interfaceC9432l, C6565l c6565l) {
        C13159l c13159l = new C13159l(this);
        this.billing = c13159l;
        this.crashlytics = subsVar;
        this.amazon = c13170l;
        this.yandex = interfaceC9432l.billing(this);
        this.loadAd = c6565l;
        this.purchase = subsVar.mopub();
        subsVar.f465l.registerObserver(c13159l);
    }
}
