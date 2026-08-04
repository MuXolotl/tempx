package defpackage;

/* JADX INFO: renamed from: lًۛۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8268l implements InterfaceC12703l {
    public final InterfaceC12703l yandex;

    public AbstractC8268l(InterfaceC12703l interfaceC12703l) {
        this.yandex = interfaceC12703l;
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean amazon() {
        return this.yandex.amazon();
    }

    @Override // defpackage.InterfaceC12703l
    public final boolean loadAd() {
        return this.yandex.loadAd();
    }

    @Override // defpackage.InterfaceC12703l
    public long mopub() {
        return this.yandex.mopub();
    }

    @Override // defpackage.InterfaceC12703l
    public C15528l purchase(long j) {
        return this.yandex.purchase(j);
    }
}
