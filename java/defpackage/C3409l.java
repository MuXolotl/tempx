package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3409l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f7263l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f7264l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7265l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f7266l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f7267l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f7268l;

    public /* synthetic */ C3409l(C15578l c15578l, C15578l c15578l2, Function2 function2, long j, int i) {
        this.f7263l = c15578l;
        this.f7266l = c15578l2;
        this.f7268l = function2;
        this.f7264l = j;
        this.f7267l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f7265l;
        int i2 = this.f7267l;
        Object obj3 = this.f7268l;
        InterfaceC14328l interfaceC14328l = this.f7266l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                C15578l c15578l = this.f7263l;
                AbstractC10547l.yandex(c15578l, (C15578l) interfaceC14328l, (Function2) obj3, this.f7264l, (C6956l) obj, iPurchase);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                long j = this.f7264l;
                AbstractC7016l.yandex((Function0) interfaceC14328l, j, (C15721l) obj3, this.f7263l, (C6956l) obj, iPurchase2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C3409l(Function0 function0, long j, C15721l c15721l, C15578l c15578l, int i) {
        this.f7266l = function0;
        this.f7264l = j;
        this.f7268l = c15721l;
        this.f7263l = c15578l;
        this.f7267l = i;
    }
}
