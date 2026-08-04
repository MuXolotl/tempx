package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؚٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7358l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ long f15262l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f15263l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f15264l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f15265l = 0;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f15266l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f15267l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f15268l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f15269l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7358l(InterfaceC13515l interfaceC13515l, String str, long j, C12814l c12814l, C16173l c16173l, InterfaceC4005l interfaceC4005l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f15263l = interfaceC13515l;
        this.f15267l = str;
        this.f15262l = j;
        this.f15264l = c12814l;
        this.f15269l = c16173l;
        this.f15266l = interfaceC4005l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f15265l;
        Object obj2 = this.f15264l;
        long j = this.f15262l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj3 = this.f15269l;
        Object obj4 = this.f15267l;
        Object obj5 = this.f15266l;
        switch (i) {
            case 0:
                InterfaceC14447l interfaceC14447l = (InterfaceC14447l) obj3;
                C3276l c3276l = (C3276l) obj2;
                C2643l c2643l = (C2643l) obj4;
                int i2 = this.f15268l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C15222l c15222l = (C15222l) this.f15263l;
                    c2643l.purchase = C3276l.m1312l(c3276l, interfaceC14447l, j);
                    Ctransient ctransient = new Ctransient(c3276l, c2643l, (InterfaceC7042l) obj5, c15222l);
                    Cfinally cfinally = new Cfinally(c3276l, c2643l, interfaceC14447l, 8);
                    this.f15268l = 1;
                    if (c2643l.yandex(ctransient, cfinally, this) == enumC9342l) {
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
            default:
                InterfaceC4005l interfaceC4005l = (InterfaceC4005l) obj5;
                String str = (String) obj4;
                C16173l c16173l = (C16173l) obj3;
                int i3 = this.f15268l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC13515l interfaceC13515l = (InterfaceC13515l) this.f15263l;
                    this.f15268l = 1;
                    obj = ((C11528l) interfaceC13515l).billing(str, j, this);
                    if (obj == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C12814l c12814l = (C12814l) obj;
                if (c12814l == null) {
                    return Unit.INSTANCE;
                }
                long j2 = c12814l.yandex;
                long jLoadAd = AbstractC2296l.loadAd(interfaceC4005l.amazon((int) (j2 >> 32)), interfaceC4005l.amazon((int) (j2 & 4294967295L)));
                if (!C12814l.loadAd(jLoadAd, (C12814l) obj2) && AbstractC8576l.yandex(c16173l.vip().yandex.f7563l, str) && interfaceC4005l == c16173l.loadAd) {
                    c16173l.crashlytics.invoke(C16173l.purchase(c16173l.vip().yandex, jLoadAd));
                    c16173l.license = new C12814l(jLoadAd);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f15265l;
        Object obj2 = this.f15266l;
        Object obj3 = this.f15269l;
        Object obj4 = this.f15264l;
        Object obj5 = this.f15267l;
        switch (i) {
            case 0:
                C7358l c7358l = new C7358l((C2643l) obj5, (C3276l) obj4, (InterfaceC14447l) obj3, this.f15262l, (InterfaceC7042l) obj2, interfaceC14029l);
                c7358l.f15263l = obj;
                return c7358l;
            default:
                return new C7358l((InterfaceC13515l) this.f15263l, (String) obj5, this.f15262l, (C12814l) obj4, (C16173l) obj3, (InterfaceC4005l) obj2, interfaceC14029l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15265l) {
            case 0:
                return ((C7358l) ads((InterfaceC14029l) obj2, (C15222l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C7358l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7358l(C2643l c2643l, C3276l c3276l, InterfaceC14447l interfaceC14447l, long j, InterfaceC7042l interfaceC7042l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f15267l = c2643l;
        this.f15264l = c3276l;
        this.f15269l = interfaceC14447l;
        this.f15262l = j;
        this.f15266l = interfaceC7042l;
    }
}
