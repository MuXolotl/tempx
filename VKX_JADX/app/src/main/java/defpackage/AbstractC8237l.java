package defpackage;

/* JADX INFO: renamed from: lًۙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8237l {
    public static final C15913l amazon = new C15913l(new C17752l(false, false, false, false, true, "    ", false, "type", false, true, 3, true), AbstractC10651l.yandex);
    public final C3585l crashlytics = new C3585l(11);
    public final C13975l loadAd;
    public final C17752l yandex;

    public AbstractC8237l(C17752l c17752l, C13975l c13975l) {
        this.yandex = c17752l;
        this.loadAd = c13975l;
    }

    public final String crashlytics(InterfaceC16588l interfaceC16588l, Object obj) {
        C14785l c14785l = new C14785l((char) 0, 10);
        c14785l.f28907l = C11962l.crashlytics.amazon(128);
        try {
            AbstractC10802l.crashlytics(this, c14785l, interfaceC16588l, obj);
            return c14785l.toString();
        } finally {
            C11962l.crashlytics.loadAd((char[]) c14785l.f28907l);
        }
    }

    public final Object loadAd(InterfaceC16588l interfaceC16588l, String str) {
        C4163l c4163lYandex = AbstractC1789l.yandex(this, str);
        Object objMopub = new C6125l(this, EnumC4737l.OBJ, c4163lYandex, interfaceC16588l.purchase(), null).mopub(interfaceC16588l);
        c4163lYandex.ads();
        return objMopub;
    }

    public final Object yandex(InterfaceC16588l interfaceC16588l, AbstractC9914l abstractC9914l) {
        InterfaceC10726l c4263l;
        String str = null;
        if (abstractC9914l instanceof C18010l) {
            c4263l = new C0065l(this, (C18010l) abstractC9914l, str, 12);
        } else if (abstractC9914l instanceof C18427l) {
            c4263l = new C3696l(this, (C18427l) abstractC9914l);
        } else {
            if (!(abstractC9914l instanceof C16192l) && !abstractC9914l.equals(C5544l.INSTANCE)) {
                C18725l.billing();
                return null;
            }
            c4263l = new C4263l(this, (AbstractC18121l) abstractC9914l, null);
        }
        return c4263l.mopub(interfaceC16588l);
    }
}
