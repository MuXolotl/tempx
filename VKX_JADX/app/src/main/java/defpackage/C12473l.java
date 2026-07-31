package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lٌِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12473l extends Cgoto {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ int f24600l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C17602l f24601l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C17385l f24602l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24603l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6947l f24604l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ C5866l f24605l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f24606l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C17385l f24607l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ int f24608l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ int f24609l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ boolean f24610l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C0086l f24611l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ long f24612l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12473l(long j, boolean z, C17602l c17602l, C17385l c17385l, int i, int i2, InterfaceC6947l interfaceC6947l, C0086l c0086l, int i3, int i4, long j2, C5866l c5866l) {
        super(10);
        this.f24610l = z;
        this.f24602l = c17385l;
        this.f24603l = i;
        this.f24609l = i2;
        this.f24604l = interfaceC6947l;
        this.f24611l = c0086l;
        this.f24608l = i3;
        this.f24600l = i4;
        this.f24612l = j2;
        this.f24605l = c5866l;
        this.f24601l = c17602l;
        this.f24607l = c17385l;
        this.f24606l = AbstractC7563l.loadAd(0, z ? C15519l.admob(j) : Integer.MAX_VALUE, 0, z ? Alert.DURATION_SHOW_INDEFINITELY : C15519l.mopub(j), 5);
    }

    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lؓۤٚ */
    public final InterfaceC9146l mo207l(int i, int i2, int i3, long j) {
        return m3384l(i, j);
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final C15237l m3384l(int i, long j) {
        C17602l c17602l = this.f24601l;
        Object objLoadAd = c17602l.loadAd(i);
        Object objPurchase = c17602l.loadAd.purchase(i);
        return new C15237l(i, m206l(this.f24607l, i, j), this.f24610l, this.f24604l, this.f24611l, this.f24602l.f33850l.getLayoutDirection(), this.f24608l, this.f24600l, i == this.f24603l + (-1) ? 0 : this.f24609l, this.f24612l, objLoadAd, objPurchase, this.f24605l.metrica, j);
    }
}
