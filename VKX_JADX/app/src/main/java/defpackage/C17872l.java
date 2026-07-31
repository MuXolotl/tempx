package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17872l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5616l f34833l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ float f34834l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f34835l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34836l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17872l(C5616l c5616l, float f, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34835l = i;
        this.f34833l = c5616l;
        this.f34834l = f;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f34835l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        float f = this.f34834l;
        switch (i) {
            case 0:
                int i2 = this.f34836l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Float f2 = new Float(f);
                    C5616l c5616l = this.f34833l;
                    C4776l c4776l = ((Number) c5616l.amazon()).floatValue() < f ? AbstractC15831l.yandex : AbstractC15831l.loadAd;
                    this.f34836l = 1;
                    if (C5616l.loadAd(c5616l, f2, c4776l, null, null, this, 12) == enumC9342l) {
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
                int i3 = this.f34836l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C14467l c14467l = new C14467l(f);
                    C5616l c5616l2 = this.f34833l;
                    C13315l c13315lAdmob = C14467l.yandex(((C14467l) c5616l2.purchase.getValue()).f28331l, f) < 0 ? AbstractC0532l.admob(1.0f, 1000.0f, null, 4) : AbstractC0532l.admob(1.0f, 250.0f, null, 4);
                    this.f34836l = 1;
                    if (C5616l.loadAd(c5616l2, c14467l, c13315lAdmob, null, null, this, 12) == enumC9342l) {
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
            default:
                int i4 = this.f34836l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C14467l c14467l2 = new C14467l(f);
                    C5616l c5616l3 = this.f34833l;
                    C13315l c13315lAdmob2 = C14467l.yandex(((C14467l) c5616l3.purchase.getValue()).f28331l, f) < 0 ? AbstractC0532l.admob(1.0f, 250.0f, null, 4) : AbstractC0532l.admob(1.0f, 1000.0f, null, 4);
                    this.f34836l = 1;
                    if (C5616l.loadAd(c5616l3, c14467l2, c13315lAdmob2, null, null, this, 12) == enumC9342l) {
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
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f34835l;
        float f = this.f34834l;
        C5616l c5616l = this.f34833l;
        switch (i) {
            case 0:
                return new C17872l(c5616l, f, interfaceC14029l, 0);
            case 1:
                return new C17872l(c5616l, f, interfaceC14029l, 1);
            default:
                return new C17872l(c5616l, f, interfaceC14029l, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f34835l) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C17872l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
