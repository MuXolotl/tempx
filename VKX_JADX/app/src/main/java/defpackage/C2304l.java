package defpackage;

/* JADX INFO: renamed from: lؔؐؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2304l implements InterfaceC3858l {
    public static final C2304l loadAd = new C2304l(0);
    public final /* synthetic */ int yandex;

    public /* synthetic */ C2304l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC3858l
    public final boolean loadAd(Class cls) {
        switch (this.yandex) {
            case 0:
                return AbstractC12946l.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC3858l
    public final C15293l yandex(Class cls) {
        switch (this.yandex) {
            case 0:
                if (!AbstractC12946l.class.isAssignableFrom(cls)) {
                    C8339l.metrica("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (C15293l) AbstractC12946l.purchase(cls.asSubclass(AbstractC12946l.class)).amazon(3);
                } catch (Exception e) {
                    C18073l.Signature("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
