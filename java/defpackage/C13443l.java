package defpackage;

/* JADX INFO: renamed from: lْ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13443l implements InterfaceC6477l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f26380l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26381l;

    public /* synthetic */ C13443l(int i, Object obj) {
        this.f26381l = i;
        this.f26380l = obj;
    }

    @Override // defpackage.InterfaceC6477l
    public final float invoke() {
        C6935l c6935lYandex;
        C6935l c6935lYandex2;
        int i = this.f26381l;
        Object obj = this.f26380l;
        switch (i) {
            case 0:
                InterfaceC3102l interfaceC3102l = ((C10809l) obj).smaato;
                if (interfaceC3102l == null || (c6935lYandex = interfaceC3102l.yandex()) == null) {
                    return 0.0f;
                }
                return c6935lYandex.amazon.admob();
            case 1:
                InterfaceC3102l interfaceC3102l2 = ((C15351l) obj).ads;
                if (interfaceC3102l2 == null || (c6935lYandex2 = interfaceC3102l2.yandex()) == null) {
                    return 0.0f;
                }
                return c6935lYandex2.amazon.admob();
            default:
                return ((Number) ((C7806l) obj).yandex.amazon()).floatValue();
        }
    }
}
