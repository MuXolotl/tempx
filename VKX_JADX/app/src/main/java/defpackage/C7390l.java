package defpackage;

import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؚٜۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7390l {
    public final void loadAd() {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        if (VKXApplication.Companion.crashlytics()) {
            C16287l.yandex.getClass();
            if (C16287l.yandex()) {
                try {
                    AbstractC8189l.purchase(new C16534l((AudioTrack) null, 27));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void yandex(AbstractC18643l abstractC18643l) {
        if (abstractC18643l != null && (abstractC18643l instanceof AudioTrack)) {
            VKXApplication.Companion companion = VKXApplication.f36628l;
            if (VKXApplication.Companion.crashlytics()) {
                C16287l.yandex.getClass();
                if (C16287l.yandex()) {
                    try {
                        if (((AudioTrack) abstractC18643l).purchase() == 2) {
                            AbstractC8189l.purchase(new C16534l((AudioTrack) null, 27));
                        } else {
                            C4626l c4626l = C4626l.yandex;
                            if (((Boolean) C4626l.loadAd.getValue()).booleanValue()) {
                                AbstractC8189l.purchase(new C16534l((AudioTrack) null, 27));
                            } else {
                                AbstractC8189l.purchase(new C16534l((AudioTrack) abstractC18643l, 27));
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
