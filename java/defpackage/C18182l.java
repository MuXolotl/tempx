package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: l٘ۚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18182l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ AbstractC12074l f35624l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ AbstractC10022l f35625l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f35626l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f35627l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f35628l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18182l(Function2 function2, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f35626l = i;
        this.f35627l = function2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f35626l;
        Function2 function2 = this.f35627l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                AbstractC12074l abstractC12074l = this.f35624l;
                AbstractC10022l abstractC10022l = this.f35625l;
                int i2 = this.f35628l;
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
                this.f35624l = abstractC12074l;
                this.f35625l = null;
                this.f35628l = 1;
                obj = function2.invoke(abstractC10022l, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC10022l abstractC10022l2 = (AbstractC10022l) obj;
                if (abstractC10022l2 != null) {
                    this.f35624l = null;
                    this.f35625l = null;
                    this.f35628l = 2;
                    if (abstractC12074l.purchase(this, abstractC10022l2) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC12074l abstractC12074l2 = this.f35624l;
                AbstractC10022l abstractC10022l3 = this.f35625l;
                int i3 = this.f35628l;
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
                this.f35624l = abstractC12074l2;
                this.f35625l = null;
                this.f35628l = 1;
                obj = function2.invoke(abstractC10022l3, this);
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                AbstractC10022l abstractC10022l4 = (AbstractC10022l) obj;
                if (abstractC10022l4 != null) {
                    this.f35624l = null;
                    this.f35625l = null;
                    this.f35628l = 2;
                    if (abstractC12074l2.purchase(this, abstractC10022l4) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f35626l;
        Function2 function2 = this.f35627l;
        AbstractC12074l abstractC12074l = (AbstractC12074l) obj;
        AbstractC10022l abstractC10022l = (AbstractC10022l) obj2;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
        switch (i) {
            case 0:
                C18182l c18182l = new C18182l(function2, interfaceC14029l, 0);
                c18182l.f35624l = abstractC12074l;
                c18182l.f35625l = abstractC10022l;
                return c18182l.Signature(Unit.INSTANCE);
            default:
                C18182l c18182l2 = new C18182l(function2, interfaceC14029l, 1);
                c18182l2.f35624l = abstractC12074l;
                c18182l2.f35625l = abstractC10022l;
                return c18182l2.Signature(Unit.INSTANCE);
        }
    }
}
