package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11834l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f23665l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23666l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f23667l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f23668l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11834l(C11096l c11096l, C8447l c8447l, Function2 function2) {
        super(2);
        this.f23666l = 4;
        this.f23665l = c11096l;
        this.f23668l = c8447l;
        this.f23667l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f23666l;
        InterfaceC14328l interfaceC14328l = this.f23667l;
        Object obj3 = this.f23668l;
        Object obj4 = this.f23665l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0124l.yandex((Function0) obj4, (C9401l) obj3, (C15578l) interfaceC14328l, (C6956l) obj, AbstractC0545l.purchase(385));
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC11397l.yandex((Function1) obj4, (InterfaceC17242l) obj3, (Function1) interfaceC14328l, (C6956l) obj, AbstractC0545l.purchase(55));
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC4751l.yandex((InterfaceC11218l) obj4, (C18196l) obj3, (Function2) interfaceC14328l, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 3:
                ((Number) obj2).intValue();
                AbstractC2219l.yandex((InterfaceC17242l) obj4, (C12818l) obj3, (Function2) interfaceC14328l, (C6956l) obj, 1);
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((C11096l) obj4).yandex(((C8447l) obj3).f17452l, (Function2) interfaceC14328l, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11834l(Object obj, Object obj2, InterfaceC14328l interfaceC14328l, int i, int i2) {
        super(2);
        this.f23666l = i2;
        this.f23665l = obj;
        this.f23668l = obj2;
        this.f23667l = interfaceC14328l;
    }
}
