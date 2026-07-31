package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؖٛؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4227l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f8653l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f8654l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f8655l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f8656l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8657l = 3;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f8658l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f8659l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f8660l;

    public /* synthetic */ C4227l(int i, Function2 function2, C15578l c15578l, Function2 function3, Function2 function4, C16721l c16721l, Function2 function5) {
        this.f8653l = i;
        this.f8659l = function2;
        this.f8656l = c15578l;
        this.f8658l = function3;
        this.f8660l = function4;
        this.f8654l = c16721l;
        this.f8655l = function5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8657l;
        int i2 = this.f8653l;
        Object obj3 = this.f8655l;
        Object obj4 = this.f8654l;
        Object obj5 = this.f8660l;
        Object obj6 = this.f8658l;
        Object obj7 = this.f8659l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0133l.yandex((InterfaceC16711l) obj7, this.f8656l, (C15178l) obj5, (InterfaceC17242l) obj4, (Function0) obj3, (C15578l) obj6, (C6956l) obj, AbstractC0545l.purchase(1 | i2));
                break;
            case 1:
                ((Integer) obj2).getClass();
                this.f8656l.isPro(this.f8659l, this.f8658l, this.f8660l, this.f8654l, this.f8655l, (C6956l) obj, AbstractC0545l.purchase(i2) | 1);
                break;
            case 2:
                Function2 function2 = (Function2) obj7;
                Function2 function3 = (Function2) obj6;
                Function2 function4 = (Function2) obj5;
                C16721l c16721l = (C16721l) obj4;
                Function2 function5 = (Function2) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(1 & iIntValue, (iIntValue & 3) != 2)) {
                    AbstractC15497l.crashlytics(this.f8653l, function2, this.f8656l, function3, function4, c16721l, function5, c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC15497l.crashlytics(this.f8653l, (Function2) obj7, this.f8656l, (Function2) obj6, (Function2) obj5, (InterfaceC10137l) obj4, (Function2) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4227l(int i, Function2 function2, C15578l c15578l, Function2 function3, Function2 function4, InterfaceC10137l interfaceC10137l, Function2 function5, int i2) {
        this.f8653l = i;
        this.f8659l = function2;
        this.f8656l = c15578l;
        this.f8658l = function3;
        this.f8660l = function4;
        this.f8654l = interfaceC10137l;
        this.f8655l = function5;
    }

    public /* synthetic */ C4227l(C15578l c15578l, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f8656l = c15578l;
        this.f8659l = obj;
        this.f8658l = obj2;
        this.f8660l = obj3;
        this.f8654l = obj4;
        this.f8655l = obj5;
        this.f8653l = i;
    }

    public /* synthetic */ C4227l(InterfaceC16711l interfaceC16711l, C15578l c15578l, C15178l c15178l, InterfaceC17242l interfaceC17242l, Function0 function0, C15578l c15578l2, int i) {
        this.f8659l = interfaceC16711l;
        this.f8656l = c15578l;
        this.f8660l = c15178l;
        this.f8654l = interfaceC17242l;
        this.f8655l = function0;
        this.f8658l = c15578l2;
        this.f8653l = i;
    }
}
