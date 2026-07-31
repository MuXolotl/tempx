package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٍٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15818l extends AbstractC5563l implements Function4 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f31060l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f31061l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public /* synthetic */ C15237l f31062l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC1601l f31063l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C17003l f31064l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ C15237l f31065l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f31066l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1234l f31067l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15818l(InterfaceC1234l interfaceC1234l, C17003l c17003l, InterfaceC14029l interfaceC14029l) {
        super(4, interfaceC14029l);
        this.f31067l = interfaceC1234l;
        this.f31064l = c17003l;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        InterfaceC1601l interfaceC1601l;
        int i;
        Object objM3168l;
        Throwable th;
        InterfaceC1601l interfaceC1601l2;
        C10207l c10207l;
        C15237l c15237l = this.f31065l;
        C15237l c15237l2 = this.f31062l;
        int i2 = this.f31061l;
        int i3 = 0;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                ((C9421l) this.f31067l).yandex(27);
                interfaceC1601l = this.f31064l.f33133l;
                this.f31065l = c15237l;
                this.f31062l = c15237l2;
                this.f31063l = interfaceC1601l;
                this.f31066l = 0;
                this.f31061l = 1;
                if (interfaceC1601l.yandex(this) != enumC9342l) {
                    i = 0;
                }
                return enumC9342l;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC1601l2 = this.f31063l;
                    try {
                        AbstractC2829l.crashlytics(obj);
                        Unit unit = Unit.INSTANCE;
                        interfaceC1601l2.billing(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC1601l2.billing(null);
                        throw th;
                    }
                }
                i3 = this.f31060l;
                i = this.f31066l;
                InterfaceC1601l interfaceC1601l3 = this.f31063l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    objM3168l = obj;
                    interfaceC1601l = interfaceC1601l3;
                    c10207l = new C10207l(c15237l2, c15237l, 11);
                    this.f31065l = null;
                    this.f31062l = null;
                    this.f31063l = interfaceC1601l;
                    this.f31066l = i;
                    this.f31060l = i3;
                    this.f31061l = 3;
                    if (((C5198l) objM3168l).m1734l(c10207l, this) != enumC9342l) {
                        interfaceC1601l2 = interfaceC1601l;
                        Unit unit2 = Unit.INSTANCE;
                        interfaceC1601l2.billing(null);
                        return Unit.INSTANCE;
                    }
                    return enumC9342l;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC1601l2 = interfaceC1601l3;
                    interfaceC1601l2.billing(null);
                    throw th;
                }
            }
            i = this.f31066l;
            InterfaceC1601l interfaceC1601l4 = this.f31063l;
            AbstractC2829l.crashlytics(obj);
            interfaceC1601l = interfaceC1601l4;
            C6336l c6336l = C6336l.yandex;
            this.f31065l = c15237l;
            this.f31062l = c15237l2;
            this.f31063l = interfaceC1601l;
            this.f31066l = i;
            this.f31060l = 0;
            this.f31061l = 2;
            objM3168l = C6336l.loadAd.m3168l(this);
            if (objM3168l != enumC9342l) {
                c10207l = new C10207l(c15237l2, c15237l, 11);
                this.f31065l = null;
                this.f31062l = null;
                this.f31063l = interfaceC1601l;
                this.f31066l = i;
                this.f31060l = i3;
                this.f31061l = 3;
                if (((C5198l) objM3168l).m1734l(c10207l, this) != enumC9342l) {
                    interfaceC1601l2 = interfaceC1601l;
                    Unit unit3 = Unit.INSTANCE;
                    interfaceC1601l2.billing(null);
                    return Unit.INSTANCE;
                }
            }
            return enumC9342l;
        } catch (Throwable th4) {
            InterfaceC1601l interfaceC1601l5 = interfaceC1601l;
            th = th4;
            interfaceC1601l2 = interfaceC1601l5;
            interfaceC1601l2.billing(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C15818l c15818l = new C15818l(this.f31067l, this.f31064l, (InterfaceC14029l) obj4);
        c15818l.f31065l = (C15237l) obj2;
        c15818l.f31062l = (C15237l) obj3;
        return c15818l.Signature(Unit.INSTANCE);
    }
}
