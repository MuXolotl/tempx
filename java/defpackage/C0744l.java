package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؑۨۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0744l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ List f2244l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ List f2245l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C6953l f2246l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f2247l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ long f2248l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ List f2249l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C14358l f2250l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C6558l f2251l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0744l(C14358l c14358l, InterfaceC14029l interfaceC14029l, List list, List list2, List list3, C6953l c6953l, C6558l c6558l, long j) {
        super(2, interfaceC14029l);
        this.f2250l = c14358l;
        this.f2244l = list;
        this.f2245l = list2;
        this.f2249l = list3;
        this.f2246l = c6953l;
        this.f2251l = c6558l;
        this.f2248l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f2247l;
        if (i != 0) {
            if (i == 1) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        InterfaceC1142l interfaceC1142lYandex = C14358l.smaato(this.f2250l).yandex(this.f2244l, this.f2245l, this.f2249l, this.f2246l, this.f2251l, this.f2248l);
        this.f2247l = 1;
        Object objFirebase = ((C9426l) interfaceC1142lYandex).firebase(this);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        return objFirebase == enumC9342l ? enumC9342l : objFirebase;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C0744l(this.f2250l, interfaceC14029l, this.f2244l, this.f2245l, this.f2249l, this.f2246l, this.f2251l, this.f2248l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0744l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
