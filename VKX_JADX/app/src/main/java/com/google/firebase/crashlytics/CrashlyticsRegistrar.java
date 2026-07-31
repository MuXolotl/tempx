package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC14425l;
import defpackage.C12186l;
import defpackage.C12638l;
import defpackage.C14184l;
import defpackage.C1652l;
import defpackage.C2631l;
import defpackage.C2683l;
import defpackage.C4353l;
import defpackage.C4652l;
import defpackage.C4749l;
import defpackage.C4910l;
import defpackage.C5976l;
import defpackage.EnumC9110l;
import defpackage.InterfaceC1444l;
import defpackage.InterfaceC2028l;
import defpackage.InterfaceC6095l;
import defpackage.InterfaceC6235l;
import defpackage.InterfaceC8588l;
import defpackage.InterfaceC8866l;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int amazon = 0;
    public final C12638l yandex = new C12638l(InterfaceC1444l.class, ExecutorService.class);
    public final C12638l loadAd = new C12638l(InterfaceC8866l.class, ExecutorService.class);
    public final C12638l crashlytics = new C12638l(InterfaceC2028l.class, ExecutorService.class);

    static {
        Map map = C4749l.loadAd;
        EnumC9110l enumC9110l = EnumC9110l.f18712l;
        if (map.containsKey(enumC9110l)) {
            Log.d("FirebaseSessions", "Dependency " + enumC9110l + " already added.");
            return;
        }
        map.put(enumC9110l, new C2631l(new C4910l(true)));
        Log.d("FirebaseSessions", "Dependency to " + enumC9110l + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1652l c1652lLoadAd = C4652l.loadAd(C4353l.class);
        c1652lLoadAd.yandex = "fire-cls";
        c1652lLoadAd.yandex(C12186l.loadAd(C14184l.class));
        c1652lLoadAd.yandex(C12186l.loadAd(InterfaceC6095l.class));
        c1652lLoadAd.yandex(new C12186l(this.yandex, 1, 0));
        c1652lLoadAd.yandex(new C12186l(this.loadAd, 1, 0));
        c1652lLoadAd.yandex(new C12186l(this.crashlytics, 1, 0));
        c1652lLoadAd.yandex(new C12186l(0, 2, C5976l.class));
        c1652lLoadAd.yandex(new C12186l(0, 2, InterfaceC6235l.class));
        c1652lLoadAd.yandex(new C12186l(0, 2, InterfaceC8588l.class));
        c1652lLoadAd.mopub = new C2683l(16, this);
        c1652lLoadAd.crashlytics(2);
        return Arrays.asList(c1652lLoadAd.loadAd(), AbstractC14425l.yandex("fire-cls", "20.0.4"));
    }
}
