package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4489l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f9120l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f9121l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9122l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18579l f9123l;

    public /* synthetic */ C4489l(InterfaceC18579l interfaceC18579l, long j, Function2 function2, int i) {
        this.f9123l = interfaceC18579l;
        this.f9120l = j;
        this.f9121l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9122l) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3308l.billing(AbstractC0545l.purchase(1), this.f9120l, (C6956l) obj, this.f9123l, this.f9121l);
                return Unit.INSTANCE;
            default:
                C6956l c6956l = (C6956l) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && c6956l.isVip()) {
                    c6956l.m2124else();
                } else {
                    Object objM2132native = c6956l.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = C17048l.f33208l;
                        c6956l.m2147try(objM2132native);
                    }
                    Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
                    c6956l.m2125final(-683746039);
                    c6956l.m2125final(-548224868);
                    if (!(c6956l.yandex instanceof C2416l)) {
                        AbstractC8238l.amazon();
                        throw null;
                    }
                    c6956l.m2131interface();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(function0);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, new C2261l(this.f9120l), new C14813l((byte) 0, 6));
                    AbstractC8182l.billing(c6956l, this.f9123l, new C14813l((byte) 0, 7));
                    this.f9121l.invoke(c6956l, 0);
                    c6956l.startapp(true);
                    c6956l.startapp(false);
                    c6956l.startapp(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C4489l(Function2 function2, long j, InterfaceC18579l interfaceC18579l) {
        this.f9121l = function2;
        this.f9120l = j;
        this.f9123l = interfaceC18579l;
    }
}
