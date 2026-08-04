package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٛۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5810l implements InterfaceC14748l {
    public long admob;
    public final Object amazon;
    public final AbstractC2249l billing;
    public final Object crashlytics;
    public final C0010l loadAd;
    public final AbstractC2249l mopub;
    public final AbstractC2249l purchase;
    public AbstractC2249l subs;
    public final InterfaceC15930l yandex;

    public C5810l(InterfaceC1489l interfaceC1489l, C0010l c0010l, Object obj, Object obj2, AbstractC2249l abstractC2249l) {
        this.yandex = interfaceC1489l.yandex(c0010l);
        this.loadAd = c0010l;
        this.crashlytics = obj2;
        this.amazon = obj;
        this.purchase = (AbstractC2249l) c0010l.yandex.invoke(obj);
        Function1 function1 = c0010l.yandex;
        this.billing = (AbstractC2249l) function1.invoke(obj2);
        this.mopub = abstractC2249l != null ? AbstractC4959l.amazon(abstractC2249l) : ((AbstractC2249l) function1.invoke(obj)).crashlytics();
        this.admob = -1L;
    }

    @Override // defpackage.InterfaceC14748l
    public final AbstractC2249l amazon(long j) {
        if (!AbstractC5020l.purchase(this, j)) {
            return this.yandex.subscription(j, this.purchase, this.billing, this.mopub);
        }
        AbstractC2249l abstractC2249l = this.subs;
        if (abstractC2249l != null) {
            return abstractC2249l;
        }
        AbstractC2249l abstractC2249lMo1830package = this.yandex.mo1830package(this.purchase, this.billing, this.mopub);
        this.subs = abstractC2249lMo1830package;
        return abstractC2249lMo1830package;
    }

    @Override // defpackage.InterfaceC14748l
    public final Object billing(long j) {
        if (AbstractC5020l.purchase(this, j)) {
            return this.crashlytics;
        }
        AbstractC2249l abstractC2249lMo1831throws = this.yandex.mo1831throws(j, this.purchase, this.billing, this.mopub);
        int iLoadAd = abstractC2249lMo1831throws.loadAd();
        for (int i = 0; i < iLoadAd; i++) {
            if (Float.isNaN(abstractC2249lMo1831throws.yandex(i))) {
                AbstractC4745l.loadAd("AnimationVector cannot contain a NaN. " + abstractC2249lMo1831throws + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.loadAd.loadAd.invoke(abstractC2249lMo1831throws);
    }

    @Override // defpackage.InterfaceC14748l
    public final C0010l crashlytics() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC14748l
    public final long loadAd() {
        if (this.admob < 0) {
            this.admob = this.yandex.mo1832volatile(this.purchase, this.billing, this.mopub);
        }
        return this.admob;
    }

    @Override // defpackage.InterfaceC14748l
    public final Object mopub() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC14748l
    public final /* synthetic */ boolean purchase(long j) {
        return AbstractC5020l.purchase(this, j);
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.amazon + " -> " + this.crashlytics + ",initial velocity: " + this.mopub + ", duration: " + (loadAd() / 1000000) + " ms,animationSpec: " + this.yandex;
    }

    @Override // defpackage.InterfaceC14748l
    public final boolean yandex() {
        return this.yandex.yandex();
    }
}
