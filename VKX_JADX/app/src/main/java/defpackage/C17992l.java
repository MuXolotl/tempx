package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘٘۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17992l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f35180l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10056l f35181l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35182l;

    public /* synthetic */ C17992l(C10056l c10056l, InterfaceC17242l interfaceC17242l, int i, int i2) {
        this.f35182l = i2;
        this.f35181l = c10056l;
        this.f35180l = interfaceC17242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f35182l;
        InterfaceC17242l interfaceC17242l = this.f35180l;
        C10056l c10056l = this.f35181l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c10056l.m2874public(interfaceC17242l, c6956l, AbstractC0545l.purchase(1));
                break;
            case 1:
                c10056l.m2869abstract(interfaceC17242l, c6956l, AbstractC0545l.purchase(1));
                break;
            case 2:
                c10056l.m2875this(interfaceC17242l, c6956l, AbstractC0545l.purchase(1));
                break;
            default:
                c10056l.m2872import(interfaceC17242l, c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
