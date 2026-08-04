package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1162l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0360l f3144l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3145l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f3146l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ boolean f3147l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1162l(int i, InterfaceC14029l interfaceC14029l, C0360l c0360l) {
        super(2, interfaceC14029l);
        this.f3144l = c0360l;
        this.f3145l = i;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int iIntValue;
        boolean z = this.f3147l;
        int i = this.f3146l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            if (z) {
                InterfaceC4335l interfaceC4335lMopub = this.f3144l.mopub();
                this.f3147l = z;
                this.f3146l = 1;
                obj = interfaceC4335lMopub.yandex(this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                iIntValue = this.f3145l;
            }
            return new Integer(iIntValue);
        }
        if (i != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        iIntValue = ((Number) obj).intValue();
        return new Integer(iIntValue);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C1162l c1162l = new C1162l(this.f3145l, interfaceC14029l, this.f3144l);
        c1162l.f3147l = ((Boolean) obj).booleanValue();
        return c1162l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C1162l) ads((InterfaceC14029l) obj2, bool)).Signature(Unit.INSTANCE);
    }
}
