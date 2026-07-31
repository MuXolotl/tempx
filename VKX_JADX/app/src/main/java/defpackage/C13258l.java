package defpackage;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: lٍْۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13258l implements InterfaceC9234l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C13258l f26032l = new C13258l();

    public final boolean equals(Object obj) {
        if ((obj instanceof C13258l) && (obj instanceof InterfaceC9234l)) {
            return loadAd().equals(((InterfaceC9234l) obj).loadAd());
        }
        return false;
    }

    public final int hashCode() {
        return loadAd().hashCode();
    }

    @Override // defpackage.InterfaceC9234l
    public final InterfaceC14328l loadAd() {
        return new C1538l(1, AbstractC6363l.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final C0458l yandex(InterfaceC9473l interfaceC9473l) {
        InputStream inputStreamMo713l = interfaceC9473l.mo713l();
        C8270l c8270l = new C8270l();
        c8270l.yandex = null;
        c8270l.loadAd = null;
        c8270l.crashlytics = false;
        c8270l.purchase = false;
        c8270l.billing = null;
        c8270l.mopub = null;
        c8270l.admob = false;
        c8270l.subs = null;
        if (!inputStreamMo713l.markSupported()) {
            inputStreamMo713l = new BufferedInputStream(inputStreamMo713l);
        }
        try {
            inputStreamMo713l.mark(3);
            int i = inputStreamMo713l.read() + (inputStreamMo713l.read() << 8);
            inputStreamMo713l.reset();
            if (i == 35615) {
                inputStreamMo713l = new BufferedInputStream(new GZIPInputStream(inputStreamMo713l));
            }
        } catch (IOException unused) {
        }
        try {
            inputStreamMo713l.mark(4096);
            c8270l.premium(inputStreamMo713l);
            return new C0458l(c8270l.yandex);
        } finally {
            try {
                inputStreamMo713l.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
