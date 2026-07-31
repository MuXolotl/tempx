package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2655l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f5755l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f5756l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f5757l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2655l(InterfaceC8714l interfaceC8714l, InterfaceC8714l interfaceC8714l2, int i) {
        super(1);
        this.f5756l = i;
        this.f5755l = interfaceC8714l;
        this.f5757l = interfaceC8714l2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f5756l;
        InterfaceC8714l interfaceC8714l = this.f5757l;
        InterfaceC8714l interfaceC8714l2 = this.f5755l;
        switch (i) {
            case 0:
                interfaceC8714l2.setValue(C12818l.yandex((C12818l) interfaceC8714l2.getValue(), 0.0f, 0.0f, 0.0f, ((Number) obj).floatValue(), 7));
                ((Function1) interfaceC8714l.getValue()).invoke(interfaceC8714l2.getValue());
                break;
            case 1:
                interfaceC8714l2.setValue(C12818l.yandex((C12818l) interfaceC8714l2.getValue(), ((Number) obj).floatValue(), 0.0f, 0.0f, 0.0f, 14));
                ((Function1) interfaceC8714l.getValue()).invoke(interfaceC8714l2.getValue());
                break;
            default:
                InterfaceC18212l interfaceC18212l = (InterfaceC18212l) obj;
                interfaceC8714l2.setValue(new C1187l(interfaceC18212l.mo2591strictfp(0L)));
                interfaceC8714l.setValue(new C4999l(interfaceC18212l.smaato()));
                break;
        }
        return Unit.INSTANCE;
    }
}
