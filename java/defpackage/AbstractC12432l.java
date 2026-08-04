package defpackage;

/* JADX INFO: renamed from: lؙّٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12432l implements InterfaceC4117l {
    public final AbstractC13851l yandex;

    public AbstractC12432l(AbstractC13851l abstractC13851l) {
        this.yandex = abstractC13851l;
    }

    public abstract int amazon();

    @Override // defpackage.InterfaceC4117l
    public final C4394l loadAd(C13152l c13152l) {
        return AbstractC0622l.amazon(new C5163l(this, null, 8));
    }

    public abstract boolean purchase(Object obj);

    @Override // defpackage.InterfaceC4117l
    public final boolean yandex(C7718l c7718l) {
        return crashlytics(c7718l) && purchase(this.yandex.yandex());
    }
}
