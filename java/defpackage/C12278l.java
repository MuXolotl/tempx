package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِۨ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12278l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f24340l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f24341l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C4154l f24342l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C4154l f24343l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ long f24344l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f24345l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C17078l f24346l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C17078l f24347l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12278l(C4154l c4154l, C17078l c17078l, long j, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f24342l = c4154l;
        this.f24347l = c17078l;
        this.f24344l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C4154l c4154l;
        C17078l c17078l;
        C4154l c4154l2;
        long j;
        int i = this.f24341l;
        EnumC7283l enumC7283l = EnumC7283l.f15125l;
        int i2 = 1;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C15222l c15222l = (C15222l) this.f24345l;
            c4154l = this.f24342l;
            C3093l c3093l = new C3093l(c4154l, c15222l, i2);
            InterfaceC14745l interfaceC14745l = c4154l.crashlytics;
            C17078l c17078l2 = this.f24347l;
            long j2 = c17078l2.f33243l;
            EnumC7283l enumC7283l2 = c4154l.amazon;
            long j3 = this.f24344l;
            float fPurchase = c4154l.purchase(enumC7283l2 == enumC7283l ? C12121l.loadAd(j3) : C12121l.crashlytics(j3));
            this.f24345l = c4154l;
            this.f24343l = c4154l;
            this.f24346l = c17078l2;
            this.f24340l = j2;
            this.f24341l = 1;
            obj = interfaceC14745l.yandex(c3093l, fPurchase, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
            c17078l = c17078l2;
            c4154l2 = c4154l;
            j = j2;
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f24340l;
            c17078l = this.f24346l;
            c4154l = this.f24343l;
            c4154l2 = (C4154l) this.f24345l;
            AbstractC2829l.crashlytics(obj);
        }
        float fPurchase2 = c4154l2.purchase(((Number) obj).floatValue());
        c17078l.f33243l = c4154l.amazon == enumC7283l ? C12121l.yandex(j, fPurchase2, 0.0f, 2) : C12121l.yandex(j, 0.0f, fPurchase2, 1);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C12278l c12278l = new C12278l(this.f24342l, this.f24347l, this.f24344l, interfaceC14029l);
        c12278l.f24345l = obj;
        return c12278l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12278l) ads((InterfaceC14029l) obj2, (C15222l) obj)).Signature(Unit.INSTANCE);
    }
}
