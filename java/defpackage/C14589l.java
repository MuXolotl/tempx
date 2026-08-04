package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14589l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ long f28572l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C11625l f28573l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f28574l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C1304l f28575l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14589l(C11625l c11625l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f28573l = c11625l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C1304l c1304l = this.f28575l;
        long j = this.f28572l;
        int i = this.f28574l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            this.f28575l = null;
            this.f28572l = j;
            this.f28574l = 1;
            Object objCrashlytics = this.f28573l.crashlytics(c1304l, j, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objCrashlytics == enumC9342l) {
                return enumC9342l;
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
        C14589l c14589l = new C14589l(this.f28573l, (InterfaceC14029l) obj3);
        c14589l.f28575l = (C1304l) obj;
        c14589l.f28572l = j;
        return c14589l.Signature(Unit.INSTANCE);
    }
}
