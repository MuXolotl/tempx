package defpackage;

import java.util.Collections;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؒۢؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1416l implements InterfaceC8393l, InterfaceC2373l {
    public final String crashlytics;
    public final String loadAd;
    public final List yandex;

    public C1416l(AudioTrack audioTrack) {
        List listSingletonList = Collections.singletonList(audioTrack);
        this.yandex = listSingletonList;
        this.loadAd = "";
        this.crashlytics = "vk_" + listSingletonList.hashCode();
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        return this.loadAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1416l)) {
            return false;
        }
        C1416l c1416l = (C1416l) obj;
        return AbstractC8576l.yandex(this.yandex, c1416l.yandex) && AbstractC8576l.yandex(this.loadAd, c1416l.loadAd);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.crashlytics;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackObjects(tracks=");
        sb.append(this.yandex);
        sb.append(", displayName=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    @Override // defpackage.InterfaceC2373l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        return this.yandex;
    }
}
