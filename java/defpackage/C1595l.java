package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؓؔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1595l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ long f3914l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f3915l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C2403l f3916l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f3917l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f3918l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C1304l f3919l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1595l(InterfaceC2262l interfaceC2262l, InterfaceC8714l interfaceC8714l, C2403l c2403l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f3915l = interfaceC2262l;
        this.f3918l = interfaceC8714l;
        this.f3916l = c2403l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3917l;
        InterfaceC2262l interfaceC2262l = this.f3915l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C1304l c1304l = this.f3919l;
            AbstractC10999l.mopub(interfaceC2262l, null, 0, new C11287l(this.f3918l, this.f3914l, this.f3916l, (InterfaceC14029l) null, 7), 3);
            this.f3917l = 1;
            obj = c1304l.billing(this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        AbstractC10999l.mopub(interfaceC2262l, null, 0, new C18523l(this.f3918l, ((Boolean) obj).booleanValue(), this.f3916l, (InterfaceC14029l) null), 3);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C1187l) obj2).yandex;
        InterfaceC8714l interfaceC8714l = this.f3918l;
        C2403l c2403l = this.f3916l;
        C1595l c1595l = new C1595l(this.f3915l, interfaceC8714l, c2403l, (InterfaceC14029l) obj3);
        c1595l.f3919l = (C1304l) obj;
        c1595l.f3914l = j;
        return c1595l.Signature(Unit.INSTANCE);
    }
}
