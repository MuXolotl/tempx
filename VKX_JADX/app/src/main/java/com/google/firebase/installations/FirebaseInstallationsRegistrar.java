package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC14425l;
import defpackage.C12186l;
import defpackage.C12638l;
import defpackage.C14184l;
import defpackage.C15617l;
import defpackage.C1652l;
import defpackage.C17059l;
import defpackage.C3441l;
import defpackage.C4652l;
import defpackage.C8876l;
import defpackage.ExecutorC17352l;
import defpackage.InterfaceC0478l;
import defpackage.InterfaceC0526l;
import defpackage.InterfaceC1444l;
import defpackage.InterfaceC6095l;
import defpackage.InterfaceC8866l;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC6095l lambda$getComponents$0(InterfaceC0478l interfaceC0478l) {
        return new C17059l((C14184l) interfaceC0478l.remoteconfig(C14184l.class), interfaceC0478l.mo619l(InterfaceC0526l.class), (ExecutorService) interfaceC0478l.mo622l(new C12638l(InterfaceC1444l.class, ExecutorService.class)), new ExecutorC17352l((Executor) interfaceC0478l.mo622l(new C12638l(InterfaceC8866l.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C4652l> getComponents() {
        C1652l c1652lLoadAd = C4652l.loadAd(InterfaceC6095l.class);
        c1652lLoadAd.yandex = LIBRARY_NAME;
        c1652lLoadAd.yandex(C12186l.loadAd(C14184l.class));
        byte b = 0;
        c1652lLoadAd.yandex(new C12186l(0, 1, InterfaceC0526l.class));
        c1652lLoadAd.yandex(new C12186l(new C12638l(InterfaceC1444l.class, ExecutorService.class), 1, 0));
        c1652lLoadAd.yandex(new C12186l(new C12638l(InterfaceC8866l.class, Executor.class), 1, 0));
        c1652lLoadAd.mopub = new C8876l(28);
        C4652l c4652lLoadAd = c1652lLoadAd.loadAd();
        C15617l c15617l = new C15617l(b, b);
        C1652l c1652lLoadAd2 = C4652l.loadAd(C15617l.class);
        c1652lLoadAd2.crashlytics = 1;
        c1652lLoadAd2.mopub = new C3441l(b, c15617l);
        return Arrays.asList(c4652lLoadAd, c1652lLoadAd2.loadAd(), AbstractC14425l.yandex(LIBRARY_NAME, "19.1.0"));
    }
}
