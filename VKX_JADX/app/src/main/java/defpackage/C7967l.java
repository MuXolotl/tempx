package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lًْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7967l implements InterfaceC8782l, InterfaceC2417l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC3783l f16606l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f16607l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f16608l = -9223372036854775807L;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f16609l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5019l f16610l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC8782l f16611l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC14384l f16612l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC2417l f16613l;

    public C7967l(C5019l c5019l, InterfaceC3783l interfaceC3783l, long j) {
        this.f16610l = c5019l;
        this.f16606l = interfaceC3783l;
        this.f16609l = j;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean adcel(C11495l c11495l) {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        return interfaceC8782l != null && interfaceC8782l.adcel(c11495l);
    }

    @Override // defpackage.InterfaceC8782l
    public final void admob() throws IOException {
        try {
            InterfaceC8782l interfaceC8782l = this.f16611l;
            if (interfaceC8782l != null) {
                interfaceC8782l.admob();
                return;
            }
            AbstractC14384l abstractC14384l = this.f16612l;
            if (abstractC14384l != null) {
                abstractC14384l.isPro();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // defpackage.InterfaceC3128l
    public final long ads() {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        String str = AbstractC15323l.yandex;
        return interfaceC8782l.ads();
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean amazon() {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        return interfaceC8782l != null && interfaceC8782l.amazon();
    }

    @Override // defpackage.InterfaceC3128l
    public final long billing() {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        String str = AbstractC15323l.yandex;
        return interfaceC8782l.billing();
    }

    @Override // defpackage.InterfaceC2417l
    public final void crashlytics(InterfaceC8782l interfaceC8782l) {
        InterfaceC2417l interfaceC2417l = this.f16613l;
        String str = AbstractC15323l.yandex;
        interfaceC2417l.crashlytics(this);
    }

    @Override // defpackage.InterfaceC8782l
    public final void isPro(long j) {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        String str = AbstractC15323l.yandex;
        interfaceC8782l.isPro(j);
    }

    @Override // defpackage.InterfaceC3128l
    public final void license(long j) {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        String str = AbstractC15323l.yandex;
        interfaceC8782l.license(j);
    }

    @Override // defpackage.InterfaceC8782l
    public final C8750l metrica() {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        String str = AbstractC15323l.yandex;
        return interfaceC8782l.metrica();
    }

    @Override // defpackage.InterfaceC8782l
    public final long mopub(long j, C17654l c17654l) {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        String str = AbstractC15323l.yandex;
        return interfaceC8782l.mopub(j, c17654l);
    }

    @Override // defpackage.InterfaceC8782l
    public final long purchase(InterfaceC10376l[] interfaceC10376lArr, boolean[] zArr, InterfaceC11759l[] interfaceC11759lArr, boolean[] zArr2, long j) {
        long j2 = this.f16608l;
        if (j2 != -9223372036854775807L && j == this.f16609l) {
            j = j2;
        }
        this.f16608l = -9223372036854775807L;
        InterfaceC8782l interfaceC8782l = this.f16611l;
        String str = AbstractC15323l.yandex;
        return interfaceC8782l.purchase(interfaceC10376lArr, zArr, interfaceC11759lArr, zArr2, j);
    }

    @Override // defpackage.InterfaceC8782l
    public final long remoteconfig() {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        String str = AbstractC15323l.yandex;
        return interfaceC8782l.remoteconfig();
    }

    @Override // defpackage.InterfaceC8782l
    public final long subs(long j) {
        InterfaceC8782l interfaceC8782l = this.f16611l;
        String str = AbstractC15323l.yandex;
        return interfaceC8782l.subs(j);
    }

    @Override // defpackage.InterfaceC18266l
    /* JADX INFO: renamed from: throws */
    public final void mo614throws(InterfaceC3128l interfaceC3128l) {
        InterfaceC2417l interfaceC2417l = this.f16613l;
        String str = AbstractC15323l.yandex;
        interfaceC2417l.mo614throws(this);
    }

    @Override // defpackage.InterfaceC8782l
    public final void vip(InterfaceC2417l interfaceC2417l, long j) {
        this.f16613l = interfaceC2417l;
        InterfaceC8782l interfaceC8782l = this.f16611l;
        if (interfaceC8782l != null) {
            long j2 = this.f16608l;
            if (j2 == -9223372036854775807L) {
                j2 = this.f16609l;
            }
            interfaceC8782l.vip(this, j2);
        }
    }

    public final void yandex(C5019l c5019l) {
        long j = this.f16608l;
        if (j == -9223372036854775807L) {
            j = this.f16609l;
        }
        AbstractC14384l abstractC14384l = this.f16612l;
        abstractC14384l.getClass();
        InterfaceC8782l interfaceC8782lLoadAd = abstractC14384l.loadAd(c5019l, this.f16606l, j);
        this.f16611l = interfaceC8782lLoadAd;
        if (this.f16613l != null) {
            interfaceC8782lLoadAd.vip(this, j);
        }
    }
}
