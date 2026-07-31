package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕۙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15907l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31222l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f31223l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C14451l f31224l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15907l(C14451l c14451l, int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(2, interfaceC14029l);
        this.f31223l = i2;
        this.f31224l = c14451l;
        this.f31222l = i;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f31223l;
        C8692l c8692l = C8692l.loadAd;
        int i2 = this.f31222l;
        C14451l c14451l = this.f31224l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                if (c14451l.f28308l != null) {
                    c14451l.firebase(i2, c8692l);
                    c14451l.f28308l = null;
                }
                break;
            case 1:
                AbstractC2829l.crashlytics(obj);
                c14451l.firebase(i2, c8692l);
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                c14451l.firebase(i2, c8692l);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f31223l;
        int i2 = this.f31222l;
        C14451l c14451l = this.f31224l;
        switch (i) {
            case 0:
                return new C15907l(c14451l, i2, interfaceC14029l, 0);
            case 1:
                return new C15907l(c14451l, i2, interfaceC14029l, 1);
            default:
                return new C15907l(c14451l, i2, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f31223l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C15907l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
