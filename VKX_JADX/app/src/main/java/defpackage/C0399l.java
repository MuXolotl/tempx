package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؑٙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0399l implements InterfaceC9069l {
    public final AudioTrack yandex;

    public C0399l(AudioTrack audioTrack) {
        this.yandex = audioTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0399l) && AbstractC8576l.yandex(this.yandex, ((C0399l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "AudioTrack(track=" + this.yandex + ')';
    }
}
