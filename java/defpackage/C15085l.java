package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٔۖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15085l implements InterfaceC15432l {
    public final long loadAd;
    public final int yandex;

    public C15085l(AudioTrack audioTrack) {
        int i = audioTrack.loadAd;
        long j = audioTrack.crashlytics;
        this.yandex = i;
        this.loadAd = j;
    }

    @Override // defpackage.InterfaceC15432l
    public final long loadAd() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC15432l
    public final int yandex() {
        return this.yandex;
    }
}
