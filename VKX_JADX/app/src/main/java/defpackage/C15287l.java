package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٔۤۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15287l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ long f29884l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f29885l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f29886l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C12217l f29887l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C1304l f29888l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15287l(C2403l c2403l, C12217l c12217l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f29885l = c2403l;
        this.f29887l = c12217l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f29886l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C1304l c1304l = this.f29888l;
            long j = this.f29884l;
            C2403l c2403l = this.f29885l;
            if (c2403l != null) {
                C8510l c8510l = new C8510l(c1304l, this.f29887l, j, c2403l, (InterfaceC14029l) null);
                this.f29886l = 1;
                Object objAdmob = AbstractC11990l.admob(c8510l, this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAdmob == enumC9342l) {
                    return enumC9342l;
                }
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

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C1187l) obj2).yandex;
        C15287l c15287l = new C15287l(this.f29885l, this.f29887l, (InterfaceC14029l) obj3);
        c15287l.f29888l = (C1304l) obj;
        c15287l.f29884l = j;
        return c15287l.Signature(Unit.INSTANCE);
    }
}
