package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12336l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f24424l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f24425l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24426l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f24427l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f24428l;

    public /* synthetic */ C12336l(InterfaceC17242l interfaceC17242l, Function0 function0, boolean z, int i) {
        this.f24427l = interfaceC17242l;
        this.f24428l = function0;
        this.f24425l = z;
        this.f24424l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24426l) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(this.f24424l | 1);
                AbstractC5103l.crashlytics(this.f24427l, this.f24428l, this.f24425l, (C6956l) obj, iPurchase);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(24961);
                AbstractC8007l.admob(this.f24425l, this.f24424l, this.f24428l, this.f24427l, (C6956l) obj, iPurchase2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12336l(boolean z, int i, Function0 function0, InterfaceC17242l interfaceC17242l, int i2) {
        this.f24425l = z;
        this.f24424l = i;
        this.f24428l = function0;
        this.f24427l = interfaceC17242l;
    }
}
