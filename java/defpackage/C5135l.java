package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؗۙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5135l extends AbstractC2240l {
    public static final C13102l crashlytics;
    public static final C13975l loadAd;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC5055l.class);
        arrayList.add(AbstractC4532l.class);
        arrayList.add(AbstractC9951l.class);
        arrayList.add(AbstractC15286l.class);
        C15376l c15376l = new C15376l(arrayList, true);
        arrayList.add(AbstractC0433l.class);
        arrayList.add(AbstractC13877l.class);
        C13102l c13102l = new C13102l(arrayList, true);
        crashlytics = c13102l;
        c13102l.purchase(c15376l);
    }

    @Override // defpackage.AbstractC2240l
    public final C2925l crashlytics(File file, String str, boolean z) {
        C14465l c14465l = new C14465l(new BufferedInputStream(new FileInputStream(file)));
        try {
            if (((C4616l) crashlytics.loadAd(AbstractC3848l.amazon(c14465l), c14465l, 0L)).loadAd(C4421l.mopub, AbstractC13203l.class) == null) {
                throw new C13768l("For file %s the File Header missing. Invalid ASF/WMA file.", file);
            }
            throw new ClassCastException();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c14465l.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.AbstractC2240l
    public final InterfaceC13280l loadAd(RandomAccessFile randomAccessFile) throws C13768l, IOException {
        randomAccessFile.seek(0L);
        try {
            C4421l[] c4421lArr = C13102l.amazon;
            C14465l c14465l = new C14465l(new BufferedInputStream(new C11270l(randomAccessFile)));
            return AbstractC15852l.yandex((C4616l) C13102l.billing.loadAd(AbstractC3848l.amazon(c14465l), c14465l, 0L));
        } catch (RuntimeException e) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            loadAd.getClass();
            int i = C17500l.yandex;
            throw new C13768l("Failed to read", e);
        }
    }

    @Override // defpackage.AbstractC2240l
    public final C16492l yandex(RandomAccessFile randomAccessFile) throws C13768l, IOException {
        randomAccessFile.seek(0L);
        try {
            C4421l[] c4421lArr = C13102l.amazon;
            C14465l c14465l = new C14465l(new BufferedInputStream(new C11270l(randomAccessFile)));
            if (((C4616l) C13102l.purchase.loadAd(AbstractC3848l.amazon(c14465l), c14465l, 0L)).loadAd(C4421l.mopub, AbstractC13203l.class) == null) {
                throw new C13768l("Invalid ASF/WMA file. File header object not available.");
            }
            throw new ClassCastException();
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            if (e instanceof C13768l) {
                throw ((C13768l) e);
            }
            throw new C13768l(AbstractC12900l.admob(e, new StringBuilder("Failed to read. Cause: ")), e);
        }
    }
}
