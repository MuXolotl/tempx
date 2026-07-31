package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؕۤٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3751l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7832l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C12362l f7833l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3751l(C12362l c12362l, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f7832l = i;
        this.f7833l = c12362l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f7832l;
        C12362l c12362l = this.f7833l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                RunnableC5360l runnableC5360l = c12362l.crashlytics;
                if (runnableC5360l != null) {
                    c12362l.yandex.removeCallbacks(runnableC5360l);
                }
                c12362l.crashlytics = null;
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                RunnableC5360l runnableC5360l2 = c12362l.crashlytics;
                if (runnableC5360l2 != null) {
                    c12362l.yandex.removeCallbacks(runnableC5360l2);
                }
                c12362l.crashlytics = null;
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (this.f7832l) {
            case 0:
                return new C3751l(this.f7833l, interfaceC14029l, 0).Signature(Unit.INSTANCE);
            default:
                return new C3751l(this.f7833l, interfaceC14029l, 1).Signature(Unit.INSTANCE);
        }
    }
}
