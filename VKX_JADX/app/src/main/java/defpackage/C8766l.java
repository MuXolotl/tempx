package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8766l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f18051l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6942l f18052l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18053l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f18054l;

    public /* synthetic */ C8766l(InterfaceC6942l interfaceC6942l, Object obj, Object obj2, int i) {
        this.f18053l = i;
        this.f18052l = interfaceC6942l;
        this.f18051l = obj;
        this.f18054l = obj2;
    }

    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        int i = this.f18053l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj = this.f18054l;
        Object obj2 = this.f18051l;
        InterfaceC6942l interfaceC6942l = this.f18052l;
        switch (i) {
            case 0:
                Object objYandex = interfaceC6942l.yandex(new C17354l(interfaceC9427l, (Function1) obj2, (AbstractC11904l) obj, 3), interfaceC14029l);
                return objYandex == enumC9342l ? objYandex : Unit.INSTANCE;
            case 1:
                Object objYandex2 = AbstractC6968l.yandex(interfaceC14029l, interfaceC9427l, C15152l.f29735l, new C12207l((Function3) obj, (InterfaceC14029l) null, 4), new InterfaceC6942l[]{interfaceC6942l, (InterfaceC6942l) obj2});
                return objYandex2 == enumC9342l ? objYandex2 : Unit.INSTANCE;
            default:
                Object objYandex3 = interfaceC6942l.yandex(new C17354l(interfaceC9427l, (AbstractC15781l) obj2, (C8125l) obj, 6), interfaceC14029l);
                return objYandex3 == enumC9342l ? objYandex3 : Unit.INSTANCE;
        }
    }
}
