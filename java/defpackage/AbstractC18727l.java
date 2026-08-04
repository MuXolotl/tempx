package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lۧۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18727l implements InterfaceC10408l {
    public final InterfaceC10408l loadAd;

    public AbstractC18727l(InterfaceC10408l interfaceC10408l) {
        this.loadAd = interfaceC10408l;
    }

    @Override // defpackage.InterfaceC10408l
    public final void admob(InterfaceC2406l interfaceC2406l) {
        this.loadAd.admob(interfaceC2406l);
    }

    @Override // defpackage.InterfaceC10408l
    public ListenableFuture amazon(float f) {
        return this.loadAd.amazon(f);
    }

    @Override // defpackage.InterfaceC10408l
    public ListenableFuture billing(float f) {
        return this.loadAd.billing(f);
    }

    @Override // defpackage.InterfaceC10408l
    public final void crashlytics() {
        this.loadAd.crashlytics();
    }

    @Override // defpackage.InterfaceC10408l
    public final InterfaceC17944l firebase() {
        return this.loadAd.firebase();
    }

    @Override // defpackage.InterfaceC10408l
    public ListenableFuture isPro(boolean z) {
        return this.loadAd.isPro(z);
    }

    @Override // defpackage.InterfaceC10408l
    public final void loadAd(C16774l c16774l) {
        this.loadAd.loadAd(c16774l);
    }

    @Override // defpackage.InterfaceC10408l
    public final void mopub(int i) {
        this.loadAd.mopub(i);
    }

    @Override // defpackage.InterfaceC10408l
    public final void purchase(InterfaceC17944l interfaceC17944l) {
        this.loadAd.purchase(interfaceC17944l);
    }

    @Override // defpackage.InterfaceC10408l
    public final void remoteconfig() {
        this.loadAd.remoteconfig();
    }

    @Override // defpackage.InterfaceC10408l
    public final void smaato() {
        this.loadAd.smaato();
    }

    @Override // defpackage.InterfaceC10408l
    public ListenableFuture subs(C0093l c0093l) {
        return this.loadAd.subs(c0093l);
    }

    @Override // defpackage.InterfaceC10408l
    public final void yandex() {
        this.loadAd.yandex();
    }
}
