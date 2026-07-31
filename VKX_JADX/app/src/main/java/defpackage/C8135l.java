package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًٜۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8135l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13994l f17001l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C8232l f17002l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f17003l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17004l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f17005l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C17385l f17006l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ int f17007l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C17385l f17008l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ long f17009l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8135l(C13994l c13994l, C17385l c17385l, int i, C8232l c8232l, boolean z, int i2, int i3, long j) {
        super(10);
        this.f17008l = c17385l;
        this.f17002l = c8232l;
        this.f17003l = z;
        this.f17007l = i2;
        this.f17004l = i3;
        this.f17009l = j;
        this.f17001l = c13994l;
        this.f17006l = c17385l;
        this.f17005l = i;
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؓۤٚ */
    public final InterfaceC9146l mo207l(int i, int i2, int i3, long j) {
        return m2273l(i, i2, i3, this.f17005l, j);
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final C9696l m2273l(int i, int i2, int i3, int i4, long j) {
        int iSubs;
        C13994l c13994l = this.f17001l;
        Object objLoadAd = c13994l.loadAd(i);
        Object objPurchase = c13994l.loadAd.purchase(i);
        List listM206l = m206l(this.f17006l, i, j);
        if (C15519l.billing(j)) {
            iSubs = C15519l.isPro(j);
        } else {
            if (!C15519l.purchase(j)) {
                AbstractC14825l.yandex("does not have fixed height");
            }
            iSubs = C15519l.subs(j);
        }
        int i5 = iSubs;
        EnumC9931l layoutDirection = this.f17008l.f33850l.getLayoutDirection();
        C12660l c12660l = this.f17002l.remoteconfig;
        return new C9696l(i, objLoadAd, this.f17003l, i5, i4, layoutDirection, this.f17007l, this.f17004l, listM206l, this.f17009l, objPurchase, c12660l, j, i2, i3);
    }
}
