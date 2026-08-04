package defpackage;

/* JADX INFO: renamed from: lٔۙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15133l implements InterfaceC4282l {
    public static final C15133l loadAd = new C15133l(0);
    public final /* synthetic */ int yandex;

    public /* synthetic */ C15133l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC4282l
    public final boolean loadAd(Class cls) {
        switch (this.yandex) {
            case 0:
                return AbstractC13399l.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC4282l
    public final C1861l yandex(Class cls) {
        switch (this.yandex) {
            case 0:
                if (!AbstractC13399l.class.isAssignableFrom(cls)) {
                    C8339l.metrica("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (C1861l) AbstractC13399l.isPro(cls.asSubclass(AbstractC13399l.class)).subs(3);
                } catch (Exception e) {
                    C18073l.Signature("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
