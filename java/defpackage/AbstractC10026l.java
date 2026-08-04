package defpackage;

import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lَؙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10026l {
    public static final C10086l loadAd;
    public static final C15308l yandex;

    static {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        yandex = new C15308l(VKXApplication.Companion.yandex(72.0f));
        loadAd = AbstractC8020l.smaato(EnumC15095l.f29627l);
    }

    public static void yandex(EnumC15095l enumC15095l) {
        int iYandex;
        loadAd.setValue(enumC15095l);
        int iOrdinal = enumC15095l.ordinal();
        if (iOrdinal == 0) {
            VKXApplication.Companion companion = VKXApplication.f36628l;
            iYandex = VKXApplication.Companion.yandex(133.0f);
        } else if (iOrdinal != 1) {
            C18725l.billing();
            return;
        } else {
            VKXApplication.Companion companion2 = VKXApplication.f36628l;
            iYandex = VKXApplication.Companion.yandex(72.0f);
        }
        yandex.subs(iYandex);
    }
}
