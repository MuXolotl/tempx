package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٟٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5806l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f12210l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C16173l f12211l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5806l(C16173l c16173l, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f12210l = i;
        this.f12211l = c16173l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f12210l;
        C16173l c16173l = this.f12211l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                c16173l.signatures = false;
                break;
            case 1:
                AbstractC2829l.crashlytics(obj);
                c16173l.billing();
                break;
            case 2:
                AbstractC2829l.crashlytics(obj);
                c16173l.amazon(c16173l.signatures);
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                c16173l.startapp();
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f12210l;
        C16173l c16173l = this.f12211l;
        switch (i) {
            case 0:
                return new C5806l(c16173l, interfaceC14029l, 0);
            case 1:
                return new C5806l(c16173l, interfaceC14029l, 1);
            case 2:
                return new C5806l(c16173l, interfaceC14029l, 2);
            default:
                return new C5806l(c16173l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f12210l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C5806l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }
}
