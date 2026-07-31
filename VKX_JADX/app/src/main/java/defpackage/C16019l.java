package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٕۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16019l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f31397l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f31398l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31399l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f31400l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f31401l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f31402l;

    public /* synthetic */ C16019l(InterfaceC17242l interfaceC17242l, long j, long j2, InterfaceC6347l interfaceC6347l, List list, int i) {
        this.f31401l = interfaceC17242l;
        this.f31398l = j;
        this.f31397l = j2;
        this.f31400l = interfaceC6347l;
        this.f31402l = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31399l;
        Object obj3 = this.f31402l;
        Object obj4 = this.f31400l;
        Object obj5 = this.f31401l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC8960l.yandex((InterfaceC17242l) obj5, this.f31398l, this.f31397l, (InterfaceC6347l) obj4, (List) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                Function2 function2 = (Function2) obj5;
                C15578l c15578l = (C15578l) obj4;
                Function2 function3 = (Function2) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 3) != 2)) {
                    AbstractC10478l.yandex(AbstractC13010l.yandex.yandex(AbstractC8644l.yandex(c6956l, 2)), AbstractC14566l.amazon(969655473, new C15022l(function2, c15578l, function3, AbstractC8644l.yandex(c6956l, 10), this.f31398l, this.f31397l), c6956l), c6956l, 56);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C16019l(Function2 function2, C15578l c15578l, Function2 function3, long j, long j2) {
        this.f31401l = function2;
        this.f31400l = c15578l;
        this.f31402l = function3;
        this.f31398l = j;
        this.f31397l = j2;
    }
}
