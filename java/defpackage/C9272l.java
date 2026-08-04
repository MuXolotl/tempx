package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9272l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f19065l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19066l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19067l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19068l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19069l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f19070l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f19071l;

    public /* synthetic */ C9272l(boolean z, Function1 function1, InterfaceC17242l interfaceC17242l, C15578l c15578l, int i, int i2) {
        this.f19068l = 2;
        this.f19069l = z;
        this.f19067l = function1;
        this.f19070l = interfaceC17242l;
        this.f19065l = c15578l;
        this.f19071l = i;
        this.f19066l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19068l;
        int i2 = this.f19071l;
        InterfaceC14328l interfaceC14328l = this.f19065l;
        Object obj3 = this.f19067l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0124l.loadAd((InterfaceC5475l) obj3, (Function0) interfaceC14328l, this.f19070l, this.f19069l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), this.f19066l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0124l.loadAd((InterfaceC5475l) obj3, (Function0) interfaceC14328l, this.f19070l, this.f19069l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), this.f19066l);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                boolean z = this.f19069l;
                InterfaceC17242l interfaceC17242l = this.f19070l;
                AbstractC17824l.yandex(z, (Function1) obj3, interfaceC17242l, (C15578l) interfaceC14328l, (C6956l) obj, iPurchase, this.f19066l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9272l(InterfaceC5475l interfaceC5475l, Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, int i, int i2, int i3) {
        this.f19068l = i3;
        this.f19067l = interfaceC5475l;
        this.f19065l = function0;
        this.f19070l = interfaceC17242l;
        this.f19069l = z;
        this.f19071l = i;
        this.f19066l = i2;
    }
}
