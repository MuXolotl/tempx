package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٔ۠ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15225l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ float f29821l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f29822l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29823l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f29824l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f29825l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f29826l;

    public /* synthetic */ C15225l(InterfaceC17242l interfaceC17242l, float f, long j, int i, int i2, int i3) {
        this.f29823l = i3;
        this.f29822l = interfaceC17242l;
        this.f29821l = f;
        this.f29825l = j;
        this.f29824l = i;
        this.f29826l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29823l) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0555l.crashlytics(this.f29822l, this.f29821l, this.f29825l, (C6956l) obj, AbstractC0545l.purchase(this.f29824l | 1), this.f29826l);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0555l.loadAd(this.f29822l, this.f29821l, this.f29825l, (C6956l) obj, AbstractC0545l.purchase(this.f29824l | 1), this.f29826l);
                break;
        }
        return Unit.INSTANCE;
    }
}
