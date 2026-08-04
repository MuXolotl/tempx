package defpackage;

import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: lٕۛۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15944l implements InterfaceC0974l {
    protected int memoizedHashCode;

    public abstract AbstractC9397l amazon();

    public final C14809l billing() {
        try {
            int iYandex = ((AbstractC13399l) this).yandex(null);
            C14809l c14809l = AbstractC15257l.f29847l;
            byte[] bArr = new byte[iYandex];
            Logger logger = AbstractC15335l.loadAd;
            C11530l c11530l = new C11530l(bArr, iYandex);
            ((AbstractC13399l) this).advert(c11530l);
            if (c11530l.advert() == 0) {
                return new C14809l(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            C18073l.Signature(crashlytics("ByteString"), e);
            return null;
        }
    }

    public final String crashlytics(String str) {
        return AbstractC14814l.ads("Serializing ", getClass().getName(), " to a ", str, " threw an IOException (should never happen).");
    }

    public final byte[] purchase() {
        try {
            int iYandex = ((AbstractC13399l) this).yandex(null);
            byte[] bArr = new byte[iYandex];
            Logger logger = AbstractC15335l.loadAd;
            C11530l c11530l = new C11530l(bArr, iYandex);
            ((AbstractC13399l) this).advert(c11530l);
            if (c11530l.advert() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            C18073l.Signature(crashlytics("byte array"), e);
            return null;
        }
    }

    public abstract int yandex(InterfaceC0060l interfaceC0060l);
}
