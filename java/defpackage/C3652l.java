package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘؕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3652l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C9649l f7645l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ long f7646l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7647l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7648l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3652l(C9649l c9649l, long j, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f7647l = i;
        this.f7645l = c9649l;
        this.f7646l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f7647l;
        C9649l c9649l = this.f7645l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                int i2 = this.f7648l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4154l c4154l = c9649l.f19680l;
                    C9040l c9040l = new C9040l(this.f7646l, null);
                    this.f7648l = 1;
                    if (c4154l.mopub(EnumC11011l.f22181l, c9040l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f7648l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4154l c4154l2 = c9649l.f19680l;
                    long j = this.f7646l;
                    this.f7648l = 1;
                    if (c4154l2.crashlytics(j, false, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f7648l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4154l c4154l3 = c9649l.f19680l;
                    long j2 = this.f7646l;
                    this.f7648l = 1;
                    if (c4154l3.crashlytics(j2, true, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i5 = this.f7648l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                long j3 = this.f7646l;
                C4154l c4154l4 = c9649l.f19680l;
                this.f7648l = 1;
                Object objLoadAd = AbstractC13611l.loadAd(c4154l4, j3, this);
                return objLoadAd == enumC9342l ? enumC9342l : objLoadAd;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f7647l) {
            case 0:
                return new C3652l(this.f7645l, this.f7646l, interfaceC14029l, 0);
            case 1:
                return new C3652l(this.f7645l, this.f7646l, interfaceC14029l, 1);
            case 2:
                return new C3652l(this.f7645l, this.f7646l, interfaceC14029l, 2);
            default:
                C3652l c3652l = new C3652l(this.f7645l, interfaceC14029l);
                c3652l.f7646l = ((C1187l) obj).yandex;
                return c3652l;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7647l) {
            case 0:
                return ((C3652l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C3652l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C3652l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                long j = ((C1187l) obj).yandex;
                C3652l c3652l = new C3652l(this.f7645l, (InterfaceC14029l) obj2);
                c3652l.f7646l = j;
                return c3652l.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3652l(C9649l c9649l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f7647l = 3;
        this.f7645l = c9649l;
    }
}
