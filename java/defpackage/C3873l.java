package defpackage;

import android.media.AudioManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۣؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3873l implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C3873l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        C13736l c13736l;
        int i2 = this.yandex;
        boolean z = true;
        Object obj = this.loadAd;
        switch (i2) {
            case 0:
                C0498l c0498l = (C0498l) obj;
                c0498l.getClass();
                if (i == -3 || i == -2) {
                    if (i != -2 && ((c13736l = c0498l.amazon) == null || c13736l.yandex != 1)) {
                        c0498l.crashlytics(4);
                    } else {
                        c0498l.loadAd(0);
                        c0498l.crashlytics(3);
                    }
                } else if (i == -1) {
                    c0498l.loadAd(-1);
                    c0498l.yandex();
                    c0498l.crashlytics(1);
                } else if (i == 1) {
                    c0498l.crashlytics(2);
                    c0498l.loadAd(1);
                } else {
                    AbstractC12900l.subscription("Unknown focus change type: ", i, "AudioFocusManager");
                }
                break;
            default:
                Function1 function1 = (Function1) ((C18396l) obj).f35934l;
                if (i != -1 && i != -2 && i != -3) {
                    z = false;
                }
                function1.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
