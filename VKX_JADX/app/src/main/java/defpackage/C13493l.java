package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚْٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13493l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f26502l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f26503l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26504l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f26505l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f26506l;

    public /* synthetic */ C13493l(C7659l c7659l, int i, boolean z, boolean z2, int i2) {
        this.f26506l = c7659l;
        this.f26505l = i;
        this.f26503l = z;
        this.f26502l = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f26504l;
        int i2 = this.f26505l;
        boolean z = this.f26502l;
        boolean z2 = this.f26503l;
        Object obj3 = this.f26506l;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                AbstractC17824l.loadAd(iPurchase, (C6956l) obj, (Function0) obj3, z2, z);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                AbstractC17824l.amazon(iPurchase2, (C6956l) obj, (Function0) obj3, z2, z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(433);
                ((C7659l) obj3).m2193import(this.f26505l, iPurchase3, (C6956l) obj, this.f26503l, this.f26502l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C13493l(Function0 function0, boolean z, boolean z2, int i) {
        this.f26506l = function0;
        this.f26503l = z;
        this.f26502l = z2;
        this.f26505l = i;
    }

    public /* synthetic */ C13493l(boolean z, boolean z2, Function0 function0, int i) {
        this.f26503l = z;
        this.f26502l = z2;
        this.f26506l = function0;
        this.f26505l = i;
    }
}
