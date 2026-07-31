package defpackage;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: lًٟٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8082l extends AbstractC13399l implements InterfaceC0974l {
    private static final C8082l DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC9858l key_ = C18368l.f35882l;
    private int primaryKeyId_;

    static {
        C8082l c8082l = new C8082l();
        DEFAULT_INSTANCE = c8082l;
        AbstractC13399l.license(C8082l.class, c8082l);
    }

    public static void isVip(C8082l c8082l, C3251l c3251l) {
        c8082l.getClass();
        InterfaceC9858l interfaceC9858l = c8082l.key_;
        if (!((AbstractC7021l) interfaceC9858l).f14716l) {
            c8082l.key_ = interfaceC9858l.yandex(interfaceC9858l.size() * 2);
        }
        c8082l.key_.add(c3251l);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C8082l m2256package(ByteArrayInputStream byteArrayInputStream, C7597l c7597l) throws C2297l {
        AbstractC13399l abstractC13399lSignature = AbstractC13399l.Signature(DEFAULT_INSTANCE, new C6068l(byteArrayInputStream), c7597l);
        AbstractC13399l.mopub(abstractC13399lSignature);
        return (C8082l) abstractC13399lSignature;
    }

    public static void signatures(C8082l c8082l, int i) {
        c8082l.primaryKeyId_ = i;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static C8082l m2257synchronized(byte[] bArr, C7597l c7597l) {
        return (C8082l) AbstractC13399l.tapsense(DEFAULT_INSTANCE, bArr, c7597l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C2150l m2258throws() {
        return (C2150l) DEFAULT_INSTANCE.admob();
    }

    public final int applovin() {
        return this.key_.size();
    }

    public final InterfaceC9858l appmetrica() {
        return this.key_;
    }

    public final int inmobi() {
        return this.primaryKeyId_;
    }

    public final C3251l premium(int i) {
        return (C3251l) this.key_.get(i);
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C3251l.class});
        }
        if (iInmobi == 3) {
            return new C8082l();
        }
        if (iInmobi == 4) {
            return new C2150l(DEFAULT_INSTANCE);
        }
        if (iInmobi == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iInmobi != 6) {
            throw null;
        }
        InterfaceC14781l interfaceC14781l = PARSER;
        if (interfaceC14781l != null) {
            return interfaceC14781l;
        }
        synchronized (C8082l.class) {
            try {
                c6768l = PARSER;
                if (c6768l == null) {
                    c6768l = new C6768l();
                    PARSER = c6768l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6768l;
    }
}
