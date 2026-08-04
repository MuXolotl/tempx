package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۦۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13000l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f25473l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25474l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f25475l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f25476l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13000l(InterfaceC17242l interfaceC17242l, Function2 function2, int i, int i2) {
        super(2);
        this.f25474l = i2;
        this.f25473l = interfaceC17242l;
        this.f25475l = function2;
        this.f25476l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25474l;
        int i2 = this.f25476l;
        Function2 function2 = this.f25475l;
        InterfaceC17242l interfaceC17242l = this.f25473l;
        C6956l c6956l = (C6956l) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC0124l.billing(interfaceC17242l, function2, c6956l, AbstractC0545l.purchase(i2 | 1));
                break;
            default:
                AbstractC17863l.yandex(AbstractC0545l.purchase(i2 | 1), (C15578l) function2, c6956l, interfaceC17242l);
                break;
        }
        return Unit.INSTANCE;
    }
}
