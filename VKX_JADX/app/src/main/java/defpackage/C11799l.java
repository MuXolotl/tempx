package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِّۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11799l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f23621l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C1304l f23622l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11799l(C1304l c1304l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f23621l = i;
        this.f23622l = c1304l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f23621l;
        C1304l c1304l = this.f23622l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                c1304l.crashlytics();
                break;
            case 1:
                AbstractC2829l.crashlytics(obj);
                c1304l.amazon();
                break;
            case 2:
                AbstractC2829l.crashlytics(obj);
                c1304l.amazon();
                break;
            case 3:
                AbstractC2829l.crashlytics(obj);
                c1304l.crashlytics();
                break;
            case 4:
                AbstractC2829l.crashlytics(obj);
                c1304l.amazon();
                break;
            case 5:
                AbstractC2829l.crashlytics(obj);
                c1304l.amazon();
                break;
            case 6:
                AbstractC2829l.crashlytics(obj);
                c1304l.crashlytics();
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                c1304l.amazon();
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f23621l;
        C1304l c1304l = this.f23622l;
        switch (i) {
            case 0:
                return new C11799l(c1304l, interfaceC14029l, 0);
            case 1:
                return new C11799l(c1304l, interfaceC14029l, 1);
            case 2:
                return new C11799l(c1304l, interfaceC14029l, 2);
            case 3:
                return new C11799l(c1304l, interfaceC14029l, 3);
            case 4:
                return new C11799l(c1304l, interfaceC14029l, 4);
            case 5:
                return new C11799l(c1304l, interfaceC14029l, 5);
            case 6:
                return new C11799l(c1304l, interfaceC14029l, 6);
            default:
                return new C11799l(c1304l, interfaceC14029l, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f23621l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((C11799l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
