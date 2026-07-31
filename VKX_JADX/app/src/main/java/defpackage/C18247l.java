package defpackage;

import android.media.AudioManager;
import android.os.SystemClock;
import android.view.KeyEvent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lؙ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18247l implements InvocationHandler {
    public final /* synthetic */ C13140l yandex;

    public C18247l(C13140l c13140l) {
        this.yandex = c13140l;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("onVolumeKeyLongPress")) {
            return null;
        }
        C3585l c3585l = this.yandex.amazon;
        KeyEvent keyEvent = (KeyEvent) objArr[0];
        C8688l c8688l = ((PlaybackService) c3585l.f7511l).f36832l;
        if (!((Boolean) AbstractC8619l.purchase.yandex()).booleanValue()) {
            return null;
        }
        int i = PlaybackService.f36828l;
        if (!((AudioManager) c8688l.getValue()).isMusicActive() || keyEvent.getAction() != 0 || keyEvent.getRepeatCount() != 0) {
            return null;
        }
        if (keyEvent.getKeyCode() == 24) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ((AudioManager) c8688l.getValue()).dispatchMediaKeyEvent(new KeyEvent(jUptimeMillis, jUptimeMillis, 0, 87, 0));
            ((AudioManager) c8688l.getValue()).dispatchMediaKeyEvent(new KeyEvent(jUptimeMillis, jUptimeMillis, 1, 87, 0));
            return null;
        }
        if (keyEvent.getKeyCode() != 25) {
            return null;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        ((AudioManager) c8688l.getValue()).dispatchMediaKeyEvent(new KeyEvent(jUptimeMillis2, jUptimeMillis2, 0, 88, 0));
        ((AudioManager) c8688l.getValue()).dispatchMediaKeyEvent(new KeyEvent(jUptimeMillis2, jUptimeMillis2, 1, 88, 0));
        return null;
    }
}
