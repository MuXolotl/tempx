package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0221l extends AbstractC10033l {
    public final Function0 loadAd;
    public final Long yandex;

    public C0221l(InterfaceC12932l interfaceC12932l, Long l, Function0 function0) {
        this.yandex = l;
        this.loadAd = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.AbstractC10033l
    public final void isPro(InterfaceC16805l interfaceC16805l) throws IOException {
        ?? r5;
        try {
            C15900l c15900lPurchase = AbstractC7709l.purchase(new C11270l(0, (InterfaceC9354l) this.loadAd.invoke()));
            Long th = null;
            try {
                Long lValueOf = Long.valueOf(interfaceC16805l.mo736volatile(c15900lPurchase));
                try {
                    c15900lPurchase.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                Long l = th;
                th = lValueOf;
                r5 = l;
            } catch (Throwable th3) {
                try {
                    c15900lPurchase.close();
                    r5 = th3;
                } catch (Throwable th4) {
                    AbstractC11718l.yandex(th3, th4);
                    r5 = th3;
                }
            }
            if (r5 != 0) {
                throw r5;
            }
            th.getClass();
        } catch (IOException e) {
            throw e;
        } catch (Throwable th5) {
            throw new C14758l(th5);
        }
    }

    @Override // defpackage.AbstractC10033l
    public final C12105l loadAd() {
        return null;
    }

    @Override // defpackage.AbstractC10033l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.AbstractC10033l
    public final long yandex() {
        Long l = this.yandex;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }
}
