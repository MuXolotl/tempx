package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٖٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16411l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f32102l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C1026l f32103l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16411l(C1026l c1026l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f32102l = i;
        this.f32103l = c1026l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f32102l;
        C1026l c1026l = this.f32103l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                int i2 = C1026l.f2848l;
                C16552l c16552l = AbstractC11463l.yandex;
                AbstractC10999l.mopub(c1026l, ExecutorC6708l.f14063l, 0, new C18731l(c1026l, (InterfaceC14029l) null, 12), 2);
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                c1026l.purchase();
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f32102l;
        C1026l c1026l = this.f32103l;
        switch (i) {
            case 0:
                return new C16411l(c1026l, interfaceC14029l, 0);
            default:
                return new C16411l(c1026l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f32102l) {
            case 0:
                break;
        }
        return ((C16411l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
