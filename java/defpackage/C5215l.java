package defpackage;

/* JADX INFO: renamed from: lؗۡۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5215l implements InterfaceC11175l {
    public final C13231l crashlytics = C13231l.purchase;
    public final C14450l amazon = new C14450l(C14450l.amazon);

    public final boolean loadAd(AbstractC18041l abstractC18041l, AbstractC18041l abstractC18041l2) {
        C5425l c5425lYandex = AbstractC16131l.yandex(true, null, this.crashlytics, 6);
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        AbstractC14318l abstractC14318lMo3847class2 = abstractC18041l2.mo3847class();
        if (abstractC14318lMo3847class == abstractC14318lMo3847class2) {
            return true;
        }
        return C6168l.f12998l.firebase(c5425lYandex, c5425lYandex.crashlytics, abstractC14318lMo3847class, abstractC14318lMo3847class2);
    }

    public final boolean yandex(AbstractC18041l abstractC18041l, AbstractC18041l abstractC18041l2) {
        return C6168l.vip(AbstractC16131l.yandex(false, null, this.crashlytics, 6), abstractC18041l.mo3847class(), abstractC18041l2.mo3847class());
    }
}
