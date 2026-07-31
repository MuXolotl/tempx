package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٟٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17315l implements Cloneable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC8760l f33585l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC8760l f33586l;

    public AbstractC17315l(AbstractC8760l abstractC8760l) {
        this.f33586l = abstractC8760l;
        if (abstractC8760l.billing()) {
            C8339l.metrica("Default instance must be immutable.");
            throw null;
        }
        this.f33585l = abstractC8760l.subs();
    }

    public static void amazon(int i, List list) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    public final Object clone() {
        AbstractC17315l abstractC17315l = (AbstractC17315l) this.f33586l.loadAd(5);
        abstractC17315l.f33585l = loadAd();
        return abstractC17315l;
    }

    public final void crashlytics() {
        if (this.f33585l.billing()) {
            return;
        }
        AbstractC8760l abstractC8760lSubs = this.f33586l.subs();
        AbstractC8760l abstractC8760l = this.f33585l;
        C16946l c16946l = C16946l.crashlytics;
        c16946l.getClass();
        c16946l.yandex(abstractC8760lSubs.getClass()).yandex(abstractC8760lSubs, abstractC8760l);
        this.f33585l = abstractC8760lSubs;
    }

    public final AbstractC8760l loadAd() {
        boolean zBilling = this.f33585l.billing();
        AbstractC8760l abstractC8760l = this.f33585l;
        if (!zBilling) {
            return abstractC8760l;
        }
        abstractC8760l.mopub();
        return this.f33585l;
    }

    public final AbstractC8760l yandex() {
        AbstractC8760l abstractC8760lLoadAd = loadAd();
        abstractC8760lLoadAd.getClass();
        if (AbstractC8760l.purchase(abstractC8760lLoadAd, true)) {
            return abstractC8760lLoadAd;
        }
        throw new C9599l();
    }
}
