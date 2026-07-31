package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC14425l;
import defpackage.C12186l;
import defpackage.C12638l;
import defpackage.C14184l;
import defpackage.C15617l;
import defpackage.C1652l;
import defpackage.C17132l;
import defpackage.C2762l;
import defpackage.C4652l;
import defpackage.C4662l;
import defpackage.C5830l;
import defpackage.C8404l;
import defpackage.C8855l;
import defpackage.C8876l;
import defpackage.InterfaceC0526l;
import defpackage.InterfaceC1444l;
import defpackage.InterfaceC15251l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String loadAd(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public static /* synthetic */ String yandex(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        C1652l c1652lLoadAd = C4652l.loadAd(C8404l.class);
        c1652lLoadAd.yandex(new C12186l(2, 0, C4662l.class));
        c1652lLoadAd.mopub = new C17132l(2);
        arrayList.add(c1652lLoadAd.loadAd());
        C12638l c12638l = new C12638l(InterfaceC1444l.class, Executor.class);
        C1652l c1652l = new C1652l(C2762l.class, new Class[]{InterfaceC0526l.class, InterfaceC15251l.class});
        c1652l.yandex(C12186l.loadAd(Context.class));
        c1652l.yandex(C12186l.loadAd(C14184l.class));
        c1652l.yandex(new C12186l(2, 0, C15617l.class));
        c1652l.yandex(new C12186l(1, 1, C8404l.class));
        c1652l.yandex(new C12186l(c12638l, 1, 0));
        c1652l.mopub = new C5830l(c12638l, 0);
        arrayList.add(c1652l.loadAd());
        arrayList.add(AbstractC14425l.yandex("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC14425l.yandex("fire-core", "22.0.1"));
        arrayList.add(AbstractC14425l.yandex("device-name", loadAd(Build.PRODUCT)));
        arrayList.add(AbstractC14425l.yandex("device-model", loadAd(Build.DEVICE)));
        arrayList.add(AbstractC14425l.yandex("device-brand", loadAd(Build.BRAND)));
        arrayList.add(AbstractC14425l.crashlytics("android-target-sdk", new C8876l(23)));
        arrayList.add(AbstractC14425l.crashlytics("android-min-sdk", new C8876l(24)));
        arrayList.add(AbstractC14425l.crashlytics("android-platform", new C8876l(25)));
        arrayList.add(AbstractC14425l.crashlytics("android-installer", new C8876l(26)));
        try {
            string = C8855l.f18202l.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(AbstractC14425l.yandex("kotlin", string));
        }
        return arrayList;
    }
}
