package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۥُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12969l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5616l f25424l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ float f25425l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12553l f25426l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f25427l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f25428l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f25429l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f25430l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12969l(C5616l c5616l, float f, boolean z, Object obj, InterfaceC12553l interfaceC12553l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f25427l = i;
        this.f25424l = c5616l;
        this.f25425l = f;
        this.f25428l = z;
        this.f25430l = obj;
        this.f25426l = interfaceC12553l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f25427l;
        InterfaceC12553l interfaceC12553l = this.f25426l;
        boolean z = this.f25428l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C5616l c5616l = this.f25424l;
        float f = this.f25425l;
        InterfaceC12553l c7008l = null;
        switch (i) {
            case 0:
                int i2 = this.f25429l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (!C14467l.loadAd(((C14467l) c5616l.purchase.getValue()).f28331l, f)) {
                        if (z) {
                            float f2 = ((C14467l) c5616l.purchase.getValue()).f28331l;
                            if (C14467l.loadAd(f2, 0.0f)) {
                                c7008l = new C12951l(0L);
                            } else if (C14467l.loadAd(f2, 1.0f)) {
                                c7008l = new C0261l();
                            } else if (C14467l.loadAd(f2, 0.0f)) {
                                c7008l = new C7008l();
                            }
                            this.f25429l = 2;
                            if (AbstractC2327l.yandex(c5616l, f, c7008l, interfaceC12553l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        } else {
                            C14467l c14467l = new C14467l(f);
                            this.f25429l = 1;
                            if (c5616l.billing(this, c14467l) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                C7224l c7224l = (C7224l) this.f25430l;
                int i3 = this.f25429l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (!C14467l.loadAd(((C14467l) c5616l.purchase.getValue()).f28331l, f)) {
                        if (z) {
                            float f3 = ((C14467l) c5616l.purchase.getValue()).f28331l;
                            if (C14467l.loadAd(f3, c7224l.loadAd)) {
                                c7008l = new C12951l(0L);
                            } else if (C14467l.loadAd(f3, c7224l.amazon)) {
                                c7008l = new C0261l();
                            } else if (C14467l.loadAd(f3, c7224l.crashlytics)) {
                                c7008l = new C7008l();
                            } else if (C14467l.loadAd(f3, c7224l.purchase)) {
                                c7008l = new C1311l();
                            }
                            this.f25429l = 2;
                            if (AbstractC2327l.yandex(c5616l, f, c7008l, interfaceC12553l, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        } else {
                            C14467l c14467l2 = new C14467l(f);
                            this.f25429l = 1;
                            if (c5616l.billing(this, c14467l2) == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                    }
                } else {
                    if (i3 != 1 && i3 != 2) {
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
        int i = this.f25427l;
        Object obj2 = this.f25430l;
        switch (i) {
            case 0:
                return new C12969l(this.f25424l, this.f25425l, this.f25428l, (C1570l) obj2, this.f25426l, interfaceC14029l, 0);
            default:
                return new C12969l(this.f25424l, this.f25425l, this.f25428l, (C7224l) obj2, this.f25426l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f25427l) {
            case 0:
                break;
        }
        return ((C12969l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
