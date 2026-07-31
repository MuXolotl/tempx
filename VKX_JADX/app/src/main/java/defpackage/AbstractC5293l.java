package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: lؗۦۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5293l {
    public static final ConcurrentHashMap yandex = new ConcurrentHashMap();

    public static final InterfaceC13226l loadAd(InterfaceC1388l interfaceC1388l) {
        InterfaceC13226l interfaceC13226lYandex = yandex(interfaceC1388l);
        if (interfaceC13226lYandex != null) {
            return interfaceC13226lYandex;
        }
        throw new IllegalStateException(("Couldn't find companion object of class '" + interfaceC1388l.license() + "'.\nA common cause for this is when the `io.realm.kotlin` is not applied to the Gradle module that contains the '" + interfaceC1388l.license() + "' class.").toString());
    }

    public static final InterfaceC13226l yandex(InterfaceC1388l interfaceC1388l) {
        InterfaceC1388l interfaceC1388lLoadAd;
        ConcurrentHashMap concurrentHashMap = yandex;
        Object obj = concurrentHashMap.get(interfaceC1388l);
        if (obj != null) {
            if (obj instanceof InterfaceC13226l) {
                return (InterfaceC13226l) obj;
            }
            return null;
        }
        Object objAdmob = AbstractC16131l.admob(interfaceC1388l);
        if (objAdmob == null) {
            try {
                try {
                    interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Class.forName(((InterfaceC13937l) interfaceC1388l).mo1730private().getName().concat("$Companion")));
                } catch (ClassNotFoundException unused) {
                    interfaceC1388lLoadAd = null;
                }
            } catch (ClassNotFoundException unused2) {
                interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Class.forName(((InterfaceC13937l) interfaceC1388l).mo1730private().getName().concat("$CREATOR")));
            }
            Object objAdvert = interfaceC1388lLoadAd != null ? interfaceC1388lLoadAd.advert() : null;
            objAdmob = objAdvert instanceof InterfaceC13226l ? (InterfaceC13226l) objAdvert : null;
            if (objAdmob == null) {
                objAdmob = interfaceC1388l;
            }
        }
        concurrentHashMap.put(interfaceC1388l, objAdmob);
        if (objAdmob instanceof InterfaceC13226l) {
            return (InterfaceC13226l) objAdmob;
        }
        return null;
    }
}
