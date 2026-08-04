package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؘِؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11558l implements InterfaceC1837l {
    public final /* synthetic */ InterfaceC0048l amazon;
    public final /* synthetic */ C5464l billing;
    public final /* synthetic */ String crashlytics;
    public final /* synthetic */ String loadAd;
    public final /* synthetic */ C5464l purchase;
    public final /* synthetic */ C10245l yandex;

    public /* synthetic */ C11558l(C10245l c10245l, String str, String str2, InterfaceC0048l interfaceC0048l, C5464l c5464l, C5464l c5464l2) {
        this.yandex = c10245l;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = interfaceC0048l;
        this.purchase = c5464l;
        this.billing = c5464l2;
    }

    @Override // defpackage.InterfaceC1837l
    public final void yandex(C10814l c10814l) {
        C10245l c10245l = this.yandex;
        if (c10245l.amazon() == null) {
            return;
        }
        c10245l.m2906synchronized();
        c10245l.m2081throws(c10245l.m2905strictfp(this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing));
        c10245l.adcel();
        C2091l c2091l = c10245l.tapsense;
        c2091l.getClass();
        AbstractC12225l.crashlytics();
        Iterator it = c2091l.f4686l.iterator();
        while (it.hasNext()) {
            c2091l.crashlytics((AbstractC6896l) it.next());
        }
    }
}
