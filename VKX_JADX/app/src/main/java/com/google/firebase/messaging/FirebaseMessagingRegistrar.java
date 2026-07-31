package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC14425l;
import defpackage.C12186l;
import defpackage.C12638l;
import defpackage.C14184l;
import defpackage.C1652l;
import defpackage.C18725l;
import defpackage.C4652l;
import defpackage.C5830l;
import defpackage.C8404l;
import defpackage.InterfaceC0478l;
import defpackage.InterfaceC10499l;
import defpackage.InterfaceC13022l;
import defpackage.InterfaceC14242l;
import defpackage.InterfaceC15251l;
import defpackage.InterfaceC3931l;
import defpackage.InterfaceC6095l;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C12638l c12638l, InterfaceC0478l interfaceC0478l) {
        C14184l c14184l = (C14184l) interfaceC0478l.remoteconfig(C14184l.class);
        if (interfaceC0478l.remoteconfig(InterfaceC3931l.class) == null) {
            return new FirebaseMessaging(c14184l, interfaceC0478l.mo619l(C8404l.class), interfaceC0478l.mo619l(InterfaceC15251l.class), (InterfaceC6095l) interfaceC0478l.remoteconfig(InterfaceC6095l.class), interfaceC0478l.mo621l(c12638l), (InterfaceC14242l) interfaceC0478l.remoteconfig(InterfaceC14242l.class));
        }
        C18725l.loadAd();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C4652l> getComponents() {
        C12638l c12638l = new C12638l(InterfaceC10499l.class, InterfaceC13022l.class);
        C1652l c1652lLoadAd = C4652l.loadAd(FirebaseMessaging.class);
        c1652lLoadAd.yandex = LIBRARY_NAME;
        c1652lLoadAd.yandex(C12186l.loadAd(C14184l.class));
        c1652lLoadAd.yandex(new C12186l(0, 0, InterfaceC3931l.class));
        c1652lLoadAd.yandex(new C12186l(0, 1, C8404l.class));
        c1652lLoadAd.yandex(new C12186l(0, 1, InterfaceC15251l.class));
        c1652lLoadAd.yandex(C12186l.loadAd(InterfaceC6095l.class));
        c1652lLoadAd.yandex(new C12186l(c12638l, 0, 1));
        c1652lLoadAd.yandex(C12186l.loadAd(InterfaceC14242l.class));
        c1652lLoadAd.mopub = new C5830l(c12638l, 1);
        c1652lLoadAd.crashlytics(1);
        return Arrays.asList(c1652lLoadAd.loadAd(), AbstractC14425l.yandex(LIBRARY_NAME, "25.0.1"));
    }
}
