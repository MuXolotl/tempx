package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12348l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f24446l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24447l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24448l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f24449l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f24450l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f24451l;

    public /* synthetic */ C12348l(AbstractC18082l abstractC18082l, InterfaceC17242l interfaceC17242l, C15578l c15578l, int i, int i2) {
        this.f24448l = 2;
        this.f24449l = abstractC18082l;
        this.f24447l = interfaceC17242l;
        this.f24451l = c15578l;
        this.f24446l = i;
        this.f24450l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24448l;
        int i2 = this.f24446l;
        int i3 = this.f24450l;
        Object obj3 = this.f24449l;
        Object obj4 = this.f24447l;
        Object obj5 = this.f24451l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C13849l) obj3).m3786abstract((String) obj5, this.f24446l, (InterfaceC17242l) obj4, (C6956l) obj, AbstractC0545l.purchase(i3 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC11308l.yandex((InterfaceC17242l) obj4, (InterfaceC13460l) obj3, (C15578l) obj5, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), this.f24450l);
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4107l.yandex((AbstractC18082l) obj3, (InterfaceC17242l) obj4, (C15578l) obj5, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), this.f24450l);
                break;
            case 3:
                C15578l c15578l = (C15578l) obj4;
                C6956l c6956l = (C6956l) obj;
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i3 | 1);
                AbstractC15497l.yandex(this.f24449l, this.f24446l, (C16141l) obj5, c15578l, c6956l, iPurchase);
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i3 | 1);
                int i4 = this.f24446l;
                ((C13550l) obj3).mopub(i4, iPurchase2, c6956l2, (InterfaceC17242l) obj4, (Function1) obj5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12348l(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        this.f24448l = i3;
        this.f24449l = obj;
        this.f24446l = i;
        this.f24451l = obj2;
        this.f24447l = obj3;
        this.f24450l = i2;
    }

    public /* synthetic */ C12348l(C13849l c13849l, String str, int i, InterfaceC17242l interfaceC17242l, int i2) {
        this.f24448l = 0;
        this.f24449l = c13849l;
        this.f24451l = str;
        this.f24446l = i;
        this.f24447l = interfaceC17242l;
        this.f24450l = i2;
    }

    public /* synthetic */ C12348l(InterfaceC17242l interfaceC17242l, InterfaceC13460l interfaceC13460l, C15578l c15578l, int i, int i2) {
        this.f24448l = 1;
        this.f24447l = interfaceC17242l;
        this.f24449l = interfaceC13460l;
        this.f24451l = c15578l;
        this.f24446l = i;
        this.f24450l = i2;
    }
}
