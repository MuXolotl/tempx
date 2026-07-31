package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC14425l;
import defpackage.C12186l;
import defpackage.C12638l;
import defpackage.C16529l;
import defpackage.C1652l;
import defpackage.C1759l;
import defpackage.C4225l;
import defpackage.C4652l;
import defpackage.InterfaceC0478l;
import defpackage.InterfaceC10499l;
import defpackage.InterfaceC13022l;
import defpackage.InterfaceC2802l;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC13022l lambda$getComponents$0(InterfaceC0478l interfaceC0478l) {
        C4225l.loadAd((Context) interfaceC0478l.remoteconfig(Context.class));
        return C4225l.yandex().crashlytics(C16529l.billing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC13022l lambda$getComponents$1(InterfaceC0478l interfaceC0478l) {
        C4225l.loadAd((Context) interfaceC0478l.remoteconfig(Context.class));
        return C4225l.yandex().crashlytics(C16529l.billing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC13022l lambda$getComponents$2(InterfaceC0478l interfaceC0478l) {
        C4225l.loadAd((Context) interfaceC0478l.remoteconfig(Context.class));
        return C4225l.yandex().crashlytics(C16529l.purchase);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C4652l> getComponents() {
        C1652l c1652lLoadAd = C4652l.loadAd(InterfaceC13022l.class);
        c1652lLoadAd.yandex = LIBRARY_NAME;
        c1652lLoadAd.yandex(C12186l.loadAd(Context.class));
        c1652lLoadAd.mopub = new C1759l(21);
        C4652l c4652lLoadAd = c1652lLoadAd.loadAd();
        C1652l c1652lYandex = C4652l.yandex(new C12638l(InterfaceC2802l.class, InterfaceC13022l.class));
        c1652lYandex.yandex(C12186l.loadAd(Context.class));
        c1652lYandex.mopub = new C1759l(22);
        C4652l c4652lLoadAd2 = c1652lYandex.loadAd();
        C1652l c1652lYandex2 = C4652l.yandex(new C12638l(InterfaceC10499l.class, InterfaceC13022l.class));
        c1652lYandex2.yandex(C12186l.loadAd(Context.class));
        c1652lYandex2.mopub = new C1759l(23);
        return Arrays.asList(c4652lLoadAd, c4652lLoadAd2, c1652lYandex2.loadAd(), AbstractC14425l.yandex(LIBRARY_NAME, "19.0.0"));
    }
}
