package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِۙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12084l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11096l f24009l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24010l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f24011l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC13840l f24012l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12084l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, C11096l c11096l, Function2 function2) {
        super(2);
        this.f24012l = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.f24009l = c11096l;
        this.f24011l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24010l;
        Function2 function2 = this.f24011l;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f24012l;
        C11096l c11096l = this.f24009l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c6956l.m2123default(866651995);
                    AbstractC4751l.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l, c11096l.smaato, function2, c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Number) obj2).intValue();
                c11096l.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l, function2, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12084l(C11096l c11096l, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, Function2 function2, int i) {
        super(2);
        this.f24009l = c11096l;
        this.f24012l = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.f24011l = function2;
    }
}
