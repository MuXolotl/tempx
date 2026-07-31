package defpackage;

/* JADX INFO: renamed from: lؘٚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5797l extends AbstractC16808l {
    public final C4322l billing;

    public C5797l(AbstractC10759l abstractC10759l) {
        super(abstractC10759l);
        this.billing = new C4322l();
    }

    @Override // defpackage.AbstractC16808l, defpackage.AbstractC10759l
    public final C3904l billing(int i, C3904l c3904l, boolean z) {
        AbstractC10759l abstractC10759l = this.purchase;
        C3904l c3904lBilling = abstractC10759l.billing(i, c3904l, z);
        if (abstractC10759l.remoteconfig(c3904lBilling.crashlytics, this.billing, 0L).yandex()) {
            c3904lBilling.subs(c3904l.yandex, c3904l.loadAd, c3904l.crashlytics, c3904l.amazon, c3904l.purchase, C12869l.billing, true);
            return c3904lBilling;
        }
        c3904lBilling.billing = true;
        return c3904lBilling;
    }
}
