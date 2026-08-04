package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4865l {
    public static final C4865l metrica;
    public final Function1 admob;
    public final InterfaceC12932l amazon;
    public final int billing;
    public final InterfaceC12932l crashlytics;
    public final InterfaceC0476l firebase;
    public final Function1 isPro;
    public final InterfaceC12932l loadAd;
    public final int mopub;
    public final int purchase;
    public final int remoteconfig;
    public final int smaato;
    public final Function1 subs;
    public final C3548l vip;
    public final AbstractC5921l yandex;

    static {
        C12844l c12844l = C12844l.f25251l;
        C12382l c12382l = AbstractC5921l.f12465l;
        C16552l c16552l = AbstractC11463l.yandex;
        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
        metrica = new C4865l(c12382l, C17218l.f33421l, executorC6708l, executorC6708l, 1, 1, 1, c12844l, c12844l, c12844l, InterfaceC0476l.f1732l, 2, 1, C3548l.loadAd);
    }

    public C4865l(AbstractC5921l abstractC5921l, InterfaceC12932l interfaceC12932l, InterfaceC12932l interfaceC12932l2, InterfaceC12932l interfaceC12932l3, int i, int i2, int i3, Function1 function1, Function1 function2, Function1 function3, InterfaceC0476l interfaceC0476l, int i4, int i5, C3548l c3548l) {
        this.yandex = abstractC5921l;
        this.loadAd = interfaceC12932l;
        this.crashlytics = interfaceC12932l2;
        this.amazon = interfaceC12932l3;
        this.purchase = i;
        this.billing = i2;
        this.mopub = i3;
        this.admob = function1;
        this.subs = function2;
        this.isPro = function3;
        this.firebase = interfaceC0476l;
        this.smaato = i4;
        this.remoteconfig = i5;
        this.vip = c3548l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4865l)) {
            return false;
        }
        C4865l c4865l = (C4865l) obj;
        return AbstractC8576l.yandex(this.yandex, c4865l.yandex) && AbstractC8576l.yandex(this.loadAd, c4865l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c4865l.crashlytics) && AbstractC8576l.yandex(this.amazon, c4865l.amazon) && this.purchase == c4865l.purchase && this.billing == c4865l.billing && this.mopub == c4865l.mopub && AbstractC8576l.yandex(this.admob, c4865l.admob) && AbstractC8576l.yandex(this.subs, c4865l.subs) && AbstractC8576l.yandex(this.isPro, c4865l.isPro) && AbstractC8576l.yandex(this.firebase, c4865l.firebase) && this.smaato == c4865l.smaato && this.remoteconfig == c4865l.remoteconfig && AbstractC8576l.yandex(this.vip, c4865l.vip);
    }

    public final int hashCode() {
        return this.vip.yandex.hashCode() + AbstractC0653l.firebase(this.remoteconfig, AbstractC0653l.firebase(this.smaato, (this.firebase.hashCode() + ((this.isPro.hashCode() + ((this.subs.hashCode() + ((this.admob.hashCode() + AbstractC0653l.firebase(this.mopub, AbstractC0653l.firebase(this.billing, AbstractC0653l.firebase(this.purchase, (this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.yandex + ", interceptorCoroutineContext=" + this.loadAd + ", fetcherCoroutineContext=" + this.crashlytics + ", decoderCoroutineContext=" + this.amazon + ", memoryCachePolicy=" + AbstractC14814l.signatures(this.purchase) + ", diskCachePolicy=" + AbstractC14814l.signatures(this.billing) + ", networkCachePolicy=" + AbstractC14814l.signatures(this.mopub) + ", placeholderFactory=" + this.admob + ", errorFactory=" + this.subs + ", fallbackFactory=" + this.isPro + ", sizeResolver=" + this.firebase + ", scale=" + AbstractC0653l.ad(this.smaato) + ", precision=" + AbstractC15560l.isVip(this.remoteconfig) + ", extras=" + this.vip + ")";
    }
}
