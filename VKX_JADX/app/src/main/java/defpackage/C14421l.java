package defpackage;

/* JADX INFO: renamed from: lٓۛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14421l implements InterfaceC16711l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f28230l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f28231l;

    public C14421l(int i, long j) {
        this.f28231l = i;
        this.f28230l = j;
    }

    @Override // defpackage.InterfaceC16711l
    public final long license(long j, long j2, C16918l c16918l, EnumC9931l enumC9931l) {
        int i = (int) (j2 >> 32);
        int iRemoteconfig = AbstractC5020l.remoteconfig(c16918l.amazon(), i, 2, c16918l.yandex);
        long j3 = this.f28230l;
        if (iRemoteconfig < 0) {
            int i2 = c16918l.yandex;
            int i3 = (i + i2) - ((int) (j3 >> 32));
            iRemoteconfig = i2 - (i3 >= 0 ? i3 : 0);
        } else if (iRemoteconfig + i > ((int) (j3 >> 32)) && (iRemoteconfig = c16918l.crashlytics - i) < 0) {
            iRemoteconfig = 0;
        }
        int i4 = c16918l.loadAd - ((int) (j2 & 4294967295L));
        int i5 = this.f28231l;
        int i6 = i4 - i5;
        if (i6 < 0) {
            i6 = c16918l.amazon + i5;
        }
        return (((long) iRemoteconfig) << 32) | (((long) i6) & 4294967295L);
    }
}
