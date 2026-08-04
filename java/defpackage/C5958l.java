package defpackage;

import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.Signature;

/* JADX INFO: renamed from: lؘۚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5958l implements AutoCloseable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AutoCloseable f12563l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12564l = 0;

    public C5958l(PublicKey publicKey, C10166l c10166l) throws InvalidKeyException {
        this.f12563l = c10166l;
        ((Signature) c10166l.yandex()).initVerify(publicKey);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.f12564l;
        AutoCloseable autoCloseable = this.f12563l;
        switch (i) {
            case 0:
                ((C10166l) autoCloseable).close();
                break;
            default:
                ((C15404l) autoCloseable).close();
                break;
        }
    }

    public AbstractC3868l yandex() {
        C15404l c15404l = (C15404l) this.f12563l;
        synchronized (c15404l.f30096l) {
            try {
                if (c15404l.f30097l) {
                    return AbstractC7151l.amazon(new IllegalStateException("Retriever is released."));
                }
                c15404l.yandex();
                C1090l c1090l = new C1090l();
                c15404l.f30101l.add(c1090l);
                C1090l c1090l2 = c15404l.f30100l;
                c1090l2.getClass();
                C1770l c1770l = new C1770l(20, c1090l);
                c1090l2.yandex(new RunnableC9929l(c1090l2, c1770l, 9), EnumC1535l.f3808l);
                return c1090l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C5958l(C15404l c15404l) {
        this.f12563l = c15404l;
    }
}
