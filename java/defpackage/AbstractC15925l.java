package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lٕٖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15925l {
    public static final /* synthetic */ InterfaceC13922l[] yandex = {AbstractC18202l.yandex.admob(new C0544l(AbstractC15925l.class, "vkxNetworkPreferencesDataStore", "getVkxNetworkPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final C18673l loadAd = AbstractC8960l.mopub("vkx_preferences_network.pb", C0995l.f2741l, new C7972l(23, new C8578l(12)), new C8578l(13), 16);

    public static final InterfaceC15829l yandex(Context context) {
        InterfaceC13922l interfaceC13922l = yandex[0];
        return (InterfaceC15829l) loadAd.yandex(context);
    }
}
