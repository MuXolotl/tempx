package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18492l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f36117l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C14025l f36118l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18492l(C14025l c14025l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f36117l = i;
        this.f36118l = c14025l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f36117l;
        C14025l c14025l = this.f36118l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C12382l c12382l = AbstractC5921l.f12465l;
                if (c12382l.isVip(c14025l)) {
                    c12382l.ads(c14025l);
                }
                c12382l.mopub(c14025l);
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                AbstractC5921l.f12465l.ads(c14025l);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f36117l;
        C14025l c14025l = this.f36118l;
        switch (i) {
            case 0:
                return new C18492l(c14025l, interfaceC14029l, 0);
            default:
                return new C18492l(c14025l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f36117l) {
            case 0:
                break;
        }
        return ((C18492l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
