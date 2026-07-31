package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC14055l;
import defpackage.AbstractC14425l;
import defpackage.AbstractC17148l;
import defpackage.AbstractC1872l;
import defpackage.AbstractC8531l;
import defpackage.C0458l;
import defpackage.C10443l;
import defpackage.C10975l;
import defpackage.C11511l;
import defpackage.C11644l;
import defpackage.C12014l;
import defpackage.C12186l;
import defpackage.C12638l;
import defpackage.C13568l;
import defpackage.C14049l;
import defpackage.C14184l;
import defpackage.C1423l;
import defpackage.C14461l;
import defpackage.C1652l;
import defpackage.C1770l;
import defpackage.C18262l;
import defpackage.C18396l;
import defpackage.C18449l;
import defpackage.C2036l;
import defpackage.C3316l;
import defpackage.C3557l;
import defpackage.C4652l;
import defpackage.C4816l;
import defpackage.C5008l;
import defpackage.C5501l;
import defpackage.C6472l;
import defpackage.InterfaceC0478l;
import defpackage.InterfaceC12932l;
import defpackage.InterfaceC13022l;
import defpackage.InterfaceC1444l;
import defpackage.InterfaceC15189l;
import defpackage.InterfaceC16967l;
import defpackage.InterfaceC2661l;
import defpackage.InterfaceC6095l;
import defpackage.InterfaceC8866l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Llؗؕۗ;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "lُۧۗ", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final C11511l Companion = new C11511l();
    private static final C12638l appContext = C12638l.yandex(Context.class);
    private static final C12638l firebaseApp = C12638l.yandex(C14184l.class);
    private static final C12638l firebaseInstallationsApi = C12638l.yandex(InterfaceC6095l.class);
    private static final C12638l backgroundDispatcher = new C12638l(InterfaceC1444l.class, AbstractC1872l.class);
    private static final C12638l blockingDispatcher = new C12638l(InterfaceC8866l.class, AbstractC1872l.class);
    private static final C12638l transportFactory = C12638l.yandex(InterfaceC13022l.class);
    private static final C12638l firebaseSessionsComponent = C12638l.yandex(InterfaceC16967l.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10443l getComponents$lambda$0(InterfaceC0478l interfaceC0478l) {
        return (C10443l) ((C1423l) ((InterfaceC16967l) interfaceC0478l.mo622l(firebaseSessionsComponent))).startapp.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC16967l getComponents$lambda$1(InterfaceC0478l interfaceC0478l) {
        Context context = (Context) interfaceC0478l.mo622l(appContext);
        InterfaceC12932l interfaceC12932l = (InterfaceC12932l) interfaceC0478l.mo622l(backgroundDispatcher);
        InterfaceC12932l interfaceC12932l2 = (InterfaceC12932l) interfaceC0478l.mo622l(blockingDispatcher);
        C14184l c14184l = (C14184l) interfaceC0478l.mo622l(firebaseApp);
        InterfaceC6095l interfaceC6095l = (InterfaceC6095l) interfaceC0478l.mo622l(firebaseInstallationsApi);
        InterfaceC15189l interfaceC15189lMo621l = interfaceC0478l.mo621l(transportFactory);
        C1423l c1423l = new C1423l();
        c1423l.yandex = C14461l.yandex(c14184l);
        C14461l c14461lYandex = C14461l.yandex(context);
        c1423l.loadAd = c14461lYandex;
        c1423l.crashlytics = C2036l.yandex(new C5008l(13, c14461lYandex));
        c1423l.amazon = C2036l.yandex(AbstractC17148l.yandex);
        c1423l.purchase = C14461l.yandex(interfaceC6095l);
        c1423l.billing = C2036l.yandex(new C5501l(10, c1423l.yandex));
        C14461l c14461lYandex2 = C14461l.yandex(interfaceC12932l2);
        c1423l.mopub = c14461lYandex2;
        c1423l.admob = C2036l.yandex(new C14049l(c1423l.billing, c14461lYandex2));
        c1423l.subs = C14461l.yandex(interfaceC12932l);
        c1423l.isPro = C2036l.yandex(new C13568l(c1423l.crashlytics, C2036l.yandex(new C11644l(c1423l.amazon, c1423l.purchase, c1423l.billing, c1423l.admob, C2036l.yandex(new C4816l(c1423l.subs, c1423l.amazon, C2036l.yandex(new C0458l(c1423l.loadAd, c1423l.mopub, 23)), 5)), 26)), 16));
        InterfaceC2661l interfaceC2661lYandex = C2036l.yandex(AbstractC8531l.yandex);
        c1423l.firebase = interfaceC2661lYandex;
        c1423l.smaato = C2036l.yandex(new C18396l(c1423l.amazon, interfaceC2661lYandex, 19));
        c1423l.remoteconfig = C2036l.yandex(new C3557l(c1423l.yandex, c1423l.purchase, c1423l.isPro, C2036l.yandex(new C10975l(11, C14461l.yandex(interfaceC15189lMo621l))), c1423l.subs));
        c1423l.vip = C2036l.yandex(new C18449l(c1423l.loadAd, c1423l.mopub, C2036l.yandex(new C1770l(26, c1423l.smaato)), 18));
        InterfaceC2661l interfaceC2661lYandex2 = C2036l.yandex(new C6472l(c1423l.isPro, c1423l.smaato, c1423l.remoteconfig, c1423l.amazon, c1423l.vip, C2036l.yandex(new C14049l(c1423l.loadAd, c1423l.firebase)), c1423l.subs));
        c1423l.metrica = interfaceC2661lYandex2;
        c1423l.startapp = C2036l.yandex(new C12014l(c1423l.yandex, c1423l.isPro, c1423l.subs, C2036l.yandex(new C3316l(21, interfaceC2661lYandex2)), 13));
        return c1423l;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C4652l> getComponents() {
        C1652l c1652lLoadAd = C4652l.loadAd(C10443l.class);
        c1652lLoadAd.yandex = LIBRARY_NAME;
        c1652lLoadAd.yandex(C12186l.yandex(firebaseSessionsComponent));
        c1652lLoadAd.mopub = new C18262l(0);
        c1652lLoadAd.crashlytics(2);
        C4652l c4652lLoadAd = c1652lLoadAd.loadAd();
        C1652l c1652lLoadAd2 = C4652l.loadAd(InterfaceC16967l.class);
        c1652lLoadAd2.yandex = "fire-sessions-component";
        c1652lLoadAd2.yandex(C12186l.yandex(appContext));
        c1652lLoadAd2.yandex(C12186l.yandex(backgroundDispatcher));
        c1652lLoadAd2.yandex(C12186l.yandex(blockingDispatcher));
        c1652lLoadAd2.yandex(C12186l.yandex(firebaseApp));
        c1652lLoadAd2.yandex(C12186l.yandex(firebaseInstallationsApi));
        c1652lLoadAd2.yandex(new C12186l(transportFactory, 1, 1));
        c1652lLoadAd2.mopub = new C18262l(1);
        return AbstractC14055l.remoteconfig(c4652lLoadAd, c1652lLoadAd2.loadAd(), AbstractC14425l.yandex(LIBRARY_NAME, "3.0.4"));
    }
}
