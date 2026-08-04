package defpackage;

/* JADX INFO: renamed from: lٖٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16191l implements InterfaceC15805l {
    public static final C16191l loadAd = new C16191l(0);
    public final /* synthetic */ int yandex;

    public /* synthetic */ C16191l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC15805l
    public final boolean loadAd(Class cls) {
        switch (this.yandex) {
            case 0:
                return AbstractC8760l.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC15805l
    public final C13673l yandex(Class cls) {
        switch (this.yandex) {
            case 0:
                if (!AbstractC8760l.class.isAssignableFrom(cls)) {
                    C8339l.metrica("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (C13673l) AbstractC8760l.crashlytics(cls.asSubclass(AbstractC8760l.class)).loadAd(3);
                } catch (Exception e) {
                    C18073l.Signature("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
