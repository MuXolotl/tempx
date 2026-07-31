package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؘۙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5928l implements InterfaceC8979l {
    public final C15637l loadAd;
    public final C15637l yandex;
    public final C6120l crashlytics = new C6120l();
    public final AtomicReference amazon = new AtomicReference(EnumC8530l.f17622l);

    public C5928l(C15637l c15637l) {
        this.yandex = c15637l;
        this.loadAd = c15637l;
    }

    public final InterfaceC8979l admob() {
        return this.amazon.get() == EnumC8530l.f17620l ? this.crashlytics : this.loadAd;
    }

    @Override // defpackage.InterfaceC8979l
    public final int billing(InterfaceC5802l interfaceC5802l, int i, boolean z) {
        return admob().billing(interfaceC5802l, i, z);
    }

    @Override // defpackage.InterfaceC8979l
    public final int crashlytics(InterfaceC5802l interfaceC5802l, int i, boolean z) {
        return admob().crashlytics(interfaceC5802l, i, z);
    }

    @Override // defpackage.InterfaceC8979l
    public final void loadAd(C13143l c13143l, int i, int i2) {
        admob().loadAd(c13143l, i, i2);
    }

    @Override // defpackage.InterfaceC8979l
    public final void mopub(C5978l c5978l) {
        this.yandex.mopub(c5978l);
    }

    @Override // defpackage.InterfaceC8979l
    public final void purchase(int i, C13143l c13143l) {
        admob().purchase(i, c13143l);
    }

    @Override // defpackage.InterfaceC8979l
    public final void yandex(long j, int i, int i2, int i3, C0472l c0472l) {
        admob().yandex(j, i, i2, i3, c0472l);
        AtomicReference atomicReference = this.amazon;
        if (atomicReference.get() == EnumC8530l.f17621l) {
            this.loadAd.premium(false);
            atomicReference.set(EnumC8530l.f17620l);
        }
    }

    @Override // defpackage.InterfaceC8979l
    public final void amazon(long j) {
    }
}
