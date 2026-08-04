package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًُۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7934l {
    public final InterfaceC0476l admob;
    public final int amazon;
    public final Function1 billing;
    public final InterfaceC12932l crashlytics;
    public final int isPro;
    public final InterfaceC12932l loadAd;
    public final Function1 mopub;
    public final Function1 purchase;
    public final int subs;
    public final InterfaceC12932l yandex;

    public C7934l(InterfaceC12932l interfaceC12932l, InterfaceC12932l interfaceC12932l2, InterfaceC12932l interfaceC12932l3, int i, Function1 function1, Function1 function2, Function1 function3, InterfaceC0476l interfaceC0476l, int i2, int i3) {
        this.yandex = interfaceC12932l;
        this.loadAd = interfaceC12932l2;
        this.crashlytics = interfaceC12932l3;
        this.amazon = i;
        this.purchase = function1;
        this.billing = function2;
        this.mopub = function3;
        this.admob = interfaceC0476l;
        this.subs = i2;
        this.isPro = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7934l)) {
            return false;
        }
        C7934l c7934l = (C7934l) obj;
        return AbstractC8576l.yandex(this.yandex, c7934l.yandex) && AbstractC8576l.yandex(this.loadAd, c7934l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c7934l.crashlytics) && this.amazon == c7934l.amazon && AbstractC8576l.yandex(this.purchase, c7934l.purchase) && AbstractC8576l.yandex(this.billing, c7934l.billing) && AbstractC8576l.yandex(this.mopub, c7934l.mopub) && AbstractC8576l.yandex(this.admob, c7934l.admob) && this.subs == c7934l.subs && this.isPro == c7934l.isPro;
    }

    public final int hashCode() {
        InterfaceC12932l interfaceC12932l = this.yandex;
        int iHashCode = (interfaceC12932l == null ? 0 : interfaceC12932l.hashCode()) * 31;
        InterfaceC12932l interfaceC12932l2 = this.loadAd;
        int iHashCode2 = (iHashCode + (interfaceC12932l2 == null ? 0 : interfaceC12932l2.hashCode())) * 31;
        InterfaceC12932l interfaceC12932l3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (interfaceC12932l3 == null ? 0 : interfaceC12932l3.hashCode())) * 31;
        int i = this.amazon;
        int iInmobi = (iHashCode3 + (i == 0 ? 0 : AbstractC5020l.inmobi(i))) * 29791;
        Function1 function1 = this.purchase;
        int iHashCode4 = (iInmobi + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function2 = this.billing;
        int iHashCode5 = (iHashCode4 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function1 function3 = this.mopub;
        int iHashCode6 = (iHashCode5 + (function3 == null ? 0 : function3.hashCode())) * 31;
        InterfaceC0476l interfaceC0476l = this.admob;
        int iHashCode7 = (iHashCode6 + (interfaceC0476l == null ? 0 : interfaceC0476l.hashCode())) * 31;
        int i2 = this.subs;
        int iInmobi2 = (iHashCode7 + (i2 == 0 ? 0 : AbstractC5020l.inmobi(i2))) * 31;
        int i3 = this.isPro;
        return iInmobi2 + (i3 != 0 ? AbstractC5020l.inmobi(i3) : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.yandex + ", fetcherCoroutineContext=" + this.loadAd + ", decoderCoroutineContext=" + this.crashlytics + ", memoryCachePolicy=" + AbstractC14814l.signatures(this.amazon) + ", diskCachePolicy=" + AbstractC14814l.signatures(0) + ", networkCachePolicy=" + AbstractC14814l.signatures(0) + ", placeholderFactory=" + this.purchase + ", errorFactory=" + this.billing + ", fallbackFactory=" + this.mopub + ", sizeResolver=" + this.admob + ", scale=" + AbstractC0653l.ad(this.subs) + ", precision=" + AbstractC15560l.isVip(this.isPro) + ")";
    }
}
