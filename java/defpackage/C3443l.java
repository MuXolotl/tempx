package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3443l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f7317l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f7318l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f7319l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C12818l f7320l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3443l(InterfaceC17242l interfaceC17242l, C12818l c12818l, Function1 function1, int i, int i2) {
        super(2);
        this.f7318l = i2;
        this.f7317l = interfaceC17242l;
        this.f7320l = c12818l;
        this.f7319l = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7318l;
        C6956l c6956l = (C6956l) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC1295l.yandex(this.f7317l, this.f7320l, this.f7319l, c6956l, 7);
                break;
            default:
                AbstractC15269l.yandex(this.f7317l, this.f7320l, this.f7319l, c6956l, 7);
                break;
        }
        return Unit.INSTANCE;
    }
}
