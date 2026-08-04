package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌؙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8602l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f17737l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17738l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f17739l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f17740l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17741l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17742l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f17743l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f17744l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f17745l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f17746l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Object f17747l;

    public /* synthetic */ C8602l(Function2 function2, Function0 function0, InterfaceC17242l interfaceC17242l, Function2 function3, Function2 function4, boolean z, C3500l c3500l, InterfaceC11780l interfaceC11780l, int i, int i2) {
        this.f17741l = 0;
        this.f17739l = function2;
        this.f17740l = function0;
        this.f17737l = interfaceC17242l;
        this.f17745l = function3;
        this.f17742l = function4;
        this.f17744l = z;
        this.f17747l = c3500l;
        this.f17743l = interfaceC11780l;
        this.f17746l = i;
        this.f17738l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17741l;
        int i2 = this.f17746l;
        Object obj3 = this.f17743l;
        Object obj4 = this.f17747l;
        Object obj5 = this.f17742l;
        Object obj6 = this.f17745l;
        Object obj7 = this.f17739l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                AbstractC16727l.loadAd((Function2) obj7, this.f17740l, this.f17737l, (Function2) obj6, (Function2) obj5, this.f17744l, (C3500l) obj4, (InterfaceC11780l) obj3, (C6956l) obj, iPurchase, this.f17738l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                AbstractC17457l.purchase(this.f17740l, this.f17737l, this.f17744l, (InterfaceC6347l) obj7, (C13412l) obj6, (C5028l) obj5, (InterfaceC11780l) obj3, (C15578l) obj4, (C6956l) obj, iPurchase2, this.f17738l);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                AbstractC17457l.crashlytics(this.f17740l, this.f17737l, this.f17744l, (InterfaceC6347l) obj7, (C13412l) obj6, (C1570l) obj5, (InterfaceC11780l) obj3, (C15578l) obj4, (C6956l) obj, iPurchase3, this.f17738l);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iPurchase4 = AbstractC0545l.purchase(i2 | 1);
                AbstractC3383l.loadAd(this.f17740l, this.f17737l, this.f17744l, (InterfaceC6347l) obj7, (C12654l) obj6, (C7224l) obj5, (C5028l) obj4, (Function3) obj3, (C6956l) obj, iPurchase4, this.f17738l);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase5 = AbstractC0545l.purchase(i2 | 1);
                AbstractC3383l.purchase(this.f17740l, this.f17737l, this.f17744l, (InterfaceC6347l) obj7, (C12654l) obj6, (C7224l) obj5, (C5028l) obj4, (C15578l) obj3, (C6956l) obj, iPurchase5, this.f17738l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C8602l(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C12654l c12654l, C7224l c7224l, C5028l c5028l, Function3 function3, int i, int i2, int i3) {
        this.f17741l = i3;
        this.f17740l = function0;
        this.f17737l = interfaceC17242l;
        this.f17744l = z;
        this.f17739l = interfaceC6347l;
        this.f17745l = c12654l;
        this.f17742l = c7224l;
        this.f17747l = c5028l;
        this.f17743l = function3;
        this.f17746l = i;
        this.f17738l = i2;
    }

    public /* synthetic */ C8602l(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C13412l c13412l, Object obj, InterfaceC11780l interfaceC11780l, C15578l c15578l, int i, int i2, int i3) {
        this.f17741l = i3;
        this.f17740l = function0;
        this.f17737l = interfaceC17242l;
        this.f17744l = z;
        this.f17739l = interfaceC6347l;
        this.f17745l = c13412l;
        this.f17742l = obj;
        this.f17743l = interfaceC11780l;
        this.f17747l = c15578l;
        this.f17746l = i;
        this.f17738l = i2;
    }
}
