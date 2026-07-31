package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1856l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f4261l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f4262l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4263l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11780l f4264l;

    public /* synthetic */ C1856l(Function2 function2, C15578l c15578l, InterfaceC11780l interfaceC11780l) {
        this.f4262l = function2;
        this.f4261l = c15578l;
        this.f4264l = interfaceC11780l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4263l;
        InterfaceC11780l interfaceC11780l = this.f4264l;
        C15578l c15578l = this.f4261l;
        Function2 function2 = this.f4262l;
        C6956l c6956l = (C6956l) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC17122l.amazon(function2, c15578l, interfaceC11780l, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                num.getClass();
                AbstractC17122l.amazon(function2, c15578l, interfaceC11780l, c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1856l(Function2 function2, C15578l c15578l, InterfaceC11780l interfaceC11780l, int i) {
        this.f4262l = function2;
        this.f4261l = c15578l;
        this.f4264l = interfaceC11780l;
    }
}
