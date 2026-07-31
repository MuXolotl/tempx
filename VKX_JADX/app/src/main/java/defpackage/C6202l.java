package defpackage;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6202l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f13085l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13086l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f13087l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13088l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13089l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f13090l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f13091l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f13092l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f13093l;

    public /* synthetic */ C6202l(C6576l c6576l, InterfaceC17242l interfaceC17242l, boolean z, C16875l c16875l, Function1 function1, Function1 function2, C7363l c7363l, C14766l c14766l, int i) {
        this.f13091l = c6576l;
        this.f13088l = interfaceC17242l;
        this.f13085l = z;
        this.f13090l = c16875l;
        this.f13093l = function1;
        this.f13086l = function2;
        this.f13087l = c7363l;
        this.f13092l = c14766l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f13089l;
        Object obj3 = this.f13092l;
        Object obj4 = this.f13087l;
        Object obj5 = this.f13086l;
        Object obj6 = this.f13093l;
        Object obj7 = this.f13088l;
        Object obj8 = this.f13090l;
        Object obj9 = this.f13091l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(805306369);
                AbstractC17457l.amazon((Function0) obj9, (C15521l) obj8, (InterfaceC17242l) obj7, this.f13085l, (C13412l) obj6, (C5028l) obj5, (InterfaceC11780l) obj4, (C15578l) obj3, (C6956l) obj, iPurchase);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(1);
                AbstractC17981l.yandex((C6576l) obj9, (InterfaceC17242l) obj7, this.f13085l, (C16875l) obj8, (Function1) obj6, (Function1) obj5, (C7363l) obj4, (C14766l) obj3, (C6956l) obj, iPurchase2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(385);
                AbstractC17981l.loadAd((C6576l) obj9, (FrameLayout.LayoutParams) obj8, this.f13085l, (C16875l) obj7, (Function1) obj6, (Function1) obj5, (C7363l) obj4, (C14766l) obj3, (C6956l) obj, iPurchase3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6202l(C6576l c6576l, FrameLayout.LayoutParams layoutParams, boolean z, C16875l c16875l, Function1 function1, Function1 function2, C7363l c7363l, C14766l c14766l, int i) {
        this.f13091l = c6576l;
        this.f13090l = layoutParams;
        this.f13085l = z;
        this.f13088l = c16875l;
        this.f13093l = function1;
        this.f13086l = function2;
        this.f13087l = c7363l;
        this.f13092l = c14766l;
    }

    public /* synthetic */ C6202l(Function0 function0, C15521l c15521l, InterfaceC17242l interfaceC17242l, boolean z, C13412l c13412l, C5028l c5028l, InterfaceC11780l interfaceC11780l, C15578l c15578l, int i) {
        this.f13091l = function0;
        this.f13090l = c15521l;
        this.f13088l = interfaceC17242l;
        this.f13085l = z;
        this.f13093l = c13412l;
        this.f13086l = c5028l;
        this.f13087l = interfaceC11780l;
        this.f13092l = c15578l;
    }
}
