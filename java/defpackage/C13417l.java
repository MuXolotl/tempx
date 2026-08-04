package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lْٖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13417l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f26317l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f26318l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26319l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ long f26320l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ float f26321l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f26322l;

    public /* synthetic */ C13417l(float f, InterfaceC17242l interfaceC17242l, long j, long j2, int i, int i2) {
        this.f26321l = f;
        this.f26318l = interfaceC17242l;
        this.f26317l = j;
        this.f26320l = j2;
        this.f26322l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26319l) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(49);
                AbstractC4332l.crashlytics(this.f26321l, this.f26322l, iPurchase, this.f26317l, this.f26320l, (C6956l) obj, this.f26318l);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(391);
                AbstractC16978l.yandex(this.f26321l, this.f26322l, iPurchase2, this.f26317l, this.f26320l, (C6956l) obj, this.f26318l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C13417l(InterfaceC17242l interfaceC17242l, long j, float f, long j2, int i, int i2) {
        this.f26318l = interfaceC17242l;
        this.f26317l = j;
        this.f26321l = f;
        this.f26320l = j2;
        this.f26322l = i;
    }
}
