package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.Map;

/* JADX INFO: renamed from: lؘؚ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7085l {
    public static final C7085l yandex = new C7085l();

    public static C12555l yandex(InterfaceC11343l interfaceC11343l) {
        DynamicMutableRealmObject.Companion companion = DynamicMutableRealmObject.INSTANCE;
        C8195l c8195l = new C8195l("photo135", null);
        C8195l c8195l2 = new C8195l("photo270", null);
        C2336l c2336l = AbstractC18202l.yandex;
        Map mapRemoteconfig = AbstractC8676l.remoteconfig(c8195l, c8195l2, new C8195l("photo300", interfaceC11343l.tapsense(c2336l.loadAd(String.class), "photo300")), new C8195l("photo600", interfaceC11343l.tapsense(c2336l.loadAd(String.class), "photo600")), new C8195l("photo1200", interfaceC11343l.tapsense(c2336l.loadAd(String.class), "photo1200")));
        companion.getClass();
        return new C12555l("CachedEmbeddedThumb", mapRemoteconfig);
    }
}
