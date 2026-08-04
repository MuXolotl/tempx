package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lؚْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16365l {
    public static final C16365l amazon;
    public static final Logger crashlytics = Logger.getLogger(C16365l.class.getName());
    public ConcurrentHashMap loadAd;
    public ConcurrentHashMap yandex;

    static {
        C16365l c16365l = new C16365l();
        c16365l.yandex = new ConcurrentHashMap();
        c16365l.loadAd = new ConcurrentHashMap();
        amazon = c16365l;
    }

    public final synchronized void amazon(InterfaceC18729l interfaceC18729l, boolean z) {
        purchase(interfaceC18729l, 1, z);
    }

    public final synchronized void crashlytics(InterfaceC18729l interfaceC18729l, boolean z) {
        try {
            String str = ((C7912l) interfaceC18729l).yandex;
            if (z && this.loadAd.containsKey(str) && !((Boolean) this.loadAd.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            InterfaceC18729l interfaceC18729l2 = (InterfaceC18729l) this.yandex.get(str);
            if (interfaceC18729l2 != null && !interfaceC18729l2.getClass().equals(interfaceC18729l.getClass())) {
                crashlytics.warning("Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + interfaceC18729l2.getClass().getName() + ", cannot be re-registered with " + interfaceC18729l.getClass().getName());
            }
            this.yandex.putIfAbsent(str, interfaceC18729l);
            this.loadAd.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized InterfaceC18729l loadAd(String str) {
        if (!this.yandex.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (InterfaceC18729l) this.yandex.get(str);
    }

    public final synchronized void purchase(InterfaceC18729l interfaceC18729l, int i, boolean z) {
        try {
            if (!(i != 1 ? AbstractC12589l.ad(i) : AbstractC12589l.pro(i))) {
                throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
            }
            crashlytics(interfaceC18729l, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final InterfaceC18729l yandex(Class cls, String str) {
        InterfaceC18729l interfaceC18729lLoadAd = loadAd(str);
        if (((C7912l) interfaceC18729lLoadAd).loadAd.equals(cls)) {
            return interfaceC18729lLoadAd;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(interfaceC18729lLoadAd.getClass());
        String strValueOf2 = String.valueOf(((C7912l) interfaceC18729lLoadAd).loadAd);
        StringBuilder sbLicense = AbstractC14814l.license("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbLicense.append(strValueOf2);
        throw new GeneralSecurityException(sbLicense.toString());
    }
}
