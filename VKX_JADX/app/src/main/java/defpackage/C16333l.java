package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lِٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16333l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14328l f31940l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f31941l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f31942l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31943l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31944l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f31945l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f31946l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f31947l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f31948l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f31949l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f31950l;

    public /* synthetic */ C16333l(InterfaceC14328l interfaceC14328l, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        this.f31944l = i2;
        this.f31940l = interfaceC14328l;
        this.f31947l = obj;
        this.f31946l = obj2;
        this.f31949l = obj3;
        this.f31941l = obj4;
        this.f31942l = obj5;
        this.f31948l = obj6;
        this.f31945l = obj7;
        this.f31950l = obj8;
        this.f31943l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31944l;
        int i2 = this.f31943l;
        InterfaceC14328l interfaceC14328l = this.f31940l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6419l.loadAd((Function0) interfaceC14328l, (InterfaceC17242l) this.f31947l, (C5069l) this.f31946l, (C3665l) this.f31949l, (C5894l) this.f31941l, (C9103l) this.f31942l, (C8013l) this.f31948l, (InterfaceC11780l) this.f31945l, (Function3) this.f31950l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2) | 1;
                ((C15578l) interfaceC14328l).metrica(this.f31947l, this.f31946l, this.f31949l, this.f31941l, this.f31942l, this.f31948l, this.f31945l, this.f31950l, (C6956l) obj, iPurchase);
                break;
        }
        return Unit.INSTANCE;
    }
}
