package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2713l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ Object f5873l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C0746l f5874l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C7045l f5875l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f5876l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ C7045l f5877l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC1601l f5878l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C0746l f5879l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f5880l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f5881l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f5882l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ boolean f5883l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2713l(C0746l c0746l, Object obj, boolean z, C7045l c7045l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f5879l = c0746l;
        this.f5873l = obj;
        this.f5883l = z;
        this.f5877l = c7045l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C0746l c0746l;
        InterfaceC1601l interfaceC1601l;
        Object obj2;
        C7045l c7045l;
        int i;
        boolean z;
        InterfaceC1601l interfaceC1601l2;
        C0746l c0746l2;
        C0746l c0746l3;
        int i2 = this.f5882l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                c0746l = this.f5879l;
                interfaceC1601l = c0746l.loadAd;
                this.f5878l = interfaceC1601l;
                obj2 = this.f5873l;
                this.f5881l = obj2;
                this.f5874l = c0746l;
                c7045l = this.f5877l;
                this.f5875l = c7045l;
                boolean z2 = this.f5883l;
                this.f5880l = z2;
                i = 0;
                this.f5876l = 0;
                this.f5882l = 1;
                if (interfaceC1601l.yandex(this) != enumC9342l) {
                    z = z2;
                }
                return enumC9342l;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0746l3 = this.f5874l;
                c0746l2 = (C0746l) this.f5881l;
                interfaceC1601l2 = this.f5878l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    c0746l3.value = obj;
                    c0746l = c0746l2;
                    Object obj3 = c0746l.value;
                    interfaceC1601l2.billing(null);
                    return obj3;
                } catch (Throwable th) {
                    th = th;
                    interfaceC1601l2.billing(null);
                    throw th;
                }
            }
            int i3 = this.f5876l;
            z = this.f5880l;
            c7045l = this.f5875l;
            C0746l c0746l4 = this.f5874l;
            obj2 = this.f5881l;
            InterfaceC1601l interfaceC1601l3 = this.f5878l;
            AbstractC2829l.crashlytics(obj);
            i = i3;
            interfaceC1601l = interfaceC1601l3;
            c0746l = c0746l4;
            if (AbstractC8576l.yandex(obj2, c0746l.value) || z) {
                this.f5878l = interfaceC1601l;
                this.f5881l = c0746l;
                this.f5874l = c0746l;
                this.f5875l = null;
                this.f5876l = i;
                this.f5882l = 2;
                Object objInvoke = c7045l.invoke(this);
                if (objInvoke != enumC9342l) {
                    c0746l2 = c0746l;
                    obj = objInvoke;
                    interfaceC1601l2 = interfaceC1601l;
                    c0746l3 = c0746l2;
                    c0746l3.value = obj;
                    c0746l = c0746l2;
                }
                return enumC9342l;
            }
            interfaceC1601l2 = interfaceC1601l;
            Object obj4 = c0746l.value;
            interfaceC1601l2.billing(null);
            return obj4;
        } catch (Throwable th2) {
            th = th2;
            interfaceC1601l2 = interfaceC1601l;
            interfaceC1601l2.billing(null);
            throw th;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C2713l(this.f5879l, this.f5873l, this.f5883l, this.f5877l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2713l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
