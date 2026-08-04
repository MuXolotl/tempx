package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔ۟ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2941l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C13177l f6404l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C7819l f6405l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f6406l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f6407l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2941l(C13177l c13177l, C7819l c7819l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f6406l = i;
        this.f6404l = c13177l;
        this.f6405l = c7819l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f6406l;
        C7819l c7819l = this.f6405l;
        C13177l c13177l = this.f6404l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f6407l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f6407l = 1;
                    Object objCrashlytics = c13177l.crashlytics(c7819l, this);
                    return objCrashlytics == enumC9342l ? enumC9342l : objCrashlytics;
                }
                if (i2 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    return obj;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.f6407l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                this.f6407l = 1;
                int i4 = C13177l.billing;
                Object objLoadAd = c13177l.loadAd(c7819l, 0, this);
                return objLoadAd == enumC9342l ? enumC9342l : objLoadAd;
            default:
                int i5 = this.f6407l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                this.f6407l = 1;
                int i6 = C13177l.billing;
                Object objLoadAd2 = c13177l.loadAd(c7819l, 1, this);
                return objLoadAd2 == enumC9342l ? enumC9342l : objLoadAd2;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f6406l;
        C7819l c7819l = this.f6405l;
        C13177l c13177l = this.f6404l;
        switch (i) {
            case 0:
                return new C2941l(c13177l, c7819l, interfaceC14029l, 0);
            case 1:
                return new C2941l(c13177l, c7819l, interfaceC14029l, 1);
            default:
                return new C2941l(c13177l, c7819l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f6406l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C2941l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
