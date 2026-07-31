package defpackage;

/* JADX INFO: renamed from: lًُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7932l implements InterfaceC7988l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f16518l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f16519l;

    public C7932l(String str, String str2) {
        this.f16518l = str;
        this.f16519l = str2;
    }

    @Override // defpackage.InterfaceC7988l
    public final String admob() {
        return this.f16519l;
    }

    @Override // defpackage.InterfaceC4656l
    public final byte[] billing() {
        String str = this.f16519l;
        return str == null ? AbstractC3799l.f7909l : str.getBytes(AbstractC12379l.loadAd);
    }

    @Override // defpackage.InterfaceC4656l
    public final String getId() {
        return this.f16518l;
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean isEmpty() {
        return "".equals(this.f16519l);
    }

    @Override // defpackage.InterfaceC4656l
    public final boolean startapp() {
        return true;
    }

    @Override // defpackage.InterfaceC4656l
    public final String toString() {
        return this.f16519l;
    }
}
