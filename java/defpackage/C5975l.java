package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* JADX INFO: renamed from: lؘؘۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5975l implements PrivilegedAction {
    public final /* synthetic */ String loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C5975l(String str, int i) {
        this.yandex = i;
        this.loadAd = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.yandex;
        String str = this.loadAd;
        switch (i) {
            case 0:
                return Security.getProperty(str);
            default:
                return System.getProperty(str);
        }
    }
}
