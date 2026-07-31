package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘؙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5498l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C17991l f11755l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f11756l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f11757l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C17991l f11758l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long[] f11759l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C6878l f11760l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C6878l f11761l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f11762l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5498l(C6878l c6878l, C17991l c17991l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f11761l = c6878l;
        this.f11758l = c17991l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C11129l c11129l;
        C6878l c6878l;
        long[] jArr;
        int i;
        C17991l c17991l;
        int i2 = this.f11756l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c11129l = (C11129l) this.f11757l;
            c6878l = this.f11761l;
            C1807l c1807l = c6878l.f14404l;
            jArr = c1807l.crashlytics;
            i = c1807l.purchase;
            c17991l = this.f11758l;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f11762l;
            jArr = this.f11759l;
            c6878l = this.f11760l;
            c17991l = this.f11755l;
            c11129l = (C11129l) this.f11757l;
            AbstractC2829l.crashlytics(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.INSTANCE;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        c17991l.f35177l = i;
        Object obj2 = c6878l.f14404l.loadAd[i];
        this.f11757l = c11129l;
        this.f11755l = c17991l;
        this.f11760l = c6878l;
        this.f11759l = jArr;
        this.f11762l = i3;
        this.f11756l = 1;
        c11129l.amazon(this, obj2);
        return EnumC9342l.f19165l;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C5498l c5498l = new C5498l(this.f11761l, this.f11758l, interfaceC14029l);
        c5498l.f11757l = obj;
        return c5498l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5498l) ads((InterfaceC14029l) obj2, (C11129l) obj)).Signature(Unit.INSTANCE);
    }
}
