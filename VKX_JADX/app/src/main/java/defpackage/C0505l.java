package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0505l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C14358l f1819l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f1820l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f1821l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0505l(C14358l c14358l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f1820l = i;
        this.f1819l = c14358l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f1820l;
        C14358l c14358l = this.f1819l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f1821l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C6267l c6267lSmaato = C14358l.smaato(c14358l);
                this.f1821l = 1;
                Object objAmazon = c6267lSmaato.amazon(this);
                return objAmazon == enumC9342l ? enumC9342l : objAmazon;
            case 1:
                int i3 = this.f1821l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC1142l interfaceC1142lFirebase = C14358l.smaato(c14358l).firebase();
                this.f1821l = 1;
                Object objFirebase = ((C9426l) interfaceC1142lFirebase).firebase(this);
                return objFirebase == enumC9342l ? enumC9342l : objFirebase;
            default:
                int i4 = this.f1821l;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC1142l interfaceC1142lLoadAd = C14358l.smaato(c14358l).loadAd();
                this.f1821l = 1;
                Object objFirebase2 = ((C9426l) interfaceC1142lLoadAd).firebase(this);
                return objFirebase2 == enumC9342l ? enumC9342l : objFirebase2;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f1820l;
        C14358l c14358l = this.f1819l;
        switch (i) {
            case 0:
                return new C0505l(c14358l, interfaceC14029l, 0);
            case 1:
                return new C0505l(c14358l, interfaceC14029l, 1);
            default:
                return new C0505l(c14358l, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f1820l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0505l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
