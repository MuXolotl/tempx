package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍُٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10939l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f22060l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22061l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f22062l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f22063l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22064l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f22065l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f22066l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f22067l;

    public /* synthetic */ C10939l(C4975l c4975l, Function1 function1, Function0 function0, int i, C7117l c7117l, InterfaceC17242l interfaceC17242l, int i2) {
        this.f22067l = c4975l;
        this.f22066l = function1;
        this.f22061l = function0;
        this.f22063l = i;
        this.f22062l = c7117l;
        this.f22065l = interfaceC17242l;
        this.f22060l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f22064l;
        Object obj3 = this.f22062l;
        Object obj4 = this.f22061l;
        Object obj5 = this.f22067l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(1 | this.f22060l);
                ((C4975l) obj5).m1658import(this.f22066l, (Function0) obj4, this.f22063l, (C7117l) obj3, this.f22065l, (C6956l) obj, iPurchase);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(1);
                AbstractC8007l.billing((String) obj5, (C16016l) obj4, this.f22063l, this.f22060l, this.f22066l, (Function1) obj3, this.f22065l, (C6956l) obj, iPurchase2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C10939l(String str, C16016l c16016l, int i, int i2, Function1 function1, Function1 function2, InterfaceC17242l interfaceC17242l, int i3) {
        this.f22067l = str;
        this.f22061l = c16016l;
        this.f22063l = i;
        this.f22060l = i2;
        this.f22066l = function1;
        this.f22062l = function2;
        this.f22065l = interfaceC17242l;
    }
}
