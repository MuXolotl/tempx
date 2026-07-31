package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؗۤۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5270l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ C18416l f11354l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f11355l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1489l f11356l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f11357l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C15389l f11358l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C14061l f11359l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5270l(C15389l c15389l, InterfaceC1489l interfaceC1489l, InterfaceC14029l interfaceC14029l) {
        super(4, interfaceC14029l);
        this.f11358l = c15389l;
        this.f11356l = interfaceC1489l;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objLoadAd;
        int i = this.f11357l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C14061l c14061l = this.f11359l;
            C18416l c18416l = this.f11354l;
            Object obj2 = this.f11355l;
            C15389l c15389l = this.f11358l;
            float fAdmob = ((C13765l) c15389l.isPro).admob();
            this.f11359l = null;
            this.f11354l = null;
            this.f11357l = 1;
            float fBilling = c18416l.billing(obj2);
            C13250l c13250l = new C13250l();
            c13250l.f26029l = Float.isNaN(((C13765l) c15389l.subs).admob()) ? 0.0f : ((C13765l) c15389l.subs).admob();
            boolean zIsNaN = Float.isNaN(fBilling);
            Object obj3 = EnumC9342l.f19165l;
            if (zIsNaN) {
                objLoadAd = Unit.INSTANCE;
            } else {
                float f = c13250l.f26029l;
                if (f == fBilling) {
                    objLoadAd = Unit.INSTANCE;
                } else {
                    objLoadAd = AbstractC18719l.loadAd(f, fBilling, fAdmob, this.f11356l, new Cpublic(c14061l, c13250l, 5), this);
                    if (objLoadAd != obj3) {
                        objLoadAd = Unit.INSTANCE;
                    }
                }
            }
            if (objLoadAd == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C5270l c5270l = new C5270l(this.f11358l, this.f11356l, (InterfaceC14029l) obj4);
        c5270l.f11359l = (C14061l) obj;
        c5270l.f11354l = (C18416l) obj2;
        c5270l.f11355l = obj3;
        return c5270l.Signature(Unit.INSTANCE);
    }
}
