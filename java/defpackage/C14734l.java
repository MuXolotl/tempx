package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14734l {
    public final Function0 amazon;
    public AbstractC2249l billing;
    public final long crashlytics;
    public final Object loadAd;
    public long mopub;
    public final C10086l purchase;
    public final C0010l yandex;
    public long admob = Long.MIN_VALUE;
    public final C10086l subs = AbstractC8020l.smaato(Boolean.TRUE);

    public C14734l(Object obj, C0010l c0010l, AbstractC2249l abstractC2249l, long j, Object obj2, long j2, Function0 function0) {
        this.yandex = c0010l;
        this.loadAd = obj2;
        this.crashlytics = j2;
        this.amazon = function0;
        this.purchase = AbstractC8020l.smaato(obj);
        this.billing = AbstractC4959l.amazon(abstractC2249l);
        this.mopub = j;
    }

    public final Object loadAd() {
        return this.yandex.loadAd.invoke(this.billing);
    }

    public final void yandex() {
        this.subs.setValue(Boolean.FALSE);
        this.amazon.invoke();
    }
}
