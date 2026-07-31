package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: renamed from: lؓۙ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2088l extends AudioDeviceCallback {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C2088l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ((C17274l) obj).subs();
                break;
            default:
                C10111l c10111l = (C10111l) obj;
                ((C1080l) c10111l.f20589l).m787catch(Boolean.valueOf(c10111l.subscription()));
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C17274l c17274l = (C17274l) obj;
                if (AbstractC15323l.remoteconfig((AudioDeviceInfo) c17274l.isPro, audioDeviceInfoArr)) {
                    c17274l.isPro = null;
                }
                c17274l.subs();
                break;
            default:
                C10111l c10111l = (C10111l) obj;
                ((C1080l) c10111l.f20589l).m787catch(Boolean.valueOf(c10111l.subscription()));
                break;
        }
    }
}
