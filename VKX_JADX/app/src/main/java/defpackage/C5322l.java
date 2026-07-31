package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗۨۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5322l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f11450l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f11451l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11452l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f11453l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f11454l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f11455l;

    public /* synthetic */ C5322l(String str, Function1 function1, Function0 function0, boolean z, boolean z2, int i) {
        this.f11452l = 3;
        this.f11450l = str;
        this.f11453l = function1;
        this.f11455l = function0;
        this.f11451l = z;
        this.f11454l = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11452l) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(1);
                AbstractC6710l.yandex(this.f11451l, (Function1) this.f11453l, (InterfaceC17242l) this.f11450l, this.f11454l, (C7259l) this.f11455l, (C6956l) obj, iPurchase);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(1);
                AbstractC0676l.yandex(this.f11451l, (Function0) this.f11453l, (InterfaceC17242l) this.f11450l, this.f11454l, (C16267l) this.f11455l, (C6956l) obj, iPurchase2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(196609);
                AbstractC18219l.subscription((Function0) this.f11453l, this.f11451l, (InterfaceC17242l) this.f11450l, (InterfaceC6347l) this.f11455l, this.f11454l, (C6956l) obj, iPurchase3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase4 = AbstractC0545l.purchase(1);
                AbstractC7252l.loadAd((String) this.f11450l, (Function1) this.f11453l, (Function0) this.f11455l, this.f11451l, this.f11454l, (C6956l) obj, iPurchase4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5322l(Function0 function0, boolean z, InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, boolean z2, int i) {
        this.f11452l = 2;
        this.f11453l = function0;
        this.f11451l = z;
        this.f11450l = interfaceC17242l;
        this.f11455l = interfaceC6347l;
        this.f11454l = z2;
    }

    public /* synthetic */ C5322l(boolean z, InterfaceC14328l interfaceC14328l, InterfaceC17242l interfaceC17242l, boolean z2, Object obj, int i, int i2) {
        this.f11452l = i2;
        this.f11451l = z;
        this.f11453l = interfaceC14328l;
        this.f11450l = interfaceC17242l;
        this.f11454l = z2;
        this.f11455l = obj;
    }
}
