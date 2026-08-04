package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٔۜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15193l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0412l f29785l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ float f29786l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f29787l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f29788l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15193l(C0412l c0412l, float f, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f29787l = i;
        this.f29785l = c0412l;
        this.f29786l = f;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objLoadAd;
        Object objLoadAd2;
        int i = this.f29787l;
        C2966l c2966l = AbstractC2021l.crashlytics;
        float f = this.f29786l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C0412l c0412l = this.f29785l;
        switch (i) {
            case 0:
                int i2 = this.f29788l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l = c0412l.f1528l;
                    if (c5616l != null) {
                        Float f2 = new Float(f);
                        InterfaceC17807l interfaceC17807l = c0412l.f1533l ? c2966l : c0412l.f1531l;
                        this.f29788l = 1;
                        objLoadAd = C5616l.loadAd(c5616l, f2, interfaceC17807l, null, null, this, 12);
                        if (objLoadAd == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                objLoadAd = obj;
                return Unit.INSTANCE;
            default:
                int i3 = this.f29788l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C5616l c5616l2 = c0412l.f1530l;
                    if (c5616l2 != null) {
                        Float f3 = new Float(f);
                        InterfaceC17807l interfaceC17807l2 = c0412l.f1533l ? c2966l : c0412l.f1531l;
                        this.f29788l = 1;
                        objLoadAd2 = C5616l.loadAd(c5616l2, f3, interfaceC17807l2, null, null, this, 12);
                        if (objLoadAd2 == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i3 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                objLoadAd2 = obj;
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f29787l;
        float f = this.f29786l;
        C0412l c0412l = this.f29785l;
        switch (i) {
            case 0:
                return new C15193l(c0412l, f, interfaceC14029l, 0);
            default:
                return new C15193l(c0412l, f, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f29787l) {
            case 0:
                break;
        }
        return ((C15193l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
