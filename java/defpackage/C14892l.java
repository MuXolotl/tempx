package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: lٔٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14892l extends AbstractC5563l implements Function5 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f29288l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ List f29289l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C12825l f29290l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f29291l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Set f29292l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ C6806l f29293l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14892l(C12825l c12825l, InterfaceC14029l interfaceC14029l, List list, Set set) {
        super(5, interfaceC14029l);
        this.f29289l = list;
        this.f29292l = set;
        this.f29290l = c12825l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws C10756l, IOException {
        C6806l c6806l = this.f29293l;
        Object obj2 = this.f29288l;
        int i = this.f29291l;
        if (i != 0) {
            if (i == 1) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        this.f29293l = null;
        this.f29288l = null;
        this.f29291l = 1;
        Object objYandex = AbstractC18358l.yandex(this.f29289l, this.f29292l, this.f29290l, c6806l, obj2, this);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        return objYandex == enumC9342l ? enumC9342l : objYandex;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Set set = this.f29292l;
        C14892l c14892l = new C14892l(this.f29290l, (InterfaceC14029l) obj5, this.f29289l, set);
        c14892l.f29293l = (C6806l) obj2;
        c14892l.f29288l = obj3;
        return c14892l.Signature(Unit.INSTANCE);
    }
}
