package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؖۘؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4342l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C10712l f8863l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8864l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f8865l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C0059l f8866l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4342l(C10712l c10712l, C0059l c0059l, InterfaceC17242l interfaceC17242l, int i, int i2) {
        super(2);
        this.f8864l = i2;
        this.f8863l = c10712l;
        this.f8866l = c0059l;
        this.f8865l = interfaceC17242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8864l;
        InterfaceC17242l interfaceC17242l = this.f8865l;
        C0059l c0059l = this.f8866l;
        C10712l c10712l = this.f8863l;
        C6956l c6956l = (C6956l) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC17549l.yandex(c10712l, c0059l, interfaceC17242l, c6956l, AbstractC0545l.purchase(385));
                break;
            default:
                AbstractC17549l.yandex(c10712l, c0059l, interfaceC17242l, c6956l, AbstractC0545l.purchase(385));
                break;
        }
        return Unit.INSTANCE;
    }
}
