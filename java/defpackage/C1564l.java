package defpackage;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1564l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final /* synthetic */ C7072l f3866l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f3867l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C14025l f3868l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f3869l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C0657l f3870l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C0657l f3871l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ C16628l f3872l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final /* synthetic */ C14025l f3873l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ CancellationSignal f3874l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C7072l f3875l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public /* synthetic */ Object f3876l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C16628l f3877l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f3878l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Function1 f3879l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f3880l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Cfinally f3881l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f3882l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ int f3883l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final /* synthetic */ Cfinally f3884l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564l(C16628l c16628l, CancellationSignal cancellationSignal, int i, C14025l c14025l, C0657l c0657l, Function1 function1, C7072l c7072l, Cfinally cfinally, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f3872l = c16628l;
        this.f3874l = cancellationSignal;
        this.f3883l = i;
        this.f3873l = c14025l;
        this.f3870l = c0657l;
        this.f3869l = function1;
        this.f3866l = c7072l;
        this.f3884l = cfinally;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C16628l c16628l;
        C7072l c7072l;
        C14025l c14025l;
        Function1 function1;
        C0657l c0657l;
        CancellationSignal cancellationSignal;
        Cfinally cfinally;
        int i;
        int i2;
        Throwable th;
        C16628l c16628l2;
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f3876l;
        int i3 = this.f3882l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(obj);
                this.f3876l = interfaceC2262l;
                c16628l = this.f3872l;
                this.f3877l = c16628l;
                CancellationSignal cancellationSignal2 = this.f3874l;
                this.f3880l = cancellationSignal2;
                C14025l c14025l2 = this.f3873l;
                this.f3868l = c14025l2;
                C0657l c0657l2 = this.f3870l;
                this.f3871l = c0657l2;
                Function1 function2 = this.f3869l;
                this.f3879l = function2;
                C7072l c7072l2 = this.f3866l;
                this.f3875l = c7072l2;
                Cfinally cfinally2 = this.f3884l;
                this.f3881l = cfinally2;
                int i4 = this.f3883l;
                this.f3878l = i4;
                this.f3867l = 0;
                this.f3882l = 1;
                if (c16628l.loadAd(this) != enumC9342l) {
                    c7072l = c7072l2;
                    c14025l = c14025l2;
                    function1 = function2;
                    c0657l = c0657l2;
                    cancellationSignal = cancellationSignal2;
                    cfinally = cfinally2;
                    i = i4;
                    i2 = 0;
                }
                return enumC9342l;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c16628l2 = this.f3877l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    C0657l c0657l3 = (C0657l) obj;
                    c16628l2.amazon();
                    return c0657l3;
                } catch (Throwable th2) {
                    th = th2;
                    c16628l2.amazon();
                    throw th;
                }
            }
            i2 = this.f3867l;
            int i5 = this.f3878l;
            Cfinally cfinally3 = this.f3881l;
            C7072l c7072l3 = this.f3875l;
            Function1 function3 = this.f3879l;
            C0657l c0657l4 = this.f3871l;
            C14025l c14025l3 = this.f3868l;
            CancellationSignal cancellationSignal3 = (CancellationSignal) this.f3880l;
            C16628l c16628l3 = this.f3877l;
            AbstractC2829l.crashlytics(obj);
            i = i5;
            cancellationSignal = cancellationSignal3;
            cfinally = cfinally3;
            c7072l = c7072l3;
            c14025l = c14025l3;
            function1 = function3;
            c0657l = c0657l4;
            c16628l = c16628l3;
            if (AbstractC11990l.smaato(interfaceC2262l) && !cancellationSignal.isCanceled()) {
                this.f3876l = interfaceC2262l;
                this.f3877l = c16628l;
                this.f3880l = c0657l;
                this.f3868l = null;
                this.f3871l = null;
                this.f3879l = null;
                this.f3875l = null;
                this.f3881l = null;
                this.f3878l = i;
                this.f3867l = i2;
                this.f3882l = 2;
                Object objYandex = C0121l.yandex(i, c14025l, c0657l, function1, c7072l, cfinally, this);
                if (objYandex != enumC9342l) {
                    C16628l c16628l4 = c16628l;
                    obj = objYandex;
                    c16628l2 = c16628l4;
                    C0657l c0657l5 = (C0657l) obj;
                    c16628l2.amazon();
                    return c0657l5;
                }
                return enumC9342l;
            }
            C0657l c0657l6 = new C0657l(null, null, null, null, false, null, null);
            c16628l.amazon();
            return c0657l6;
        } catch (Throwable th3) {
            C16628l c16628l5 = c16628l;
            th = th3;
            c16628l2 = c16628l5;
            c16628l2.amazon();
            throw th;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C1564l c1564l = new C1564l(this.f3872l, this.f3874l, this.f3883l, this.f3873l, this.f3870l, this.f3869l, this.f3866l, this.f3884l, interfaceC14029l);
        c1564l.f3876l = obj;
        return c1564l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1564l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
