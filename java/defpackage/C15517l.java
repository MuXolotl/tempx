package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؘؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15517l implements InterfaceC7270l {
    public final int crashlytics = 1;
    public final String loadAd;
    public final AudioTrack yandex;

    public C15517l(AudioTrack audioTrack) {
        this.yandex = audioTrack;
        this.loadAd = AbstractC16676l.mopub(audioTrack);
    }

    @Override // defpackage.InterfaceC7270l
    public final String getId() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC7270l
    public final int yandex() {
        return this.crashlytics;
    }
}
