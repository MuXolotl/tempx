package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* JADX INFO: renamed from: lؑۥٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C0700l extends C7272l {
    @Override // defpackage.C7272l
    public final C3070l crashlytics() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.yandex.getCurrentControllerInfo();
        C3070l c3070l = new C3070l();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            C6541l.subs("package shouldn't be null");
            return null;
        }
        if (TextUtils.isEmpty(packageName)) {
            C8339l.metrica("packageName should be nonempty");
            return null;
        }
        c3070l.yandex = new C2303l(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return c3070l;
    }

    @Override // defpackage.C7272l
    public final void purchase(C3070l c3070l) {
    }
}
