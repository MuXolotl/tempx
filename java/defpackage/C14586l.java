package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓۨۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14586l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f28552l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f28553l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f28554l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f28555l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28556l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f28557l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f28558l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f28559l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f28560l;

    public /* synthetic */ C14586l(C5766l c5766l, boolean z, C13939l c13939l, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        this.f28556l = 0;
        this.f28557l = c5766l;
        this.f28552l = z;
        this.f28560l = c13939l;
        this.f28555l = function0;
        this.f28553l = function1;
        this.f28554l = function2;
        this.f28559l = function3;
        this.f28558l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f28556l;
        int i2 = this.f28558l;
        Object obj3 = this.f28559l;
        Object obj4 = this.f28560l;
        Object obj5 = this.f28554l;
        Object obj6 = this.f28553l;
        Object obj7 = this.f28557l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                ((C5766l) obj7).m1849abstract(this.f28552l, (C13939l) obj4, this.f28555l, (Function0) obj6, (Function0) obj5, (Function0) obj3, (C6956l) obj, iPurchase);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(1 | i2);
                AbstractC0133l.crashlytics((InterfaceC16711l) obj7, (C15178l) obj4, this.f28555l, (InterfaceC2262l) obj6, this.f28552l, (InterfaceC8714l) obj5, (C15578l) obj3, (C6956l) obj, iPurchase2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                AbstractC17457l.billing(this.f28555l, (C15521l) obj7, (InterfaceC17242l) obj4, this.f28552l, (C13412l) obj6, (InterfaceC11780l) obj5, (C15578l) obj3, (C6956l) obj, iPurchase3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iPurchase4 = AbstractC0545l.purchase(i2 | 1);
                AbstractC6710l.crashlytics((EnumC13846l) obj7, this.f28555l, (C0404l) obj4, (C0404l) obj6, (InterfaceC17242l) obj5, this.f28552l, (C7259l) obj3, (C6956l) obj, iPurchase4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iPurchase5 = AbstractC0545l.purchase(i2 | 1);
                AbstractC7470l.smaato(this.f28555l, (InterfaceC17242l) obj7, this.f28552l, (InterfaceC6347l) obj4, (C17076l) obj6, (C2403l) obj5, (C15578l) obj3, (C6956l) obj, iPurchase5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iPurchase6 = AbstractC0545l.purchase(i2 | 1);
                AbstractC7470l.purchase(this.f28555l, (C11607l) obj7, (InterfaceC17242l) obj4, this.f28552l, (C17076l) obj6, (C2403l) obj5, (C15578l) obj3, (C6956l) obj, iPurchase6);
                break;
            case 6:
                ((Integer) obj2).intValue();
                int iPurchase7 = AbstractC0545l.purchase(i2 | 1);
                AbstractC7470l.mopub((InterfaceC17242l) obj7, this.f28555l, this.f28552l, (InterfaceC6347l) obj4, (C17076l) obj6, (C2403l) obj5, (Function2) obj3, (C6956l) obj, iPurchase7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase8 = AbstractC0545l.purchase(1);
                AbstractC15918l.billing((C4964l) obj7, this.f28555l, (Function0) obj6, (Function0) obj5, (C0247l) obj4, (String) obj3, this.f28558l, this.f28552l, (C6956l) obj, iPurchase8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C14586l(InterfaceC17242l interfaceC17242l, Function0 function0, boolean z, InterfaceC6347l interfaceC6347l, C17076l c17076l, C2403l c2403l, Function2 function2, int i) {
        this.f28556l = 6;
        this.f28557l = interfaceC17242l;
        this.f28555l = function0;
        this.f28552l = z;
        this.f28560l = interfaceC6347l;
        this.f28553l = c17076l;
        this.f28554l = c2403l;
        this.f28559l = function2;
        this.f28558l = i;
    }

    public /* synthetic */ C14586l(InterfaceC16711l interfaceC16711l, C15178l c15178l, Function0 function0, InterfaceC2262l interfaceC2262l, boolean z, InterfaceC8714l interfaceC8714l, C15578l c15578l, int i) {
        this.f28556l = 1;
        this.f28557l = interfaceC16711l;
        this.f28560l = c15178l;
        this.f28555l = function0;
        this.f28553l = interfaceC2262l;
        this.f28552l = z;
        this.f28554l = interfaceC8714l;
        this.f28559l = c15578l;
        this.f28558l = i;
    }

    public /* synthetic */ C14586l(EnumC13846l enumC13846l, Function0 function0, C0404l c0404l, C0404l c0404l2, InterfaceC17242l interfaceC17242l, boolean z, C7259l c7259l, int i) {
        this.f28556l = 3;
        this.f28557l = enumC13846l;
        this.f28555l = function0;
        this.f28560l = c0404l;
        this.f28553l = c0404l2;
        this.f28554l = interfaceC17242l;
        this.f28552l = z;
        this.f28559l = c7259l;
        this.f28558l = i;
    }

    public /* synthetic */ C14586l(C4964l c4964l, Function0 function0, Function0 function1, Function0 function2, C0247l c0247l, String str, int i, boolean z, int i2) {
        this.f28556l = 7;
        this.f28557l = c4964l;
        this.f28555l = function0;
        this.f28553l = function1;
        this.f28554l = function2;
        this.f28560l = c0247l;
        this.f28559l = str;
        this.f28558l = i;
        this.f28552l = z;
    }

    public /* synthetic */ C14586l(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C17076l c17076l, C2403l c2403l, C15578l c15578l, int i) {
        this.f28556l = 4;
        this.f28555l = function0;
        this.f28557l = interfaceC17242l;
        this.f28552l = z;
        this.f28560l = interfaceC6347l;
        this.f28553l = c17076l;
        this.f28554l = c2403l;
        this.f28559l = c15578l;
        this.f28558l = i;
    }

    public /* synthetic */ C14586l(Function0 function0, Object obj, InterfaceC17242l interfaceC17242l, boolean z, Object obj2, Object obj3, C15578l c15578l, int i, int i2) {
        this.f28556l = i2;
        this.f28555l = function0;
        this.f28557l = obj;
        this.f28560l = interfaceC17242l;
        this.f28552l = z;
        this.f28553l = obj2;
        this.f28554l = obj3;
        this.f28559l = c15578l;
        this.f28558l = i;
    }
}
