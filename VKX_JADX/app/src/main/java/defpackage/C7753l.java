package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7753l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f16256l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16257l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f16258l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16259l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16260l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f16261l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f16262l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f16263l;

    public /* synthetic */ C7753l(int i, int i2, Function0 function0, Function1 function1, Function0 function2, InterfaceC17242l interfaceC17242l, int i3) {
        this.f16259l = i;
        this.f16256l = i2;
        this.f16261l = function0;
        this.f16263l = function1;
        this.f16257l = function2;
        this.f16258l = interfaceC17242l;
        this.f16262l = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16260l;
        Object obj3 = this.f16258l;
        Object obj4 = this.f16257l;
        Object obj5 = this.f16263l;
        Object obj6 = this.f16261l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(this.f16256l | 1);
                int i2 = this.f16259l;
                C10053l.yandex((InterfaceC17045l) obj6, (String) obj5, (InterfaceC12001l) obj4, i2, (C2607l) obj3, (C6956l) obj, iPurchase, this.f16262l);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(this.f16262l | 1);
                int i3 = this.f16259l;
                int i4 = this.f16256l;
                AbstractC11173l.yandex(i3, i4, (Function0) obj6, (Function1) obj5, (Function0) obj4, (InterfaceC17242l) obj3, (C6956l) obj, iPurchase2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C7753l(InterfaceC17045l interfaceC17045l, String str, InterfaceC12001l interfaceC12001l, int i, C2607l c2607l, int i2, int i3) {
        this.f16261l = interfaceC17045l;
        this.f16263l = str;
        this.f16257l = interfaceC12001l;
        this.f16259l = i;
        this.f16258l = c2607l;
        this.f16256l = i2;
        this.f16262l = i3;
    }
}
