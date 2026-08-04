package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2641l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ float f5748l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ float f5749l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f5750l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f5751l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ float f5752l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C13009l f5753l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2641l(C13009l c13009l, float f, float f2, float f3, Function0 function0, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f5753l = c13009l;
        this.f5748l = f;
        this.f5749l = f2;
        this.f5752l = f3;
        this.f5750l = function0;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f5751l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            this.f5751l = 1;
            InterfaceC17242l interfaceC17242l = AbstractC11840l.yandex;
            C1114l c1114l = new C1114l(this.f5748l, this.f5749l, this.f5752l, null);
            Object objYandex = this.f5753l.yandex(EnumC11011l.f22182l, c1114l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex != enumC9342l) {
                objYandex = Unit.INSTANCE;
            }
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        Function0 function0 = this.f5750l;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C2641l(this.f5753l, this.f5748l, this.f5749l, this.f5752l, this.f5750l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2641l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
