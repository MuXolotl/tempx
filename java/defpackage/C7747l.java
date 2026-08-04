package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lًؓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7747l {
    public final C18449l loadAd;
    public final C16557l yandex;

    public C7747l(C16557l c16557l, C12714l c12714l) {
        this.yandex = c16557l;
        this.loadAd = new C18449l(c12714l);
    }

    public final void loadAd(String str) {
        C18449l c18449l = this.loadAd;
        synchronized (c18449l) {
            if (!Objects.equals((String) c18449l.f36009l, str)) {
                C18449l.m4533switch((C12714l) c18449l.f36010l, str, (String) c18449l.f36012l);
                c18449l.f36009l = str;
            }
        }
    }

    public final String yandex(String str) {
        String strSubstring;
        C18449l c18449l = this.loadAd;
        synchronized (c18449l) {
            if (Objects.equals((String) c18449l.f36009l, str)) {
                return (String) c18449l.f36012l;
            }
            C12714l c12714l = (C12714l) c18449l.f36010l;
            C3781l c3781l = C18449l.f36006l;
            File file = new File((File) c12714l.f25077l, str);
            file.mkdirs();
            List listStartapp = C12714l.startapp(file.listFiles(c3781l));
            if (listStartapp.isEmpty()) {
                strSubstring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                strSubstring = ((File) Collections.min(listStartapp, C18449l.f36008l)).getName().substring(4);
            }
            return strSubstring;
        }
    }
}
