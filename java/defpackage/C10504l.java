package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: lَۗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10504l extends AbstractC2240l {
    public static final C13975l loadAd;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        loadAd = new C13975l(4);
    }

    @Override // defpackage.AbstractC2240l
    public final C2925l crashlytics(File file, String str, boolean z) throws C13768l, FileNotFoundException {
        C13975l c13975l = loadAd;
        try {
            C1503l c1503l = new C1503l(new C15900l(new FileInputStream(file), C3446l.amazon));
            try {
                C5868l c5868l = new C5868l(c1503l);
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i = C17500l.yandex;
                C8117l c8117l = new C8117l(c1503l);
                while (true) {
                    EnumC8101l enumC8101l = EnumC8101l.UNKNOWN;
                    if ("moov".equals(c8117l.yandex)) {
                        C2494l c2494l = new C2494l(c8117l, c1503l, c5868l, file.length(), z);
                        C2925l c2925l = new C2925l(file, str, (C11566l) c2494l.f5291l, (C3397l) c2494l.f5290l);
                        c1503l.close();
                        return c2925l;
                    }
                    EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                    c13975l.getClass();
                    int i2 = C17500l.yandex;
                    c1503l.skip(c8117l.yandex());
                    c8117l = new C8117l(c1503l);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        c1503l.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e2) {
            throw new C13768l("This file does not appear to be an Mp4 file", e2);
        }
    }

    @Override // defpackage.AbstractC2240l
    public final InterfaceC13280l loadAd(RandomAccessFile randomAccessFile) {
        throw new UnsupportedOperationException("");
    }

    @Override // defpackage.AbstractC2240l
    public final C16492l yandex(RandomAccessFile randomAccessFile) {
        throw new UnsupportedOperationException("");
    }
}
