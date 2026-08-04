package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٕٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8017l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f16688l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16689l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f16690l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f16691l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16692l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f16693l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ boolean f16694l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f16695l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ int f16696l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f16697l;

    public /* synthetic */ C8017l(C3809l c3809l, boolean z, Function0 function0, InterfaceC17242l interfaceC17242l, Function0 function1, boolean z2, C11971l c11971l, C15578l c15578l, int i) {
        this.f16692l = 2;
        this.f16688l = c3809l;
        this.f16691l = z;
        this.f16693l = function0;
        this.f16695l = interfaceC17242l;
        this.f16697l = function1;
        this.f16694l = z2;
        this.f16689l = c11971l;
        this.f16690l = c15578l;
        this.f16696l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16692l;
        int i2 = this.f16696l;
        Object obj3 = this.f16689l;
        Object obj4 = this.f16697l;
        Object obj5 = this.f16693l;
        Object obj6 = this.f16688l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                AbstractC7470l.remoteconfig(this.f16691l, (Function1) obj6, this.f16695l, this.f16694l, (C12804l) obj5, (C7708l) obj4, (C2403l) obj3, this.f16690l, (C6956l) obj, iPurchase);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                AbstractC7470l.vip(this.f16691l, (Function1) obj6, this.f16695l, this.f16694l, (InterfaceC6347l) obj5, (C7708l) obj4, (C2403l) obj3, this.f16690l, (C6956l) obj, iPurchase2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                AbstractC0079l.yandex((C3809l) obj6, this.f16691l, (Function0) obj5, this.f16695l, (Function0) obj4, this.f16694l, (C11971l) obj3, this.f16690l, (C6956l) obj, iPurchase3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C8017l(boolean z, Function1 function1, InterfaceC17242l interfaceC17242l, boolean z2, Object obj, C7708l c7708l, C2403l c2403l, C15578l c15578l, int i, int i2) {
        this.f16692l = i2;
        this.f16691l = z;
        this.f16688l = function1;
        this.f16695l = interfaceC17242l;
        this.f16694l = z2;
        this.f16693l = obj;
        this.f16697l = c7708l;
        this.f16689l = c2403l;
        this.f16690l = c15578l;
        this.f16696l = i;
    }
}
