package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؔٚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2735l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ AbstractC12074l f5930l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f5931l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f5932l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f5933l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f5934l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2735l(Function3 function3, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f5932l = i;
        this.f5933l = function3;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f5932l;
        Function3 function3 = this.f5933l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                AbstractC12074l abstractC12074l = this.f5930l;
                Object obj2 = this.f5931l;
                int i2 = this.f5934l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i2 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                if (!(obj2 instanceof AbstractC8870l)) {
                    return Unit.INSTANCE;
                }
                Object obj3 = abstractC12074l.f24000l;
                this.f5930l = abstractC12074l;
                this.f5931l = null;
                this.f5934l = 1;
                obj = function3.invoke(obj3, obj2, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC8870l abstractC8870l = (AbstractC8870l) obj;
                if (abstractC8870l == null) {
                    return Unit.INSTANCE;
                }
                this.f5930l = null;
                this.f5931l = null;
                this.f5934l = 2;
                if (abstractC12074l.purchase(this, abstractC8870l) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            default:
                AbstractC12074l abstractC12074l2 = this.f5930l;
                Object obj4 = this.f5931l;
                int i3 = this.f5934l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i3 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                Object obj5 = abstractC12074l2.f24000l;
                this.f5930l = abstractC12074l2;
                this.f5931l = null;
                this.f5934l = 1;
                obj = function3.invoke(obj5, obj4, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC8870l abstractC8870l2 = (AbstractC8870l) obj;
                if (abstractC8870l2 != null) {
                    this.f5930l = null;
                    this.f5931l = null;
                    this.f5934l = 2;
                    if (abstractC12074l2.purchase(this, abstractC8870l2) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f5932l;
        Function3 function3 = this.f5933l;
        AbstractC12074l abstractC12074l = (AbstractC12074l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (i) {
            case 0:
                C2735l c2735l = new C2735l(function3, interfaceC14029l, 0);
                c2735l.f5930l = abstractC12074l;
                c2735l.f5931l = obj2;
                return c2735l.Signature(Unit.INSTANCE);
            default:
                C2735l c2735l2 = new C2735l(function3, interfaceC14029l, 1);
                c2735l2.f5930l = abstractC12074l;
                c2735l2.f5931l = obj2;
                return c2735l2.Signature(Unit.INSTANCE);
        }
    }
}
