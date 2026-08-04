package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import android.view.autofill.AutofillId;

/* JADX INFO: renamed from: lّؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3865l {
    public final Object yandex;

    public AutofillId amazon() {
        return C8339l.purchase(this.yandex);
    }

    public boolean crashlytics() {
        String nameForUid;
        Context context = (Context) this.yandex;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC5941l.m1899package(context);
        }
        if (!AbstractC12300l.subs() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public PackageInfo loadAd(int i, String str) {
        return ((Context) this.yandex).getPackageManager().getPackageInfo(str, i);
    }

    public ApplicationInfo yandex(int i, String str) {
        return ((Context) this.yandex).getPackageManager().getApplicationInfo(str, i);
    }
}
