package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lًؘَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5535l {
    public static final C5535l loadAd;
    public final AtomicReference yandex = new AtomicReference(new C3344l(new C10038l(24)));

    static {
        try {
            C5535l c5535l = new C5535l();
            c5535l.amazon(new C5773l(C0624l.class, new C6541l(19)));
            c5535l.billing(new C4733l(C6457l.class, new C6541l(20)));
            loadAd = c5535l;
        } catch (Exception e) {
            C11467l.tapsense(e);
        }
    }

    public final C12418l admob(AbstractC3302l abstractC3302l) throws GeneralSecurityException {
        HashMap map = ((C3344l) this.yandex.get()).crashlytics;
        if (map.containsKey(abstractC3302l.getClass())) {
            return ((C4733l) map.get(abstractC3302l.getClass())).loadAd.amazon(abstractC3302l);
        }
        throw new GeneralSecurityException(AbstractC15560l.Signature("No Key Format serializer for ", String.valueOf(abstractC3302l.getClass()), " available"));
    }

    public final synchronized void amazon(C5773l c5773l) {
        C10038l c10038l = new C10038l((C3344l) this.yandex.get());
        HashMap map = (HashMap) c10038l.f20463l;
        Class cls = c5773l.yandex;
        if (map.containsKey(cls)) {
            C5773l c5773l2 = (C5773l) map.get(cls);
            if (!c5773l2.equals(c5773l) || c5773l != c5773l2) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(cls)));
            }
        } else {
            map.put(cls, c5773l);
        }
        this.yandex.set(new C3344l(c10038l));
    }

    public final synchronized void billing(C4733l c4733l) {
        C10038l c10038l = new C10038l((C3344l) this.yandex.get());
        HashMap map = (HashMap) c10038l.f20466l;
        Class cls = c4733l.yandex;
        if (map.containsKey(cls)) {
            C4733l c4733l2 = (C4733l) map.get(cls);
            if (!c4733l2.equals(c4733l) || c4733l != c4733l2) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(String.valueOf(cls)));
            }
        } else {
            map.put(cls, c4733l);
        }
        this.yandex.set(new C3344l(c10038l));
    }

    public final synchronized void crashlytics(C9439l c9439l) {
        C10038l c10038l = new C10038l((C3344l) this.yandex.get());
        String str = c9439l.yandex;
        HashMap map = (HashMap) c10038l.f20462l;
        if (map.containsKey(str)) {
            C9439l c9439l2 = (C9439l) map.get(str);
            if (!c9439l2.equals(c9439l) || c9439l != c9439l2) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, c9439l);
        }
        this.yandex.set(new C3344l(c10038l));
    }

    public final AbstractC3302l loadAd(C12418l c12418l) throws GeneralSecurityException {
        C3344l c3344l = (C3344l) this.yandex.get();
        c3344l.getClass();
        String str = (String) c12418l.f24518l;
        HashMap map = c3344l.amazon;
        if (map.containsKey(str)) {
            return ((C8873l) map.get(str)).loadAd.billing(c12418l);
        }
        throw new GeneralSecurityException(AbstractC15560l.Signature("No Parameters Parser for requested key type ", str, " available"));
    }

    public final C11644l mopub(AbstractC6968l abstractC6968l) {
        HashMap map = ((C3344l) this.yandex.get()).yandex;
        if (map.containsKey(abstractC6968l.getClass())) {
            return ((C5773l) map.get(abstractC6968l.getClass())).loadAd.crashlytics(abstractC6968l);
        }
        throw new GeneralSecurityException(AbstractC15560l.Signature("No Key serializer for ", String.valueOf(abstractC6968l.getClass()), " available"));
    }

    public final synchronized void purchase(C8873l c8873l) {
        C10038l c10038l = new C10038l((C3344l) this.yandex.get());
        String str = c8873l.yandex;
        HashMap map = (HashMap) c10038l.f20465l;
        if (map.containsKey(str)) {
            C8873l c8873l2 = (C8873l) map.get(str);
            if (!c8873l2.equals(c8873l) || c8873l != c8873l2) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(str));
            }
        } else {
            map.put(str, c8873l);
        }
        this.yandex.set(new C3344l(c10038l));
    }

    public final AbstractC6968l yandex(C11644l c11644l) {
        C3344l c3344l = (C3344l) this.yandex.get();
        c3344l.getClass();
        String str = (String) c11644l.f23358l;
        HashMap map = c3344l.loadAd;
        if (map.containsKey(str)) {
            return ((C9439l) map.get(str)).loadAd.purchase(c11644l);
        }
        throw new GeneralSecurityException(AbstractC15560l.Signature("No Key Parser for requested key type ", str, " available"));
    }
}
