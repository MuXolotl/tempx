package defpackage;

import java.util.Collections;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًؙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6333l implements InterfaceC2373l {
    public final boolean crashlytics = true;
    public final String loadAd;
    public final RadioStation yandex;

    public C6333l(RadioStation radioStation) {
        this.yandex = radioStation;
        this.loadAd = "vk_radio_" + radioStation.yandex;
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return vKXApplication.getString(R.string.op_radio_station);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6333l) && this.yandex.equals(((C6333l) obj).yandex);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.loadAd;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    public final String toString() {
        return "Station(station=" + this.yandex + ')';
    }

    @Override // defpackage.InterfaceC2373l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        return Collections.singletonList(this.yandex);
    }
}
