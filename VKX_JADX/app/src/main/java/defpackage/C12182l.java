package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12182l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC15209l f24200l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18439l f24201l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24202l;

    public /* synthetic */ C12182l(C18439l c18439l, InterfaceC15209l interfaceC15209l, int i) {
        this.f24202l = i;
        this.f24201l = c18439l;
        this.f24200l = interfaceC15209l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f24202l;
        int i2 = 5;
        InterfaceC15209l interfaceC15209l = this.f24200l;
        C18439l c18439l = this.f24201l;
        switch (i) {
            case 0:
                C9319l c9319l = c18439l.billing;
                C9636l c9636l = new C9636l(8, interfaceC15209l);
                C10700l c10700l = new C10700l();
                c18439l.purchase.crashlytics("dataBuilder", c9319l, new Ctry(c10700l, c9636l, i2));
                Object obj = c10700l.f21708l;
                if (obj == null) {
                    obj = Unit.INSTANCE;
                }
                return (C2863l) obj;
            case 1:
                C9319l c9319l2 = c18439l.mopub;
                C12182l c12182l = new C12182l(c18439l, interfaceC15209l, 2);
                C10700l c10700l2 = new C10700l();
                c18439l.purchase.crashlytics("positioner", c9319l2, new Ctry(c10700l2, c12182l, i2));
                Object obj2 = c10700l2.f21708l;
                if (obj2 == null) {
                    obj2 = Unit.INSTANCE;
                }
                return (C8896l) obj2;
            default:
                Object objInvoke = c18439l.crashlytics.invoke();
                if (!((InterfaceC18212l) objInvoke).mopub()) {
                    objInvoke = null;
                }
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) objInvoke;
                return interfaceC18212l == null ? C8896l.purchase : interfaceC15209l.metrica(interfaceC18212l).vip(interfaceC18212l.mo2591strictfp(0L));
        }
    }
}
