package defpackage;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: lۗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18518l extends AbstractC13399l implements InterfaceC0974l {
    private static final C18518l DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile InterfaceC14781l PARSER;
    private int bitField0_;
    private AbstractC15257l encryptedKeyset_ = AbstractC15257l.f29847l;
    private C0332l keysetInfo_;

    static {
        C18518l c18518l = new C18518l();
        DEFAULT_INSTANCE = c18518l;
        AbstractC13399l.license(C18518l.class, c18518l);
    }

    public static C8824l applovin() {
        return (C8824l) DEFAULT_INSTANCE.admob();
    }

    public static C18518l appmetrica(ByteArrayInputStream byteArrayInputStream, C7597l c7597l) throws C2297l {
        AbstractC13399l abstractC13399lSignature = AbstractC13399l.Signature(DEFAULT_INSTANCE, new C6068l(byteArrayInputStream), c7597l);
        AbstractC13399l.mopub(abstractC13399lSignature);
        return (C18518l) abstractC13399lSignature;
    }

    public static void isVip(C18518l c18518l, C14809l c14809l) {
        c18518l.getClass();
        c18518l.encryptedKeyset_ = c14809l;
    }

    public static void signatures(C18518l c18518l, C0332l c0332l) {
        c18518l.getClass();
        c18518l.keysetInfo_ = c0332l;
        c18518l.bitField0_ |= 1;
    }

    public final AbstractC15257l premium() {
        return this.encryptedKeyset_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "encryptedKeyset_", "keysetInfo_"});
        }
        if (iInmobi == 3) {
            return new C18518l();
        }
        if (iInmobi == 4) {
            return new C8824l(DEFAULT_INSTANCE);
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
        synchronized (C18518l.class) {
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
