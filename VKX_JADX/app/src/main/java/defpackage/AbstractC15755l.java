package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lٕ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15755l {
    public static final /* synthetic */ int yandex = 0;

    static {
        AbstractC8669l.m2407import(new String[]{"json", "ld+json", "xml", "xhtml+xml", "rss+xml", "atom+xml", "x-www-form-urlencoded", "svg+xml"});
    }

    public static final Charset yandex(C5254l c5254l) {
        String strM4259l = c5254l.m4259l("charset");
        if (strM4259l == null) {
            return null;
        }
        try {
            Charset charset = AbstractC9050l.yandex;
            return Charset.forName(strM4259l);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
