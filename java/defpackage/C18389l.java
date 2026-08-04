package defpackage;

import java.io.Closeable;

/* JADX INFO: renamed from: lؚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18389l implements Closeable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final long f35905l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f35906l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AbstractC6897l f35907l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final InterfaceC1361l f35908l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final boolean f35909l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC9199l f35910l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17032l f35911l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C18389l f35912l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final InterfaceC14341l f35913l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C13478l f35914l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f35915l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final long f35916l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C18389l f35917l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8309l f35918l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C18389l f35919l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C4619l f35920l;

    public C18389l(C17032l c17032l, EnumC9199l enumC9199l, String str, int i, C13478l c13478l, C8309l c8309l, AbstractC6897l abstractC6897l, InterfaceC1361l interfaceC1361l, C18389l c18389l, C18389l c18389l2, C18389l c18389l3, long j, long j2, C4619l c4619l, InterfaceC14341l interfaceC14341l) {
        this.f35911l = c17032l;
        this.f35910l = enumC9199l;
        this.f35906l = str;
        this.f35915l = i;
        this.f35914l = c13478l;
        this.f35918l = c8309l;
        this.f35907l = abstractC6897l;
        this.f35908l = interfaceC1361l;
        this.f35917l = c18389l;
        this.f35912l = c18389l2;
        this.f35919l = c18389l3;
        this.f35916l = j;
        this.f35905l = j2;
        this.f35920l = c4619l;
        this.f35913l = interfaceC14341l;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.f35909l = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35907l.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f35910l + ", code=" + this.f35915l + ", message=" + this.f35906l + ", url=" + this.f35911l.yandex + '}';
    }

    public final C10049l yandex() {
        C10049l c10049l = new C10049l();
        c10049l.crashlytics = -1;
        c10049l.mopub = AbstractC6897l.f14438l;
        c10049l.metrica = InterfaceC14341l.f28087l;
        c10049l.yandex = this.f35911l;
        c10049l.loadAd = this.f35910l;
        c10049l.crashlytics = this.f35915l;
        c10049l.amazon = this.f35906l;
        c10049l.purchase = this.f35914l;
        c10049l.billing = this.f35918l.mopub();
        c10049l.mopub = this.f35907l;
        c10049l.admob = this.f35908l;
        c10049l.subs = this.f35917l;
        c10049l.isPro = this.f35912l;
        c10049l.firebase = this.f35919l;
        c10049l.smaato = this.f35916l;
        c10049l.remoteconfig = this.f35905l;
        c10049l.vip = this.f35920l;
        c10049l.metrica = this.f35913l;
        return c10049l;
    }
}
