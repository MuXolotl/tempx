package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٞۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8173l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f17056l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f17057l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17058l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f17059l;

    public /* synthetic */ C8173l(long j, int i, Function2 function2, int i2) {
        this.f17057l = j;
        this.f17056l = i;
        this.f17059l = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17058l) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(49);
                AbstractC13319l.crashlytics(this.f17057l, this.f17056l, (Function2) this.f17059l, (C6956l) obj, iPurchase);
                break;
            default:
                InterfaceC17242l interfaceC17242l = (InterfaceC17242l) this.f17059l;
                ((Integer) obj2).getClass();
                AbstractC4111l.loadAd(AbstractC0545l.purchase(this.f17056l | 1), this.f17057l, (C6956l) obj, interfaceC17242l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C8173l(long j, InterfaceC17242l interfaceC17242l, int i) {
        this.f17057l = j;
        this.f17059l = interfaceC17242l;
        this.f17056l = i;
    }
}
