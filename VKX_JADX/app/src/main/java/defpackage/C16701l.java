package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: lٖۡۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16701l {
    public final C14996l yandex;

    public C16701l(String str, int i, int i2) {
        if (str == null) {
            C6541l.subs("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            C8339l.metrica("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.yandex = new C0557l(str, i, i2);
        } else {
            this.yandex = new C14996l(str, i, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16701l)) {
            return false;
        }
        return this.yandex.equals(((C16701l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public C16701l(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strYandex = C0557l.yandex(remoteUserInfo);
        if (strYandex != null) {
            if (!TextUtils.isEmpty(strYandex)) {
                this.yandex = new C0557l(remoteUserInfo);
                return;
            } else {
                C8339l.metrica("packageName should be nonempty");
                throw null;
            }
        }
        C6541l.subs("package shouldn't be null");
        throw null;
    }
}
