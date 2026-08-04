package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٍؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4186l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f8594l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f8595l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f8596l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8597l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8598l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f8599l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f8600l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f8601l;

    public /* synthetic */ C4186l(int i, InterfaceC17242l interfaceC17242l, String str, String str2, String str3, Function0 function0, boolean z) {
        this.f8599l = str;
        this.f8601l = str2;
        this.f8595l = str3;
        this.f8596l = function0;
        this.f8597l = z;
        this.f8594l = interfaceC17242l;
        this.f8600l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8598l;
        int i2 = this.f8600l;
        Object obj3 = this.f8596l;
        Object obj4 = this.f8595l;
        Object obj5 = this.f8601l;
        Object obj6 = this.f8599l;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj3;
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                AbstractC12225l.loadAd(iPurchase, (C6956l) obj, this.f8594l, (String) obj6, (String) obj5, (String) obj4, function0, this.f8597l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                AbstractC6710l.loadAd(this.f8597l, (EnumC13846l) obj6, this.f8594l, (C7259l) obj5, (C0404l) obj4, (C0404l) obj3, (C6956l) obj, iPurchase2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                AbstractC4830l.crashlytics((String) obj6, this.f8597l, (C3541l) obj5, this.f8594l, (Function3) obj4, (Function0) obj3, (C6956l) obj, iPurchase3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4186l(String str, boolean z, C3541l c3541l, InterfaceC17242l interfaceC17242l, Function3 function3, Function0 function0, int i) {
        this.f8599l = str;
        this.f8597l = z;
        this.f8601l = c3541l;
        this.f8594l = interfaceC17242l;
        this.f8595l = function3;
        this.f8596l = function0;
        this.f8600l = i;
    }

    public /* synthetic */ C4186l(boolean z, EnumC13846l enumC13846l, InterfaceC17242l interfaceC17242l, C7259l c7259l, C0404l c0404l, C0404l c0404l2, int i) {
        this.f8597l = z;
        this.f8599l = enumC13846l;
        this.f8594l = interfaceC17242l;
        this.f8601l = c7259l;
        this.f8595l = c0404l;
        this.f8596l = c0404l2;
        this.f8600l = i;
    }
}
