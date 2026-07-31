package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؙٖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16233l {
    public static final C16233l loadAd = new C16233l();
    public final AtomicReference yandex = new AtomicReference(new C3300l(new C18396l(13)));

    public final synchronized void loadAd(C12107l c12107l) {
        Object obj;
        C18396l c18396l = new C18396l((C3300l) this.yandex.get());
        HashMap map = (HashMap) c18396l.f35933l;
        switch (c12107l.yandex) {
            case 0:
                obj = InterfaceC13883l.class;
                break;
            case 1:
                obj = C8375l.class;
                break;
            case 2:
                obj = InterfaceC10135l.class;
                break;
            case 3:
                obj = InterfaceC11416l.class;
                break;
            case 4:
                obj = InterfaceC10634l.class;
                break;
            default:
                obj = InterfaceC1218l.class;
                break;
        }
        if (map.containsKey(obj)) {
            C12107l c12107l2 = (C12107l) map.get(obj);
            if (!c12107l2.equals(c12107l) || !c12107l.equals(c12107l2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(obj)));
            }
        } else {
            map.put(obj, c12107l);
        }
        this.yandex.set(new C3300l(c18396l));
    }

    public final synchronized void yandex(C13911l c13911l) {
        C18396l c18396l = new C18396l((C3300l) this.yandex.get());
        c18396l.m4525package(c13911l);
        this.yandex.set(new C3300l(c18396l));
    }
}
