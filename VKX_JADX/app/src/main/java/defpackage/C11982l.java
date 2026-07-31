package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import kotlin.Unit;

/* JADX INFO: renamed from: lِٜۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11982l implements InterfaceC18477l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C11982l f23891l = new C11982l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3152l f23890l = C3152l.adcel();

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final Object mo2330l() {
        return f23890l;
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٖؖ۠ */
    public final Object mo2331l(InputStream inputStream) throws C16916l {
        try {
            return C3152l.tapsense(inputStream);
        } catch (C0803l e) {
            throw new C16916l("Cannot read proto.", e);
        }
    }

    @Override // defpackage.InterfaceC18477l
    /* JADX INFO: renamed from: lٌّۡ */
    public final Unit mo2332l(OutputStream outputStream, Object obj) {
        C3152l c3152l = (C3152l) obj;
        c3152l.getClass();
        int iLoadAd = c3152l.loadAd(null);
        Logger logger = AbstractC11078l.loadAd;
        if (iLoadAd > 4096) {
            iLoadAd = 4096;
        }
        C5977l c5977l = new C5977l(outputStream, iLoadAd);
        c3152l.remoteconfig(c5977l);
        if (c5977l.billing > 0) {
            c5977l.inmobi();
        }
        return Unit.INSTANCE;
    }
}
